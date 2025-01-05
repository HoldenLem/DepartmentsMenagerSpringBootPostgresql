package com.uneversity.Departments.lectors.model;

import com.uneversity.Departments.lectors.Lector;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LectorMapper {
    LectorDTO toDto(Lector lector);
    Lector toEntity(LectorDTO lectorDTO);
}
