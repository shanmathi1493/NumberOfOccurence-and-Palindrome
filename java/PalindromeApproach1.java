package week1.day1.java;

public class PalindromeApproach1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //write the input
		String input = "malayalam";
		//we need to check if original input and reverse of the same are equal
		//creating empty string to store the value of reverse of input
		String rev = "";
		for (int i = input.length()-1; i >=0; i--) {
			rev += input.charAt(i);
		}
				System.out.println(input.equals(rev)?"Yes, Palindrome":"No, not a palindrome");
			}
				
			
		}
		
	


