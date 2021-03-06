package Calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
    public void testMultipleNumbers(){
    	assertEquals(6, Calculator.add("1,2,3"));
    }

	@Test
	  public void testMultipleNumbersTwo(){
	  	assertEquals(4, Calculator.add("1,1,1,1"));
	  }

	@Test
	  public void testNewLine(){
	  	assertEquals(3, Calculator.add("1\n2"));
	  }

	@Test
	  public void testNumbersAndNewline(){
	  	assertEquals(6, Calculator.add("1\n2,3"));
	  }
}
