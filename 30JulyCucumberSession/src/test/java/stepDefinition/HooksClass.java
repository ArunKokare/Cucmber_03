package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass {
	
	@Before(order=0)
	public  void setUp()
	{
		System.out.println("Start Execution");
	}
	
	@After(order=0)
	public void tearDown()
	{
		System.out.println("Stop Execution");
	}
	
	@Before(order=1)
	public void setUp1()
	{
		System.out.println("Start Execution1");
	}
	
	@After(order=1)
	public void tearDown1()
	{
		System.out.println("Stop Execution1");
	}
	
	@Before(order=2)
	public void setUp2()
	{
		System.out.println("Start Execution2");
	}
	
	@After(order=2)
	public void tearDown2()
	{
		System.out.println("Stop Execution2");
	}
	
	

}
