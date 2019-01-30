public class LampMain(String[] args) {

	Lamp l1;
	Lamp l2;
	Lamp l3;

	l1 = new Lamp();
	l2.setPower(100);
	l2 = new Lamp(50 , false);
	l3 = new Lamp(20 , false);
	l1.turnOn();
	l2.turnOn();
	l3.turnOn();

	System.out.println(l1.getOn() + l2.getOn() + l3.getOn());

}
