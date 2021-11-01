package Interview_Program_1_11_21;

import java.util.Scanner;

public class Fibbnocci {
public static void main(String[] args) {
	System.out.println("Enter any number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();int f=-1,s=1,t=0;
	
	for(int i=1;i<=n;i++)
	{
		t=f+s;
		System.out.print(t+" ");
		f=s;
		s=t;
	}
}
}
/*
Enter any number
10
0 1 1 2 3 5 8 13 21 34 ss
*/