package Loltrade;
import java.util.Scanner;
public class Main {

	
	

	
	

public static void main(String []args) {
	Scanner sc =new Scanner(System.in);	
	Scanner move = new Scanner(System.in);
	Myinfo myinfo= new Myinfo();
	Lobby lobby = new Lobby();
	CharacterAbility characterAbility = new CharacterAbility(0, null, 0, 0, 0, 0, 0);
	
	
	
	
	
	int top1tower=0;
	int top2tower=0;
	int top3tower=0;
	int mid1tower=0;
	int mid2tower=0;
	int mid3tower=0;
	int botton1tower=0;
	int botton2tower=0;
	int botton3tower=0;
	boolean top;
	boolean mid;
	boolean botton;
	int CharacterNum=0;
	int myMoney=0;
	
	
	String CharacterName="";
	int ability=0;
	int cooperation=0;
	int operate=0;
	int hp=0;
	
	if (CharacterNum==1)
	{CharacterName="기본 탑유닛";
	ability=50;
	cooperation=50;
	operate=50;
	hp=5;}
	
	if (CharacterNum==2)
	{
		CharacterName="기본 미드유닛";	
	ability=50;
	cooperation=50;
	operate=50;
	hp=5;}
	
	if (CharacterNum==3)
	{CharacterName="기본 정글유닛";
	ability=50;
	cooperation=50;
	operate=50;
	hp=5;}
	
	if (CharacterNum==4)
	{CharacterName="기본 바텀유닛";
	ability=50;
	cooperation=50;
	operate=50;
	hp=5;}
	
	if (CharacterNum==5)
	{CharacterName="기본 서폿유닛";
	ability=50;
	cooperation=50;
	operate=50;
	hp=5;}
	
	
	if (CharacterNum==6)
	{CharacterName="기본적군 탑유닛";
	ability=50;
	cooperation=50;
	operate=50;
	hp=5;}
	
	if (CharacterNum==7)
	{CharacterName="기본적군 미드유닛";
	ability=50;
	cooperation=50;
	operate=50;
	hp=5;}
	
	if (CharacterNum==8)
	{CharacterName="기본적군 정글유닛";
	ability=50;
	cooperation=50;
	operate=50;
	hp=5;}
	
	if (CharacterNum==9)
	{CharacterName="기본 원딜유닛";
	ability=50;
	cooperation=50;
	operate=50;
	hp=5;}
	
	if (CharacterNum==10)
	{CharacterName="기본적군 서폿유닛";
	ability=50;
	cooperation=50;
	operate=50;
	hp=5;}
	
	
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
			CharacterNum=1;
			System.out.println("우리팀 탑라이너 : "+CharacterName);
			System.out.println("개인기 : "+ability+" , 한타력 : "+cooperation+" , 운영력 : "+operate);
			
			CharacterNum=2;
			System.out.println("우리팀 미드라이너 : "+CharacterName);
			System.out.println("개인기 : "+ability+" , 한타력 : "+cooperation+" , 운영력 : "+operate);
			
			CharacterNum=3;
			System.out.println("우리팀 정글라이너 : "+CharacterName);
			System.out.println("개인기 : "+ability+" , 한타력 : "+cooperation+" , 운영력 : "+operate);
			
			CharacterNum=4;
			System.out.println("우리팀 원딜라이너 : "+CharacterName);
			System.out.println("개인기 : "+ability+" , 한타력 : "+cooperation+" , 운영력 : "+operate);
			
			CharacterNum=5;
			System.out.println("우리팀 서포터 : "+CharacterName);
			System.out.println("개인기 : "+ability+" , 한타력 : "+cooperation+" , 운영력 : "+operate);
			
			CharacterNum=6;
			System.out.println("적팀 탑라이너 : "+CharacterName);
			System.out.println("개인기 : "+ability+" , 한타력 : "+cooperation+" , 운영력 : "+operate);
			
			CharacterNum=7;
			System.out.println("적팀 미드라이너 : "+CharacterName);
			System.out.println("개인기 : "+ability+" , 한타력 : "+cooperation+" , 운영력 : "+operate);
			
			CharacterNum=8;
			System.out.println("적팀 정글라이너 : "+CharacterName);
			System.out.println("개인기 : "+ability+" , 한타력 : "+cooperation+" , 운영력 : "+operate);
			
			CharacterNum=9;
			System.out.println("적팀 원딜 라이너 : "+CharacterName);
			System.out.println("개인기 : "+ability+" , 한타력 : "+cooperation+" , 운영력 : "+operate);
			
			CharacterNum=10;
			System.out.println("적팀 서포터 : "+CharacterName);
			System.out.println("개인기 : "+ability+" , 한타력 : "+cooperation+" , 운영력 : "+operate);
			
			for(int i=0; i< 5; i++) {
				count++;
				CharacterNum=3;
				System.out.println("우리팀 정글라이너 : "+CharacterName);
				System.out.println("개인기 : "+ability+" , 한타력 : "+cooperation+" , 운영력 : "+operate);
				System.out.println("우리팀 정글라이너 : "+CharacterName+"를 어디에 갱을 보낼까요?");
				System.out.println("탑 1, 미드 2 바텀 3");
				
				
				movenum = move.nextInt();
				
				System.out.println("적팀 원딜 라이너 : "+CharacterName);
				
				
				
			}
		
		
		
		}
		
		
	}
	
	
	}
}
}
