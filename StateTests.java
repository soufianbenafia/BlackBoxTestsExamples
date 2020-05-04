import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class StateTest_Template {

	@Test
	void test() {
		Statemachine.start(); 
		Statemachine.getStateName(); //S1
		Statemachine.getStateEvents(); 
		Statemachine.transition("c"); 
		Statemachine.getStateName(); //S5
		Statemachine.getStateEvents();
		Statemachine.transition("b"); 
		Statemachine.getStateName(); //S2
		Statemachine.getStateEvents(); 
		Statemachine.transition("c");
		Statemachine.getStateName(); //S4
		Statemachine.getStateEvents(); 
		Statemachine.transition("d");
		Statemachine.getStateName(); //S6
		Statemachine.getStateEvents(); 
		Statemachine.transition("b");
		Statemachine.getStateName(); //S3
		Statemachine.getStateEvents(); 
		Statemachine.transition("b");
		String stateName = Statemachine.getStateName(); //S1

		assertEquals("S1", stateName);
	}
	
	@Test
	void test2() {
		Statemachine.start(); 
		Statemachine.getStateName(); //S1
		Statemachine.getStateEvents(); 
		Statemachine.transition("d"); 
		Statemachine.getStateName(); //S3
		Statemachine.getStateEvents(); 
		Statemachine.transition("d");
		Statemachine.getStateName(); //S4
		Statemachine.getStateEvents(); 
		Statemachine.transition("b");
		Statemachine.getStateName(); //S2
		Statemachine.getStateEvents(); 
		Statemachine.transition("a");
			
		String stateName = Statemachine.getStateName(); //FINAL

		assertEquals("Final", stateName);
	}
	

	@Test
	void test3() {
		Statemachine.start(); 
		Statemachine.getStateName(); //S1
		Statemachine.getStateEvents(); 
		Statemachine.transition("c"); 
		Statemachine.getStateName(); //S5
		Statemachine.getStateEvents(); 
		Statemachine.transition("a");
			
		String stateName = Statemachine.getStateName(); //FINAL

		assertEquals("Final", stateName);
	}
	
	@Test
	void test4() {
		Statemachine.start(); 
		Statemachine.getStateName(); //S1
		Statemachine.getStateEvents(); 
		Statemachine.transition("b"); 
		Statemachine.getStateName(); //S2
		Statemachine.getStateEvents(); 
		Statemachine.transition("c");
		Statemachine.getStateName(); //S4
		Statemachine.getStateEvents(); 
		Statemachine.transition("a");
			
		String stateName = Statemachine.getStateName(); //FINAL

		assertEquals("Final", stateName);
	}

	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(Statemachine.evalCoverage(), "There are states or transitions left to cover!");
	}

}
