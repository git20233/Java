package com.obsqura.Inheritance;

public class Circle extends Shape {
	
	String Color;
	double  radius;
	
	
	public Circle (String Color,double radius) 
	{
		super("Circle","blue");
		this.radius=radius;
	}
	public String Print()
    {
		
	return super.display() + "Radius :"+radius;
    }
	
}
