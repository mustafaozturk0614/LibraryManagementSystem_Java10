package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Address;
import com.bilgeadam.service.AddressService;

public class AddressController {

    private AddressService addressService;

    public AddressController() {
        this.addressService = new AddressService();

    }

    public Address save(Address address){
        return  addressService.save(address);
    }
}
