interface Addin{
	public int add(int a,int b);
	public int add(int a);
	
	default void pr() {  //자바8에 추가된 디폴트 메소드
		System.out.println("히히");
	}
	//default라는 예약어를 적지 않으면 다 추상메소드로 인식한다!!!!!!!!
}
class Addasdf implements Addin{
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
		Addasdf a=new Addasdf();
		System.out.println(a.add(1,4));
		System.out.println(a.add(10));
		a.pr();//인터페이스를 클래스에서 상속을 받았기때문에 출력 가능, 또한 추상메소드가 아닌 디폴트 메소드라 껍데기가 아닌 기능을 가진 메소드임
	}

}
