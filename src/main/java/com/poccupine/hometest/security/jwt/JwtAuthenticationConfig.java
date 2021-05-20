package com.poccupine.hometest.security.jwt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Config JWT.
 * Only one property 'locpnguyen.security.jwt.secret' is mandatory.
 *
 * @author locpnguyen 2021/01/09
 */

public class JwtAuthenticationConfig {

    @Value("${security.authentication.jwt.token-validity-in-seconds}")
    private int expiration = 86400;

    @Value("${security.authentication.jwt.token-validity-in-seconds-for-remember-me}")
    private int rememberMe = 2592000; // default 24 hours

    @Value("${security.authentication.jwt.base64-secret}")
    private String secretKey = "MjI3YzU0OTQ4OTg4YWM4MmM1YWU1NzIyNWVkZTdmM2NjM2Y4NTUzZTdlZjEyZmNjMWQyMDlkOGYzYTEyM2Q3MmMyNjM2ZGM5ZGNkZWI1MDU1NzVhNTRlNGJhMDBlZDkyOTQ4M2UzZjgyZjM2OTFiYWYyNzA4ZTgyZGUxNjgxNWQ=";

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    public int getRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(int rememberMe) {
        this.rememberMe = rememberMe;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
