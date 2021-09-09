package com.springApp.springMVC.rest;

import com.springApp.springMVC.rest.configuration.MyConfig;
import com.springApp.springMVC.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> employeeList = communication.getAllEmployees();
        System.out.println(employeeList);
        Employee  employeeById = communication.getEmployee(1);
        System.out.println(employeeById);
        Employee addEmp = new Employee("Vika", "Vupsen", "Reception", 900);
        addEmp.setId(9);
        communication.saveEmployee(addEmp);
        communication.deleteEmployee(9);
    }
}
