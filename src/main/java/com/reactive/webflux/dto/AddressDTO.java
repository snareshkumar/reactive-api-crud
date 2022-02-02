package com.reactive.webflux.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private String addressLine1;

    private String addressLine2;

    private String city;

    private String state;

    private String country;

    private String email;

    private Long phone;

    private String addrType;

}
