package com.shankar.hazlecast.service;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import com.shankar.hazlecast.model.hrEmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {

    @Autowired
    private HazelcastInstance instance;

    public Collection<hrEmployeeDto> getAllEmployees() {

        IMap<String, hrEmployeeDto> employee = fetchEmployeeDetailsCache();

        return employee.values();

    }

    public IMap<String, hrEmployeeDto> fetchEmployeeDetailsCache() {
        IMap<String, hrEmployeeDto> hrEmployeeIMap = null;
        try {
            hrEmployeeIMap = instance.getMap("hrEmployeeCache");
            if (!CollectionUtils.isEmpty(hrEmployeeIMap)) {
                System.out.println("fetched from hrEmployeeCache");
                return hrEmployeeIMap;
            }

            System.out.println("setting manually");
            Map<String, hrEmployeeDto> testData = new HashMap<>();
            testData.put("shankar", new hrEmployeeDto("100", "shankar"));
            testData.put("pallavi", new hrEmployeeDto("101", "pallavi"));

            hrEmployeeIMap.putAll(testData);


        } catch (Exception e) {
            e.printStackTrace();
        }

        return hrEmployeeIMap;
    }

}
