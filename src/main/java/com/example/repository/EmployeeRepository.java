package com.example.repository;

import com.example.model.Employee;
import com.example.model.UpdateEmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employeeList;

    public List<Employee> getAllEmployeeList(){
        return employeeList;
    }

    public Employee getEmployeeById(String id){
        Employee output = null;
        for(Employee employee: employeeList){
            if(id.equals(employee.getId())){
                output = employee;
                break;
            }
        }
        return output;
    }

    public List<Employee> getEmployeeWithParams(String name, String surname){
        List<Employee> output = new ArrayList<Employee>();
        if(name == null && surname == null)
            return employeeList;

        for(Employee employee: employeeList){
            if(employee.getName().equalsIgnoreCase(name) ||
                    employee.getSurname().equalsIgnoreCase(surname)){
                output.add(employee);
            }
        }

        return output;
    }

    public Employee SaveEmployee(Employee employee){
        if (Employee.nullCheck(employee))
            employeeList.add(employee);
        return employee;
    }

    public Boolean DeleteEmployee(String id){
        return employeeList.removeIf(employee -> employee.getId().equalsIgnoreCase(id));
    }

    public Employee UpdateEmployee(String id, UpdateEmployeeRequest employeeRequest){
        Employee findEmployee = getEmployeeById(id);
        if(findEmployee != null){
            DeleteEmployee(id);
            findEmployee.setName(employeeRequest.getName());
            findEmployee.setSurname(employeeRequest.getSurname());

            employeeList.add(findEmployee);
        }
        return  findEmployee;
    }
}
