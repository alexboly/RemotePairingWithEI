package ro.alexbolboaca.TDDPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Tests {

	@Test
	public void testThatFails(){
		assertEquals(true, false);
	}

	@Test
	public void testThatPasses(){
		assertEquals(true, true);
	}
}
