package section01;

public class Child2 extends Parent{

//	private String lastName = "김"; // 성
//	private String firstName = "산"; // 이름
//	private String address = "서울시 강남구";
//	private int money= 8000;

	private String car; // child2만의 필드
	
	public Child2() {
		System.out.println("*** Child2 객체 생성됨 ***");

		
		// 부모의 firstName 필드를 상속받았으나 접근 제어자가 private이라서 직접 접근이 불가능하다.
		// -> 간접 접근 방법 이용
		setFirstName("바다");
		setAddress("경기도 용인시");
		setMoney(7000);
		car = "미니쿠페 클럽맨";
	}

	// getter/setter 자동 완성 = alt + shift + s -> r
	
	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
	
	
	
	
}
