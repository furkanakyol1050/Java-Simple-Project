package com.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateEmployeeRequest {
    private String name;
    private String surname;

    public static Boolean nullCheck(UpdateEmployeeRequest employeeRequest){
        return employeeRequest.getName() != null && employeeRequest.getSurname() != null;
    }
}
