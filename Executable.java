import java.util.*;
import java.io.*;

class Employee {


 private String id, name;

 private int salary;


 public Employee(String id, String name,int salary) {

     this.id = id;

     this.name = name;

     this.salary = salary;

 }


 public String getId() {

     return id;

 }

 public String getName() {

     return name;

 }


 public int getSalary() {

     return salary;

 }

 @Override

 public String toString(){


     return ("ID :" + id + "Name :" + name + "Salary :"+salary);

 }

}

public class Executable {

public static void main(String[] args){

        Employee s1 = new Employee("202221", "Simran goyal", 6500);
        Employee s2 = new Employee("202223", "chandni", 3000);
        Employee s3 = new Employee("202225", "santoshi choudhary", 7500);
        Employee s4 = new Employee("202226", "deepanshi dupta", 6000);
        ArrayList<Employee> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        ListIterator li = al.listIterator();
         System.out.println("forward direction");
         while(li.hasNext()){
         		System.out.println("employee data"+li.next());
           	 }
         System.out.println("Reverse direction");
          while(li.hasPrevious()){
		 System.out.println("employee data"+li.previous());
               }
   
}

}