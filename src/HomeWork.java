import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		int a, b;
		char ope;
		
		Add ad = new Add();
		Sub sb = new Sub();
		Mul ml = new Mul();
		Div dv = new Div();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 피 연산자와 연산자 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		ope = sc.next().charAt(0);
		
		switch(ope) {
		
		case '+':
			ad.set(a, b);
			System.out.println(ad.calculate());
			break;
		case '-':
			sb.set(a, b);
			System.out.println(sb.calculate());
			break;
		case '*':
			ml.set(a, b);
			System.out.println(ml.calculate());
			break;
		case '/':
			dv.set(a, b);
			System.out.println(dv.calculate());
			break;
		}
		
	}

}


abstract class Calc{
	double op1, op2;
	
	abstract public void set(double op1, double op2); 
	
	abstract public double calculate();
	
}

class Add extends Calc{
	
	public void set(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public double calculate() {
		return op1 + op2;
	}
	
}

class Sub extends Calc{
	
	public void set(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public double calculate() {
		return op1 - op2;
	}
}

class Mul extends Calc{
	
	public void set(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public double calculate() {
		return op1 * op2;
	}
}

class Div extends Calc{
	
	public void set(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public double calculate() {
		return op1 / op2;
	}
}

