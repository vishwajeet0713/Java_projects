package Hello_World;

public class Non_Static_Block {

	int value;

	{
		// This block will execute every time an object is created
		value = 20;
		System.out.println("Non-static block: " + value);
	}

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		// Non-static block runs when an object is created
		System.out.println("Main method: " + obj.value);
	}
}
