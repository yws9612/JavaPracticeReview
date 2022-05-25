import java.util.Scanner;

interface Hitter{
	void hit();
	void out();
}

interface Pitcher{
	void pitch();
}

class B implements Hitter,Pitcher{
	
	
	
	public void hit() {
		System.out.println("안타");
	}
	public void out() {
		System.out.println("아웃");
	}
	public void pitch() {
		System.out.println("직구");
	}
}


public class May25 {
	public static void main (String []args) {
		
		B b = new B();
		b.pitch();
		b.hit();
		b.out();
		
	}
}
