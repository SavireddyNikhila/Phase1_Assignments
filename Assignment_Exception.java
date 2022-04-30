package phase1.core.programs;

import java.io.IOException;
import java.util.Scanner;

public class Assignment_Exception {

	public static int calculate(int l, int b) throws IOException{
		return areaFunc(l,b);
	}
	public static int areaFunc(int l, int b) throws IOException{
		return display(l,b);
	}
	public static int display(int l, int b) throws IOException{
		int area=0;
	    if(l>b)
	    	throw new IOException("Length is greater than breadth");
	    else
	    	area=l*b;
	    return area;
	}
	public static void main(String[] args) {
	
		int result=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length :");
		int l=sc.nextInt();
		
		System.out.println("Enter breadth :");
		int b=sc.nextInt();

		try{
			result=calculate(l,b);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Area of rectangle is"+result);
		}

}
