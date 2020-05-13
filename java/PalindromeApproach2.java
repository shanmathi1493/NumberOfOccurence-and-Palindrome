package week1.day1.java;

public class PalindromeApproach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write the input
    String input = "testleaf";
/*we need to check if original input and reverse of the same are equal.
we are using String buffer, which is a class that resolves "String immutable" issue and 
and it has a method called reverse.tostring(), which converts string buffer to string*/
    StringBuffer stb = new StringBuffer(input);
    String rev = stb.reverse().toString();
   if(input.equals(rev))
   {
	   System.out.println("Yes, Palindrome");
   }
   else
   {
	   System.out.println("No, not a palindrome");
   }
	}

}
