package com.qa;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("listeN", "ten   lis"));

	}
	
	
	public static boolean isAnagram(String word1,String word2) {
		
		String s1 = word1.replaceAll("\\s","");
		String s2 = word2.replaceAll("\\s","");
		if(s1.length()!=s2.length()) {
			
			return false;
		}
		
		else {
			
		char ch1[] = s1.toLowerCase().toCharArray();
		char ch2[] = s2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		//System.out.println(ch1);
		//System.out.println(ch2);
		return Arrays.equals(ch1, ch2);
		
		}
}
}

//2nd change
//change3
//change4

