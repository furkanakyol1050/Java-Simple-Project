package com.example.controller;

import com.example.model.Employee;
import com.example.model.UpdateEmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.services.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/getAll")
    public List<Employee> GetAllEmployeeList(){
        return employeeService.getAllEmployeeList();
    }

    @GetMapping(path = "/get/{id}")
    public Employee GetEmployeeById(@PathVariable(name = "id") String id){
        return employeeService.getEmployee(id);
    }

    @GetMapping(path = "/getAllWithParams")
    public List<Employee> GetEmployeeWithParams(@RequestParam(name = "name", required = false) String name,
                                          @RequestParam(name = "surname", required = false) String surname){
        return employeeService.getEmployeeWithParams(name, surname);
    }

    @PostMapping(path = "/save")
    public Employee SaveEmployee(@RequestBody Employee employee){
        return employeeService.SaveEmployee(employee);
    }

    @DeleteMapping(path = "/delete/{id}")
    public Boolean DeleteEmployee(@PathVariable(name = "id") String id){
        return employeeService.DeleteEmployee(id);
    }

    @PutMapping(path = "/update/{id}")
    public Employee UpdateEmployee(@PathVariable(name = "id") String id
            , @RequestBody UpdateEmployeeRequest employeeRequest){
        return employeeService.UpdateEmployee(id, employeeRequest);
    }
}
