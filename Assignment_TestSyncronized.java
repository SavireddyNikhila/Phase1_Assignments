package phase1.core.programs;

class P1 {

	synchronized public void factorial(int num) {
		int f = 1;
		for (int i = 1; i <= num; i++) {
			f = f * i;
		}
		System.out.println("Factorial of " + num + " is: " + f);
		try {
			Thread.sleep(400);
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			Thread.sleep(400);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

class MyThread1 extends Thread {
	P1 p1;

	MyThread1(P1 p1) {
		this.p1 = p1;
	}

	public void run() {
		System.out.println("MyThread1 run() method");
		p1.factorial(4);
	}
}

class MyThread2 extends Thread {
	P1 p1;

	MyThread2(P1 p1) {
		this.p1 = p1;
	}

	public void run() {
		System.out.println("MyThread2 run() method");
		p1.factorial(6);
	}
}

class P2 {

	synchronized public void addTwoNumbers(int num1, int num2) {
		System.out.println("Addition of two numbers : " + (num1 + num2));
	}
}

class MyThread3 extends Thread {

	P2 p2;

	MyThread3(P2 p2) {
		this.p2 = p2;
	}

	public void run() {
		System.out.println("MyThread3 run() method");
		p2.addTwoNumbers(4, 5);
	}
}

class MyThread4 extends Thread {

	P2 p2;

	MyThread4(P2 p2) {
		this.p2 = p2;
	}

	public void run() {
		System.out.println("MyThread4 run() method");
		p2.addTwoNumbers(20, 10);
	}
}

public class Assignment_TestSyncronized {

	public static void main(String[] args) {

		P1 obj1 = new P1();
		MyThread1 t1 = new MyThread1(obj1);
		MyThread2 t2 = new MyThread2(obj1);

		P2 obj2 = new P2();
		MyThread3 t3 = new MyThread3(obj2);
		MyThread4 t4 = new MyThread4(obj2);

		t2.start();
		t4.start();
		t1.start();
		t3.start();
	}

}
