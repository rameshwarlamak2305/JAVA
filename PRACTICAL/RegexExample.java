package test;

import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		boolean b=Pattern.matches("[a-zA-z0-9]{5,}", "Anudip");
		System.out.println(b);
	}

}
