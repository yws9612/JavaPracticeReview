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
	// PersonŬ���� ArrayList
	ArrayList<Person> a = new ArrayList<Person>(5);

	Game() { // �ʱ�ȭ ����
		a.add(new Person("����", 123)); // [0]
		a.add(new Person("����", 456)); // [1]
		a.add(new Person("�ǿ�", 789)); // [2]
		a.add(new Person("����", 112)); // [3]
	}

	void in() {
		while (true) {
			System.out.println("�̸�, id�Է�");
			// �̸� = stop
			String name = s.next();
			if (name.equals("stop")) {
				break;
			}
			int id = s.nextInt();

			Person pp = new Person(name, id); // PersonŬ���� ��ü ����

			if (a.contains(pp)) {
				System.out.println(pp.getname() + "�� �̹� �ִ�");
			} else
				a.add(pp);
		}
	}// ��̸���Ʈ�� ���� ������

	void out() {
		while (true) {
			Random r = new Random();
			int n = r.nextInt(a.size());
			// 0~4 ������ �����߻����Ѽ� n������
			Person p = a.get(n); // Person p=new Person("����",123)
			String str = p.getname();

			System.out.println(str + "id��?"); // ������ id��?
			int id = p.getid(); // 123

			Scanner s = new Scanner(System.in);
			int i = s.nextInt();

			if (i == -1) {
				break;
			}
			if (i == p.getid()) {
				System.out.println("����");
			} else
				System.out.println("����ƴ�");
		}
	}

	void end() {
		System.out.println("����");
		System.exit(0); // ���α׷� ����
	}
}

public class GameArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game g = new Game();
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("1,2,3");
			// 1.�Է�(in�Լ�)
			// 2.out�Լ�
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
