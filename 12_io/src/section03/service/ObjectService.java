package section03.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import section03.dto.Member;

public class ObjectService {

	/** Member 객체 하나를 파일로 출력하기 */
	public void outputMember() {

		// 출력용 스트림 참조 변수 선언
		FileOutputStream fos = null; // 기반 스트림 / 1byte기반 통로
		ObjectOutputStream oos = null; // 객체 출력 보조 스트림

		try {
			// 출력할 Member 객체 생성
			Member member = new Member("member112233", "1q2w3e", "짱구");

			// 파일 출력 기반 스트림 객체 생성
			fos = new FileOutputStream("io_test/byte/Member.bin");

			// .bin 확장자 : 바이너리 코드(==바이트 코드) 저장 파일 확장자

			// 객체 출력 보조 스트림 객체 생성

			oos = new ObjectOutputStream(fos);

			// 보조 스트림을 이용해서 파일에 Member 객체 출력
			oos.writeObject(member);

			System.out.println("출력 완료");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (oos != null)
					oos.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	/* 파일에서 Member 객체 입력 받기(읽어오기) */
	public void intputMember() {

		// 스트림 참조 변수 선언
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			// 입력 기반 스트림
			fis = new FileInputStream("io_test/byte/Member.bin");

			// 객체 입력 보조 스트림
			ois = new ObjectInputStream(fis);

			// 연결된 파일로 부터 Member 객체 읽어오기
			// -> 파일에 존재하는 Member 객체는 직렬화된 상태!!
			// -> readObject() 호출 시 자동으로 "역직렬화" 수행
			// -> JVM이 객체를 인식 가능한 상태로 변경
			Member member = (Member) ois.readObject();

			System.out.print("읽어온 Member : ");
			System.out.println(member);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (ois != null) ois.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

	public void outputMemberList() {

		
		// 스트림 객체 참조 변수	/ 통로 역할의 객체 / 프로그램이 종료됐을 때 자동으로 종료되지 않음으로 직접 종료시켜야함 -> close()
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		
		
		try {
			List<Member> memberList = new ArrayList<Member>();
			
			memberList.add(new Member("member01", "pass01", "짱구"));
			memberList.add(new Member("member02", "pass02", "짱십"));
			memberList.add(new Member("member03", "pass03", "짱십일"));
			memberList.add(new Member("member04", "pass04", "짱십이"));
			memberList.add(new Member("member05", "pass05", "짱십삼"));
			
			// 스트림 객체 생성
			fos = new FileOutputStream("io_test/byte/MemberList.bin");
			oos = new ObjectOutputStream(fos);
			
			// 보조 스트림을 이용해서 객체 출력
			oos.writeObject(memberList);
			
			System.out.println("회원 목록 출력 완료");
			
			
		} catch (Exception e) {
			e.printStackTrace(); // 예외 발생 메서드 추적
		
		} finally {
			try {
				if (oos != null) oos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			} // 보조 스트림 close 시 기반 스트림도 같이 close / close는 IOException을 발생시킬 수 있음
		}

	}

	
	
	/**
	 * MemberList.bin 내용 읽어오기
	 */
	public void inputMemberList() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			fis = new FileInputStream("io_test/byte/MemberList.bin");
			ois = new ObjectInputStream(fis);;
			
			/* fis 기반 스트림에 경로를 넣고 그 경로를 보조 스트림인 ois로 바꿔줌
			 * List<Member> 타입인 memberList에 ois 보조스트림을 readObject로 읽어와서
			 * List<Member> 타입으로 다운캐스팅을 해주고 대입한다 -> memberList가 List<member> 타입이기 때문에 타입 맞춰줌.
			 * 
			 * */
			
			// 직렬화된 상태로 저장된 List<Member> 객체를 읽어와
			// 역직렬화해서 저장
			List<Member> memberList = (List<Member>)ois.readObject();
			
			for(Member member : memberList) {
				System.out.println(member);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 보조 스트림 close -> 기반 스트림도 같이 close
				if(ois != null) ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
