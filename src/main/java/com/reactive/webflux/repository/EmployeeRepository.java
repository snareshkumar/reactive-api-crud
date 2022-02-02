package com.reactive.webflux.repository;

import com.reactive.webflux.entity.Employee;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends ReactiveSortingRepository<Employee, Integer> {
}
