package Interview_Program_1_11_21;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc=new Scanner(System.in);
	String word=sc.nextLine();
	int i=0,j=word.length()-1;
	boolean b=true;
	while(i<j)
	{
		if(word.charAt(i)!=word.charAt(j))
		{
			System.out.println("not palindrome");
			b=false;
			break;
		}
		i++;
		j--;
	}
	if(b)
		System.out.println("palindrome");
	
	
}
}
/*
Enter a String
banana
not palindrome
*/