package basic;

public class Run {

	public static void main(String[] args) {
		
		// Quant 객체 생성
		// Quant 클래스에 작성도니 내용을 토대로 Heap 메모리 영역에 생성
		Quant qt = new Quant();
		Dbstn dt = new Dbstn();
		Dnqls dq = new Dnqls();
		
		
		// qt가 참조하는 Quant 객체의 필드에 값 대입
		dt.first = "1대입니다.";
		dt.commisstion = 1;
		dt.name = "강윤수";
		
		dq.second = "2대입니다.";
		dq.commisstion = 0.7f;
		dq.name = "박우빈";
		
		
		// qt가 참조하는 Car 객체의 필드 값 얻어오기
		System.out.println(dt.name + " 회원은 " + dt.first);
		System.out.print(dt.name + " 회원이 " + dq.name + " 회원을 ");
		dt.invite();
		
		System.out.println(dq.name + " 회원은 " + dq.second);
		
		System.out.print(dt.name + " 회원이 ");
		qt.click();
		
		System.out.println("커미션 수익은(dt + dq) : " + dt.commisstion + dq.commisstion);
		qt.stop();
		
		
	}
}
