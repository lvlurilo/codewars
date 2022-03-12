package codewarsJrTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import codewarsJr.PrinterClass;

public class PrinterTest {

	PrinterClass printer = new PrinterClass();

	@Test
	public void Test() {

		System.out.println("printerError Fixed Tests");
		String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
		assertEquals("3/56", printer.printerError(s));
	}

}
