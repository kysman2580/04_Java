package section03.dto;



/** Calculator 인터페이스 구현체
 * - 모든 인터페이스 구현체 같은 형태를 띠고 있다ㅏ
 */
public class KYSCalculator implements Calculator{

	@Override
	public int plus(int a, int b) {
		int result = checkNum(a+b);
		
		return result;
	}

	@Override
	public int minus(int a, int b) {
	    int result = checkNum(a-b);
	    
	    return result;
	}

	@Override
	public int multi(int a, int b) {
	    int result = checkNum(a*b);  
		
	    return result;
	}

	@Override
	public double div(int a, int b) {
		double result = (double)a/b;
		
		if(result > MAX_NUM) return MAX_NUM;
		if(result < MIN_NUM) return MIN_NUM;
		
		return result;
	}

	@Override
	public int mod(int a, int b) {
		int result = checkNum(a%b);
		
		return result;
	}

	@Override
	public int pow(int a, int b) {
		int result = 1;
		// for
		for(int i=0; i<b; i++) {
			result *= a;
		}
		return checkNum(result);
	}

	@Override
	public double areaOfCircle(double r) {
		double result = PI * r * r;
		
		if(result > MAX_NUM) return MAX_NUM;
		if(result < MIN_NUM) return MIN_NUM;
		
		return result;
	}

}
