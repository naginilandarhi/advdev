package com.hotel.core.development;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.PropertyOption;
import org.apache.felix.scr.annotations.PropertyUnbounded;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.commons.osgi.PropertiesUtil;
import org.osgi.service.component.ComponentContext;

@Component(immediate=true,metatype=true,label="MyFirstOsgiComponent",description = "Simple demo ")
@Service(MyFirstOsgiComponent.class)
@Properties({
@Property(label="tick yes or no:",name="osgi.property", boolValue=false,
description = "Whether or not to schedule this task concurrently"),
@Property( label = "Author Gender",name="gender", description = "Describe Author Gender",
options = { @PropertyOption(name = "Male", value = "1. Male"),
			@PropertyOption(name = "Female", value = "2. Female") }, 
			value = "Female")
})

public class MyFirstOsgiComponentImpl implements MyFirstOsgiComponent {

	@Property(value={"English", "Hindi","Telugu"}, unbounded = PropertyUnbounded.ARRAY, label = "Subjects", cardinality = 50, description = "Example for Multi field config") 
	private static final String MULTI_FIELD = "multifield";


	
	ComponentContext context;



	private String[] multi_String;
	
	@Override
	public String checkBox() {
		// TODO Auto-generated method stub
		if(context.getProperties().get("osgi.property").toString().equalsIgnoreCase("true"))
		{return "check box is checked:true";}
		else
			return "check box is checked:false";
		
		
	}
	@Override
	public String gender() {
		// TODO Auto-generated method stub
		if(context.getProperties().get("gender").toString().equalsIgnoreCase("male"))
		{return "gender selected:male";}
		else
			return "gender selected:female";
	}
	
	@Activate
	public void activatemethod(ComponentContext context1)
	{
		
		
		context=context1;
		this.multi_String=PropertiesUtil.toStringArray(context1.getProperties().get(MULTI_FIELD));
	}

	

	

	

}
