package section03;

import java.io.IOException;

public class Parent {

	public void method1() throws IOException {
		throw new IOException(); // 예외를 강제 발생시키겠다.
	}

	public void method2() throws IOException {
		throw new IOException();
	}

	public void method3() throws IOException {
		throw new IOException();

	}
}
