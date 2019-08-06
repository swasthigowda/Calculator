package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {
	Calculator cl;
	//@SuppressWarnings("static-access")
	//@Test
	//public void testAdd() {
		//cl = new Calculator();
		//int result=2+4;
		
		//assertEquals("Hello World!",sm.printHello());
	//}
	
	//@SuppressWarnings("static-access")
	//@Test
	public void testadd() {
		cl = new Calculator();
		int result= 2+4;
		assertEquals(result,cl.add(2,4));
	}

}
