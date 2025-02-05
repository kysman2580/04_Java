package 연습문제;

import java.util.Scanner;

public class ScoreManeger {

	public void method1() {
		Scanner sc = new Scanner(System.in);

		
		System.out.printf("이름 : ");
		String name = sc.next();
		
		System.out.println("중간고사 점수(40%) : ");
		int first = sc.nextInt();
		
		System.out.println("기말고사 점수(50%) : ");
		int second = sc.nextInt();
		
		System.out.println("과제 점수(10%) : ");
		int homework = sc.nextInt();
		
		double total = (first * 0.4) +
				(second * 0.5)+
				(homework * 0.1);
		
		String result; // 성적 저장 변수
		
		// (int)total/10 
		// total을 먼저 int로 형변환 후 10으로 나눔
		// -> 십의 자리 숫자만 남기는 식
		switch((int)total/10) { // switch문 () 내에는 정수/문자열 작성 가능]
		// 하나의 casd에 여러 경우를 , 기호를 이용해서 작성 가능
		// (Java만 가능!! js 안됨)
		case 9, 10 : result = "A"; break;
		case 8 : result = "B"; break;
		case 7 : result = "C"; break;
		case 6 : result = "D"; break;
		default: result = "F";
		}
		
		// 합계가 60점대 이상 이면서
		// 나머지 5 이상인 경우(65~, 75~, 85~, 95~)
		if(total == 100 || (total >= 60.0 && total % 10 >=5)) {
			result += "+";
		}
		
		// 결과 출력 
		System.out.printf("\n%s의 최종점수 : %.1f점\n", name, total);
		System.out.println("성적 : " + result);
		
		sc.close();
	}
}
