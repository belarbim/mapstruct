package com.mbe.mapstruct.model.com.mbe.mapstruct.mapper;

import com.mbe.mapstruct.dto.AddressDTO;
import com.mbe.mapstruct.model.Address;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {

    AddressDTO addressToDTO(Address address);
}
