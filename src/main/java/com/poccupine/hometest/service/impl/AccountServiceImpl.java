package com.poccupine.hometest.service.impl;

import com.poccupine.hometest.config.UserAuthentication;
import com.poccupine.hometest.dto.request.LoginDTO;
import com.poccupine.hometest.security.CAuthenticationProvider;
import com.poccupine.hometest.security.jwt.TokenProvider;
import com.poccupine.hometest.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private TokenProvider tokenProvider;

    @Autowired
    CAuthenticationProvider cAuthenticationManager;

    @Override
    public String authenticate(LoginDTO dto) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
            dto.getUsername(),
            dto.getPassword()
        );
        UserAuthentication authentication = (UserAuthentication) this.cAuthenticationManager.authenticate(authenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return tokenProvider.createToken(authentication, dto.isRememberMe());
    }
}
