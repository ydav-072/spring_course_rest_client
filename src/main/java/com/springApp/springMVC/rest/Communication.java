package com.springApp.springMVC.rest;

import com.springApp.springMVC.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    private static final String URL = "http://localhost:8080/spring_course_rest/api//employees";
    @Autowired
    private RestTemplate restTemplate;

    public List<Employee> getAllEmployees(){
        ResponseEntity<List<Employee>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Employee>>() {});
        List<Employee> employeeList = responseEntity.getBody();
        return  employeeList;
    }

    public Employee getEmployee(int id){
        return null;
    }

    public void saveEmployee(Employee employee){

    }

    public void deleteEmployee(int id){

    }
}
