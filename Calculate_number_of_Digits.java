package Basic_programmig;

//WAJP caluculate  product of digits of number 
public class Calculate_number_of_Digits {
public static void main(String[] args) {
	int n=1234;
	int pro=1;
	while(n!=0) {
		int d=n%10;
		System.out.println(d);
		n=n/10;
		pro=pro*d;
	
	}
	System.out.println("sum of Digits Of number is : "+pro);
}
}