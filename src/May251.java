interface Addin{
	public int add(int a,int b);
	public int add(int a);
	
	default void pr() {  //�ڹ�8�� �߰��� ����Ʈ �޼ҵ�
		System.out.println("����");
	}
	//default��� ���� ���� ������ �� �߻�޼ҵ�� �ν��Ѵ�!!!!!!!!
}
class Add implements Addin{
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a) {
		int n = 0;
		for(int i=1;i<=a;i++) {
			n+=i;
		}
		return n;
	}
}

public class May251 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a=new Add();
		System.out.println(a.add(1,4));
		System.out.println(a.add(10));
		a.pr();
	}

}
