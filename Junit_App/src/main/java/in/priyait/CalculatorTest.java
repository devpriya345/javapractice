package in.priyait;


public class CalculatorTest {
	@Test
	
	public void testAdd() {
		Calculator c = new Calculator();
		
		int actualResult = c.add(10,20);
		
		int exceptedResult =30;
		
		(exceptedResult,actualResult);
	}
}
