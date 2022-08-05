package org.emp;

public class Employee {
	
  public void empId() {
	
}
  private void empName() {
System.out.println("Balamurugan S");
}
  private void empDob() {
System.out.println("02/02/1992");
}
  private void empPhone() {
System.out.println("7010740767");
}
  private void empEmail() {
System.out.println("bala2barani@hotmail.com");
}
  private void empAddress() {
System.out.println("Cuddalore");
}
  
  public static void main(String[] args) {
	Employee e = new Employee();
	e.empName();
	e.empDob();
	e.empPhone();
	e.empEmail();
	e.empAddress();
}
}
