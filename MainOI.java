import java.util.*; 
class Outer{
String pswd;
Outer(String pswd)
{
this.pswd=pswd;
}
public void callToInnerMethod(){
Inner in = new Inner();
in.verifyPswd();
}
private class Inner{
String verify;
public void verifyPswd(){
System.out.println("input the verification code");
Scanner sc = new Scanner(System.in);
verify=sc.next();
if(verify.equalsIgnoreCase(pswd)){
System.out.println("verification passed");
}
else{
System.out.println("verification failed");
}
}
}
}
class MainOI{
public static void main(String[] args){
Outer out = new Outer("1215");
out.callToInnerMethod();
}
}