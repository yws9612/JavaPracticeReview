
public class May26 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Lost Stars");
		
		sb.append(" Adem Levine");
		
		sb.insert(11, "sung by ");
		
		sb.replace(0, 10, "Payphone");
		
		System.out.println(sb);
		
		
		Num [] arr =new Num[] {new Num(1),
							   new Num(2),
							   new Num(3)};
		
		for(Num n: arr) {
			System.out.println(n.get());
		}
		 
			
		//Animal �θ𿡴� ��������� ���ڿ��� ����
		//Dog �ڽ� 		
		Animal a1=new Dog("������","Ǫ��");
		System.out.println(a1.ani());    //������ Ǫ��
				
		
	}
				
}

class Animal{
	String name;
	public Animal(String name) {
		this.name = name;
	}
	
	public String ani() {
		return name;
	}
}

class Dog extends Animal{
	String type;
	public Dog(String name, String type) {
		super(name);
		this.type = type;
	}
	
	public String ani() {
		return super.ani() + " " + type;
	}
}



class Num{
	int a;
	public Num(int a) {
		this.a = a;
	}
	
	int get() {
		return a;
	}
}
