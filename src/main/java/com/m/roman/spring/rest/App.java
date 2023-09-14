package com.m.roman.spring.rest;

import com.m.roman.spring.rest.configuration.MyConfig;
import com.m.roman.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);
        Employee employee = communication.getEmployee(1);
        System.out.println(employee);
//        Employee emp = new Employee("Sveta", "Sokolova", "HR", 700);
//        communication.saveEmployee(emp);
        communication.deleteEmployee(40);
        communication.deleteEmployee(41);

    }
}
