package test;

import java.util.StringTokenizer;

public class StringTokenizer {

	public static void main(String[] args) {
		StringTokenizer s= new StringTokenizer(" welcome to java");
		
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
	}

}
