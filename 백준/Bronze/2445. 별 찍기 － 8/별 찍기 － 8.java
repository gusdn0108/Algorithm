import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		// 삼각형 위쪽 4개, 아래쪽 4개 출력하면 끝!

		// 위쪽 부분
		// 왼쪽 아래 직각삼각형
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			// 오른쪽 위 직각 삼각형 공백 만들어주기
			for (int j = i; j < N; j++) {
				System.out.print(" ");
			}
			// 왼쪽 위 직각 삼각형 공백 만들어주기
			for (int j = i; j < N; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 왼쪽 위 직각 삼각형
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				System.out.print("*");
			}
			// 오른쪽 아래 직각 삼각형 공백 만들어주기
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// 왼쪽 아래 직각 삼각형 공백 만들어주기
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}