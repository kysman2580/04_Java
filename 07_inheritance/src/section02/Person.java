package section02;
/* Object 클래스
 * - 모든 클래스(객체)의 최상위 부모
 * - 모든 클래스(객체)가 공통적을 가져야 하는 기능이 모여 있음
 * 
 * - 클래스 선언부에 아무런 상속 구문이 작성되지 않으면 
 *   컴퍼일러가 자동으로 [extends object] 추가
 *   
 
 *   final 클래스 / final 메서드
 *   

 *   - final : 마지막, 최종
 *   
 *   - final 클래스 : 상속 불가 클래스
 *   -> 다른 클래스가 필드// 메서드를 상속 뱓아
 */



//* Person이 fina 클래스인 경우
public /*final*/ class Person {	/* extends object */
	private String name;
	private int age;
	
	// 기본 생성자
	public Person() {
		System.out.println("[Person 기본 생성자로 생성됨]");
	}

	// 매개 변수 생성자 자동 생성 : alt + shift + s -> o
	public Person(String name, int age) {
		System.out.println("[Person 매개 변수있는 생성자로 생성됨]");

		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/* Object.toString() 메서드
	 * - 객체가 사람이 읽기 쉬운 간단한 문자열 행태로
	 * 	 반환하는 목적의 메서드
	 * 
	 * - 모든 자식 클래스에서 재정의(오버라이딩)
	 * 
	 */
	
	
	/* 오버라이딩(Overriding)
	 * - 덮어쓰다, 재정의 하다라는
	 * 
	 * - 부모와 같은 이름의 메서드를
	 * 	 자식이 다시 정의하는 기술
	 * 	 (자식이 용도에 맞게 코드를 수정)
	
	 * 
	 * 
	 * [오버라이딩 성립 조건]
	 * 1) 변경 불가
	 * - 메서드명
	 * - 반환형
	 * - 매개 변수의 타입, 개수 순서
	 * 
	 * 2) 변경 가능
	 * - 접근 제어자는 같거나넓은 범위로 변경 가능
	 * - 예외 처리는 같거나 좁은 범위로 변경 가능
	 * 
	 * 
	 * *** 주의 사항 ***
	 * 부모의 private 메서드는 오버라이딩 불
	 * 
	 * 
	 * 
	 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	 * @Override 어노테이션
	 * 1) 해당 메서드가 오버라이딩 되었음을 명시 (정보 제공) 
	 * 2) 컴파일러에게 해당 메서드는 오버라이딩이
	 * 	  문제없이 작성되었는지 확인(검증)하라 지시
	 * 	  (성립 조건을 위배하지 않았는지 확인)
	 * 
	 */
	
	@Override
	public String toString() {
		return String.format("name : %s  age : %d", name, age);
	}
	
	// 부모 메서드
	public final String introduce(String alias) {
		return String.format("이름은 %s 이고 별명은 %s 입니다", name, alias);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
