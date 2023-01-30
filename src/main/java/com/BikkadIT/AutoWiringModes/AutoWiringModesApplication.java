package com.BikkadIT.AutoWiringModes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.AutoWiringModes.service.ReportService;
import com.BikkadIT.AutoWiringModes.service.ReportServiceInterface;

@SpringBootApplication
public class AutoWiringModesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(AutoWiringModesApplication.class, args);
		ReportServiceInterface reportServiceInterface = run.getBean(ReportServiceInterface.class);
		reportServiceInterface.report();
	
		ReportService reportService = run.getBean(ReportService.class);
		reportService.report();
	}	

}
