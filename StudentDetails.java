import java.io.*;
import java.util.*;

class Student  {
    private String student_id, student_name;
    private int attendance, marks;

    Student(String student_id, String student_name, int attandance, int marks) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.attendance = attandance;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return ("ID:" + this.student_id + " Name:" + this.student_name +
                " Attendance:" + this.attendance + " Marks:" + this.marks);
    }

}
public class StudentDetails{
    public static void main(String[] args){
        Student s1 = new Student("202221", "Simran goyal", 65, 92);
        Student s2 = new Student("202223", "chandni", 30, 45);
        Student s3 = new Student("202225", "santoshi choudhary", 75, 90);
        Student s4 = new Student("202219", "deepanshi dupta", 69, 56);

        HashSet<Student> hs = new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        Iterator it = hs.iterator();
        while(it.hasNext()){
              System.out.println(it.next()+"\n");
		}
 			
	for(Student x:hs){
		System.out.println(x);
          }

        

	}

}