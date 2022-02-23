package init.lpu.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Test Case: A class that will test our code
public class TestEmployee {
	//test methods
	@BeforeEach
	public void setup()
	{
		System.out.println("FROM SETUP");
	}
	@Test
	public void testSave()
	{
		System.out.println("Test-Save");
	}
	

}
