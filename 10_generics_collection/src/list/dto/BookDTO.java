package list.dto;

public class BookDTO implements Comparable<BookDTO>{

	private String title;	// 제목
	private String author;	// 저자
	private int price;		// 가격
	private String publisher; // 출판사
	
	public BookDTO(){}	// 기본 생성자

	
	// 매개 변수가 있는 생성자
	public BookDTO(String title, String author, int price, String publisher) {
		super(); // 모든 클래스는 암묵적으로 Object 클래스를 상속 받는다. 때문에 BookDTO는 Object 클래스의 자식 클래스인데
				 // 모든 자식 클래스의 생성자는 반드시 부모 클래스의 생성자를 호출해야 한다 이는 자바 규칙이다
				 // super()는 부모 클래스의 생성자를 호출하는 메서드이다 하지만 super()를 명시적으로 호출하지 않으면
				 // 컴파일러가 자동으로 super() 생성자를 첫 줄에 추가한다.
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	@Override
	public String toString() {
		return "BookDTO [title=" + title + ", author=" + author + ", price=" + price + ", publisher=" + publisher + "]";
	}


	// 기본 정렬 기준을 설정(제목 오름차순)
	// -> Collections.sort() 호출 시 자동으로 이 메서드를 이용함
	@Override
	public int compareTo(BookDTO other) {
		
		return this.title.compareTo(other.title);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
