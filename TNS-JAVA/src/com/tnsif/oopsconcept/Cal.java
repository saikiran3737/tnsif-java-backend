//compile time polymorphism
package com.tnsif.oopsconcept;

public class Cal {
public int add(int a,int b) {
	return a+b;
	
}
public float add(float a,float b) {
	return a+b;
	
	
}


	public static void main(String[] args) {
		Cal ob=new Cal();
		System.out.println(ob.add(12,15 ));
		System.out.println(ob.add(2.6f, 7.5f));
		

	}

}
