//-------------------------------------------------------Package p1------------------------------------------------------
//class M
package phase1_P1;

public class M {

	private int a= 10;   
	
	long b = 1000;       
	
	protected float c = 2.34f;
	
	public void methodPublicM() {
		System.out.println("Class M: methodPublic");
		methodProtectedM();
		methodDefaultM();
		methodPrivateM();
	}

	public int display()
	{
		return a;
	}
	protected void methodProtectedM() {
		System.out.println("Class M: methodProtected");
		
	}

	void methodDefaultM() {
		System.out.println("Class M: methodDefault");
	}

	private void methodPrivateM() {
		System.out.println("Class M: methodPrivate");
	}
}

//class N
package phase1_P1;

public class N {
	
	protected long d = 233214567L;
	
	public int e= 75; 
	
	double f=234.12445678;
	
	public void methodPublicN() {
		System.out.println("Class N: methodPublic");
		methodProtectedN();
		methodDefaultN();
		methodPrivateN();
	}

	protected void methodProtectedN() {
		System.out.println("Class N: methodProtected");
		
	}

	void methodDefaultN() {
		System.out.println("Class N: methodDefault");
	}

	private void methodPrivateN() {
		System.out.println("Class N: methodPrivate");
	}

}

//class P
package phase1_P1;

public class P {

	public static void main(String[] args) {
		
		System.out.println("Value of a :"+ new M().display());
		System.out.println("Value of b :"+ new M().b);
		System.out.println("Value of c :"+ new M().c);
		System.out.println("Value of d :"+ new N().d);
		System.out.println("Value of e :"+ new N().e);
		System.out.println("Value of f :"+ new N().f);

	}
	
	public void methodPublicP() {
		System.out.println("Class P: methodPublic");
		methodProtectedP();
		methodDefaultP();
		methodPrivateP();
	}

	protected void methodProtectedP() {
		System.out.println("Class P: methodProtected");
		
	}

	void methodDefaultP() {
		System.out.println("Class P: methodDefault");
	}

	private void methodPrivateP() {
		System.out.println("Class P: methodPrivate");
	}

}

//------------------------------------------------Package p2---------------------------------------------------------
//class X

package phase1_P2;

public class X {
	
	private int g=123;
	
	long h=12345778L;
	
	protected float i=7.6f;
	
	public char j='K';
	
	public int dis(){
		return g;
	}

}

//class Y

package phase1_P2;

import phase1_P1.M;
import phase1_P1.N;

public class Y extends N {

	public static void main(String[] args) {

		// calling methods in M class
		new M().methodPublicM();

		// calling methods in N class
		new N().methodPublicN();
		new Y().methodProtectedN();

		// calling all the variables of X class
		System.out.println("Value of g :" + new X().dis());
		System.out.println("Value of h :" + new X().h);
		System.out.println("Value of i :" + new X().i);
		System.out.println("Value of j :" + new X().j);
		
	}

}

//class Z

package phase1_P2;

import phase1_P1.M;
import phase1_P1.N;
import phase1_P1.P;

public class Z extends M {

	public static void main(String[] args) {

		// calling methods in M class
		new M().methodPublicM();  //new Z().methodPublicM();
		new Z().methodProtectedM();

		// calling methods in N class
		new N().methodPublicN();

		// calling methods in P class
		new P().methodPublicP();

		// calling all the variables of X class
		System.out.println("Value of g :" + new X().dis());
		System.out.println("Value of h :" + new X().h);
		System.out.println("Value of i :" + new X().i);
		System.out.println("Value of j :" + new X().j);

	}

}
