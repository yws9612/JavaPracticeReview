import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String, Integer> h = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("이름, 나이 입력 : ");
			String name = sc.next();
			int age = sc.nextInt();
			
			h.put(name, age);
		}
		
		Set <String> s = h.keySet();
		Iterator <String> it = s.iterator();
		
		int max = 0;
		String str = "";
		while(it.hasNext()) {
			String name = it.next();
			int age = h.get(name);
			
			if(max < age) {
				max = age;
				str = name;
			}
			
		}
		System.out.println(str + "의 나이는 " + max);
		
	}

}
