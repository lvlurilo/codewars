package codewarsJrTest;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import codewarsJr.ArrayDiffClass;

public class ArrayDiffTest {

	ArrayDiffClass arrayDiffClass = new ArrayDiffClass();

	@Test
	public void sampleTests() {
		assertArrayEquals(new int[] { 2 }, arrayDiffClass.arrayDiff(new int[] { 1, 2 }, new int[] { 1 }));
		assertArrayEquals(new int[] { 2, 2 }, arrayDiffClass.arrayDiff(new int[] { 1, 2, 2 }, new int[] { 1 }));
		assertArrayEquals(new int[] { 1 }, arrayDiffClass.arrayDiff(new int[] { 1, 2, 2 }, new int[] { 2 }));
		assertArrayEquals(new int[] { 1, 2, 2 }, arrayDiffClass.arrayDiff(new int[] { 1, 2, 2 }, new int[] {}));
		assertArrayEquals(new int[] {}, arrayDiffClass.arrayDiff(new int[] {}, new int[] { 1, 2 }));
	}

}
