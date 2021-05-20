package com.poccupine.hometest.service;


import com.poccupine.hometest.dto.request.LoginDTO;

public interface AccountService {
    String authenticate(LoginDTO dto);
}
