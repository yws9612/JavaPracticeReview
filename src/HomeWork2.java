import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("배열 크기 입력 : ");
		int n = s.nextInt();
		int arr [] = new int [n];
		
		for(int i = 0; i < arr.length; i++) {
			int score = ((int)(Math.random() *101));
			arr[i] = score;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "점" + " ");
		}

	}

}
