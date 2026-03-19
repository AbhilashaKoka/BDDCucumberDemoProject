package utilityDemoTest.testDemo.Test_0234;
import java.sql.*;
import java.util.List;

public class Student {
    private String name;
    private int rollno;
    private String Grade;

    public Student(String name, int rollno, String Grade) {
        this.name = name;
        this.rollno = rollno;
        this.Grade = Grade;
    }

    public String getname() {
        return name;
    }

    public int getrollno() {
        return rollno;
    }

    public String getGrade() {
        return Grade;
    }

    public static Student findByRollNo(List<Student> student, int Rollno) {
        for (Student s : student) {
            if (s.getrollno() == Rollno) {
                return s;
            }
        }
        return null;
    }


    public void getValueFromDB(String url, String username, String password) {
        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement statement = con.createStatement();
             ResultSet rs = statement.executeQuery("Select name,Rollno,grade From Student ")) {
            while (rs.next()) {
                String name = rs.getString("name");
                int Rollno = rs.getInt("rollno");
                String grade = rs.getString("Grade");
                System.out.println("Name: " + name);
                System.out.println("Rollno: " + Rollno);
                System.out.println("Grade: " + grade);
            }
        } catch (SQLException q) {
            q.printStackTrace();
        }
    }
}


