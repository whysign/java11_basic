package sec1;

public class Exam1 {

	public static void main(String[] args) {
		int a = 1004;
		int b = 1004;
		System.out.println("a==b : " +(a==b)); //단순 변수의 정수 값 비교
		
		String s1 = "박은성"; // 기본형x , 참조형x
		String s2 = "박은성";
		System.out.println("s1==s2 : "+(s1==s2)); //틀린 문자열의 값 비교 *엄청 중요함*
		System.out.println("s1 equls d : " +(s1.equals(s2))); //맞는 문자열의 값 비교 -> String 클래스 연산을 해야 하므로 반드시 equals 로해야함
		
		Integer c= new Integer(1004);
		Integer d= new Integer(1004);
		
		System.out.println("a==c : " +(a==c)); //기본형과 참조형의 비교는 값 비교
		System.out.println("c==d : " +(c==d)); // 참조형과 참조형의 비교는 주소 비교
		System.out.println("c equls d : " +(c.equals(d)));//참조형의 비교는 equals로 해야함.
	}

}
