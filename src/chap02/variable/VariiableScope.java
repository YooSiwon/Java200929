package chap02.variable;

public class VariiableScope {

	public static void main(String[] args) {
		// 변수의 사용범위
		// 선언된 코드 블럭 안에서 사용 가능
		
		
		int a = 3;
		
		if (true) {
			int b = 5;
			System.out.println(a);
			System.out.println(b);
		}
		
		System.out.println(a);
//		System.out.println(b);
		

	}

}
