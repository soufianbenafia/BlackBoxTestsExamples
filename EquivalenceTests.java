import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class BlackBoxTest_Template {

	@Test
	void testZero() {
		/* Colors: YELLOW, GREEN, RED */ 
		Color expected = Color.YELLOW;
		int x = 5;
		int y = 1;
		Color actual = BlackBox.G(x, y);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCaseOne() {
		/* Colors: YELLOW, GREEN, RED */ 
		Color expected = Color.RED;
		int x = 15;
		int y = 8;
		Color actual = BlackBox.G(x, y);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCaseTwo() {
		/* Colors: YELLOW, GREEN, RED */ 
		Color expected = Color.BLUE;
		int x = 18;
		int y = 9;
		Color actual = BlackBox.G(x, y);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCaseThree() {
		/* Colors: YELLOW, GREEN, RED */ 
		Color expected = Color.RED;
		int x = 9;
		int y = 8;
		Color actual = BlackBox.G(x, y);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCaseFour() {
		/* Colors: YELLOW, GREEN, RED */ 
		Color expected = Color.YELLOW;
		int x = 11;
		int y = -2;
		Color actual = BlackBox.G(x, y);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCaseFive() {
		/* Colors: YELLOW, GREEN, RED */ 
		Color expected = Color.YELLOW;
		int x = 19;
		int y = -5;
		Color actual = BlackBox.G(x, y);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCaseSix() {
		/* Colors: YELLOW, GREEN, RED */ 
		Color expected = Color.YELLOW;
		int x = 9;
		int y = -1;
		Color actual = BlackBox.G(x, y);
		assertEquals(expected, actual);
	}
	
	//ungültige
	
	@Test
	void testCaseSeven() {
		/* Colors: YELLOW, GREEN, RED */ 
		Color expected = Color.YELLOW;
		int x = 13;
		int y = 5;
		Color actual = BlackBox.G(x, y);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCaseEight() {
		/* Colors: YELLOW, GREEN, RED */ 
		Color expected = Color.YELLOW;
		int x = 20;
		int y = 5;
		Color actual = BlackBox.G(x, y);
		assertEquals(expected, actual);
	}
	
	
	@Test
	void testCaseNine() {
		/* Colors: YELLOW, GREEN, RED */ 
		Color expected = Color.YELLOW;
		int x = 17;
		int y = 8;
		Color actual = BlackBox.G(x, y);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCaseTen() {
		/* Colors: YELLOW, GREEN, RED */ 
		Color expected = Color.YELLOW;
		int x = 17;
		int y = -2;
		Color actual = BlackBox.G(x, y);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCaseEleven() {
		/* Colors: YELLOW, GREEN, RED */ 
		Color expected = Color.YELLOW;
		int x = 17;
		int y = 5;
		Color actual = BlackBox.G(x, y);
		assertEquals(expected, actual);
	}
	
	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(BlackBox.evalEqClasses(), "Not all equivalence classes covert!");
	}

}
