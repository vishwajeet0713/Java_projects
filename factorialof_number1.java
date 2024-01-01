package Basic_programmig;

public class factorialof_number1 {

////WAjp factorial of number in the given range starts 1 To 10
 
//	public static void main(String[] args) {
//		
//	
//		int fact=1;
//		for(int j=1;j<=10;j++) {
//		
//			fact=fact*j;
//		
//		System.out.println("Factorial of "+j+" is :"+fact);
//	}
//
//}
//}
	public static void main(String[] args) {
		//int fact=1;
		for(int i=1;i<=10;i++) {
			int fact=1;
			for(int j=1;j<=i;j++) {
				fact=fact*j;
			}
				System.out.println("factorial of "+i+"is: "+fact);
			}
		}
	}
	
	
	

