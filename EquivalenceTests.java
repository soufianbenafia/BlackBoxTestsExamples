import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class BlackBoxTest_Template {

	public static Collection<Object[]> equivalenceClassesDataProvider() {
		return Arrays.asList(new Object[][] { { 15, 8, Color.RED }, { 18, 9, Color.BLUE }, { 18, 9, Color.BLUE },
				{ 9, 8, Color.RED }, { 11, -2, Color.YELLOW }, { 19, -5, Color.YELLOW }, { 9, -1, Color.GREEN },
				{ 13, 5, Color.YELLOW }, { 20, 5, Color.YELLOW }, { 5, 1, Color.YELLOW }, { 17, 8, Color.YELLOW },
				{ 17, -2, Color.YELLOW }, { 17, 5, Color.YELLOW },
		});
	}

	@ParameterizedTest
	@MethodSource("equivalenceClassesDataProvider")
	void testEquivalenceClasses(int x, int y, Color expected) {
		Color actual = BlackBox.G(x, y);
		assertEquals(expected, actual);
	}

	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(BlackBox.evalEqClasses(), "Not all equivalence classes covert!");
	}

}
