public class HomeWork1 {

	public static void main(String[] args) {

		Grade g1 = new Grade();

		Grade g2 = new Grade(90, 70, 90);

//1-4

		System.out.println("수학 : " + g1.getM());
		System.out.println("영어 : " + g1.getE());
		System.out.println("과학 : " + g1.getS());
		System.out.println("평균 : " + g1.avg());
		System.out.println("-------------------------------");
		System.out.println("수학 : " + g2.getM());
		System.out.println("영어 : " + g2.getE());
		System.out.println("과학 : " + g2.getS());
		System.out.println("평균 : " + g2.avg());

	}

}

class Grade {
//1-1
	private int english, math, science;

	public Grade() {

		this(80, 60, 100);

	}

//1-2
	public Grade(int math, int english, int science) {

		this.math = math;

		this.english = english;

		this.science = science;

	}

	public int getM() {
		return math;
	}

	public int getE() {
		return english;
	}

	public int getS() {
		return science;
	}

//1-3
	public double avg(int math, int english, int scince) {

		return (math + english + scince) / 3.0;

	}

	public double avg() {

		return (math + english + science) / 3.0;

	}

}