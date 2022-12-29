import java.io.*;
import java.util.*;

class Student implements Serializable{
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

public class MainStudent1 {
    public static void main(String[] args)throws IOException,ClassNotFoundException {
        Student s1 = new Student("202221", "Simran goyal", 65, 92);
        Student s2 = new Student("202223", "chandni", 30, 45);
        Student s3 = new Student("202225", "santoshi choudhary", 75, 90);
        Student s4 = new Student("202219", "deepanshi dupta", 69, 56);

        LinkedList<Student> lis = new LinkedList<Student>();
        lis.add(s1);
        lis.add(s2);
        lis.add(s3);
        lis.add(s4);

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Bharat\\Desktop\\javalearning\\std.txt");
        ObjectOutputStream ous = new ObjectOutputStream(fos);
        ous.writeObject(lis);
        fos.close();
        ous.close();
               ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Bharat\\Desktop\\javalearning\\std.txt"));
		LinkedList<Student> lis1 = (LinkedList<Student>)ois.readObject();
		for(Student x:lis1){
			System.out.println(x);
		}

        List<Student>lis2 = (LinkedList<Student>)lis.clone();
        for(Student x:lis1){
          System.out.println(x);
              }
    }

}