package sec2;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String names = "박은성,김영인,이시현,김대중,홍민석,이수훈";//구분기호(delim)를 토큰 이 라고한다.
		String anis = "개새끼 \f 소새끼 \n 말새끼 \t 꿩새끼 \r 쥐새끼 ";
		System.out.println(anis);
		//출력 제어 문자와 같은 것은 토큰을 기재하지 않아도 자동으로 토큰으로 간주
		StringTokenizer st = new StringTokenizer(anis);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken().trim());
		}
		//특정 문자가 토큰인 경우
		StringTokenizer sk = new StringTokenizer(names,",");
		while(sk.hasMoreTokens()) {
			System.out.println(sk.nextToken().trim());
		}
	}

}
