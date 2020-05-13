package week1.day1.java;

public class NumberOfOccurenceApproach3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write the input
		String input = "You have no choice other than following me";
		String replace = input.replaceAll("[^o]", "");
		System.out.println("Number of occurences of o is:"+replace.length());
		
		
	}

}
