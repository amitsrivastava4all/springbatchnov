package com.srivastava.basics;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/loans")
public class MyFirstWS {
@GET
@Path("/emi")
@Produces(MediaType.TEXT_PLAIN)
public String getMessage(){
	return "Hello Client ";
	
}
@GET
@Path("/repayment")
@Produces(MediaType.TEXT_HTML)
public String getHTMLMessage(){
	return "<h1>Hello Client </h1>";
	
}
@GET
@Path("/MyWSXML")
@Produces(MediaType.TEXT_XML)
public String getXMLMessage(){
	return "<?xml version=\"1.0\"?>" + "<hello> Hello Client XML" + "</hello>";
}
}
