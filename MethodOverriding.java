package poly;

public class MethodOverriding extends MethodoverRide{
public void interset(int id) {
	//super.interset(id);
	System.out.println("12%");

}

public void loan() {
	System.out.println("2%");
}
public static void main(String[] args) {
	MethodOverriding bank=new MethodOverriding();
	bank.interset(12);
	bank.deposit();
	bank.loan();
	bank.saving();
	
}
}
