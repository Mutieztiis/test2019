public class PermanentEmployee extends Employee{
    private int salary;

    public PermanentEmployee(String n , int a , int emId , int emSalary){

    	super(n,a,emId);
    	salary = emSalary;
    }

    public int getEmSalary(){
    	return salary;
    }
}