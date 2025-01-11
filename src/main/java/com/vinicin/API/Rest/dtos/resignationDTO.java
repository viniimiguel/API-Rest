package com.vinicin.API.Rest.dtos;

public class resignationDTO {
    private double salary;
    private int months;

    public resignationDTO(double salary, int month){
        this.salary = salary;
        this.months = month;
    }
    public double salary(){
        return salary;
    }
    void setSalary(double salary){
        this.salary = salary;
    }
    public int getMonths(){
        return months;
    }
    void setMonths(int months){
        this.months = months;
    }
}
