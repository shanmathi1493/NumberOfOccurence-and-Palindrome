package week1.day1.java;

public class NumberOfOccurencesApproach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //write the input
		String input = "You have no choice other than following me";
	    //we need to find the number of 'o' in the given input string, so create a counter variable
			int count = 0;
			for (int i = 0; i < input.length(); i++) 
			{
		//using charAt, which is a method that returns the index of characters in the given string
				if(input.charAt(i)=='o')
				{
				count++;
				}
			}
			System.out.println("Occurence of o is:"+count);
	}

}
