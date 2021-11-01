package Interview_Program_1_11_21;

import java.util.Scanner;

public class Amstrong_num1 {
public static void main(String[] args) {
	System.out.println("Enter any no");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int num,temp,t;
	num=n;

	t=0;
	while(num!=0)
	{
		temp=num%10;
		t=t+temp*temp*temp;
		num=num/10;
	}

	if(t==n)
	{
		System.out.println(n+" Amstrong No");
	}
	else
	{
		System.out.println(n+" not Amstrong No");
	}
	}
}

