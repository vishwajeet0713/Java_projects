package Hello_World;

import java.lang.reflect.Method;

class MyClass {
    // Static variable
    static int count = 0;
	public String value;
    
    // Method to increment count and display its value
    void incrementCount() {
        count++;
        System.out.println("Count is: " + count);
    }
    
}

public class Main {
	 public void method() {
			 System.out.println("Hi It's value counter ");
			 
		}
    public static void main(String[] args) {
        // Creating instances of MyClass
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        Main obj = new Main();
        obj.method();
        
        // Accessing the static variable 'count' using both instances
        obj1.incrementCount(); // Output: Count is: 1
        obj2.incrementCount(); // Output: Count is: 2
        
        // Modifying the static variable using direct assignment
        MyClass.count = 2;
        
        // Accessing the modified static variable using obj1 and obj2
        obj1.incrementCount(); // Output: Count is: 11
        obj2.incrementCount(); // Output: Count is: 12
    }
}
