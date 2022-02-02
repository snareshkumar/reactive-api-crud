package com.reactive.webflux.entity;

import com.reactive.webflux.dto.AddressType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;

@Entity
@Table
@Data
public class Address {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ADDRESS_LINE1")
    private String addressLine1;

    @Column(name = "ADDRESS_LINE2")
    private String addressLine2;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private Long phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name="ADDRESS_TYPE")
    private AddressType addressType;

    @Column(name = "EMPLOYEE_ID")
    private int employeeId;


}
