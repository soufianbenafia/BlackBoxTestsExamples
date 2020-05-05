import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class StateTest_Template {

	public static Collection<Object[]> transitionsDataProvider() {
		return Arrays.asList(new Object[][] { { new String[] { "c", "b", "c", "d", "b", "b" }, "S1" },
				{ new String[] { "d", "d", "b", "a" }, "Final" }, { new String[] { "c", "a" }, "Final" },
				{ new String[] { "b", "c", "a" }, "Final" }, });
	}

	@ParameterizedTest
	@MethodSource("transitionsDataProvider")
	void testStateTransition(String[] string, String expected) {
		Statemachine.start();
		for (String k : string) {
			Statemachine.transition(k);
		}

		String stateName = Statemachine.getStateName();
		assertEquals(expected, stateName);
	}

	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(Statemachine.evalCoverage(), "There are states or transitions left to cover!");
	}
}