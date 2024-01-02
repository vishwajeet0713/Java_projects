package Basic_programmig;

public class DIGITds_from_a_number {

	//WAJP to print all the even DIGITds from a number
	 
	public static void main(String[] args) {
		int n=128;
	int sum=0;
	int pro=1;
		while(n!=0) {
			
			int d=n%10;
			if(d%2==0) {
				sum=sum+d;
				pro=pro*d;
			}
			n=n/10;
			
		
		}
		System.out.println(sum);
		System.out.println(pro);
	}
	}

