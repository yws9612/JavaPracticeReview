
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
		 
			
		//Animal 부모에는 강아지라는 문자열만 있음
		//Dog 자식 		
		Animal a1=new Dog("강아지","푸들");
		System.out.println(a1.ani());    //강아지 푸들
				
		
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
