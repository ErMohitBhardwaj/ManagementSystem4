package com.BikkadIT.AutoWiringModes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.BikkadIT.AutoWiringModes.dao.ReportDao;

@Service

public class ReportService {

	@Autowired
	@Qualifier("mySQLReport") //if we use Qualifier annotation then we have to 
	
	//give the bean name(object name) by default bean name is 
	//class name having first letter lower case. 
	// for example class name is Student then bean name is student.
	//we need only bean name in Qualifier annotation need not to use any annotation(like primary) on other classes on which we are calling 
	private ReportDao reportDao;
//priority is given to bytype if byname and by type both are available.	
// Priority between primary and Qualifier  is given to Qualifier because it gives instruction in same class where we are 
	// injecting the bean.
	
	public void report() {
		System.out.println("Next report is genrated by qualifier annotation");
		reportDao.generateReport();
	}
	
}
