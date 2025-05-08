//runtime polymorphism
package com.tnsif.oopsconcept;
//override
public class Demo {
	public void msg() {
		System.out.println("this is runtime Demo");
	}
	}
class Sample extends Demo{
	public void msg() {
		System.out.println("this is runtime Demo called from Demo class");
	}
}

