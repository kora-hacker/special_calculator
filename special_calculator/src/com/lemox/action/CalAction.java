package com.lemox.action;

import com.opensymphony.xwork2.ActionSupport;

public class CalAction extends ActionSupport
{
	private String resource;

	public String getResource()
	{
		return resource;
	}
	
	public String cal ()
	{
		System.out.println(resource);
		return "success";
	}
	

	public void setResource(String resource)
	{
		this.resource = resource;
	}
}
