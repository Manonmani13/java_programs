package logic;

public class ExtractDigit {
public static void main(String[] args) {
	String i="12131";
	for(int j=i.length()-1;j>=0;j--)
	{
		System.out.println("digit position "+j+ " value "+i.charAt(j));
	}
}
}
