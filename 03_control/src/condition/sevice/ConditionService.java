package condition.sevice;
import java.util.Scanner;


/**
 * 기능(예제 ,연습문제) 제공용 클래스
 */
public class ConditionService {
	
	// 필드(field) == 멤버 변수 == 인스턴스 변수
	// 해당 클래스(객체) 내에서 언제, 어디서든지 사용 가능한 변수
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 1 ~ 10 사이 난수(정수)가
	 * 짝수인지 홀수인지 검사
	 * 
	 */
	
	
	public void method1() {
		
		// Math.random() : 0.0 이상 1.0 미만 난수 발생
		int randomNumber = (int)(Math.random() * 10 + 1);
		
		// 2로 나눴을 때 나머지가 0인지 아닌지 결과를 저장
		// == 0이면 짝수(true), 1이면 홀수(false)
		boolean result = randomNumber % 2 == 0;
		
		System.out.println("randomNumber : " + randomNumber);
		
		if(result) {// true인 경우
			System.out.println("짝수 입니다.");
		}else {// false인 경우
			System.out.println("홀수 입니다.");
			
		}
	}
	
	/**
	 * 나이를 입력 받아 "어린이", "청소년", "성인" 구분
	 * <pre>
	 * 13세 이하 "어린이"
	 * 14세 초과 19세 이하 "청소년"
	 * 19세 초과 "성인"
	 * </pre>
	 */
	public void method2() {
		
		System.out.printf("나이 입력 : ");
		int age = sc.nextInt();
		
		// if = else if- else
		
		if(age < 14){
			System.out.println("어린이");
		}
		else if(age <= 19) {
			System.out.println("청소년");
		}
		else {
			System.out.println("성인");
		}
	}
	
	/**
	 * 나이를 입력 받아 "어린이", "청소년", "성인" 구분
	 * <pre>
	 * 13세 이하 "어린이"
	 * 14세 초과 19세 이하 "청소년"
	 * - 14~16세 : 청소년(중)
	 * - 17~19세 : 청소년(고)
	 * 
	 * 19세 초과 "성인"
	 * 0 미만 100 이상 : "잘못 입력하셨습니다"
	 * </pre>
	 */
	public void method3() {
		
		System.out.printf("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age > 0 && age < 100) {
			if(age < 14) {
				System.out.println("어린이");
			}else if(age < 17) {
				System.out.println("청소년(중)");
			}else if(age < 20) {
				System.out.println("청소년(고)");
			}else {
				System.out.println("성인");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}	
	}
	
	public void method3_1() {
		System.out.printf("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age < 0 || age > 100) {
			String result;
			
			if(age > 19) {
				result = "성인";
			}else if(age > 13) {
				result = "청소년" + (age <= 16 ? "(중)" : "(고)");
			}else {
				result = "어린이";
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	
	/**
	 * ConditionService에 작성된 메서드를 골라서 실행하는 메서드
	 */
	
	public void displayMenu() {
		System.out.println("1. method()");
		System.out.println("2. method()");
		System.out.println("3. method()");
		System.out.println("메뉴 번호 입력 >> ");
		int input = sc.nextInt();
		
		
		// (중요) 같은 클래스 내 필드, 메서드는 이름만 부르면 호출 가능!
		switch(input) {
		case 1 : method1(); break;
		case 2 : method2(); break;
		case 3 : method3(); break;
		default : System.out.println("없는 메뉴 번호 입니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
