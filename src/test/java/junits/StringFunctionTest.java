package junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.StringFunction;

public class StringFunctionTest {
	
	@Test
	public void test1() {
		
		Assertions.assertTrue(StringFunction.isPalindrome("madam"));
		
	}
	
	@Test
	public void test2() {
		
		Assertions.assertFalse(StringFunction.isPalindrome("Palash"));
		
	}

}
