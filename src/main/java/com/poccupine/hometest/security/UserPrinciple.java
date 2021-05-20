package com.poccupine.hometest.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UserPrinciple extends User implements UserDetails {

    private Long user_id;




    public UserPrinciple(String username,
                         String password,
                         Collection<? extends GrantedAuthority> authorities,
                         Long userId
                         ) {
        super(username, password, authorities);
        this.user_id = userId;
    }


    public UserPrinciple(String username, String password, boolean enabled, boolean accountNonExpired,
                         boolean credentialsNonExpired,
                         boolean accountNonLocked,
                         Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
