package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String id;
    private String name;
    private String surname;

    public static Boolean nullCheck(Employee employee){
        return employee.getName() != null && employee.getSurname() != null
                && employee.getId() != null;
    }
}
