package phase1.core.programs;

public class MethodOverloading {

	public int calculate(int num1, int num2) {
		int sum=num1+num2;
		return sum;
	}
	
	public float calculate(float r) {
		float a = (3.14f)*r*r;
		return a;
	}
	
	public int calculate(long l, long b) {
		int  area= (int)(l * b);
		return area;
	}

	public static void  main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		System.out.println("Addition two numbers: "+obj.calculate(12,13));
		System.out.println("Area of circle: "+obj.calculate(2.5f));
		System.out.println("Area of rectangle: "+obj.calculate(76,54));

	}

}
