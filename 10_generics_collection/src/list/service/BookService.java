package list.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import list.dto.BookDTO;

/**
 * 도서 관리 프로그램 기능 제공 클래스
 */

public class BookService {

	private List<BookDTO> bookList = new ArrayList<BookDTO>();

	// 기본 생성자
	public BookService() {

		// 샘플 데이터 추가
		bookList.add(new BookDTO("소년이 온다", "한강", 15000, "창비"));
		bookList.add(new BookDTO("초역 부처의 말", "코이케 류노스케", 17800, "포레스트북스"));
		bookList.add(new BookDTO("채식주의자", "한강", 15000, "창비"));
		bookList.add(new BookDTO("작별하지 않는다", "한강", 16800, "문학동네"));
		bookList.add(new BookDTO("모순", "양귀자", 13000, "쓰다"));
	}

	// getter
	public List<BookDTO> getBookList() {
		return bookList;

	}

	/**
	 * 전달 받은 index가 정상 범위인지 확인
	 * 
	 * @param index
	 * @return 정상 true, 아니면 false
	 */
	public boolean checkIndex(int index) {

		// 범위 초과 시 false
		if (index < 0 || index >= bookList.size()) {
			return false;
		}
		// 정상 범위 true
		return true;
	}

	/**
	 * 전달 받은 index 번째 bookList 요소 반환 단, 범위 초과 시 null 반환
	 * 
	 * @param index
	 * @return BookDTO 참조 주소 또는 null (객체에서의 null은 참조하고 있는 게 없다)
	 */
	public BookDTO selectIndex(int index) {

		// 범위 초과 검사 -> 초과 시 false
		if (checkIndex(index) == false)
			return null;
		return bookList.get(index);
	}

	/**
	 * 전달 받은 book을 bookList에 추가 단, 책 정보가 모두 일치하는 책이 있다면 추가 X
	 * 
	 * @param book
	 * @returnqq 추가 0 : true, 추가 X : false
	 */
	public boolean addBook(BookDTO book) {

		// 책 정보 비교 방법 1) 필드 값 하나씩 깨내서 비교
		// 책 정보 비교 방법 2) equals 오버라이딩 후 비교

//		for(BookDTO b : bookList) {
//			if(b.equals(book)) return false;
//		}

		// BookDTO의 equals()를 오버라이딩 했기 때문에
		// List가 제공하는 contains() (포함하는지 확인) 사용 가능
		if (bookList.contains(book))
			return false;

		return bookList.add(book);
		// 컬렉션은 크기 제한이 없어서 무조건 추가 성공! (true 반환)

	}

	/**
	 * 전달 받은 index번째 요소의 가격을 newPrice로 수정
	 * 
	 * @param index
	 * @param newPrice
	 * @return "[책제목] 가격이 [이전가격] -> [수정된 가격]으로 수정되었습니다"
	 */
	public String modifyBookPrice222222(int index, int newPrice) {

		BookDTO target = bookList.get(index); // index번째 요소를 얻어와라
		int oldPrice = target.getPrice(); // 이전 가격 저장
		target.setPrice(newPrice); // 새 가격으로 수정

		return String.format("[%s] 가격이 [%d] -> [%d]으로 수정되었습니다", target.getTitle(), oldPrice, newPrice);

	}

	/**
	 * index번째 BookDTO 제거 단, 없으면 null 반환 제거 성공하면 제거된 BookDTO 반환
	 * 
	 * @param index
	 */
	public BookDTO removeBook(int index) { // index 번호를 받아올테니 매개변수는 int index

		if (checkIndex(index) == false)
			return null;

		return bookList.remove(index);
		// bookList에서 index 번째 요소를 제거
		// == index 번째 요소를 뽑아냄

	}

	/**
	 * 제목이 일치하는 책 반환
	 * 
	 * @param title : 찾으려는 책 제목
	 * @return
	 */
	public BookDTO selectTitle(String title) {

		for (BookDTO book : bookList) { // bookList에서 하나씩 꺼냄

			// 꺼낸 책의 제목과 전달 받은 책의 제목이 같을 경우
			if (book.getTitle().equals(title)) {
				return book;
			}
		}

		return null; // 못 찾으면 null 반환

	}

	public boolean removeBookTitle(String title) {

		for (BookDTO book : bookList) {

			if (book.getTitle().equals(title)) {
				return bookList.remove(book); 		
			} 								  		
		}											
													
		return false;
	}
	
	
	
	

	// 출판사가 일치하는 책 모두 조회하기
	public List<BookDTO> selectPublisherAll(String publisher) {

		List<BookDTO> list = new ArrayList<BookDTO>();

		for (BookDTO book : bookList) {
			if (book.getPublisher().equals(publisher)) {
				list.add(book);
			}
		}

		return list;
	}

	// 저자가 일치하는 책 모두 조회
	public List<BookDTO> selectAuthorAll(String author) {
		List<BookDTO> list = new ArrayList<BookDTO>();

		for (BookDTO book : bookList) {
			if (book.getAuthor().equals(author)) {
				list.add(book);
			}
		}

		return list;

	}

	/**
	 * 제목, 저자에 검색어가 포함되어있는 모든 책 조회
	 * 
	 * @param keyword : 검색어
	 * @return : 0~n개의 결과를 가지는 List
	 */
	public List<BookDTO> searchBook(String keyword) {

		List<BookDTO> searchList = new ArrayList<BookDTO>();

		// 찾기 시작
		for (BookDTO book : bookList) {
			if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
				searchList.add(book);
			}
		}
		return searchList;

	}

	/**
	 * 제목 오름차순 정렬
	 */
	public void bookListSorting() {
		Collections.sort(bookList);
		// 원본 리스트가 정렬된 형태로 변경됨

	}

}
