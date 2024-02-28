package sec3;
//특정 변수가 영항을 미치는 범쉬 를 scope 라고한다  (자바책 192p)
public class ScopeExam {
	int a =10; // 전역 변수 : 클래스 전체에서 인지되는 변수이지만, 특정 메소드(함수)내에서는 인지하지 못함.
	static int b =80; //클래스 변수 :클래스 전체에서 인지되며 , 특정메소드(함수)내에서도 인지함.=>Global Scope
	public static void main(String[] args) {
		int a = 20; //지역변수 : 특정 메소드(함수)내에서 선언되어 활용되는 변수로서 함수 블록을 벗어나면,인지할수없음
		System.out.println("지역변수 a=" +a);
		run();
		run(30);
				
	}
	public static void run() {
		int c = 40;
		//System.out.println("지역 변수 a =" +a);
		System.out.println("클래스 변수b =" +b);
		
	}
	public static void run(int a) { //매개변수 : 메소드(함수) 정의시 괄호 안에 있는 변수로 호출시 지정된 값을 저장한다.=>Local Scope
		System.out.println("매개 변수 a=" +a);
		
	}
}
