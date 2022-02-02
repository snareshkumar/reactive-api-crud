package com.reactive.webflux.repository;

import com.reactive.webflux.entity.Address;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import reactor.core.publisher.Mono;

public interface AddressRepository extends ReactiveSortingRepository<Address, Integer> {
    public Mono<Address> deleteAddressesByEmployeeId(Integer employeeId);
}
