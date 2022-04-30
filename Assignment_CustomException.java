package phase1.core.programs;

import java.util.Scanner;

public class Assignment_CustomException {

	static void SalaryStatus(int sal) throws SalaryStatusException {
		if (sal < 2100)
			throw new SalaryStatusException("You need to work hard");
		if (sal >= 2100 && sal < 5100)
			throw new SalaryStatusException("Your salary is somehow good");
		if(sal>=5100 && sal<9000)
			throw new SalaryStatusException("Salary is very good");
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary :");
		int salary=sc.nextInt();
		try {
			SalaryStatus(salary);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

class SalaryStatusException extends Exception {
	public SalaryStatusException(String msg) {
		super(msg);
	}
}

