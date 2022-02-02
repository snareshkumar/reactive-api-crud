package com.reactive.webflux.controller;


import com.reactive.webflux.dto.EmployeeRequestDTO;
import com.reactive.webflux.entity.Employee;
import com.reactive.webflux.mapper.EmployeeMapper;
import com.reactive.webflux.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;
    private final EmployeeMapper employeeMapper;

    public EmployeeController(EmployeeService employeeService, EmployeeMapper employeeMapper) {
        this.employeeService = employeeService;
        this.employeeMapper = employeeMapper;
    }

    @PostMapping
    public Mono<Employee> create(@RequestBody EmployeeRequestDTO employeeRequestDTO) {
        return employeeService.create
                (employeeMapper.employeeDtoToEntity(employeeRequestDTO),
                        employeeMapper.addressDtosToEntities(employeeRequestDTO.getAddressDTOs()));
    }
    @GetMapping
    public Flux<Employee> get(){
        return employeeService.getRecords().log();
    }
    @DeleteMapping
    public Mono<Void> delete(String employeeId){
        return employeeService.delete(employeeId);
    }
}
