package com.Dilay.ıoc;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named(value = "employee")
@ApplicationScoped
public class Employee {
    private Employer employer;

    public Employee(){
        employer = new Employer();
    }

    public String getData(String data){
    return employer.version(data);
    }
}
