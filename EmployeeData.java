import java.util.Scanner;
class Employee
{
String ename;
int id;
int esalary;
Employee()
{
id=0;
ename="simrangoyal";
esalary=2000;
}
Employee(int i,String nm, int sal)
{
id= i;
ename= nm;
esalary= sal;
}
public void display()
  {
   System.out.println("employee name "+ename);
   System.out.println("employee id "+" "+id);
   System.out.println("employee salary "+" "+esalary);
  }
}
public class EmployeeData
{
public static void main(String args[])
 {
  System.out.println("the employee details are:");
  Employee e1 = new Employee(1,"susmita",1000);
  Employee e2 = new Employee(2,"jessy",2000);
 Employee e3 = new Employee();
   e1.display();
   e2.display();
   e3.display();

 }


  }



