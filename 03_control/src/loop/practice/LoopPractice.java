package loop.practice;

import java.util.Scanner;

/**
 * 기능 제공용 클래스
 */
public class LoopPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);

		System.out.printf("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if (input >= 1) {
			for (int i = 1; i <= input; i++) {
				System.out.print(i + " + ");
			}
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}

	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);

		System.out.printf("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if (input >= 1) {
			for (int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}

	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);
		int sum = 0;

		System.out.printf("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			sum += i;
			System.out.print(i);
			if (i < input) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = " + sum);
	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		System.out.printf("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.printf("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		if (num1 >= 1 && num2 >= 1) {
			if (num1 <= num2) {
				for (int i = num1; i <= num2; i++) {
					System.out.printf(i + " ");
				}
			} else {
				for (int i = num2; i <= num1; i++) {
					System.out.printf(i + " ");
				}
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.printf("숫자 : ");
		int input = sc.nextInt();
		int result = 0;

		System.out.printf("====%d단====\n", input);

		for (int i = 1; i <= 9; i++) {
			result = i * input;
			System.out.printf("%d * %d = %d\n", input, i, result);
		}
	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.printf("숫자 : ");
		int input = sc.nextInt();
		int result = 0;

		for (int i = input; i <= 9; i++) {
			System.out.printf("====%d단====\n", i);
			for (int j = 1; j <= 9; j++) {
				result = i * j;
				System.out.printf("%d * %d = %d\n", i, j, result);
			}
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.printf("정수 입력 : ");
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.printf("정수 입력 : ");
		int input = sc.nextInt();
		for (int i = input; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.printf("정수 입력 : ");
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {

			for (int j = i; j < input; j++) { // 공백 출력
				System.out.printf(" ");
			}
			for (int k = 1; k <= i; k++) { // 별 출력
				System.out.printf("*");
			}
			System.out.println();
		}

//		Scanner sc = new Scanner(System.in);
//
//		System.out.printf("정수 입력 : ");
//		int input = sc.nextInt();
//
//		for (int row = 1; row <= input; row++) {
//
//			for (int blank = 1; blank <= input - row; blank++) { // 공백 추가
//				System.out.print(" ");
//			}
//
//			for (int col = 1; col <= row; col++) { //별찍기
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}

	/**
	 * 정수 입력 : 3
	 *
	 **
	 ***
	 **
	 *
	 */
	public void practice10() {

	}

	/**
	 * 정수 입력 : 4
	 *
	 ***
	 *****
	 *******
	 */
	public void practice11() {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.printf("정수 입력 : ");
//		int input = sc.nextInt();
//
//		for (int row = 1; row <= input; row++) {
//
//			for (int blank = 1; blank <= input - row; blank++) { // 공백 추가
//				System.out.print(" ");
//			}
//
//			for (int col = 1; col <= row; col++) { //별찍기
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);

		System.out.printf("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1; row<=input; row++) {
			
			for(int col=1; col<=input; col++) {
				if(row ==1 || row == input || col == 1 || col == input) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(); // 줄바꿈
		}

	}

}
