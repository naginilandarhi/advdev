package com.hotel.core.development;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;

@Component(immediate = true,metatype = true,label ="ITC Online Configuration service", description = "Service used for itc online configuration")
@Service(MyFirstOsgiComponent.class)
@Property()
public class MyFirstOsgiComponentImpl implements MyFirstOsgiComponent {

	@Override
	public String displayMessage(String val) {
		// TODO Auto-generated method stub
		 return "Welcome to AEM CQ5 Tutorials:- Your Message is"+ val;
	}

}
