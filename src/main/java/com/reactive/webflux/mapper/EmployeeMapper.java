package com.reactive.webflux.mapper;

import com.reactive.webflux.dto.AddressDTO;
import com.reactive.webflux.dto.EmployeeRequestDTO;
import com.reactive.webflux.entity.Address;
import com.reactive.webflux.entity.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    Employee employeeDtoToEntity(EmployeeRequestDTO employeeRequestDTO);

    List<Address> addressDtosToEntities(List<AddressDTO> addressDTOs);

    Address addressDtoToEntity(AddressDTO addressDTO);

}
