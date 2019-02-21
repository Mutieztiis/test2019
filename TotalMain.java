import java.util.*;
public class TotalMain{

	public static void main(String[] args){

		ArrayList<Person> personlist = new ArrayList<Person>();

		personlist ps1 = new Person("Mutiez",24);
		personlist em1 = new Employee("Tiez",25,55);
		personlist per1 = new PermanentEmployee("Tiss",25,045,10000);

		ps1.printDetails();
		em1.printDetails();
		per1.printDetails();
	}
	

}