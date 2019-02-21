public class Employee extends Person {

	private int employeeId;

	public Employee(String n , int a , int emId){
		super(n,a);
		employeeId = emId;
	}

	public int getEmployeeId(){
		return employeeId;
	}

}