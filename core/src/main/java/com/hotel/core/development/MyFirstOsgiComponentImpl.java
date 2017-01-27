package com.hotel.core.development;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;

@Component(metatype=true,label="FirstOsgiComponent",description = "Simple demo ")
@Service(value=MyFirstOsgiComponent.class)
@Property(label="tick yes or no:",name="osgi.property", boolValue=false,
description = "Whether or not to schedule this task concurrently")
public class MyFirstOsgiComponentImpl implements MyFirstOsgiComponent {

	

}
