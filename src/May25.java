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
		System.out.println("��Ÿ");
	}
	public void out() {
		System.out.println("�ƿ�");
	}
	public void pitch() {
		System.out.println("����");
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
