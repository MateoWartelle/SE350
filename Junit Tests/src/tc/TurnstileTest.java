package tc;

import static org.junit.Assert.*;
import org.junit.Test;

import code.Turnstile;


public class TurnstileTest {
	@Test
	public void testadd2Coins()	{
		Turnstile turnStile = new Turnstile();
		turnStile.addTurn();
		turnStile.addTurn();
		assertEquals(turnStile.countTurns(),2);
	}
	
	@Test
	public void testAddandEnter(){
		Turnstile turnStile = new Turnstile();
		turnStile.addTurn();
		assertTrue(turnStile.pushTurnStile("")==true);
	}	

	@Test
	public void testProhibitEntry(){
		Turnstile turnStile = new Turnstile();
		assertTrue(turnStile.pushTurnStile("")==false);
	}
}
