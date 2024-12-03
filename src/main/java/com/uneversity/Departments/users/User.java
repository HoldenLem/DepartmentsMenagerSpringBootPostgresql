package com.uneversity.Departments.users;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class User {
    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Role role;
}
