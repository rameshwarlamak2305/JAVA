package lab9mar;

public class StringLab {
	
	    public static void main(String[] args) {
	        String str = "Welcome to Java World";

	        // Returns the character at 5th position 
	        char charAt5 = str.charAt(4);
	        System.out.println("Character at 5th position: " + charAt5);

	        
	        // Concatenates “ Let us learn”
	        String newStr = str.concat(" -Let us learn");
	        System.out.println("Concatenated string: " + newStr);

	        // Returns the position of the first occurrence of character ‘a’ and display it.
	        int indexOfA = str.indexOf('a');
	        System.out.println("Index of first 'a': " + indexOfA);

	        // Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
	        String replacedStr = str.replace('a', 'e');
	        System.out.println("Replaced string: " + replacedStr);

	        // Returns string between 4th position and 10th position and display it.
	        String subStr = str.substring(3, 10);
	        System.out.println("Substring between 4th and 10th position: " + subStr);

	        // Returns the lowercase of the string and display it.
	        String lowerCaseStr = str.toLowerCase();
	        System.out.println("Lowercase string: " + lowerCaseStr);
	    }
	}



