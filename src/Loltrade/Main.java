package Loltrade;
import java.util.Scanner;
public class Main {

	
	
public static void main(String []args) {
	Scanner sc =new Scanner(System.in);	
	Scanner move = new Scanner(System.in);
	Myinfo myinfo= new Myinfo();
	Lobby lobby = new Lobby();
	CharacterKind characterKind = new CharacterKind();

	
	
	int myMoney=0;
	
	
	
	
	
	System.out.println("당신의 이름은 무엇입니까?");

	
	String name = sc.nextLine();
	 Myinfo.myName(name);
	 
	System.out.println(name+"님 환영합니다.");
	System.out.println("게임 설명");
	System.out.println("각 타워 마다 체력은4칸이며, 각 라인마다 1차,2차,3차 타워 파괴 후 억제기 파괴");
	System.out.println("억제기 2개 파괴시 승리");
	System.out.println("각 라인 첫 억제기 파괴시 버프 획득 또는 보너스 타워 1개 파괴 선택하게됩니다.! ");
	System.out.println("탑 억제기: 장로버프,바텀억제기 바론버프 미드억제기 : 타워파괴력 2배 ");
	System.out.println("턴제 게임이며,첫 억제기 파괴전에는 초반 페이즈로 정글을 활용하여 게임합니다. ");
	System.out.println("이 후에는 팀원 모두의 한타력 또는 운영력을 합산하여 경기하게 됩니다. ");
	
	
	while(true) {
	int count=0;
	System.out.println("현재 소지금 :"+myMoney+" 만원");
	System.out.println(Lobby.Lobby1()); 
	System.out.println(Lobby.Lobby2());
	//1.시합 2.마켓 3.훈련 4.휴식 5.내정보"
	int movenum = move.nextInt();
	if(movenum==1) {
		System.out.println("1.세계 대회(스토리), 2.지역대회(돈벌기)");
		move.nextInt();
		if(movenum==1) {
			System.out.println("세계 대회에 출전 하였습니다.");
			
				for(int i=0; i<50; i++) {
					characterKind.CharacterNum01();
					if(CharacterKind.myteam[i]==0) {
						System.out.println();
					}
				}
				
				
				
				}
				
				
				
				
				movenum = move.nextInt();
				
				
				
				
				
			}
		
		
		
		}
		
		
	}
	
	
	}


