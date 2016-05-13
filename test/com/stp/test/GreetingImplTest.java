package com.stp.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stp.main.Greeting;
import com.stp.main.GreetingImpl;

import org.junit.After;
import org.junit.Before;

public class GreetingImplTest {

	private Greeting greeting;

@Before
public void setup()
{
	System.out.println("Setup");
	 greeting =	new GreetingImpl();
	
}
@Test
public void greetShouldReturnAValidOutput()
{
	System.out.println("greetShouldReturnAValidOutput");
	String result = greeting.greet("stp");
	assertNotNull(result);
	assertEquals("Hello stp", result);
}

@Test(expected = IllegalArgumentException.class)
public void greetShouldThrowAnException_For_NameIsNull()
{
	System.out.println("greetShouldThrowAnException_For_NameIsNull");
	greeting.greet(null);
}

@Test(expected = IllegalArgumentException.class)
public void greetShouldThrowAnException_For_NameIsBlank()
{
	System.out.println("greetShouldThrowAnException_For_NameIsBlank");
	greeting.greet("");
}

@After

public void teardown()
{
	System.out.println("tear down");

	greeting = null;	
}


}


