package week1.day1.java;

public class NumberOfOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //write the input
		String input = "You have no choice other than following me";
    //we need to find the number of 'o' in the given input string, so create a counter variable
		int count = 0;
	//using toCharArray to convert sentence(input string) into sequence of characters
		char[] arr = input.toCharArray();
		//iterate the given string 
		for (int i = 0; i < arr.length; i++) {
	
			if(arr[i]=='o')
			{
				count=count+1;
			}
		}
		
		System.out.println("Occurence of O is:"+count);
	}

}
