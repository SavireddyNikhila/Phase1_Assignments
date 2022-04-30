package phase1.core.programs;

abstract class Vehicle{
	
	abstract void run();
	abstract void stop();
	
	public void fuel(int i1) {
		System.out.println("Value of i1: "+i1);
	}
	public void fuel(float fl, String str) {
		System.out.println("Values of f1 :"+fl+" and str :"+str);
	}
	public void fuel(char ch, int i2) {
		System.out.println("Values of ch :"+ch+" and i2 :"+i2);
	}
	int speed=60;
	long distance=470;
	public Vehicle() {
	}
	public Vehicle(int speed, long distance) {
		this.speed = speed;
		this.distance = distance;
	}
	
}
class Two_W extends Vehicle{
	void run() {
		System.out.println("I am run method inside 2W");
	}
	void stop() {
		System.out.println("I am stop method inside 2W");
	}
	Two_W() {
		System.out.println("I am a constructor inside 2W");
		}
	int speed=45;
	long distance=400;
	int nos_of_tyre=2;
	
	void display() {
		System.out.println("Variables of Two_W class are speed :"+speed+" "+"distance :"+distance+" "+"nos_of_tyre :"+nos_of_tyre);
		System.out.println("Variables of parent class are speed:"+super.speed+" "+"distance :"+super.distance);
	}
	
}
class Three_W extends Vehicle{
	void run() {
		System.out.println("I am run method inside 3W");
	}
	void stop() {
		System.out.println("I am stop method inside 3W");
	}
	Three_W() {
		System.out.println("I am a constructor inside 3W");
		}
	int speed=50;
	long distance=300;
	int nos_of_tyre=3;
	
	void display() {
		System.out.println("Variables of Two_W class are speed :"+speed+" "+"distance :"+distance+" "+"nos_of_tyre :"+nos_of_tyre);
		System.out.println("Variables of parent class are speed:"+super.speed+" "+"distance :"+super.distance);
	}
	
}
class Four_W extends Vehicle{
	void run() {
		System.out.println("I am run method inside 4W");
	}
	void stop() {
		System.out.println("I am stop method inside 4W");
	}
	Four_W() {
		System.out.println("I am a constructor inside 4W");
		}
	int speed=35;
	long distance=350;
	int nos_of_tyre=4;
	
	void display() {
		System.out.println("Variables of Two_W class are speed :"+speed+" "+"distance :"+distance+" "+"nos_of_tyre :"+nos_of_tyre);
		System.out.println("Variables of parent class are speed:"+super.speed+" "+"distance :"+super.distance);
	}
	
}
class Eight_W extends Vehicle{
	void run() {
		System.out.println("I am run method inside 8W");
	}
	void stop() {
		System.out.println("I am stop method inside 8W");
	}
	Eight_W() {
		System.out.println("I am a constructor inside 8W");
		}
	int speed=60;
	long distance=800;
	int nos_of_tyre=8;
	
	void display() {
		System.out.println("Variables of Two_W class are speed :"+speed+" "+"distance :"+distance+" "+"nos_of_tyre :"+nos_of_tyre);
		System.out.println("Variables of parent class are speed:"+super.speed+" "+"distance :"+super.distance);
	}
	
}
public class Assignment_OOPS {

	public static void main(String[] args) {
		
		Vehicle v;
		v=new Two_W();
	    v.run();
	    v.stop();
	    
	    v=new Three_W();
	    v.run();
	    v.stop();
	    
		v=new Four_W();
		v.run();
		v.stop();
		
		v=new Eight_W();
		v.run();
		v.stop();
		
		new Two_W().display();
		new Three_W().display();
		new Four_W().display();
		new Eight_W().display();
		
		v.fuel(20);
		v.fuel(23.4f, "Nikhila");
		v.fuel('F',25);
	}

}

