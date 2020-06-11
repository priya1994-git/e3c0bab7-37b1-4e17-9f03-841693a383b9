package com.example.demo.employee;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
    //Put your code here
	 @Autowired
	  EmployeeService employeeService;

	  @RequestMapping("/")
	    public List<Employee> getEmpList(){
	    List<Employee> empController = employeeService.getEmployees();
	    Collections.sort(empController);
	        return empController;
	    }
}
