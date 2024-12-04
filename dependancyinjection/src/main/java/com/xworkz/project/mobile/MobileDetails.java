package com.xworkz.project.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.project.interfaces.Mobile;
@Component
public class MobileDetails {

		@Autowired
		@Qualifier("realme")
		private Mobile mobiles ;


}
