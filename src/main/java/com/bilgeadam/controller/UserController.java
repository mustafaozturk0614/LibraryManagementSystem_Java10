package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Users;
import com.bilgeadam.service.UsersService;

public class UserController {

  private   UsersService usersService;

    public UserController() {
        this.usersService = new UsersService();
    }

    public Users save(Users users){
      return   usersService.save(users);
    }

}
