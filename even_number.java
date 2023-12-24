package Basic_programmig;

public class even_number {

	//sum of even number range is 5 t 12
	 
	public static void main(String[] args) {
		int sum=0;
		for(int i=5;i<=12;i++) {
	          if(i %2==0) {
	        	  sum=sum+i;
	          }
		}
		System.out.println(sum);
	}
	}


