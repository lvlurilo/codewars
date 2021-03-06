package codewarsJrTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import codewarsJr.WhoLikeItClass;

public class WhoLikeItTest {

	@Test
	public void staticTests() {

		WhoLikeItClass WhoLikeIt = new WhoLikeItClass();

		assertEquals("no one likes this", WhoLikeIt.whoLikesIt());
		assertEquals("Peter likes this", WhoLikeIt.whoLikesIt("Peter"));
		assertEquals("Jacob and Alex like this", WhoLikeIt.whoLikesIt("Jacob", "Alex"));
		assertEquals("Max, John and Mark like this", WhoLikeIt.whoLikesIt("Max", "John", "Mark"));
		assertEquals("Alex, Jacob and 2 others like this", WhoLikeIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
	}
}
