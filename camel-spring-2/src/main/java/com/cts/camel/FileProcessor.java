package com.cts.camel;

import java.util.StringTokenizer;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FileProcessor implements Processor {
	
	@Override
	public void process(Exchange exchange)throws Exception{
		
		String Message =exchange.getIn().getBody(String.class);
		
		StringTokenizer str = new StringTokenizer(Message,",");
		
		String eid = str.nextToken();
		String ename =str.nextToken();
		String esal = str.nextToken();
		
String outMessage = "{eid:"+eid+",ename:"+ename+",esal:"+esal+"}";
        
        exchange.getIn().setBody(outMessage);
	}

}
