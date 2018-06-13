package com.mum.edu.test;

import org.junit.Test;

import com.mum.edu.classes.MyProject;

import junit.framework.TestCase;

public class TestWelcome2 extends TestCase{

	@Test
	public void test() {
		MyProject tester1 = new MyProject();
		
		assertEquals("Welcome", tester1.welcome());
		//assertEquals("Welcome1", tester1.welcome());
	}

}
