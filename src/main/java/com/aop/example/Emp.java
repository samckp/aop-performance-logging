package com.aop.example;

import java.io.Serializable;

public class Emp implements Serializable {
    private static final long svId = 1L;

    private Long empId;
    private String fName;
    private String lName;

    public Emp(){
        super();
    }

    public Emp(Long empId, String fName, String lName) {
        this.empId = empId;
        this.fName = fName;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
