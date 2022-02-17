package com.jb.spring_basic.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDetails {
    private String userName;
    private String userPass;
    private String role;
    private int id; //0-admin, companyId/CustomerId

}
