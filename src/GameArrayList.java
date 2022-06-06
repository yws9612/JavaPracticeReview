import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Person {
	private String name;
	private int id;

	Person(String n, int i) {
		name = n;
		id = i;
	}

	String getname() {
		return name;
	}

	int getid() {
		return id;
	}

	public boolean equals(Object obj) {
		Person p = (Person) obj;
		if (p.getid() == this.id && p.getname().equals(this.name)) {
			return true;
		}
		return false;
	}
}

class Game {

	Scanner s = new Scanner(System.in);
	// Person클래스 ArrayList
	ArrayList<Person> a = new ArrayList<Person>(5);

	Game() { // 초기화 과정
		a.add(new Person("용학", 123)); // [0]
		a.add(new Person("윤경", 456)); // [1]
		a.add(new Person("의영", 789)); // [2]
		a.add(new Person("연운", 112)); // [3]
	}

	void in() {
		while (true) {
			System.out.println("이름, id입력");
			// 이름 = stop
			String name = s.next();
			if (name.equals("stop")) {
				break;
			}
			int id = s.nextInt();

			Person pp = new Person(name, id); // Person클래스 객체 생성

			if (a.contains(pp)) {
				System.out.println(pp.getname() + "은 이미 있다");
			} else
				a.add(pp);
		}
	}// 어레이리스트에 값을 저장함

	void out() {
		while (true) {
			Random r = new Random();
			int n = r.nextInt(a.size());
			// 0~4 사이의 난수발생시켜서 n에저장
			Person p = a.get(n); // Person p=new Person("용학",123)
			String str = p.getname();

			System.out.println(str + "id는?"); // 용학의 id는?
			int id = p.getid(); // 123

			Scanner s = new Scanner(System.in);
			int i = s.nextInt();

			if (i == -1) {
				break;
			}
			if (i == p.getid()) {
				System.out.println("정답");
			} else
				System.out.println("정답아님");
		}
	}

	void end() {
		System.out.println("종료");
		System.exit(0); // 프로그램 종료
	}
}

public class GameArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game g = new Game();
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("1,2,3");
			// 1.입력(in함수)
			// 2.out함수
			// 3.end
			int select = s.nextInt();
			switch (select) {
			case 1:
				g.in();
				break;
			case 2:
				g.out();
				break;
			case 3:
				g.end();
				break;
			}
		}
	}

}
