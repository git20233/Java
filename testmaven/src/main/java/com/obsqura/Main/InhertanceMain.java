

package com.obsqura.Main;


import com.obsqura.Inheritance.Shape;
import com.obsqura.Inheritance.Circle;
import com.obsqura.Inheritance.Rectangle;

public class InhertanceMain {
	public static void main(String[] args) {
		Shape S1= new Shape("Circle","Red");
		System.out.println(S1.display());
		Circle S2 = new Circle("blue" ,5.3);
		System.out.println(S2.Print());
        Rectangle S3=new Rectangle("Red" ,5,6);
    	System.out.println(S3.display());
    	
    	//upcasting
    	Shape S4=new Circle("Green",5.5);
    	System.out.println(S4.display());
    
	}
}

