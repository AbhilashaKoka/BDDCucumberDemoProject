package utilityDemoTest.search;

abstract public class Person {
    String name;
    abstract void showDetails();


    class Student extends Person{
        int RollNo;
        String Grade;


        Student(String name,int Rollno, String Grade){
       this.name=name;
       this.RollNo=Rollno;
       this.Grade=Grade;
        }

        @Override
        void showDetails() {
            System.out.println();
        }
    }

}
