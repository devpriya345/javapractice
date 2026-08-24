package in.priyait;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		
		int actualResult= c.add(10, 20);
		
		int exceptedResult =30;
		
		Assertions.assertEquals(exceptedResult,actualResult);
	}
}
