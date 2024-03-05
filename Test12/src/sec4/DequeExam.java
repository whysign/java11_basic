package sec4;

import java.util.Deque;
import java.util.LinkedList;

//Deque : LIFO 와 FIFO가 모두 가능한 구조 -> 스택과 큐의 혼합 구조로서 양쪽에서 입력과 출력이 모두 가능
public class DequeExam {
	public static void main(String[] args) {
		Deque<String> d = new LinkedList<>();
		
		//추가
		d.addFirst("자바");
		d.addFirst("파이");
		d.addLast("자스");
		d.addFirst("리엑");
		d.addLast("노드");
		d.addLast("스타일시트");
		System.out.println(d);
		System.out.println(d.peek()); //큐처럼 동작
		System.out.println(d.peekLast()); //스택처럼 동작
		System.out.println(d.peekFirst()); //큐처럼 동작
		
		System.out.println(d.poll()); //큐처럼 동작하여 맨 처음 요소 반환후 제거
		System.out.println(d.pollLast()); //
		System.out.println(d.pollFirst());
		System.out.println(d);
		System.out.println();
		System.out.println(d.pop());//스택처럼 맨 마지막 요소 반환 후 제거
		System.out.println(d);
	}

}
