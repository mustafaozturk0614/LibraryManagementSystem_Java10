package com.bilgeadam;

import com.bilgeadam.repository.UsersRepository;
import com.bilgeadam.repository.entity.Address;
import com.bilgeadam.repository.entity.UserInformation;
import com.bilgeadam.repository.entity.Users;

public class MainWithCascade {
    public static void main(String[] args) {
        UsersRepository userRepository=new UsersRepository();


//        Users user=Users.builder().password("123").username("musty")
//                .userInformation(UserInformation.builder().firstName("Mustafa").lastName("Ozturk")
//                        .address(Address.builder().city("Ankara").country("Türkiye").build()).build()).build();
//        userRepository.save(user);


    }
}