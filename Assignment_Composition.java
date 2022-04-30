package phase1.core.programs;

import java.util.ArrayList;
import java.util.List;

class Employee {
	public String name;
	public int age;
	public int salary;

	Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}

class HR {
	private final List<Employee> emp;
	
	HR(List<Employee> emp){
		this.emp=emp;
	}
	
	public List<Employee> getEmployeeDetails(){
		return emp;
	}
}

public class Assignment_Composition {

	public static void main(String[] args) {
		Employee e1=new Employee("Nikhila",21,30000);
		Employee e2=new Employee("Sneha",23,35000);
		Employee e3=new Employee("Radhika",27,40000);
		Employee e4=new Employee("Vennila",31,50000);
		
		List<Employee> employee = new ArrayList<Employee>();
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        employee.add(e4);
        
        HR hr=new HR(employee);
        List<Employee> emp=hr.getEmployeeDetails();
        for(Employee e:emp) {
        	System.out.println("Name :"+e.name+" "+"Age :"+e.age);
        }
        for(Employee e:emp) {
        	System.out.println("Salary of "+e.name+" :"+e.salary);
        }
        
	}

}
