package Basic_programmig;

public class alltheeven_numbers {

	//product of the all the even numbers ranfe is 5 to 12
	 
		public static void main(String[] args) {
			int pro=1;
			for(int i=5;i<=12;i++) {
				if(i%2==0) {
					pro=pro*i;
				}
				
			}
			System.out.println(pro);
		}

	}


