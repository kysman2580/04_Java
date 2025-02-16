//package section02;
//
//import java.io.IOException;
//
//public class ThrowsRun {
//
//	public static void main(String[] args) {
//
//		ThrowsTest tt = new ThrowsTest();
//
//		try {
//			tt.method1(); // IOException이 전달되어옴
//
//		} catch (Exception e) {
//			// Exception : IPException의 부모 타입 == 다형성 적용
//			System.out.println("예외 처리됨");
//		} catch (IOException e) {
//		} finally {
//			System.out.println("마지막에 무조건 수행");
//		}
//	}
//
//}
