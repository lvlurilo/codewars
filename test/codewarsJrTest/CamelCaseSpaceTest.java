package codewarsJrTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import codewarsJr.CamelCaseSpaceClass;

public class CamelCaseSpaceTest {
	
	@Test
    public void tests() {
      assertEquals( "Incorrect", "camel Casing", CamelCaseSpaceClass.camelCase("camelCasing"));
      assertEquals( "Incorrect", "camel Casing Test", CamelCaseSpaceClass.camelCase("camelCasingTest"));
      assertEquals( "Incorrect", "camelcasingtest", CamelCaseSpaceClass.camelCase("camelcasingtest"));
    }
}



