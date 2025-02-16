package section04.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharService {

	/*
	 * 문자 기반 스트림
	 * 
	 * - 2byte 문자(char) 단위로 입/출력하는 스트림
	 * 
	 * - 문자만 작성된 파일(txt, bin 등), 채팅, JSON, 웹 요청(주소)reader/응답(HTML)writer - 문자 기반 스트림
	 * 최상위 인터페이스 : Reader(입력), Writer(출력)
	 */

	/**
	 * 문자 기반 스트림을 이용한 파일 출력
	 */
	public void fileOutput1() {

		FileWriter fw = null;

		try {
			String content = 
"""
오늘 따라 왜이리 떠올라 그리운 마음에
그냥 가기엔 아쉬운 것 같아서 (지금 뭐해?)
잠깐 나와 같이 걸을까 해서
내 맘 전해보곤 해
어제도 신나게
네 얘기를 떠들다가 잠에 들어 (잠에 들어)
It's time to say something, 이렇게 또 망설이다
놓쳐버리면 나는 어떡해? I'm going crazy (I'm going crazy)
Oh, it's time to say something (time to say something)
Then you gotta show it, babe
서너 군데 골라놨어, 가자 one day
둘이서, day and night, 더 바랄 게 없는걸
You're gonna say I like it
I'll be everything that you want me to be
Day and night trip
둘이서, day and night, love
Or pick another day
Whenever you want, my babe
하루에도 몇 번씩 생각했었지
하나, 하나, 하나, 네게 원하는 건 없어, 난 okay, my babe
어제도 신나게
네 얘기를 떠들다가 잠에 들어 (잠에 들어)
It's time to say something, 이렇게 또 망설이다
놓쳐버리면 나는 어떡해? I'm going crazy (I'm going crazy)
Oh, it's time to say something (time to say something)
Then you gotta show it, babe
서너 군데 골라놨어, 가자 one day
둘이서, day and night, 더 바랄 게 없는걸
You're gonna say I like it
I'll be everything that you want me to be
Day and night trip
둘이서, day and night, love
네게 원하는 건 없어, 난 okay
흘러, 흘러, 흘러, 시간이 가도
점점 커져가는 맘을 어떡해?
다 너에게 줄게
더 넓은데 언제라도, 가자 one day
둘이서, day and night, 더 바랄 게 없는걸
You're gonna say I like it
I'll be everything that you want me to be
Day and night trip
둘이서, day and night, love
""";
			
			
			// 폴더가 없을 경우 생성
			String path = "io_test/char";
			
			File folder = new File(path);
			if(!folder.exists()) folder.mkdir();
			
			// 문자 기반 파일 출력 스트림 객체 생성
			fw = new FileWriter(folder + "/" + "거니_34.txt");
			
			// 문자 기반 스트림을 이용해서 출력하기
			fw.write(content);	// String, char[] 출력을 위한 기능이 제공됨
			
			fw.flush();	// 스트림에 남은 데이터를 밀어냄 / close 시 자동 수행
			
			System.out.println("출력 완료");
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)	fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	
	
	/** 문자 기반 스트림 + 보조스트림을 이용한 파일 출력 */
	public void fileOutput2() {

		FileWriter fw = null;
		BufferedWriter bw = null; // 버퍼를 이용한 보조 스트림 (임시로 데이터를 모아두는 메모리 공간)
		

		try {
			String content = 
					
"""
오늘 따라 왜이리 떠올라 그리운 마음에
그냥 가기엔 아쉬운 것 같아서 (지금 뭐해?)
잠깐 나와 같이 걸을까 해서
내 맘 전해보곤 해
어제도 신나게
네 얘기를 떠들다가 잠에 들어 (잠에 들어)
It's time to say something, 이렇게 또 망설이다
놓쳐버리면 나는 어떡해? I'm going crazy (I'm going crazy)
Oh, it's time to say something (time to say something)
Then you gotta show it, babe
서너 군데 골라놨어, 가자 one day
둘이서, day and night, 더 바랄 게 없는걸
You're gonna say I like it
I'll be everything that you want me to be
Day and night trip
둘이서, day and night, love
Or pick another day
Whenever you want, my babe
하루에도 몇 번씩 생각했었지
하나, 하나, 하나, 네게 원하는 건 없어, 난 okay, my babe
어제도 신나게
네 얘기를 떠들다가 잠에 들어 (잠에 들어)
It's time to say something, 이렇게 또 망설이다
놓쳐버리면 나는 어떡해? I'm going crazy (I'm going crazy)
Oh, it's time to say something (time to say something)
Then you gotta show it, babe
서너 군데 골라놨어, 가자 one day
둘이서, day and night, 더 바랄 게 없는걸
You're gonna say I like it
I'll be everything that you want me to be
Day and night trip
둘이서, day and night, love
네게 원하는 건 없어, 난 okay
흘러, 흘러, 흘러, 시간이 가도
점점 커져가는 맘을 어떡해?
다 너에게 줄게
더 넓은데 언제라도, 가자 one day
둘이서, day and night, 더 바랄 게 없는걸
You're gonna say I like it
I'll be everything that you want me to be
Day and night trip
둘이서, day and night, love
""";
			
			
			// 폴더가 없을 경우 생성
			String path = "io_test/char";
			
			File folder = new File(path);
			if(!folder.exists()) folder.mkdir();
			
			// 문자 기반 파일 출력 스트림 객체 생성
			fw = new FileWriter(folder + "/" + "거니34_Buffer버전.txt");
			
			// 보조 스트림 객체
			bw = new BufferedWriter(fw);
			
			// 문자 기반 스트림을 이용해서 출력하기
			bw.write(content);	// String, char[] 출력을 위한 기능이 제공됨
			
			bw.flush();	// 스트림에 남은 데이터를 밀어냄 / close 시 자동 수행
			
			System.out.println("출력 완료");
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)	bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	/**
	 * 문자 기반 입력 스트림 + 보조 스트림 이용해서 파일 읽어오기
	 */
	public void fileInput() {
		
		/* [try - with - resource]
		 * - 자바 7버전에서 추가된 기능
		 * - finally에서  작성하던 close 처리 구문을
		 * 	 자동으로 수행하도록 만드는 구문
		 */
		
		
		String path = "io_test/char/거니34_Buffer버전.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {	// try 끝나면 자동으로 close
			
			// 보조 스트림을 이용해서 파일 내용 읽어오기
			
			StringBuilder sb = new StringBuilder();	// 읽어온 내용을 누적
			String temp = null;	// 임시 변수
			
			while(true) {
			temp = br.readLine(); // 한 줄씩 읽어오기
			
			if(temp == null) break;	// 읽어온 내용이 없으면 반복을 종료한다.
			
			sb.append(temp);	// 읽어온 내용 누적(엔터 미포
			sb.append("\n");	// 엔터 추가
			}
			
			System.out.println("읽어오기 성공");
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println(sb.toString());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		// finally에서 close 하던 구문 생략 가능
	}
	
	
	
	
	// Scanner 대신 스트림을 이용한 문자열 입력 받기
	// -> Scanner가 편리하긴 한데 매우 느림.
	
	
	// System.in : 기본 장치(키보드)와 연결된 InputsStream 반환
	public void keyboardInput() {	
		
		// InpuStreamReader : 바이트 스트림 -> 문자 스트림 변환
		try(BufferedReader br 
				= new BufferedReader(new InputStreamReader(System.in))) {
			 
			System.out.print("문자열 입력1 : ");
			String input1 = br.readLine();	// 입력된 한 줄 읽어오기
			
			System.out.print("문자열 입력2 : ");
			String input2 = br.readLine();	// 입력된 한 줄 읽어오기
			
			System.out.println("intput1 : " + input1);
			System.out.println("intput2 : " + input2);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
