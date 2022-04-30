package phase1.core.programs;

public class ConstructorOverloading {

	String name;
	int age;
	char section;
	char gender;
	int subject1=0, subject2, subject3;
	float total;
	float avg,per;

	public ConstructorOverloading(String n, int a, char sec, char gen, int sub1, int sub2, int sub3) {
		name = n;
		age = a;
		section = sec;
		gender = gen;
		subject1 = sub1;
		subject2 = sub2;
		subject3 = sub3;
		
		total = subject1 + subject2 + subject3;
		per = (total / 300)*100;

	}

	public ConstructorOverloading(String n, int a, char sec, char gen, int sub2, int sub3) {
		name = n;
		age = a;
		section = sec;
		gender = gen;
		subject2 = sub2;
		subject3 = sub3;

		total = subject1 + subject2 + subject3;
		per = (total / 300)*100;

	}

	/*
	 * int total = subject1 + subject2 + subject3; float per = (total / 300) * 100;
	 */
	void display() {
		System.out.println("name=" + name + ", age=" + age + ", section=" + section + ", gender=" + gender
				+ ", subject1=" + subject1 + ", subject2=" + subject2 + ", subject3=" + subject3 + ", total=" + total
				+ ", per=" + per);
	}

	public static void main(String[] args) {
		ConstructorOverloading s1 = new ConstructorOverloading("Nikhi", 21, 'D', 'F', 76, 87, 98);
		ConstructorOverloading s2 = new ConstructorOverloading("Kavya", 23, 'B', 'F', 79, 94);
		ConstructorOverloading s3 = new ConstructorOverloading("Mohith", 20, 'A', 'M', 64, 56);
		ConstructorOverloading s4 = new ConstructorOverloading("Rithvik", 21, 'C', 'M', 86, 43, 73);

		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}

}
