package utilityDemoTest.testDemo.search;

import java.sql.*;
import java.util.ArrayList;
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


   static  public List<Student> getStudentsFromDB(String url, String username, String password) {
        List<Student> students = new ArrayList<>();

        String query = "SELECT name, rollno, grade FROM Student";

        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String name = rs.getString("name");
                int rollNo = rs.getInt("rollno");
                String grade = rs.getString("grade");

                students.add(new Student(name, rollNo, grade));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }
}



