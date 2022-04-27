package phase1.core.programs;

abstract class MNC {
	MNC() {
		System.out.println("I am a Constructor from MNC");
	}

	void show() {
		System.out.println("I am a normal method inside MNC");
	}

	abstract void Method1();

	abstract void Method2();
}

abstract class Infosys extends MNC {
	void Method1() {
		System.out.println("I am  Method1 inside Infosys");
	}

	abstract void Method2();
}

class Hello extends Infosys {
	void Method2() {
		System.out.println("I am Method2 inside Hello");
	}

	void display() {
		System.out.println("I am a normal method inside Hello");
	}
}

public class Assignment_Abstract {

	public static void main(String[] args) {

		MNC ref1 = new Hello();
		ref1.Method1();
		ref1.Method2();
		ref1.show();
	}

}
