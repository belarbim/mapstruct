package com.mbe.mapstruct.model.com.mbe.mapstruct.mapper;

import com.mbe.mapstruct.dto.CustomerDTO;
import com.mbe.mapstruct.model.Customer;
import com.mbe.mapstruct.model.Title;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = AddressMapper.class)
public interface CustomerMapper {

    @Mapping(target = "customerId",source = "id")
    @Mapping(target = "dateOfBirth",dateFormat = "dd.MM.yyyy")
    @Mapping(target = "fullName",expression = "java(customer.getFirstName() + customer.getLastName())")
    CustomerDTO customerToDto(Customer customer);

    default String toString(Title title){
        return title.getValue();
    }
}
