package com.abhay.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class jenkins_test {

	@Test
	public int addTest() {
		jenkins_calculator myCalc = new jenkins_calculator();
		assertEquals(10,myCalc.add_num(5,5));
	}
	@Test
	public int subtractTest() {
		jenkins_calculator myCalc = new jenkins_calculator();
		assertEquals(5,myCalc.sub_num(10,5));
	}

}
