package com.xworkz.project.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.project.interfaces.OperatingSystem;
@Component
public class OsDetails {
		@Autowired
		@Qualifier("dellProcess")
		private OperatingSystem operatingSystem ;
	

}
