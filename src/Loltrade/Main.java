package Loltrade;
import java.util.Scanner;
public class Main {

	
	
public static void main(String []args) {
	Scanner sc =new Scanner(System.in);	
	Scanner move = new Scanner(System.in);
	Scanner order = new Scanner(System.in);
	Scanner empty = new Scanner(System.in);
	
	
	Myinfo myinfo= new Myinfo();
	Lobby lobby = new Lobby();
	CharacterKind characterKind = new CharacterKind();
	CharacterKind[] characters = new CharacterKind[5];
	BattleSystem battleSystem = new BattleSystem();
	
	
	Enemy enemy = new Enemy();
	Enemy[] enemys = new Enemy[5];
	int enemyOrderNUM=0;
	
	String gankingOrder=" ";
	String gankingPlaceA=" ";
	String gankingPlaceB=" ";
	
	
	for (int i = 0; i < characters.length; i++) {
        characters[i] = new CharacterKind();
	}
	for (int i = 0; i < enemys.length; i++) {
		enemys[i] = new Enemy();
	}
	
	int myMoney=0;
	
	
	System.out.println("당신의 이름은 무엇입니까?");

	
	String name = sc.nextLine();
	 Myinfo.myName(name);
	 
	System.out.println(name+"님 환영합니다.");
	System.out.println("게임 설명");
	System.out.println("각 타워 마다 체력은 4칸이며, 각 라인마다 1차,2차,3차 타워 파괴 후 억제기 파괴가 가능합니다.");
	System.out.println("억제기 2개 파괴시 승리하게 됩니다.");
	System.out.println("각 라인 첫 억제기 파괴시 버프 획득 또는 보너스 타워 1개 파괴 선택하게됩니다. ");
	System.out.println("탑 억제기 파괴시, 장로버프 또는 포탑 1개 추가 파괴 선택 가능합니다.");
	System.out.println("바텀 억제기 파괴시, 바론버프 또는 포탑 1개 추가 파괴 선택 가능합니다.");
	System.out.println("미드억제기 파괴시, 타워파괴력 2배 버프를 얻게 됩니다.");
	System.out.println("턴제 게임이며,첫 억제기 파괴전에는 초반 페이즈로 정글을 활용하여 게임합니다. ");
	System.out.println("이 후에는 팀원 모두의 한타력 또는 운영력을 합산하여 경기하게 됩니다. ");
	
	boolean lolTrade= true;
	while(lolTrade) {
	int count=0;
	System.out.println("현재 소지금 :"+myMoney+" 만원");
	System.out.println(Lobby.Lobby1()); 
	System.out.println(Lobby.Lobby2());
	//1.시합 2.마켓 3.훈련 4.휴식 5.내정보"
	int movenum = move.nextInt();
	if(movenum==1) {
		System.out.println();
		System.out.println("1.세계 대회(스토리), 2.지역대회(돈벌기)");
		move.nextInt();
		if(movenum==1) {
			System.out.println();
			System.out.println("세계 대회에 출전 하였습니다.");
			System.out.println();
			System.out.println(name+"팀 출전 정보");
			
				for(int i=0; i<characters.length; i++) {
					switch (i){
					case 0:
						characters[i].CharacterNum0(); break;
					case 1:
						characters[i].CharacterNum1();break;
					case 2:
						characters[i].CharacterNum2();break;
					case 3:
						characters[i].CharacterNum3();break;
					case 4:
						characters[i].CharacterNum4();break;
					     }
					/*if( CharacterKind.myteam[i]==0 &&
						CharacterKind.myInventory[i]==0 &&
						CharacterKind.position[i]==0
						) {*/
						System.out.println("--------------------------");
						System.out.println("선수명 : "+characterKind.characterName);
						System.out.println("기술력 : "+characterKind.ability);
						System.out.println("한타력 : "+characterKind.cooperation);
						System.out.println("운영력 : "+characterKind.operate);
						
				}
				//다른팀 설정 미구현
				System.out.println("--------------------------");
				System.out.println("상대팀 소개");
				enemy.enemyDifficulty=0.05;
				System.out.println("난이도 1");
				//승리시 money 획득 가능
				for(int i=0; i<enemys.length; i++) {
					switch (i){
					case 0:
						enemys[i].globalEnemy0(); break;
					case 1:
						enemys[i].globalEnemy1();break;
					case 2:
						enemys[i].globalEnemy2();break;
					case 3:
						enemys[i].globalEnemy3();break;
					case 4:
						enemys[i].globalEnemy4();break;
					     }
						System.out.println("--------------------------");
						System.out.println("선수명 : "+enemy.characterName);
						System.out.println("기술력 : "+enemy.ability);
						System.out.println("한타력 : "+enemy.cooperation);
						System.out.println("운영력 : "+enemy.operate);
						
				
				}
					System.out.println("--------------------------");
					System.out.println("경기를 시작합니다.");
					System.out.println("--------------------------");
					System.out.println();
					System.out.println("양팀 각 라이너가 맡은 라인으로 이동하였습니다.");
					System.out.println("ㄴ>enter");
					empty.nextLine();
					System.out.println("각 팀의 정글러들이 갱킹을 준비합니다!");
					System.out.println("ㄴ>enter");
					empty.nextLine();
					TawerSystem tawerSystem = new TawerSystem();
					tawerSystem.myTawer();
					tawerSystem.enemyTawer();
					
					//반복
					boolean worldChampionShipLeague=true;
					while(worldChampionShipLeague) {
						//System.out.print(battleSystem.jungleBattle(characters[2].ability));
						System.out.println(name+"팀 정글러에게 어느 라인 갱킹을 오더하시겠습니까? ");
						if(tawerSystem.enemyTopLinerFlesh==false) {
							System.out.println("감독님 적팀 탑라이너가 현재 플래쉬가 없습니다!");
						}
						if(tawerSystem.enemyMidLinerFlesh==false) {
							System.out.println("감독님 적팀 미드라이너가  현재 플래쉬가 없습니다!");
						}
						if(tawerSystem.enemyBottomLinerFlesh==false) {
							System.out.println("감독님 적팀 바텀듀오가 현재 플래쉬가 없습니다!");
						}
						System.out.println("정글러가 오더를 따를 확율은 "+(characters[2].ability)+"% 입니다.");
						System.out.println("1.탑, 2.미드 ,3.바텀 입력하세요!");
						int orderNUM=order.nextInt();
						int Jungle=0;
						int myLiner=0;
						int enemyLiner=0;
						{
							if (orderNUM==1) {
								gankingOrder="탑";
								gankingPlaceA="미드";
								gankingPlaceB="바텀";
							}
							else if (orderNUM==2) {
								gankingOrder="미드";
								gankingPlaceA="탑";
								gankingPlaceB="바텀";
							}
							else if (orderNUM==3) {
								gankingOrder="바텀";
								gankingPlaceA="탑";
								gankingPlaceB="미드";
							}
						}
						battleSystem.ganking(myLiner, Jungle, enemyLiner);	
						
							System.out.println(name+"팀 정글러에게 "+gankingOrder+" 갱킹을 오더하였습니다. ");
							System.out.println("ㄴ>enter");
							empty.nextLine();
							
							// 오더한 라인의 적팀 플래시가 없는 경우 정글러는 100% 오더를 수행하며, 100% 포탑 피해를 입는다.
							if (orderNUM==1 && tawerSystem.enemyTopLinerFlesh==false ) {
									tawerSystem.enemyTopTower++;
									System.out.println(name+"팀 정글러의 완벽한 갱킹으로 "+gankingOrder+" 라이너가 속수무책으로 당했습니다!. ");
									tawerSystem.enemyTopLinerFlesh=true;
							}
							else if (orderNUM==2 && tawerSystem.enemyMidLinerFlesh==false ) {
									tawerSystem.enemyMidTower++;
									System.out.println(name+"팀 정글러의 완벽한 갱킹으로 "+gankingOrder+" 라이너가 속수무책으로 당했습니다!. ");
									tawerSystem.enemyMidLinerFlesh=true;
							}
							else if (orderNUM==3 && tawerSystem.enemyBottomLinerFlesh==false ) {
									tawerSystem.enemyBottomTower++;
									System.out.println(name+"팀 정글러의 완벽한 갱킹으로 "+gankingOrder+" 라이너가 속수무책으로 당했습니다!. ");
									tawerSystem.enemyBottomLinerFlesh=true;
							}
							else{//첫번째 시행 또는 오더한 라인의 라이너가, 플래시가 있는 경우 아래로 시행 
								
								
								battleSystem.jungleBattle(characters[2].ability);//
		
								if (battleSystem.sellectTawer==1) {
							
									System.out.println(name+"팀 정글러가 "+gankingOrder+"에 갱킹을 갔습니다! ");
									System.out.println("ㄴ>enter");
									empty.nextLine();
									//오더를 제대로 따랐을 때.
									{
									if 		(orderNUM==1){
										battleSystem.ganking(characters[0].ability, characters[2].ability, enemys[0].ability);}
									else if (orderNUM==2){
										battleSystem.ganking(characters[1].ability, characters[2].ability, enemys[1].ability);}
									else if (orderNUM==3){
										battleSystem.ganking(characters[3].ability+characters[4].ability, characters[2].ability,enemys[3].ability+enemys[4].ability);}
									}
									if (battleSystem.success ==0) {
										System.out.println(name+"팀 정글러가 "+gankingOrder+" 갱킹을 성공하였습니다!");
										System.out.println("적팀 "+gankingOrder+" 포탑에 금이 갔습니다.");
										{//오더한 곳에 갱킹을 성공했을 때.
											if (orderNUM==1){tawerSystem.enemyTopTower++;}
											else if (orderNUM==2){tawerSystem.enemyMidTower++;}
											else if (orderNUM==3){tawerSystem.enemyBottomTower++;}
										}
										
									}
									else if (battleSystem.success ==1) {
										System.out.println(name+"팀 정글러가 "+gankingOrder+" 갱킹을 실패하였습니다!");
										System.out.println("상대팀 "+gankingOrder+" 라이너가 플래쉬를 사용하였습니다!");
										{//오더한 곳 라이너의 플래쉬를 뺏을 때.
											if (orderNUM==1){tawerSystem.enemyTopLinerFlesh=false;}
											else if (orderNUM==2){tawerSystem.enemyMidLinerFlesh=false;}
											else if (orderNUM==3){tawerSystem.enemyBottomLinerFlesh=false;}
										}
									}
									else if (battleSystem.success ==2) {
										System.out.println(name+"팀 정글러가 "+gankingOrder+" 갱킹을 실패하였습니다!");
										System.out.println("상대팀 "+gankingOrder+" 라이너가 와드로 갱킹을 피했습니다!");
									}
								}
								
								else if (battleSystem.anotherTawerA==1) {
									System.out.println(name+"팀 정글러가 "+gankingPlaceA+" 갱킹을 갔습니다!");
									System.out.println("ㄴ>enter");
									empty.nextLine();
										{
										//Plan A 가 나왔을 때.
										if 		(orderNUM==1){
											battleSystem.ganking(characters[1].ability, characters[2].ability, enemys[1].ability);}
										else if (orderNUM==2){
											battleSystem.ganking(characters[0].ability, characters[2].ability, enemys[0].ability);}
										else if (orderNUM==3){
											battleSystem.ganking(characters[0].ability, characters[2].ability, enemys[0].ability);}
										}
									battleSystem.ganking(characters[2].ability, characters[1].ability, enemys[1].ability);
									if (battleSystem.success ==0) {
										System.out.println(name+"팀 정글러가 "+gankingPlaceA+" 갱킹을 성공하였습니다!");
										System.out.println("적팀 "+gankingPlaceA+" 포탑에 금이 갔습니다.");
										{//Plan A에서 갱킹을 성공했을 때.
											if (orderNUM==1){tawerSystem.enemyMidTower++;}
											else if (orderNUM==2){tawerSystem.enemyTopTower++;}
											else if (orderNUM==3){tawerSystem.enemyTopTower++;}
										}
										}
									else if (battleSystem.success ==1) {
										System.out.println(name+"팀 정글러가 "+gankingPlaceA+" 갱킹을 실패하였습니다!");
										System.out.println("상대팀 "+gankingPlaceA+" 라이너가 플래쉬를 사용하였습니다!");
										{//Plan A에서 라이너의 플래쉬를 뺏을 때.
											if (orderNUM==1){tawerSystem.enemyMidLinerFlesh=false;}
											else if (orderNUM==2){tawerSystem.enemyTopLinerFlesh=false;}
											else if (orderNUM==3){tawerSystem.enemyTopLinerFlesh=false;}
										}
								}
								else if (battleSystem.success ==2) {
									System.out.println(name+"팀 정글러가 "+gankingPlaceA+" 갱킹을 실패하였습니다!");
									System.out.println("상대팀 "+gankingPlaceA+"라이너가 와드로 갱킹을 피했습니다!");
								}
						
								}
								else if (battleSystem.anotherTawerB==1) {
									System.out.println(name+"팀 정글러가 "+gankingPlaceB+"에 갱킹을 갔습니다! ");
									System.out.println("ㄴ>enter");
									empty.nextLine();
									{
										//Plan B 가 나왔을 때.
										if 		(orderNUM==1){
											battleSystem.ganking(characters[3].ability+characters[4].ability, characters[2].ability,enemys[3].ability+enemys[4].ability);}
										else if (orderNUM==2){
											battleSystem.ganking(characters[3].ability+characters[4].ability, characters[2].ability,enemys[3].ability+enemys[4].ability);}
										else if (orderNUM==3){
											battleSystem.ganking(characters[1].ability, characters[2].ability,enemys[1].ability);}
									}
									battleSystem.ganking(characters[2].ability, characters[1].ability, enemys[1].ability);
									if (battleSystem.success ==0) {
										System.out.println(name+"팀 정글러가 "+gankingPlaceB+" 갱킹을 성공하였습니다!");
										{//Plan B에서 갱킹을 성공했을 때.
											if (orderNUM==1){tawerSystem.enemyBottomTower++;}
											else if (orderNUM==2){tawerSystem.enemyBottomTower++;}
											else if (orderNUM==3){tawerSystem.enemyMidTower++;}
										}
										}
									else if (battleSystem.success ==1) {
										System.out.println(name+"팀 정글러가 "+gankingPlaceB+" 갱킹을 실패하였습니다!");
										System.out.println("상대팀 "+gankingPlaceB+" 라이너가 플래쉬를 사용하였습니다!");
										{//Plan B에서 라이너의 플래쉬를 뺏을 때.
											if (orderNUM==1){tawerSystem.enemyBottomLinerFlesh=false;}
											else if (orderNUM==2){tawerSystem.enemyBottomLinerFlesh=false;}
											else if (orderNUM==3){tawerSystem.enemyMidLinerFlesh=false;}
										}
									}
									else if (battleSystem.success ==2) {
										System.out.println(name+"팀 정글러가 "+gankingPlaceB+" 갱킹을 실패하였습니다!");
										System.out.println("상대팀 "+gankingPlaceB+"라이너가 와드로 갱킹을 피했습니다!");
									}
								}
						}
						System.out.println("상대 탑 : "+tawerSystem.enemyTopTower+"  미드 : "+tawerSystem.enemyMidTower + "  바텀 : "+tawerSystem.enemyBottomTower);
						
						
						System.out.println();
						System.out.println("------------------------------------------------------------------------------------------");
						System.out.println("상대팀의 공격이 시작되었습니다.");
						System.out.println("ㄴ>enter");
						empty.nextLine();

						System.out.println("상대팀 정글러가 갱킹을 시도합니다.");
						
						enemyOrderNUM=enemy.enemyOrder();
						
						battleSystem.ganking(enemyLiner, Jungle, myLiner);	
						if (enemyOrderNUM==1){gankingOrder="탑";}
						else if (enemyOrderNUM==2){gankingOrder="미드";}
						else if (enemyOrderNUM==3){gankingOrder="바텀";}
						System.out.println("상대팀 감독이 정글러에게 "+gankingOrder+" 갱킹을 오더하였습니다. ");
						System.out.println("ㄴ>enter");
						empty.nextLine();
						
						// 오더한 라인의 적팀 플래시가 없는 경우 정글러는 100% 오더를 수행하며, 100% 포탑 피해를 입는다.
						if (enemyOrderNUM==1 && tawerSystem.myTopLinerFlesh==false ) {
								tawerSystem.myTopTower++;
								System.out.println("상대팀 정글러의 완벽한 갱킹으로 "+gankingOrder+" 라이너가 속수무책으로 당했습니다!. ");
								tawerSystem.myTopLinerFlesh=true;
						}
						else if (enemyOrderNUM==2 && tawerSystem.myMidLinerFlesh==false ) {
								tawerSystem.myMidTower++;
								System.out.println("상대팀 정글러의 완벽한 갱킹으로 "+gankingOrder+" 라이너가 속수무책으로 당했습니다!. ");
								tawerSystem.myMidLinerFlesh=true;
						}
						else if (enemyOrderNUM==3 && tawerSystem.myBottomLinerFlesh==false ) {
								tawerSystem.myBottomTower++;
								System.out.println("상대팀 정글러의 완벽한 갱킹으로 "+gankingOrder+" 라이너가 속수무책으로 당했습니다!. ");
								tawerSystem.myBottomLinerFlesh=true;
						}
						else{//첫번째 시행 또는 오더한 라인의 라이너가, 플래시가 있는 경우 아래로 시행 
							
							
							battleSystem.jungleBattle(enemys[2].ability);//
						
							System.out.println("상대팀 정글러가 "+gankingOrder+"에 갱킹을 갔습니다! ");
							System.out.println("ㄴ>enter");
							empty.nextLine();
							//상대 정글은 오더를 제대로 따른다.
								{
									if 		(enemyOrderNUM==1){
										battleSystem.ganking(enemys[0].ability, enemys[2].ability, characters[0].ability);}
									else if (enemyOrderNUM==2){
										battleSystem.ganking(enemys[1].ability, enemys[2].ability, characters[1].ability);}
									else if (enemyOrderNUM==3){
										battleSystem.ganking(enemys[3].ability+enemys[4].ability, enemys[2].ability,characters[3].ability+characters[4].ability);}
								}
								if (battleSystem.success==0) {
									System.out.println("상대팀 정글러가 "+gankingOrder+" 갱킹을 성공하였습니다!");
									System.out.println("아군팀 "+gankingOrder+" 포탑에 금이 갔습니다.");
									{//오더한 곳에 갱킹을 성공했을 때.
										if (enemyOrderNUM==1){tawerSystem.myTopTower++;}
										else if (enemyOrderNUM==2){tawerSystem.myMidTower++;}
										else if (enemyOrderNUM==3){tawerSystem.myBottomTower++;}
									}
									
								}
								else if (battleSystem.success ==1) {
									System.out.println("상대팀 정글러가 "+gankingOrder+" 갱킹을 실패하였습니다!");
									System.out.println("아군팀 "+gankingOrder+" 라이너가 플래쉬를 사용하였습니다!");
									{//오더한 곳 라이너의 플래쉬를 뺏을 때.
										if (enemyOrderNUM==1){tawerSystem.myTopLinerFlesh=false;}
										else if (enemyOrderNUM==2){tawerSystem.myMidLinerFlesh=false;}
										else if (enemyOrderNUM==3){tawerSystem.myBottomLinerFlesh=false;}
									}
								}
								else if (battleSystem.success ==2) {
									System.out.println("상대팀 정글러가 "+gankingOrder+" 갱킹을 실패하였습니다!");
									System.out.println("아군팀 "+gankingOrder+" 라이너가 와드로 갱킹을 피했습니다!");
								}						
							
						}
						System.out.println(name+"팀 탑 : "+tawerSystem.myTopTower+"  미드 : "+tawerSystem.myMidTower + "  바텀 : "+tawerSystem.myBottomTower);
					}			
				
				
				movenum = move.nextInt();
				
				
				
				
				
		}
		
		
		
	}
		
		
	}
	
	
	}
}



