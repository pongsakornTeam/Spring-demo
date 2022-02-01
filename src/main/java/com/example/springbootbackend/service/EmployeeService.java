package com.example.springbootbackend.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.example.model.MessageProducer;
import com.example.springbootbackend.repository.EmployeeRepository;

import lombok.extern.log4j.Log4j2;


@Service
@Log4j2
public class EmployeeService {
	/*
	 * @Autowired MessageProducer sender;
	 */

    private static final org.apache.logging.log4j.Logger log = 
    	    org.apache.logging.log4j.LogManager.getLogger(EmployeeService.class);

    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

	/*
	 * public void sendEmployee(String id) { //Employee result = (Employee)
	 * employeeRepository.findAll(); log.info("Success"); sender.sendEmail(id); }
	 */
  
}