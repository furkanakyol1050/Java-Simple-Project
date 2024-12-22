package com.example.services;

import com.example.model.Employee;
import com.example.model.UpdateEmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList(){
        return employeeRepository.getAllEmployeeList();
    }

    public Employee getEmployee(String id){
        return employeeRepository.getEmployeeById(id);
    }

    public List<Employee> getEmployeeWithParams(String name, String surname){
        return employeeRepository.getEmployeeWithParams(name,surname);
    }

    public Employee SaveEmployee(Employee employee){
        return employeeRepository.SaveEmployee(employee);
    }

    public Boolean DeleteEmployee(String id){
        return employeeRepository.DeleteEmployee(id);
    }

    public Employee UpdateEmployee(String id, UpdateEmployeeRequest employeeRequest){
        return employeeRepository.UpdateEmployee(id, employeeRequest);
    }
}
