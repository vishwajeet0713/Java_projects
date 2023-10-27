package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {
	
	public static boolean insertStudenttoDB(Student st) {

	    boolean f=false;
	try {
	Connection con =cp.createC();
	//jdbc code
	String q = "INSERT INTO students (sid, sname, scity, sphone) VALUES (?, ?, ?, ?)";
	 
	PreparedStatement pstmt=con.prepareStatement(q);
	
	pstmt.setLong(1,st.getStudentId());
	pstmt.setString(2,st.getStudentName());
//	pstmt.setString(4,st.getStudentCity());
	pstmt.setString(3,st.getStudentPhone());
	pstmt.setString(4,st.getStudentCity());

	//execute
	pstmt.executeUpdate();
	f=true;

	}
	catch(Exception e) {
	    e.printStackTrace();
	}
	return f;
	}
	
public static boolean deleteStudentFromDB(int studentId) {
    boolean f = false;
    try {
        Connection con = cp.createC();
        String q = "DELETE FROM students WHERE sid = ?";
        PreparedStatement pstmt = con.prepareStatement(q);
        
        pstmt.setInt(1,studentId);

        // Execute
        int result = pstmt.executeUpdate();
        
        if (result > 0) {
        	
            f = true;
        }
        else {
			System.out.println("No Data");
		}
    } catch (Exception e) {
        e.printStackTrace();
    }
    return f;
 }


public static void displayStudentsFromDB() {
	
    try {
        Connection con = cp.createC();
        String q = "SELECT * FROM students";
        PreparedStatement pstmt = con.prepareStatement(q);
        ResultSet resultSet = pstmt.executeQuery();

        while (resultSet.next()) 
        {
            String studentId = resultSet.getString("sid");
            String studentName = resultSet.getString("sname");
            String studentCity = resultSet.getString("scity");
            String studentPhone = resultSet.getString("sphone");

            System.out.println("Student ID: " + studentId);
            System.out.println("Name: " + studentName);
            System.out.println("City: " + studentCity);
            System.out.println("Phone: " + studentPhone);
            System.out.println("------------");
		}
        
    } catch (Exception e) {
    	
        e.printStackTrace();
    }
}

}

	 



 