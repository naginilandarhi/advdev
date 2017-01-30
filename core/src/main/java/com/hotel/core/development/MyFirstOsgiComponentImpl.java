package com.hotel.core.development;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.osgi.service.component.ComponentContext;

@Component(immediate=true,metatype=true,label="MyFirstOsgiComponent",description = "Simple demo ")
@Service(MyFirstOsgiComponent.class)
@Property(label="tick yes or no:",name="osgi.property", boolValue=false,
description = "Whether or not to schedule this task concurrently")
public class MyFirstOsgiComponentImpl implements MyFirstOsgiComponent {

	
	ComponentContext context;
	@Override
	public String checkBox() {
		// TODO Auto-generated method stub
		if(context.getProperties().get("osgi.property").toString().equalsIgnoreCase("true"))
		{return "true";}
		else
			return "false";
	}
	@Activate
	public void activatemethod(ComponentContext context1)
	{
		context=context1;
	}

	

	

}
