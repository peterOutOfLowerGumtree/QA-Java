package main;

import static org.junit.Assert.*;
import org.junit.*;

public class BlackjackTest {

	@Test
	public void blackjackCase1() {
		String result = Blackjack.blackjack(22, 22);
		assertEquals("BOTH LOSE", result);
	}

	@Test
	public void blackjackCase2() {
		String result = Blackjack.blackjack(20, 20);
		assertEquals("DRAW", result);
	}

	@Test
	public void blackjackCase3() {
		String result = Blackjack.blackjack(20, 19);
		assertEquals("PLAYER 1 WINS", result);
	}

	@Test
	public void blackjackCase4() {
		String result = Blackjack.blackjack(19, 20);
		assertEquals("PLAYER 2 WINS", result);
	}

	@Test
	public void blackjackCase5() {
		String result = Blackjack.blackjack(22, 19);
		assertEquals("PLAYER 2 WINS", result);
	}

	@Test
	public void blackjackCase6() {
		String result = Blackjack.blackjack(19, 22);
		assertEquals("PLAYER 1 WINS", result);
	}

	@Test
	public void blackjackCase7() {
		String result = Blackjack.blackjack(-1, 1);
		assertEquals("ERROR", result);
	}
}