package com.hotel.core.development;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.osgi.service.component.ComponentContext;

@Component(immediate=true,metatype=true,label="MyFirstOsgiComponent",description = "Simple demo ")
@Service(MyFirstOsgiComponent.class)
@Property(label="tick yes or no:",name="osgi.property", boolValue=false,
description = "Whether or not to schedule this task concurrently")
public class MyFirstOsgiComponentImpl implements MyFirstOsgiComponent {

	@Reference
	ComponentContext context;
	@Override
	public String checkBox() {
		// TODO Auto-generated method stub
		if(context.getProperties().get("osgi.property").toString().equalsIgnoreCase("true"))
		{return "true";}
		else
			return "false";
	}

	

}
