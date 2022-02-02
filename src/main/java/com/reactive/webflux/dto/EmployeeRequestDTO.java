package com.reactive.webflux.dto;


import lombok.Data;

import java.util.List;

@Data
public class EmployeeRequestDTO {

    private String employeeName;

    private String department;

    private String gender;

    private String employerName;

    private String designation;

    private List<AddressDTO> addressDTOs;

}
