import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		int finalNum = 0;
		int num = 0;
		
		if (validateString(romanNum)) {
			int [] romanNumArr = convertToArray(romanNum);

			for (int i = 0; i < romanNumArr.length; i++) {
				num = convertCharacter(romanNum.charAt(i));
				if ((i < romanNumArr.length-1 && num < romanNumArr[i+1])) {
					// subtract
					finalNum = finalNum - romanNumArr[i];
				} else {
					// add
					finalNum = finalNum + romanNumArr[i];
				}
			}
			return finalNum;
			
		} else {
			return 0;
		}
	}
	
	private int[] convertToArray(String romanNum) {
		int[] romanArr = new int[romanNum.length()];
		for (int i = 0; i < romanNum.length(); i++) {
			romanArr[i] = convertCharacter(romanNum.charAt(i));
		}
		return romanArr;
	}
	
	public int convertCharacter(char romanNum) {
		switch (romanNum) {
		    case 'M':
		        return 1000;
		    case 'D':
		        return 500;
		    case 'C':
		        return 100;
		    case 'L':
		        return 50;
		    case 'X':
		        return 10;
		    case 'V':
		        return 5;
		    case 'I':
		        return 1;
		    default:
		        return 0;
		}
	}
	
	public boolean validateString(String romanNum) {
		boolean isValid = validateCharacters(romanNum);
		if (isValid) {
			isValid = validateRepeats(romanNum);
		}
		return isValid;
	}
	
	public boolean validateCharacters(String romanNum) {
	    String pattern = "[M|D|C|L|X|V|I]*";
	    Pattern p = Pattern.compile(pattern);
	    Matcher m = p.matcher(romanNum);
		return m.matches();
	}
	
	public boolean validateRepeats(String romanNum) {
		boolean isValid = true;
		
		if (romanNum.contains("IIII") || romanNum.contains("XXXX") || romanNum.contains("CCCC") || romanNum.contains("MMMM")) {
			isValid = false;
		}
		
		if (romanNum.contains("VV") || romanNum.contains("LL") || romanNum.contains("DD")) {
			isValid = false;
		}

		return isValid;
	}
}
