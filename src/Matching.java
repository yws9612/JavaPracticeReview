import java.util.HashMap;
import java.util.Scanner;

public class Matching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Persons [] p = new Persons[3];
		HashMap <String, Integer> hashMap = new HashMap<>();
		
		for(int i = 0; i < p.length; i++) {
			System.out.println("이름, 아이디 입력 :");
			String name = sc.next();
			int id = sc.nextInt();
			
			p[i] = new Persons(name, id);
			hashMap.put(name, id);
		}
		
		while(true) {
			System.out.println("이름 뭐니?");
			String na = sc.next();
			if(hashMap.containsKey(na)) {
				System.out.println("정답 :"+hashMap.get(na));
			}else if(na.equals("stop")) {
				break;
			}else {
				System.out.println("이름 없다");
			}
			
		}
		
	}

}

class Persons{
	String name;
	int id;
	Persons(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return name + " " + id;
	}
}
