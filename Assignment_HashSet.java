package phase1.core.programs;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Assignment_HashSet {

	public static void main(String[] args) {
		LinkedHashSet L1=new LinkedHashSet();
		
		L1.add(12);
		L1.add(24);
		L1.add(2.34f);
		L1.add(98.54f);
		L1.add('D');
		L1.add('N');
		L1.add(true);
		System.out.println("Generic LinkedHashset is "+L1);
		
		LinkedHashSet<Integer> L2=new LinkedHashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		int i1=sc.nextInt();
		int i2=sc.nextInt();
		int i3=sc.nextInt();
		int i4=sc.nextInt();
        int i5=sc.nextInt();
        int i6=sc.nextInt();
		int i7=sc.nextInt();
        int i8=sc.nextInt();

        L2.add(i1);
        L2.add(i2);
        L2.add(i3);
        L2.add(i4);
        L2.add(i5);
        L2.add(i6);
        L2.add(i7);
        L2.add(i8);

		System.out.println("Integer type LinkedHashset is "+L2);
	}

}
