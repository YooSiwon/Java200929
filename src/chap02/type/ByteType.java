package chap02.type;

public class ByteType {

	public static void main(String[] args) {
		// byte : 정수형 
		// 크기: 1byte (8bit)
		
		// -128: 1000 0000
		// 
		// -3 : 1111 1101
		// -2 : 1111 1110
		// -1 : 1111 1111
		
		// +1 : 0000 0001
		
		//      1 0000 0000
		
		// 0: 0000 0000
		// 1: 0000 0001
		// 2: 0000 0010
		//  : 
		// 127: 0111 1111 양수로 제일 크게 표현할수 있는 수
		
		// +1
		
		// -128: 1000 0000
		
		
		byte byteValue;
		
		byteValue = 0;
		System.out.println(byteValue);
		
		byteValue = 127;
		System.out.println(byteValue);
		
//		byteValue = 128;
		
		byteValue++;
		System.out.println(byteValue);

	}

}
