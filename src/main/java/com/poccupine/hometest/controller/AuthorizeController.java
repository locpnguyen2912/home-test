package com.poccupine.hometest.controller;


import com.poccupine.hometest.dto.request.LoginDTO;
import com.poccupine.hometest.payload.CustomPayload;
import com.poccupine.hometest.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Controller to authenticate users.
 */
@RestController
@RequestMapping("/api")
public class AuthorizeController {


    @Autowired
    AccountService accountService;

    @PostMapping("/auth.login")
    public CustomPayload authorize(@Valid @RequestBody LoginDTO loginDTO) {
        return new CustomPayload(accountService.authenticate(loginDTO));
    }



}
