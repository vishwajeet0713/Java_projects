import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Welcome To Student Management App");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println("press 1 to add student");
			System.out.println("press 2 to delete student");
			System.out.println("press 3 to display student");
			System.out.println("press 4 to exit app");
			int c = Integer.parseInt(br.readLine());
			
			
			if (c==1) {
				//add student
//				System.out.println("Enter user ID : ");
//				String id = br.readLine();
				
				System.out.println("Enter user ID : ");
                int id = Integer.parseInt(br.readLine());
				
				System.out.println("Enter user name :");
				String name = br.readLine();
				
				System.out.println("Enter Your City :");
				String city = br.readLine();
				
				System.out.println("Enter user PhoneNumber :");
				String phone = br.readLine();
				
				//create student object to store student 
				Student st = new Student(id,name, phone, city);
				
			boolean	answer=StudentDao.insertStudenttoDB(st);
			
			if(answer) {
				System.out.println("student is addeded successfully..");
				 }
			else {
				System.out.println("heiuvjvbv");
			} 
				System.out.println(st);
				 }
//			else if(c==2) {
//				 System.out.println("NO Data");
			
			
			
//				 //Delete Student..
//				
//			}
			else if (c == 2) {
			    System.out.println("Enter the ID of the student you want to delete:");
			   int studentId = Integer.parseInt(br.readLine());


			    boolean deleted = StudentDao.deleteStudentFromDB(studentId);
			    if (deleted) {
			        System.out.println("Student with ID " + studentId + " is deleted successfully.");
			    } else {
			        System.out.println("Student ko delete karne me kuch gadbad hui hai.");
			    }
			}

			
			
//			else if(c==3) {
//				//display student..
//			}
			
			
			
			else if (c == 3)
			{
			    StudentDao.displayStudentsFromDB();
			}
			
			
			
			else if (c==4) {
				//exit
				
				break;
			}
			
			
			else {
				
			}
			
		}
		System.out.println("Thankyou for using my application...");
		System.out.println("see you by by...");
	}

}
