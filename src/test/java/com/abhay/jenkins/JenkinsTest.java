package com.abhay.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsTest {

	@Test
	public void addTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10,myCalc.add_num(5,5));
	}
	@Test
	public void subtractTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(5,myCalc.sub_num(10,5));
	}

}
