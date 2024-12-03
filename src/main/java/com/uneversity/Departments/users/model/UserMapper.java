package com.uneversity.Departments.users.model;


import com.uneversity.Departments.users.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO of(User user);
    User of(UserDTO userDTO);
}
