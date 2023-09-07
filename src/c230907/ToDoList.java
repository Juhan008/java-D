package c230907;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class ToDoList {
//투두 리스트 만들기
	//셋으로 입력 , 맵으로 찾아서 출력하자 우선순위는 뭘로 만드는게 좋을까아? 나두 몰랑 케케
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner title = new Scanner(System.in);
		Scanner empty = new Scanner(System.in);

		TreeMap<String, Integer> map = new TreeMap<>();
		
		
		
		boolean toDoList = true;  
		System.out.println("안녕하세요 당신의 스케줄을 관리해드립니다.");
		System.out.println("ㄴEnter");
		String title1 =title.nextLine();
	
		while(toDoList) {
		System.out.println("1.내 스케줄 등록하기");
		System.out.println("2.내 스케줄 삭제하기");
		System.out.println("3.내 스케줄 오름차순 보기");
		System.out.println("4.하위순서로 보기");
		System.out.println("5.종료하기");
		
		int scNUM= sc.nextInt();
		
			if (scNUM==1) {
				System.out.println("추가할 스케줄 제목 또는 내용을 입력해주세요!");
				title1 =title.nextLine();
				//empty.nextLine();
				System.out.println("1~20까지 스케줄 중요도를 입력해주세요!");
				scNUM= sc.nextInt();
				 
			        if (!map.containsKey(title1)) {
			            map.put(title1,scNUM );
			            System.out.println(title1+"이(가)  "+scNUM+"번째 우선순위로 추가되어었습니다.");
			            System.out.println("ㄴEnter");
			            empty.nextLine();
			        } else {
			            System.out.println("이미 추가되어있는 내용입니다.");
			            System.out.println("ㄴEnter");
			            empty.nextLine();
			        }
			}
		    else if (scNUM==2) {	
		    	System.out.println("삭제할 스케줄 제목 또는 내용을 입력해주세요!");
		    	title1 = title.nextLine();
		    	System.out.println("1~20까지 스케줄 중요도를 입력해주세요!");
				scNUM= sc.nextInt();
		        map.remove(title1,scNUM);
		        System.out.println(scNUM+"번째 우선순위인 "+title1+"이(가) 삭제되어었습니다.");
		       
			}
		    else if (scNUM==3) {	
		    	System.out.println("등록 갯수 :"+map.size());
		    	for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    	    String key = entry.getKey();
		    	    Integer value = entry.getValue();
		    	    System.out.println("스케줄 제목 : " + key + ", 우선순위 : " + value);
		    	}
				
		    	
			}
		    else if (scNUM==4) {	
		        	
					
			}

			else if (scNUM==5) {	
		
				toDoList = false;
			}
		}
	}
}
