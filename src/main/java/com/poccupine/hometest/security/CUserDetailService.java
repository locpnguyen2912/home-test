package com.poccupine.hometest.security;

import com.poccupine.hometest.model.Users;
import com.poccupine.hometest.repository.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component("cuserDetailsService")
public class CUserDetailService implements UserDetailsService {

    private final Logger log = LoggerFactory.getLogger(CUserDetailService.class);

    @Autowired
    UsersRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        Users user = userRepository.findByUsername(username)
            .orElseThrow(() -> new UsernameNotFoundException(String.format("Username '%s' not found!", username)));
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if (StringUtils.hasText(user.getRoles())) {
            grantedAuthorities = Arrays.stream(user.getRoles().split(","))
                .filter(StringUtils::hasText)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
        }
        return new UserPrinciple(username, user.getPassword(), grantedAuthorities, user.getId());
    }
}
