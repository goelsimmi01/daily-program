abstract class Car{
int regNo;
Car(int regNo){
this.regNo=regNo;
}
void fuelTank(){
System.out.println("fill the tank");
}
abstract void brake();
}
class Maruti extends Car{
Maruti(int regNo){
super(regNo);
}
void brake(){
System.out.println("Hydraulic brake");
}
}
class Santro extends Car{
Santro(int regNo){
super(regNo);
}
void brake(){
System.out.println("Gas brake");
}
}
class MainMS{
public static void main(String[] args)
{
Car c;
Maruti m = new Maruti(2606);
Santro s = new Santro(2248);
c=m;
c.fuelTank();
c.brake();
c=s;
c.fuelTank();
c.brake();
}
}