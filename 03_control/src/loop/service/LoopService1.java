package loop.service;

import java.util.Scanner;

/**
 * 반복문 기능 제공 클래스1
 */

public class LoopService1 {

	//
	public void displayMenu() {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. method1()");
		System.out.println("2. method2()");
		System.out.println("3. method3()");
		System.out.println("4. method4()");
		System.out.println("8. method8()");

		System.out.printf("실행할 메서드 번호 입력 >>");
		int input = sc.nextInt();

		switch (input) {
		case 1:
			method1();
			break;
		case 2:
			method2();
			break;
		case 3:
			method3();
			break;
		case 4:
			method4();
			break;
		case 8:
			method8();
			break;
		default:
			System.out.println("없는 번호 입력함");
		}
	}

	/**
	 * for문을 이용해서 1~10까지 세로로 출력하기
	 */
	// 조건식이 true인 경우 반복 수행할 코드

	// 초기식 : for문에서 사용할 지역 변수 선언
	// -> 대부분 for문 제어를 위한 변수를 선언

	// 조건식 : 결과가 true/false가 나오는 식

	// 증감식 : 초기식 변수를 증가/감소 시켜
	// 조건식의 결과가 변할 수 있게 제어하는 식
	public void method1() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public void method2() {
		for (int i = 9; i > 0; i--) {
			System.out.print(i);
		}
		System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		// for문 초기식, 조건식, 증감식 다르게해서
		// 987654321 출력하기
		for (int i = 0; i < 9; i++) {
			System.out.print(9 - i);
		}
	}

	/**
	 * 두 정수를 입력 받아 두 정수 사이 모든 정수를 출력 (무조건 첫 번째 입력이 작은 수)
	 * 
	 * <pre>
	 * 첫 번째 정수 입력 : 5
	 * 두 번쩨 정수 입력 : 12
	 * 5 6 7 8 9 10 11 12
	 * </pre>
	 */
	public void method3() {

		Scanner sc = new Scanner(System.in);

		System.out.printf("첫 번째 정수 입력 : ");
		int firstNum = sc.nextInt();

		System.out.printf("두 번째 정수 입력 : ");
		int secondNum = sc.nextInt();

		for (int i = firstNum; i <= secondNum; i++) {
			System.out.print(i + " ");
		}

	}

	/**
	 * 입력된 두 정수 사이의 모든 정수 출력
	 * <ul>
	 * <li>입력 1이 입력 2보다 작거나 같은 경우 : 1234 ~ 증가하며 출력</li>
	 * <li>입력 1이 입력 2보다 큰 경우 : 9876 ~ 감소하며 출력</li>
	 * </ul>
	 */
	public void method4() {

		Scanner sc = new Scanner(System.in);

		System.out.printf("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();

		System.out.printf("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();

		if (num1 <= num2) {
			for (int i = num1; num1 <= 2; i++) {
				System.out.println(i + " ");
			}

		} else {
			for (int i = num1; i >= num2; i--) {
				System.out.printf(i + " ");
			}
		}
	}
	
	
	/**
	 * 두 정수를 입력 받아 작은 수 부터 큰 수까지 1씩 증가하며 출력
	 * <pre>
	 * [실행화면]
	 * 입력 1 : 3
	 * 입력 2 : 6
	 * 3 4 5 6
	 * 
	 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	 * 입력 1 : 7
	 * 입력 2 : 2
	 * 2 3 4 5 6 7
	 * 
	 * 
	 * </pre>
	 */
	public void method5() {
		Scanner sc = new Scanner(System.in);

		System.out.printf("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();

		System.out.printf("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();

		if (num1 <= num2) {
			for (int i = num1; num1 <= 2; i++) {
				System.out.println(i + " ");
			}

		} else {
			for (int i = num2; i <= num1; i++) {
				System.out.printf(i + " ");
			}
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		// 방법2)
		
		// 일단 num1이 작은 수, num2가 큰 수라고 생각하고 변수에 값 대인
		int start = num1;
		int end = num2;
		
		// 알고보니 num1이 큰수, num2가 작은 수이면 start, end 대입 값 바꾸기
		if(num1 > num2) {
			start = num1;
			end = num1;
		}
		for(int i=start; i<= end; i++) {
			System.out.println(i + " ");
		}
	}
	
	
	/**
	 * 1부터 100 사이의 정수 중
	 * 입력 받은 정수의 배수가 몇개,배수의 합 구하기
	 */
//	public void method6() {
//		
//		Scanner sc = new Scanner(System.in);
//
//		System.out.printf("정수 입력 : ");
//		int num1 = sc.nextInt();
//		
//		for(int i; i<100; i++) {
//			if(i%num ==0) { 
//
//			}
//	}
		
		/**
		 * 메서드 7
		 */
		
		
		
		/**
		 * 입력받은 두 정수 사이의 구구단 모두 출력
		 * <pre>
		 * 시작 단 : 3
		 * 종료 단 : 6
		 * 
		 * [4단] , [5단]
		 * 
		 * </pre>
		 * 
		 */
		public void method8() {
			Scanner sc = new Scanner(System.in);

			System.out.printf("시작 단 입력 : ");
			int num1 = sc.nextInt();

			System.out.printf("종료 단 입력 : ");
			int num2 = sc.nextInt();
			
			for(int i=num1+1; i<num2; i++) {
				System.out.printf("\n[%d]단\n", i);
				for(int j=1; j<=9; j++) {
					System.out.println(i + "x" + j + "=" + i*j);
				}
			}
		}
	
	
	
	
	
	
	
}