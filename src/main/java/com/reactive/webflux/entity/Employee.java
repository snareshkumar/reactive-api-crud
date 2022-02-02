package com.reactive.webflux.entity;

import com.reactive.webflux.dto.Gender;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;

@Entity
@Table
@Data
public class Employee {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name="EMPLOYEE_NAME")
    private String employeeName;

    @Column(name ="DEPARTMENT" )
    private String department;

    @Enumerated(EnumType.STRING)
    @Column(name="GENDER")
    private Gender gender;

    @Column(name = "EMPLOYER_NAME")
    private String employerName;

    @Column(name = "DESIGNATION")
    private String designation;




}
