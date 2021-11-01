package Interview_Program_1_11_21;

import java.util.Scanner;

public class Amstrong_num2 {
public static void main(String[] args) {
	System.out.println("Enter any no");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int num=n;
	int temp=0,tot=0;
	while(num!=0)
	{
		temp=num%10;
		tot+=Math.pow(temp,3);
		num/=10;
	}
	if(tot==n)
	{
		System.out.println("Amstrong number");
	}
	else
		System.out.println("Not Amstrong Number");
}
}
/*
Enter any no
234
Not Amstrong Number
*/