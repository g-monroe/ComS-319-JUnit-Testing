package cs319.lab1;
import static org.junit.Assert.*;
import org.junit.Test;
public class MyTests {
	@Test
	public void findMaxShouldReturnMaxOfThree()
	{
	MyClass tester = new MyClass(); // MyClass is tested
	 // assert statements
	 assertEquals("Max of (3,2,1) must be 3", 3, tester.findMax(3,2,1));
	 assertEquals("Max of (1,3,2) must be 3", 3, tester.findMax(1,3,2));
	 assertEquals("Max of (1,2,3) must be 3", 3, tester.findMax(1,2,3));
	 //Added
	 assertEquals("Max of (2,3,1) must be 3", 3, tester.findMax(1,2,3));
	
	}

}
