package utilityDemoTest.searchbyRollNoTest;

import java.util.List;

public class StudentRecordDemo{
public static void main(String[] args){
String url = "";
String username = "";
String password = "";
//        List<Student> students= Arrays.asList(
//                new Student("Abhilasha",102,"A"),
//                new Student("Arpita",234,"B"),
//                new Student ("Advika",6798, "C")
//
//        );
 List<Student> students=Student.getStudentsFromDB(url,username,password);
Student result=Student.findByRollNo(students,102);
 if(result!=null){
 System.out.println("Found Test_0234.Student");
 System.out.println("Name:"+result.getname());
 System.out.println("rollno:"+result.getrollno());
 System.out.println("grade:"+result.getGrade());

}

    }
}
