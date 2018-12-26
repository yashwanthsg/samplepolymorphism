package poly;

public class MethodOverloading {
public void empId(String name) {
System.out.println(name);	
}
public void empId(int name) {
System.out.println(name);	
}
public void empId(String email,long phno) {
System.out.println(email+"\n"+phno);	
}
public static void main(String[] args) {
	MethodOverloading me=new MethodOverloading();
	me.empId("Yashwanth");
	me.empId(12);
	me.empId("yashsg94@gmail.com", 9750866606l);
}
}
