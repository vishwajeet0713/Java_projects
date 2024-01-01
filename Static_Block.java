package Hello_World;

public class  Static_Block {
	static int number;

	static {
		// This block will execute when the class is loaded
		number = 10;
		System.out.println("Static block: " + number);
	}

	public static void main(String[] args) {
		// Static block has already executed before this point
		System.out.println("Main method: " + number);
	}
}
