package com.bilgeadam;

import com.bilgeadam.repository.AddressRepository;
import com.bilgeadam.repository.UserInformationRepository;
import com.bilgeadam.repository.UsersRepository;
import com.bilgeadam.repository.entity.Address;
import com.bilgeadam.repository.entity.UserInformation;
import com.bilgeadam.repository.entity.Users;

public class Main {
    public static void main(String[] args) {
        UsersRepository userRepository=new UsersRepository();
        UserInformationRepository userInformationRepository=new UserInformationRepository();
        /// adress kayıt işlemi
        AddressRepository addressRepository=new AddressRepository();
        Address address= Address.builder().city("Ankara").country("Türkiye").build();
        addressRepository.save(address);
        // user informatiın kayıt işlemi
     UserInformation userInformation   =UserInformation.builder().firstName("Mustafa").lastName("Ozturk").build();
     userInformationRepository.save(userInformation);
        // user kayıt işlemi
        Users user=Users.builder().password("123").username("musty")
                .userInformation(userInformation).build();
        userRepository.save(user);

        Users users2=Users.builder().password("456").username("mustafa").build();
       userRepository.save(users2);




    }
}