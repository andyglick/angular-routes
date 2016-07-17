package net.xeric.demos.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author markshead
 */
public class CounterServiceTest {
	private CounterService counterService = new CounterService();

	@Test
	public void testCounter() {
		assertEquals(1, counterService.increment());
		assertEquals(2, counterService.increment());
		assertEquals(3, counterService.increment());
	}
}