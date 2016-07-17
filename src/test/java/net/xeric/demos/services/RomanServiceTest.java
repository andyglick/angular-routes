package net.xeric.demos.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author markshead
 */
public class RomanServiceTest {

	@SuppressWarnings("WeakerAccess")
	RomanNumberService romanService = new RomanNumberService();

	@Test
	public void testRoman() throws Exception {

		assertEquals("I", romanService.toRoman(1));
		assertEquals("V", romanService.toRoman(5));
	}
}