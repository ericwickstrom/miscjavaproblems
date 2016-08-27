package com.beardsmcgee.misc.countletter;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountLetterTest {

	// Test lowercase
	@Test
	public void iShouldBe2() {
		CountLetter cl = new CountLetter("xanadu.txt");
		assertTrue(cl.count("i") == 2);
	}
	
	// Test uppercase
	@Test
	public void IShouldBe2() {
		CountLetter cl = new CountLetter("xanadu.txt");
		assertTrue(cl.count("I") == 2);
	}
	
	@Test
	public void NShouldBe7() {
		CountLetter cl = new CountLetter("xanadu.txt");
		assertTrue(cl.count("N") == 7);
	}

}
