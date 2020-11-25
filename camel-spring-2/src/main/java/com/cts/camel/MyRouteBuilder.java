package com.cts.camel;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder {
	
	@Override
	public void configure()throws Exception {
		from ("file:F/source?nopp=true")
		.process(new FileProcessor())
		.to("file:F/destin?fileName=emp.json");
		
		
	}

}
