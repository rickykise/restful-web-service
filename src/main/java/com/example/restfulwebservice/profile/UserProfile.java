package com.example.restfulwebservice.profile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile {

    private String id;
    private String name;
    private String phone;
    private String adress;
}
