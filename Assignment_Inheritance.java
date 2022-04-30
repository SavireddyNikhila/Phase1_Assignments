package phase1.core.programs;

class Product {
	int id = 78;
	String name = "Amul";

	void displayProduct() {
		System.out.println("id = " + id + " " + "name = " + name);
	}
}

class A extends Product {
	int count = 50;
	String category = "Butter";

	void displayA() {
		System.out.println(
				"id = " + id + " " + "name = " + name + " " + "count = " + count + " " + "category = " + category);
	}
}

class B extends Product {
	int count = 90;
	String category = "Milk";

	void displayB() {
		System.out.println(
				"id = " + id + " " + "name = " + name + " " + "count = " + count + " " + "category = " + category);
	}
}

class C extends Product {
	int count = 56;
	String category = "Coco";

	void displayC() {
		System.out.println(
				"id = " + id + " " + "name = " + name + " " + "count = " + count + " " + "category = " + category);
	}
}

class subA extends A {
	int price = 30;

	void displaysubA() {
		System.out.println("TotalPrice = " + count * price + " " + "id = " + id + " " + "name = " + name + " "
				+ "category = " + category);
	}
}

class subB extends B {
	int price = 10;

	void displaysubB() {
		System.out.println("TotalPrice = " + count * price + " " + "id = " + id + " " + "name = " + name + " "
				+ "category = " + category);
	}
}

public class Assignment_Inheritance {

	public static void main(String[] args) {
		subA obj1 = new subA();
		obj1.displayProduct();
		obj1.displayA();
		obj1.displaysubA();
		
		subB obj2 = new subB();
		obj2.displayProduct();
		obj2.displayB();
		obj2.displaysubB();
		
		C obj3 = new C();
		obj3.displayProduct();
		obj3.displayC();
}
}