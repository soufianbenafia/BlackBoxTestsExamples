import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
class BlackBoxTest_Template {

	@ParameterizedTest
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 15, 8, Color.RED }, { 18, 9, Color.BLUE }, { 18, 9, Color.BLUE },
				{ 9, 8, Color.RED }, { 11, -2, Color.YELLOW }, { 19, -5, Color.YELLOW }, { 9, -1, Color.YELLOW },
				{ 13, 5, Color.YELLOW }, { 20, 5, Color.YELLOW }, { 5, 1, Color.YELLOW }, { 17, 8, Color.YELLOW },
				{ 17, -2, Color.YELLOW }, { 17, 5, Color.YELLOW },

		});
	}

	private final Color expected;
	private final int x;
	private final int y;

	public BlackBoxTest_Template(int x, int y,Color expected) {
		this.expected = expected;
		this.x = x;
		this.y = y;
	}

	@Test
	void test() {
		Color actual = BlackBox.G(x, y);
		assertEquals(expected, actual);
	}

	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(BlackBox.evalEqClasses(), "Not all equivalence classes covert!");
	}

}
