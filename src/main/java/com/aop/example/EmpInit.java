package com.aop.example;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmpInit {

    static Map<Long, Emp> data = new HashMap<>();

    static {
        data.put(1L, new Emp(1L, "Raj", "Kumar"));
        data.put(2L, new Emp(2L,"Amit", "kumar"));
    }

    public Emp getEmpById(Long id){
        return data.get(id);
    }

}
