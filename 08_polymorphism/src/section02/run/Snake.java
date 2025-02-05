package section02.run;

import section02.dto.Animal;

public class Snake extends Animal{

	@Override
	public void move() {
		 System.out.println("뱀 : S자로 슬금슬금");
	}

	@Override
	public void eat() {
		 System.out.println("뱀 : 통으로 삼킴");
	}

	@Override
	public void sleep() {
		 System.out.println("뱀 : 똬리 틀고 잠");
	}

}
