import java.io.*;

/* String is palindrome if it is equal to its reverse */

/* Check output for "never odd or even" */

public class Palindrome {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string.");
		String s = br.readLine(); 
		
		/* REMOVE WHITESPACES FROM THE INPUT STRING*/
		String s1 = s.replaceAll("\\s", "");
		System.out.println(s1);
		if(palindrome(s1))
			System.out.println("The given string is a palindrome.");
		else
			System.out.println("The given string is not a palindrome.");
		
	}
	
	static boolean palindrome(String s1) {
		int len = s1.length();
		String reverse = "";
		//int j = len-1;
		for(int i = len-1; i >=0; i--) {
			reverse = reverse + s1.charAt(i);		
		}
		System.out.println(reverse);
		String r1 = reverse.replaceAll("\\s", "");
		System.out.println(r1);
		if(r1.equals(s1)) 
			return true;
		else 
			return false;
	}
}
