import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Test;

class SumRandomNumbersTest {
	
	SumRandomNumbers testObj = new SumRandomNumbers();
	
	@Test
	void testFindSum() {
		assertTrue(testObj.FindSum() < 1000 && testObj.FindSum() >= 0);
	}
	
	@Test
	void testRandomNumber() {
		assertTrue(testObj.GetRandomNumber() < 100 && testObj.GetRandomNumber() >= 0);
	}
	
	@Test
	void testSomething() {
		assertTrue(testObj.FindSum() > testObj.GetRandomNumber());
	}

}
