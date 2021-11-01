package Interview_Program_1_11_21;

import java.util.Scanner;

public class Alphabet_pro3 {
public static void main(String[] args) {
	System.out.println("Enter value of N");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
		for(int h=1;h<=n;h++)
		{
			for(char j=0;j<h;j++)
			{
				System.out.print((char)(j+65)+" ");
			}
			System.out.println();
		}
}
}
/*
 Enter value of N
4
A 
A B 
A B C 
A B C D 
 */
