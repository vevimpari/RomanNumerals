import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		int finalNum = 0;
		int num = 0;
		int prevNum = 0;
		
		if (validateString(romanNum)) {
			for (int i = 0; i < romanNum.length(); i++) {
				prevNum = num;
				num = convertCharacter(romanNum, i);
				
				if ((num < prevNum) && (prevNum == 1 || prevNum == 10 || prevNum == 100)) {
					// subtract
					finalNum = num-prevNum;
				} else {
					finalNum = finalNum + num;
				}
			}
			
			return finalNum;
			
		} else {
			return 0;
		}
	}
	
	public int convertCharacter(String romanNum, int i) {
		char c = romanNum.charAt(i);
		switch (c) {
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

	
	public ArrayList<String> convertToList(String romanNum) {
		ArrayList<String> charList  = new ArrayList<String>();
		return charList;
	}
	
	public int countI(String romanNum) {
		int i = romanNum.split("I",-1).length-1;
		return i;
	}
}
