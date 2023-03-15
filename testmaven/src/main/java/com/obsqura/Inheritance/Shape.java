package com.obsqura.Inheritance;

public class Shape {
	String Name ;
	String Color;
	
	public Shape()
	{
		super();
	}
	
	
	public Shape(String Name,String Color)
	{
	super();
	this.Name=Name;
	this.Color=Color;
	
	}
	public String display()
	{
		return "Name:" +Name +",Color:" + Color ;
		
		
	}
	
	}


