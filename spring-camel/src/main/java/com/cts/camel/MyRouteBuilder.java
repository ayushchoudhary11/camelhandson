package com.cts.camel;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder{
	
	@Override
	public void configure() throws Exception {
		
		from ("file:inbox?noop=true").to("file:outbox");
		
	}

}
