package c230907;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;



public class FIFOFILE {
	public static void main(String[] args) {
	//first in First Out => Queue > 클래스에서 
	//first in Last out => Stack > 메소드 호출에 많이 사용한다.
	
	Queue<Integer>qqq =new LinkedList<>(); // Array , LinkedList, Array List
	
	System.out.println(qqq.isEmpty());
	
	qqq.offer(1);
	qqq.offer(2);
	qqq.offer(3);
	qqq.offer(4);
	qqq.offer(5);

	System.out.println(qqq.isEmpty());
	System.out.println(qqq.size());
	System.out.println(qqq);
	System.out.println(qqq.poll());//제거하는
	System.out.println(qqq.size());
	System.out.println(qqq);
	
	//데이터를 효율적으로 저장하기위해서 자료형을 쓴다
//알고리즘은 시간을 단축시키기 위해 규격화한것
	//n개를 n의 제곱번 돌린다. 버블정렬
	
	Stack<Integer>sss =new Stack<>();
	
	
	System.out.println(sss.isEmpty());
	
	sss.push(1);
	sss.push(2);
	sss.push(3);
	sss.push(4);
	sss.push(5);

	System.out.println(sss);
	System.out.println(sss.size());
	System.out.println(sss);
	System.out.println(sss.pop());
	System.out.println(sss.size());
	System.out.println(sss);
	
	}
}
