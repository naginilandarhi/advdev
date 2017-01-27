package com.hotel.core.development;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;

@Component(immediate = true,metatype = true,label ="MyFirst service",name="firstbundle", description = "Service used for  configuration")
@Service(MyFirstOsgiComponent.class)
@Property(label="cscc")

public class MyFirstOsgiComponentImpl implements MyFirstOsgiComponent {

	@Override
	public String displayMessage() {
		// TODO Auto-generated method stub
		 return "Welcome to AEM CQ5 Tutorials:- Your Message is";
	}

}
