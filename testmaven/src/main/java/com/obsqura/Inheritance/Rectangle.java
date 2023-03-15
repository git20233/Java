package com.obsqura.Inheritance;

public class Rectangle extends Shape
{
	double a, b;
	public Rectangle()
	{
		super();
	}
	 public Rectangle(String Color,double a,double b)
	 {
		 super("Rectangle", Color);
		 this.a = a;
		 this.b = b;
	 }
	 
	 public String display()
	 {
		return super.display()     +"a:"+a+ ",  b:" + b; 
	 }

}
