package TypeCasting;

public class Add {
public static void main(String[] args) {
	int x = 100 + 50;
	System.out.println(x);
	int sum1 = 100 + 50;        // 150 (100 + 50)
	int sum2 = sum1 + 250;      // 400 (150 + 250)
	int sum3 = sum2 + sum2;  
	System.out.println(sum3);
}
}
/*
150
800
*/