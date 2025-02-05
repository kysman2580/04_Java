package loop.run;

import loop.service.LoopService2;
//import loop.sevice.LoopService1;

public class LoopRun {

	public static void main(String[] args) {
		
		// LoopService1 객체 생성
//		LoopService1 service1 = new LoopService1();		
//		service1.displayMenu(); // 메뉴 제공
		
		LoopService2 service2 = new LoopService2();
		service2.displayMenu();
	}
}
