package com.scaler.dsa1.stream;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
class Employee {
    private int id;
    private String name;
    private int salary;
    private String department;

    public Employee(int id, String name, int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

}

