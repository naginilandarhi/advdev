package com.hotel.core.development;

import org.apache.felix.scr.annotations.Component;

@Component

public class MyFirstOsgiComponentImpl implements MyFirstOsgiComponent {

	@Override
	public String displayMessage() {
		// TODO Auto-generated method stub
		 return "Welcome to AEM CQ5 Tutorials:- Your Message is";
	}

}
