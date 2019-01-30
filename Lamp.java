public class Lamp{
	private int power;
	private boolean On;

	public Lamp(){

	}
	public Lamp(int power,boolean on){
		this.power = power;
		this.on = on;

		public void turnOn(){
			this.on = true;
		}
		public void turnOff(){
			this.on = false;
		}
		public void setPower (int power){
			this.power = power;
		}
		public boolean getOn(){
			return On;
		}
		public getPower(){
			return this.power;
		}
	}
}