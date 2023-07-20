package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Book;
import com.bilgeadam.repository.entity.Borrow;
import com.bilgeadam.repository.entity.UserInformation;
import com.bilgeadam.service.UserInformationService;

public class UserInformationController {

    private UserInformationService userInformationService;

    public UserInformationController() {
        this.userInformationService = new UserInformationService();
    }

    public UserInformation save(UserInformation userInformation){
        return userInformationService.save(userInformation);
    }
}
