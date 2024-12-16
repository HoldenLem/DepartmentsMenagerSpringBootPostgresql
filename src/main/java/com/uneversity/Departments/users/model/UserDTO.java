package com.uneversity.Departments.users.model;


import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
class UserDTO {
    private long id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
}
