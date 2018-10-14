import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	@Test
	public void romanNumerals_stringIsValid_invalidCharacters() {
		RomanNumerals rn = new RomanNumerals();		
		int num = rn.convertToInteger("AA");
		assertEquals("String contains invalid characaters, return 0", 0, num);
	}
	
	@Test
	public void romanNumerals_stringIsValid_repeatI() {
		RomanNumerals rn = new RomanNumerals();		
		int num = rn.convertToInteger("IIII");
		assertEquals("String is invalid, I can be repeated at most 3 times, should return 0", 0, num);
	}
	
	@Test
	public void romanNumerals_stringIsValid_repeatX() {
		RomanNumerals rn = new RomanNumerals();		
		int num = rn.convertToInteger("XXXX");
		assertEquals("String is invalid, X can be repeated at most 3 times, should return 0", 0, num);
	}
	
	@Test
	public void romanNumerals_stringIsValid_repeatC() {
		RomanNumerals rn = new RomanNumerals();		
		int num = rn.convertToInteger("CCCC");
		assertEquals("String is invalid, C can be repeated at most 3 times, should return 0", 0, num);
	}
	
	@Test
	public void romanNumerals_stringIsValid_repeatM() {
		RomanNumerals rn = new RomanNumerals();		
		int num = rn.convertToInteger("MMMM");
		assertEquals("String is invalid, M can be repeated at most 3 times, should return 0", 0, num);
	}
	
	@Test
	public void romanNumerals_testSingleCharacters() {
		RomanNumerals rn = new RomanNumerals();
		
		int num = rn.convertToInteger("I");
		assertEquals("I should be 1", 1, num);
		num = rn.convertToInteger("V");
		assertEquals("V should be 5", 5, num);
		num = rn.convertToInteger("X");
		assertEquals("X should be 10", 10, num);
		num = rn.convertToInteger("L");
		assertEquals("L should be 50", 50, num);
		num = rn.convertToInteger("C");
		assertEquals("C should be 100", 100, num);
		num = rn.convertToInteger("D");
		assertEquals("C should be 500", 500, num);
		num = rn.convertToInteger("M");
		assertEquals("M should be 1000", 1000, num);
	}
	
	@Test
	public void romanNumerals_Iequals1() {
		RomanNumerals rn = new RomanNumerals();
		int num = rn.convertToInteger("I");
		assertEquals("I should be 1", 1, num);
	}
	
	@Test
	public void romanNumerals_IIequals2() {
		RomanNumerals rn = new RomanNumerals();
		int num = rn.convertToInteger("II");
		assertEquals("II should be 2", 2, num);
	}
	
	@Test
	public void romanNumerals_IVequals4() {
		RomanNumerals rn = new RomanNumerals();
		int num = rn.convertToInteger("IV");
		assertEquals("IV should be 4", 4, num);
	}
	
	@Test
	public void romanNumerals_VIequals6() {
		RomanNumerals rn = new RomanNumerals();
		int num = rn.convertToInteger("VI");
		assertEquals("VI should be 6", 6, num);
	}
	
	@Test
	public void romanNumerals_VIIequals7() {
		RomanNumerals rn = new RomanNumerals();
		int num = rn.convertToInteger("VII");
		assertEquals("VII should be 7", 7, num);
	}
	
	@Test
	public void romanNumerals_IXequals9() {
		RomanNumerals rn = new RomanNumerals();
		int num = rn.convertToInteger("IX");
		assertEquals("IX should be 9", 9, num);
	}
	
	@Test
	public void romanNumerals_XXequals20() {
		RomanNumerals rn = new RomanNumerals();
		int num = rn.convertToInteger("XX");
		assertEquals("XX should be 20", 20, num);
	}

	@Test
	public void romanNumerals_LXXequals70() {
		RomanNumerals rn = new RomanNumerals();
		int num = rn.convertToInteger("LXX");
		assertEquals("LXX should be 70", 70, num);
	}
	
	@Test
	public void romanNumerals_LXXXequals80() {
		RomanNumerals rn = new RomanNumerals();
		int num = rn.convertToInteger("LXXX");
		assertEquals("LXXX should be 80", 80, num);
	}

}
