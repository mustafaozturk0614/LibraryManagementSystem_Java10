package com.bilgeadam;

import com.bilgeadam.repository.AddressRepository;
import com.bilgeadam.repository.UserInformationRepository;
import com.bilgeadam.repository.UserRepository;
import com.bilgeadam.repository.entity.Address;
import com.bilgeadam.repository.entity.UserInformation;
import com.bilgeadam.repository.entity.Users;

public class MainWithCascade {
    public static void main(String[] args) {
        UserRepository userRepository=new UserRepository();


        Users user=Users.builder().password("123").username("musty")
                .userInformation(UserInformation.builder().firstName("Mustafa").lastName("Ozturk")
                        .address(Address.builder().city("Ankara").country("Türkiye").build()).build()).build();
        userRepository.save(user);


    }
}