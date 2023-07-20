package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Book;
import com.bilgeadam.repository.entity.Borrow;
import com.bilgeadam.repository.entity.UserInformation;
import com.bilgeadam.service.UserInformationService;

import java.util.List;

public class UserInformationController {

    private UserInformationService userInformationService;

    public UserInformationController() {
        this.userInformationService = new UserInformationService();
    }

    public UserInformation save(UserInformation userInformation){
        return userInformationService.save(userInformation);
    }


    public List<UserInformation> findAll(){
        return userInformationService.findAll();
    }

}
