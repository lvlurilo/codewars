package codewarsJrTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import codewarsJr.CamelCaseClass;

public class CamelCaseTest {
	
	@Test
    public void testSomeUnderscoreLowerStart() {
      String input = "the_Stealth_Warrior";
      System.out.println("input: "+input); 
      System.out.println("output: "+CamelCaseClass.toCamelCase(input));
      assertEquals("theStealthWarrior", CamelCaseClass.toCamelCase(input));
    }
	
	@Test
    public void testSomeDashLowerStart() {
      String input = "the-Stealth-Warrior";
      System.out.println("input: "+input); 
      System.out.println("output: "+CamelCaseClass.toCamelCase(input));
      assertEquals("theStealthWarrior", CamelCaseClass.toCamelCase(input));
    }
	
	@Test
    public void testNullLowerStart() {
      String input = "";
      System.out.println("input: "+input); 
      System.out.println("output: "+CamelCaseClass.toCamelCase(input));
      assertEquals("", CamelCaseClass.toCamelCase(input));
    }
	
	

}
