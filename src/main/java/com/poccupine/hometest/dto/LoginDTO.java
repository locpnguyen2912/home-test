package com.poccupine.hometest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * View Model object for storing a user's credentials.
 */
public class LoginDTO implements Serializable {

    public static final int PASSWORD_MIN_LENGTH = 4;
    public static final int PASSWORD_MAX_LENGTH = 100;

//    @NotNull
//    @Size(min = 1, max = 50)
    @JsonProperty("username")
    private String username;

//    @NotNull
//    @Size(min = PASSWORD_MIN_LENGTH, max = PASSWORD_MAX_LENGTH)
    @JsonProperty("password")
    private String password;

    @JsonProperty("token")
    private String token;

    @JsonProperty("remember_me")
    private Boolean rememberMe = false;

    public String getUsername() {
        return StringUtils.isNotEmpty(username) ? username.toLowerCase().trim() : username;
    }

    public void setUsername(String username) {
        this.username = username.toLowerCase().trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(Boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LoginDTO() {
    }

    @Override
    public String toString() {
        return "LoginV2DTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                ", rememberMe=" + rememberMe +
                '}';
    }
}
