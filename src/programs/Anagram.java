package programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str1= "Listen";
		String str2= "Silent";
		//Remove white spaces;
		str1=str1.replaceAll("//s", "");
		str2=str2.replaceAll("//s", "");
		
		// convert string to lowercase and then convert to char array
		char[] c1 = str1.toLowerCase().toCharArray();
		char[] c2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2)) 
			System.out.println("both are anagram");
		else
			System.out.println("both are not anagram");

	}

}
