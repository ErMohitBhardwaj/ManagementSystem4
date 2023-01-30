package com.BikkadIT.AutoWiringModes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.AutoWiringModes.dao.OracleReport;
import com.BikkadIT.AutoWiringModes.dao.ReportDao;

@Service
public class ReportServiceInterface {

	@Autowired
	private ReportDao reportDao;
	
	//bytype : if a single class having @Primary annotation on it
	//			then bean of that class we be injected.
	// if multiple class having @Primary annotation then multiple @Primary 
	//			bean found error will occurs. because of ambiguity problem.
	
	
	public void report() {
		
		reportDao.generateReport();
	}
}
