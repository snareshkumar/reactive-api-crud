package com.reactive.webflux.service;

import com.reactive.webflux.entity.Address;
import com.reactive.webflux.entity.Employee;
import com.reactive.webflux.repository.AddressRepository;
import com.reactive.webflux.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final AddressRepository addressRepository;

    public EmployeeService(EmployeeRepository employeeRepository, AddressRepository addressRepository) {
        this.employeeRepository = employeeRepository;
        this.addressRepository = addressRepository;
    }

    public Mono<Employee> create(Employee employee, List<Address> addresses) {
        return employeeRepository.save(employee).doOnNext(employee1 -> {
            addresses.forEach(a -> {
                a.setEmployeeId(employee1.getId());
                addressRepository.save(a).subscribe();
            });
        });
    }

    public Flux<Employee> getRecords() {
        return employeeRepository.findAll();
    }

    public Mono<Void> delete(String employeeId) {
        return employeeRepository.deleteById(Integer.parseInt(employeeId));
    }
}
