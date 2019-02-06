package com.zserg.controller;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.zserg.controller.Controller;

public class ControllerTest {

	@Test
	public void test_welcome_message() {
		Controller obj = new Controller();
		assertEquals("welcome", obj.hello());
	}

}
