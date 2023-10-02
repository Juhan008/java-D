package main;

import java.util.ArrayList;
import java.util.Scanner;

import battleSystem.BattleElement;
import battleSystem.BattleJoin;
import battleSystem.BottomObjectSystem;
import battleSystem.ComPattern;
import battleSystem.EarlyPhase;
import battleSystem.FinalTowerElement;
import battleSystem.FinalTowerSystem;
import battleSystem.FinalyPhase;
import battleSystem.LevelSystem;
import battleSystem.LineTowerElement;
import battleSystem.LineTowerSystem;
import battleSystem.MidPhase;
import battleSystem.TopObjectSystem;
import characterMangement.CharaterRegulation;
import characterMangement.PlayerCharacter;
import characterMangement.EnemyCharater;
import teamManagement.TransferMember;
import teamManagement.EquippedTeam;
import teamManagement.DomesticCompetitionTeam;
import teamManagement.InternationalTeam;
import membershipManagement.MyInfo;
import membershipManagement.MyInfoElement;
import messageSystem.OutputStatement;
import marketSystem.MarketList;



public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);// 기타입력
    	Scanner move = new Scanner(System.in);//메뉴이동
    	Scanner order = new Scanner(System.in);//배틀페이지
    	Scanner luckyNumInput = new Scanner(System.in);//배틀페이지
    	Scanner luckyNumInput2 = new Scanner(System.in);//배틀페이지
    	Scanner empty = new Scanner(System.in);//메세지 체크
    	
    	PlayerCharacter playerCharacter = new PlayerCharacter();
    	EnemyCharater enemyCharater = new EnemyCharater();
    	TransferMember transferMember = new TransferMember();
    	EquippedTeam equippedTeam = new EquippedTeam();
    	DomesticCompetitionTeam domesticCompetitionTeam = new DomesticCompetitionTeam();
    	InternationalTeam internationalTeam = new InternationalTeam();
    	OutputStatement outputStatement = new OutputStatement();
    	MarketList marketList =new MarketList();
    	MyInfo myInfo = new MyInfo();
    	BattleJoin battleJoin =new BattleJoin();
    	LineTowerSystem lineTowerSystem = new LineTowerSystem();
    	FinalTowerSystem finalTowerSystem = new FinalTowerSystem();
    	ComPattern comPattern =new ComPattern();
    	LevelSystem levelSystem =new LevelSystem();
    	BottomObjectSystem bottomObjectSystem = new BottomObjectSystem();
    	TopObjectSystem topObjectSystem =new TopObjectSystem();
    	EarlyPhase earlyPhase= new EarlyPhase();
    	MidPhase midPhase = new MidPhase();
    	FinalyPhase finalyPhase = new FinalyPhase();
    	
    	String name ="";
    	int money=0;
    	int rating=0;
    	int domesticVictory=0;
    	int domesticDefeat=0;
    	int internationalVictory=0;
    	int internationalDefeat=0;
    	boolean internationalCompetition=false;
    	String outPut="";
    	int gameturn=0;
    	int moveNum = 0;
    	outputStatement.Loading();
    	
    	playerCharacter.addTopLiners();
    	playerCharacter.addJunglers();
    	playerCharacter.addMidLiners();
    	playerCharacter.addAdCarries();
    	playerCharacter.addSupporters();
    	
    	enemyCharater.addEnemyTopLiners();
    	enemyCharater.addEnemyJunglers();
    	enemyCharater.addEnemyMidLiners();
    	enemyCharater.addEnemyAdCarries();
    	enemyCharater.addEnemySupporters();
    	
    	
    	outputStatement.Registration();
    	outputStatement.CheckRegistration(myInfo.name=sc.nextLine());
    	name=myInfo.name;
    	
    	//Stream 구현후 불러오기 구간(미구현)
    	
    	
    	
    	 // MarketCharacter 클래스에서 생성한 MarketCharacter ArrayList 호출
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> topLinersArl = playerCharacter.topLinerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> junglerArl = playerCharacter.junglerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> midLinerArl = playerCharacter.midLinerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> adcArl = playerCharacter.adcArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> supporterArl = playerCharacter.supporterArl;
        
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> enemyTopLinersArl = enemyCharater.enemyTopLinerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> enemyJunglerArl = enemyCharater.enemyJunglerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> enemyMidLinerArl = enemyCharater.enemyMidLinerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> enemyAdcArl = enemyCharater.enemyAdcArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> enemySupporterArl = enemyCharater.enemySupporterArl;
        
        //게임시작
        boolean begin=true;
    	while(begin) {
    		System.out.println("어디를 가볼까?");
    		System.out.println("어떤 메뉴로 이동하시겠습니까?");
            System.out.println("1.내정보    2. 보유 선수 조회 및 교체    3.장착 선수조회    4.마켓");
       
    	
        // TransferMember 클래스에서 메서드에 MarketCharacter ArrayList 추가
        // TransferMember 클래스에서 생성한 TransferMember ArrayList 호출
        transferMember.addArlTransferedLiner(topLinersArl,junglerArl,midLinerArl,adcArl,supporterArl);
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedtopArl = transferMember.TransferedToplinerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedjunglerArl = transferMember.TransferedjunglerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedmidArl = transferMember.TransferedMidlinerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedadcArl = transferMember.TransferedAdcArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedsuppArl = transferMember.TransferedSupporterArl;
        
        // marketList 클래스에서 메서드에 MarketCharacter ArrayList 추가
        // marketList 클래스에서 생성한 marketList ArrayList 호출
        marketList.addArlUntransferedLiner(topLinersArl,junglerArl,midLinerArl,adcArl,supporterArl);
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> UntransferedtopArl = marketList.UntransferedToplinerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> UntransferedjunglerArl = marketList.UntransferedjunglerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> UntransferedmidArl = marketList.UntransferedMidlinerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> UntransferedadcArl = marketList.UntransferedAdcArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> UntransferedsuppArl = marketList.UntransferedSupporterArl;
        
        // EquippedTeam 클래스에서 메서드에 TransferMember ArrayList 추가
        equippedTeam.addArlEquippedLiner(TransferedtopArl,TransferedjunglerArl,TransferedmidArl,TransferedadcArl,TransferedsuppArl);
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedtopArl = equippedTeam.EquippedToplinerArl;       
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedjunglerArl = equippedTeam.EquippedjunglerArl;        
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedmidArl = equippedTeam.EquippedMidlinerArl;       
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedadcArl = equippedTeam.EquippedAdcArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedsuppArl = equippedTeam.EquippedSupporterArl;
        
        
        //내 레이팅값 계산 후 대입
        myInfo.renewMyRating(EquippedtopArl,EquippedjunglerArl,EquippedmidArl,EquippedadcArl,EquippedsuppArl);
        money= myInfo.money;
        rating=myInfo.rating;
        domesticVictory=myInfo.domesticVictory;
        domesticDefeat=myInfo.domesticDefeat;
        internationalVictory=myInfo.internationalVictory;
        internationalDefeat=myInfo.internationalDefeat;
        //ArrayList<MyInfoElement<String, Integer, Integer, Integer, Integer, Integer, Integer>> myInfoArl = myInfo.myInfoArl;
        myInfo.renewMyInfo();
      

        //내 정보 조회 메뉴 선택(임시번호 1번)
        moveNum = move.nextInt();
       	if(moveNum==1) {
        myInfo.checkMyInfo();
    	}
    	
        //내 보유 선수 조회 및 라인선수 교체 메뉴선택(임시번호 2번 ) 라인 선택시 >> 1 : 탑, 2 : 정글, 3 : 미드, 4 : 원딜, 5 : 서폿)
       	else if(moveNum==2) {
       		
       		System.out.println("보유한 선수 조회 또는 교체할 라인을 고르시오.");
        	System.out.println("1.탑선수  2.정글선수 3.미드선수 4.원딜선수 5.서폿선수");
 
        	move.nextInt();
        switch (move.nextInt()) {
		case 1->{transferMember.checkTransferedLiner(TransferedtopArl);
				order.nextInt();
				if(order.nextInt()==1) {
					System.out.println("교체 시킬 탑라이너 선수명은 ?");
					order.nextLine();
					
					outPut = order.nextLine();
					transferMember.changeLiner(topLinersArl, EquippedtopArl, outPut);}
				else {
					System.out.println("메인으로 돌아갑니다.");
					System.out.println();
				
				}
				}
		case 2->{transferMember.checkTransferedLiner(TransferedjunglerArl);
				order.nextInt();
				if(order.nextInt()==1) {
					System.out.println("교체 시킬 정글러 선수명은 ?");
					outPut = order.nextLine();
					transferMember.changeLiner(junglerArl, EquippedjunglerArl, outPut);}
				else {
					System.out.println("메인으로 돌아갑니다.");
					System.out.println();
				
				}
				}
		case 3->{transferMember.checkTransferedLiner(TransferedmidArl);
				order.nextInt();
				if(order.nextInt()==1) {
					System.out.println("교체 시킬 미드라이너 선수명은 ?");
					outPut = order.nextLine();
					transferMember.changeLiner(midLinerArl, EquippedmidArl, outPut);}
				else {
					System.out.println("메인으로 돌아갑니다.");
					System.out.println();
				
				}
				}
		case 4->{transferMember.checkTransferedLiner(TransferedadcArl);
				order.nextInt();
				if(order.nextInt()==1) {
					System.out.println("교체 시킬 원딜러 선수명은 ?");
					outPut = order.nextLine();
					transferMember.changeLiner(adcArl, EquippedadcArl, outPut);}
				else {
					System.out.println("메인으로 돌아갑니다.");
					System.out.println();
				
				}
				}
		case 5->{transferMember.checkTransferedLiner(TransferedsuppArl);
				order.nextInt();
				if(order.nextInt()==1) {
					System.out.println("교체 시킬 서포터 선수명은 ?");
					outPut = order.nextLine();
					transferMember.changeLiner(supporterArl, EquippedsuppArl, outPut);}
				else {
					System.out.println("메인으로 돌아갑니다.");
					System.out.println();
				
				}
				}
		default->throw new IllegalArgumentException("Unexpected value: " + outPut);}
       	}
        
        //작창 선수조회 메뉴 선택(임시번호 3번)
       	else if(moveNum==3) {
       	equippedTeam.checkEquippedLiner(EquippedtopArl,EquippedjunglerArl,EquippedmidArl,EquippedadcArl,EquippedsuppArl);
       	}
       
        //선수 이적시장 마켓 조회 및 변경(임시번호 4번) 라인 선택시 >> 1 : 탑, 2 : 정글, 3 : 미드, 4 : 원딜, 5 : 서폿)
       	else if(moveNum==4) {
    		System.out.println("보유하지 않은 선수를 조회할 라인을 고르시오.");
        	System.out.println("1.탑선수  2.정글선수 3.미드선수 4.원딜선수 5.서폿선수");
       	switch (move.nextInt()) {
		case 1->{marketList.checkUntransferedLiner(UntransferedtopArl);
				order.nextInt();
				if(order.nextInt()==1) {
					System.out.println("이적시킬 선수명은 ?");
					outPut=order.nextLine();
					marketList.toTransferLiner(topLinersArl, outPut, money);
					money -= marketList.pay;
					System.out.println("보유 금액 " + money);}
				else {System.out.println("else 구매 실패");
				
				}
				}
		case 2->{marketList.checkUntransferedLiner(UntransferedjunglerArl);
				order.nextInt();
				if(order.nextInt()==1) {
					System.out.println("이적시킬 선수명은 ?");
					outPut = order.nextLine();
				marketList.toTransferLiner(junglerArl, outPut, money);
				money -= marketList.pay;
				System.out.println("보유 금액 " + money);}
				else {System.out.println("else 구매 실패");
				
				}
		}
		case 3->{marketList.checkUntransferedLiner(UntransferedmidArl);
				order.nextInt();
				if(order.nextInt()==1) {
					System.out.println("이적시킬 선수명은 ?");
					outPut = order.nextLine();
				marketList.toTransferLiner(midLinerArl, outPut, money);
				money -= marketList.pay;
				System.out.println("보유 금액 " + money);}
				else {System.out.println("else 구매 실패");
				
				}
				}
		case 4->{marketList.checkUntransferedLiner(UntransferedadcArl);
				order.nextInt();
				if(order.nextInt()==1) {
					System.out.println("이적시킬 선수명은 ?");
					outPut = order.nextLine();
				marketList.toTransferLiner(adcArl, outPut, money);
				money -= marketList.pay;
				System.out.println("보유 금액 " + money);}
				else {System.out.println("else 구매 실패");
				
				}
		}
		case 5->{marketList.checkUntransferedLiner(UntransferedsuppArl);
				order.nextInt();
				if(order.nextInt()==1) {
					System.out.println("이적시킬 선수명은 ?");
					outPut = order.nextLine();
				marketList.toTransferLiner(supporterArl, outPut, money);
				money -= marketList.pay;
				System.out.println("보유 금액 " + money);}
				else {System.out.println("else 구매 실패");
				
				}
				}
		default->throw new IllegalArgumentException("보유 금액 " + money+"Unexpected value:"+outPut);}
    	}
        
        //대회 출전 메뉴 선택(임시번호 5번)
       	else if (moveNum==5) {
        boolean Game =true;

        	ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
	        battlingMyTop = new ArrayList<>();
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
			battlingMyJungler =  new ArrayList<>();
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
			battlingMyMid = new ArrayList<>();
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
			battlingMyAdc =  new ArrayList<>();
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
			battlingMySupp =  new ArrayList<>();
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
			battlingEnemyTop =  new ArrayList<>();
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
			battlingEnemyJungler = new ArrayList<>();
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
			battlingEnemyMid = new ArrayList<>();
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
			battlingEnemyAdc =  new ArrayList<>();
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
			battlingEnemySupp =  new ArrayList<>();
	        //지역대회 1번 
			System.out.println("1.지역대회 참가    2.세계대회 참가  ");
	        order.nextInt();
	        if(order.nextInt()==1) {
		        internationalCompetition=false;
		        domesticCompetitionTeam.domesticTeamMatching(EquippedtopArl, EquippedjunglerArl, EquippedmidArl, EquippedadcArl, EquippedsuppArl, enemyTopLinersArl, enemyJunglerArl, enemyMidLinerArl, enemyAdcArl, enemySupporterArl);
		        
		        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchedETopArl = domesticCompetitionTeam.domesticCToplinerArl;       
		        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchedEJunglerArl = domesticCompetitionTeam.domesticCjunglerArl; 
		        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchedEMidArl = domesticCompetitionTeam.domesticCMidlinerArl;       
		        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchedEAdcArl = domesticCompetitionTeam.domesticCAdcArl;
		        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchedESuppArl = domesticCompetitionTeam.domesticCSupporterArl;
		        
		        battleJoin.AddArlBattle(EquippedtopArl, EquippedjunglerArl, EquippedmidArl, EquippedadcArl, EquippedsuppArl, matchedETopArl, matchedEJunglerArl, matchedEMidArl, matchedEAdcArl, matchedESuppArl);
		    
		        battlingMyTop.addAll(battleJoin.ArlMyTop);
		        battlingMyJungler.addAll(battleJoin.ArlMyJungler);
		        battlingMyMid.addAll(battleJoin.ArlMyMid);
		        battlingMyAdc.addAll(battleJoin.ArlMyAdc);
		        battlingMySupp.addAll(battleJoin.ArlMySupp);
		        battlingEnemyTop.addAll(battleJoin.ArlEnemyTop);
		        battlingEnemyJungler.addAll(battleJoin.ArlEnemyJungler);
		        battlingEnemyMid.addAll(battleJoin.ArlEnemyMid);
		        battlingEnemyAdc.addAll(battleJoin.ArlEnemyAdc);
		        battlingEnemySupp.addAll(battleJoin.ArlEnemySupp);
	        }
	        else if(order.nextInt()==2){//세계대회 2번
	        	internationalCompetition=true;
				internationalTeam.internationalTeamMatching(EquippedtopArl, EquippedjunglerArl, EquippedmidArl, EquippedadcArl, EquippedsuppArl, enemyTopLinersArl, enemyJunglerArl, enemyMidLinerArl, enemyAdcArl, enemySupporterArl);
		        
		        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchedETopArl = internationalTeam.internationalToplinerArl;       
		        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchedEJunglerArl = internationalTeam.internationaljunglerArl; 
		        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchedEMidArl = internationalTeam.internationalMidlinerArl;       
		        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchedEAdcArl = internationalTeam.internationalAdcArl;
		        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchedESuppArl = internationalTeam.internationalSupporterArl;
		        
		        battleJoin.AddArlBattle(EquippedtopArl, EquippedjunglerArl, EquippedmidArl, EquippedadcArl, EquippedsuppArl, matchedETopArl, matchedEJunglerArl, matchedEMidArl, matchedEAdcArl, matchedESuppArl);
		    
		        battlingMyTop.addAll(battleJoin.ArlMyTop);
		        battlingMyJungler.addAll(battleJoin.ArlMyJungler);
		        battlingMyMid.addAll(battleJoin.ArlMyMid);
		        battlingMyAdc.addAll(battleJoin.ArlMyAdc);
		        battlingMySupp.addAll(battleJoin.ArlMySupp);
		        battlingEnemyTop.addAll(battleJoin.ArlEnemyTop);
		        battlingEnemyJungler.addAll(battleJoin.ArlEnemyJungler);
		        battlingEnemyMid.addAll(battleJoin.ArlEnemyMid);
		        battlingEnemyAdc.addAll(battleJoin.ArlEnemyAdc);
		        battlingEnemySupp.addAll(battleJoin.ArlEnemySupp);
			}
	        lineTowerSystem.addTowerStatus();
	        ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> topTowerArl = lineTowerSystem.TopTowerArl;
	    	ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> midTowerArl = lineTowerSystem.midTowerArl;
	    	ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> bottomTowerArl = lineTowerSystem.bottomTowerArl;
	    	ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> enemyTopTowerArl = lineTowerSystem.EnemyTopTowerArl;
	    	ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> enemyMidTowerArl = lineTowerSystem.EnemyMidTowerArl;
	    	ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> enemyBottomTowerArl = lineTowerSystem.EnemyBottomTowerArl;
	    	finalTowerSystem.addFinalTowerStatus();
	    	ArrayList<FinalTowerElement<Integer, Boolean, Integer, Boolean>> myFinalTowerArl = finalTowerSystem.myFinalTowerArl;
	    	ArrayList<FinalTowerElement<Integer, Boolean, Integer, Boolean>> enemyFinalTowerArl = finalTowerSystem.enemyFinalTowerArl;
	    	lineTowerSystem.myTopTawer=true;
	    	lineTowerSystem.myMidTawer=true;
	    	lineTowerSystem.mybottomTawer=true;
	    	lineTowerSystem.EnemyTopTawer=true;
	    	lineTowerSystem.EnemymidTawer=true;
	    	lineTowerSystem.EnemyBottomTawer=true;
	    	bottomObjectSystem.dragonExistence=false;
	    	bottomObjectSystem.dragonKind=0;
	    	bottomObjectSystem.consecutiveDragonCount=0;
	    	bottomObjectSystem.lastDragonAppearanceTurn=0;
	    	topObjectSystem.genieRemainingTurns=0;
	    	topObjectSystem.objectExistence=false;
	    	topObjectSystem.objectKind=0;
	    	finalTowerSystem.myNexus=true;
	    	finalTowerSystem.EnemyNexus=true;
	    	gameturn=0;
	    	
	    	int gankingOrder=0;
	    	int luckyNum=0;
	    	int luckyNum2=0;
	    	int comGankingorder=0;
	    	int comLuckyNum=0;
	    	while(Game) {
	//    		초기 용싸움
	//    		포탑 파괴 시스템
	//    		레벨업시스템
	//    		용 출몰 > 장로로 바꾸기
	//    		협곡정령 바론 출몰
	//    		컴퓨터 판단
	    		
	        	if (gameturn<=16) {
	        		//플레이어부터 시작
	        		//버프 생성확인
	        		bottomObjectSystem.DragonAppear(gameturn, battlingMyJungler, battlingEnemyJungler);
	        		topObjectSystem.genieAppear(gameturn);
	        		
	        		gameturn++;
	        		//버프 지속턴 감소
	        		midPhase.reductionBuffTurn(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
	        		System.out.println(gameturn+"번째 턴 입니다.(플레이어턴)");
	        		System.out.println("당신의 턴입니다. 오브잭트 또는 갱킹라인을 입력하세요!");
	        		
	        		if(bottomObjectSystem.dragonExistence==true && topObjectSystem.objectExistence==true) {
	        		System.out.println("1. 탑  2. 미드 3. 바텀 4.드래곤 5.내셔 둥지");
	        		}
	        		//모든 오브잭트가 없을때.
	        		else if(bottomObjectSystem.dragonExistence==false && topObjectSystem.objectExistence==false) {
		        		System.out.println("1. 탑  2. 미드 3. 바텀");
	        		}
	        		else if(bottomObjectSystem.dragonExistence==true && topObjectSystem.objectExistence==false) {
		        		System.out.println("1. 탑  2. 미드 3. 바텀 4.드래곤");
	        		}
	        		else if(bottomObjectSystem.dragonExistence==false && topObjectSystem.objectExistence==true) {
		        		System.out.println("1. 탑  2. 미드 3. 바텀 5.내셔 둥지");
	        		}
		        		gankingOrder = order.nextInt();

		        		System.out.println("라이너 행운의 숫자 1~10 중 하나를 입력하세요.");
		        		luckyNum = luckyNumInput.nextInt();
		        		System.out.println("정글러 행운의 숫자 1~10 중 하나를 입력하세요.");
		        		luckyNum2 = luckyNumInput2.nextInt();
		        		System.out.println("상대라이너가 행운의 숫자를 입력중 입니다..");
		        		comPattern.comOenByTen();
		        		if(gankingOrder==1 || gankingOrder == 2 || gankingOrder==3) {
		        		earlyPhase.myTeamsuperPlayActivate(
		        		gankingOrder, luckyNum, luckyNum2, comPattern.comRandomNumber, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		earlyPhase.gankingDamageFormula(gankingOrder, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		}
		        		
		        		if (gankingOrder == 1) {
		        			if(lineTowerSystem.EnemyTopTawer==true) {
		        		lineTowerSystem.damegingTower(gankingOrder, earlyPhase.damage, enemyTopTowerArl, enemyMidTowerArl, enemyBottomTowerArl);
		        			}
		        			else if (lineTowerSystem.EnemyTopTawer==false) {
		        				finalTowerSystem.damegingFinalTower(earlyPhase.damage, enemyFinalTowerArl);
		        			}
		        		}
		        		else if (gankingOrder == 2) {
		        			if(lineTowerSystem.EnemymidTawer==true) {
		        		lineTowerSystem.damegingTower(gankingOrder, earlyPhase.damage, enemyTopTowerArl, enemyMidTowerArl, enemyBottomTowerArl);
		        			}
		        			else if (lineTowerSystem.EnemymidTawer==false) {
		        				finalTowerSystem.damegingFinalTower(earlyPhase.damage, enemyFinalTowerArl);
		        			}
		        		}
		        		else if (gankingOrder == 3) {
		        			if(lineTowerSystem.EnemyBottomTawer==true) {
		        				lineTowerSystem.damegingTower(gankingOrder, earlyPhase.damage, enemyTopTowerArl, enemyMidTowerArl, enemyBottomTowerArl);
		        			}
		        			else if (lineTowerSystem.EnemyBottomTawer==false) {
		        				finalTowerSystem.damegingFinalTower(earlyPhase.damage, enemyFinalTowerArl);
		        			}
		        		}
		        		else if (gankingOrder == 4) {
		        			if(bottomObjectSystem.dragonExistence==true) {
		        			midPhase.bottomObjectTry(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);	
			        			if(midPhase.bottomObjectSuccess==true) {
			        				bottomObjectSystem.DragonGain(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
			        			}
		        			}
		        			else if (bottomObjectSystem.dragonExistence==false) {
		        				System.out.println("아군 정글러가 드래곤이 없어서 바텀 갱킹을 하였습니다!");
		        				earlyPhase.myTeamsuperPlayActivate(
		        		      	3, luckyNum, luckyNum2, comPattern.comRandomNumber, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		       earlyPhase.gankingDamageFormula(gankingOrder, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		       if(lineTowerSystem.EnemyBottomTawer==true) {
			        				lineTowerSystem.damegingTower(gankingOrder, earlyPhase.damage, enemyTopTowerArl, enemyMidTowerArl, enemyBottomTowerArl);
			        			}
			        			else if (lineTowerSystem.EnemyBottomTawer==false) {
			        				finalTowerSystem.damegingFinalTower(earlyPhase.damage, enemyFinalTowerArl);
			        			}
		        			}
		        		}
		        		else if (gankingOrder == 5) {
		        			if(bottomObjectSystem.dragonExistence==true) {
		        				midPhase.topObjectTry(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        				if(midPhase.topObjectSuccess==true) {
		        					topObjectSystem.topObjectGain(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
		        					midPhase.topObjectSuccess=false;
		        				}
		        			}
		        			else if (bottomObjectSystem.dragonExistence==false) {
		        				System.out.println("아군 정글러가 내셔 둥지에 오브잭트가 없어서 탑 갱킹을 하였습니다!");
		        				earlyPhase.myTeamsuperPlayActivate(
		        		      	1, luckyNum, luckyNum2, comPattern.comRandomNumber, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		       earlyPhase.gankingDamageFormula(gankingOrder, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		       if(lineTowerSystem.EnemyTopTawer==true) {
			        				lineTowerSystem.damegingTower(gankingOrder, earlyPhase.damage, enemyTopTowerArl, enemyMidTowerArl, enemyBottomTowerArl);
			        			}
			        			else if (lineTowerSystem.EnemyTopTawer==false) {
			        				finalTowerSystem.damegingFinalTower(earlyPhase.damage, enemyFinalTowerArl);
			        			}
		        			}
		        		}
		        		//경험치 적립, 레벨업, 종료 조건확인
		        		levelSystem.acquireExperience(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		levelSystem.levelUpSystem(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		if(finalTowerSystem.EnemyNexus==false) {
		        			if(internationalCompetition==true) {
		        				myInfo.internationalVictory=myInfo.internationalVictory+1;
		        				myInfo.money=myInfo.money+300;
		        			}
		        			else if(internationalCompetition==false) {
		        				myInfo.domesticVictory=myInfo.domesticVictory+1;
		        				myInfo.money=myInfo.money+150;
		        			}
		        		}
		        		//컴퓨터 턴
		        		bottomObjectSystem.DragonAppear(gameturn, battlingMyJungler, battlingEnemyJungler);
		        		topObjectSystem.genieAppear(gameturn);
		        		midPhase.reductionBuffTurn(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		
		        		gameturn++;
		        		System.out.println(gameturn+"번째 턴 입니다.(컴퓨터턴)");
		        		
		        		comPattern.comOenByFive();
		        		comGankingorder=comPattern.comRandomNumber;
		        		
		        		System.out.println("상대라이너가 행운의 숫자를 입력중 입니다..");
		        		comPattern.comOenByTen();
		        		comLuckyNum=comPattern.comRandomNumber;
		        		System.out.println("수비 라이너 행운의 숫자 1~10 중 하나를 입력하세요.");
		        		luckyNum = luckyNumInput.nextInt();
		        		if(comGankingorder==1 || comGankingorder==2 || comGankingorder==3) {

		        		earlyPhase.myTeamsuperPlayActivate(comGankingorder, comLuckyNum, comLuckyNum, luckyNum, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
		        		earlyPhase.gankingDamageFormula(comGankingorder, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
		        		lineTowerSystem.damegedTower(comGankingorder, earlyPhase.damage, topTowerArl, midTowerArl, bottomTowerArl);
		        		}
		        		if (comGankingorder == 1) {
		        			if(lineTowerSystem.myTopTawer==true) {
		        		lineTowerSystem.damegedTower(gankingOrder, earlyPhase.damage, topTowerArl, midTowerArl, bottomTowerArl);
		        			}
		        			else if (lineTowerSystem.myTopTawer==false) {
		        				finalTowerSystem.damegedFinalTower(earlyPhase.damage, myFinalTowerArl);
		        			}
		        		}
		        		else if (comGankingorder == 2) {
		        			if(lineTowerSystem.myMidTawer==true) {
		        		lineTowerSystem.damegedTower(gankingOrder, earlyPhase.damage, topTowerArl, midTowerArl, bottomTowerArl);
		        			}
		        			else if (lineTowerSystem.myMidTawer==false) {
		        				finalTowerSystem.damegedFinalTower(earlyPhase.damage, myFinalTowerArl);
		        			}
		        		}
		        		else if (comGankingorder == 3) {
		        			if(lineTowerSystem.mybottomTawer==true) {
		        				lineTowerSystem.damegedTower(gankingOrder, earlyPhase.damage, topTowerArl, midTowerArl, bottomTowerArl);
		        			}
		        			else if (lineTowerSystem.mybottomTawer==false) {
		        				finalTowerSystem.damegedFinalTower(earlyPhase.damage, myFinalTowerArl);
		        			}
		        		}
		        		else if (comGankingorder == 4) {
		        			if(bottomObjectSystem.dragonExistence==true) {
		        			midPhase.bottomObjectTry(battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);	
			        			if(midPhase.bottomObjectSuccess==true) {
			        				bottomObjectSystem.DragonGain(battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
			        			}
		        			}
		        			else if (bottomObjectSystem.dragonExistence==false) {
		        				System.out.println("적군 정글러가 드래곤이 없어서 바텀 갱킹을 하였습니다!");
		        				earlyPhase.myTeamsuperPlayActivate(3, comLuckyNum, comLuckyNum, luckyNum, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
				        		earlyPhase.gankingDamageFormula(3, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
				        		if(lineTowerSystem.mybottomTawer==true) {
			        				lineTowerSystem.damegedTower(gankingOrder, earlyPhase.damage, topTowerArl, midTowerArl, bottomTowerArl);
			        			}
			        			else if (lineTowerSystem.mybottomTawer==false) {
			        				finalTowerSystem.damegingFinalTower(earlyPhase.damage, myFinalTowerArl);
			        			}
		        			}
		        		}
		        		else if (comGankingorder == 5) {
		        			if(bottomObjectSystem.dragonExistence==true) {
		        				midPhase.topObjectTry(battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
		        				if(midPhase.topObjectSuccess==true) {
		        					topObjectSystem.topObjectGain(battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        					midPhase.topObjectSuccess=false;
		        				}
		        			}
		        			else if (bottomObjectSystem.dragonExistence==false) {
		        				System.out.println("적군 정글러가 내셔 둥지에 오브잭트가 없어서 탑 갱킹을 하였습니다!");
		        				earlyPhase.myTeamsuperPlayActivate(1, comLuckyNum, comLuckyNum, luckyNum, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
				        		earlyPhase.gankingDamageFormula(1, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
				        		if(lineTowerSystem.mybottomTawer==true) {
			        				lineTowerSystem.damegedTower(gankingOrder, earlyPhase.damage, topTowerArl, midTowerArl, bottomTowerArl);
			        			}
			        			else if (lineTowerSystem.mybottomTawer==false) {
			        				finalTowerSystem.damegedFinalTower(earlyPhase.damage, myFinalTowerArl);
			        			}
		        			}
		        		}
		        		//경험치 적립, 레벨업
		        		levelSystem.acquireExperience(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		levelSystem.levelUpSystem(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		if(finalTowerSystem.myNexus==false) {
		        			if(internationalCompetition==true) {
		        				myInfo.internationalDefeat=myInfo.internationalDefeat+1;
		        				myInfo.money=myInfo.money+150;
		        			}
		        			else if(internationalCompetition==false) {
		        				myInfo.domesticDefeat=myInfo.domesticDefeat+1;
		        				myInfo.money=myInfo.money+100;
		        			}
		        		}
	        	}

	        	else if (gameturn>16) {
	        		//플레이어부터 시작
	        		//버프 생성확인
	        		bottomObjectSystem.DragonAppear(gameturn, battlingMyJungler, battlingEnemyJungler);
	        		topObjectSystem.genieAppear(gameturn);
	        		
	        		gameturn++;
	        		//버프 지속턴 감소
	        		midPhase.reductionBuffTurn(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
	        		System.out.println(gameturn+"번째 턴 입니다.(플레이어턴)");
	        		System.out.println("당신의 턴입니다. 오브잭트 또는 버스트콜 라인을 입력하세요!");
	        		System.out.println("게임이 뜨겁게 달아올랐습니다!");
	        		if(bottomObjectSystem.dragonExistence==true && topObjectSystem.objectExistence==true) {
	        		System.out.println("1. 탑(미드라이너)  2. 미드(원딜러) 3. 바텀(탑라이너) 4.드래곤 5.내셔 둥지");
	        		}
	        		//모든 오브잭트가 없을때.
	        		else if(bottomObjectSystem.dragonExistence==false && topObjectSystem.objectExistence==false) {
		        		System.out.println("1. 탑(미드라이너)  2. 미드(원딜러) 3. 바텀(탑라이너)");
	        		}
	        		else if(bottomObjectSystem.dragonExistence==true && topObjectSystem.objectExistence==false) {
		        		System.out.println("1. 탑(미드라이너)  2. 미드(원딜러) 3. 바텀(탑라이너) 4.드래곤");
	        		}
	        		else if(bottomObjectSystem.dragonExistence==false && topObjectSystem.objectExistence==true) {
		        		System.out.println("1. 탑(미드라이너)  2. 미드(원딜러) 3. 바텀(탑라이너) 5.내셔 둥지");
	        		}
		        		gankingOrder = order.nextInt();

		        		System.out.println("라이너들의 행운의 숫자 1~10 중 하나를 입력하세요.");
		        		luckyNum = luckyNumInput.nextInt();
		        		System.out.println("상대라이너가 행운의 숫자를 입력중 입니다..");
		        		comPattern.comOenByTen();
		        		if(gankingOrder==1 || gankingOrder == 2 || gankingOrder==3) {
		        			finalyPhase.myTeamsuperPlayActivate(
		        		luckyNum, comPattern.comRandomNumber, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        			finalyPhase.gankingDamageFormula(gankingOrder, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		}
		        		
		        		if (gankingOrder == 1) {
		        			if(lineTowerSystem.EnemyTopTawer==true) {
		        		lineTowerSystem.damegingTower(gankingOrder, finalyPhase.damage, enemyTopTowerArl, enemyMidTowerArl, enemyBottomTowerArl);
		        			}
		        			else if (lineTowerSystem.EnemyTopTawer==false) {
		        				finalTowerSystem.damegingFinalTower(finalyPhase.damage, enemyFinalTowerArl);
		        			}
		        		}
		        		else if (gankingOrder == 2) {
		        			if(lineTowerSystem.EnemymidTawer==true) {
		        		lineTowerSystem.damegingTower(gankingOrder, finalyPhase.damage, enemyTopTowerArl, enemyMidTowerArl, enemyBottomTowerArl);
		        			}
		        			else if (lineTowerSystem.EnemymidTawer==false) {
		        				finalTowerSystem.damegingFinalTower(finalyPhase.damage, enemyFinalTowerArl);
		        			}
		        		}
		        		else if (gankingOrder == 3) {
		        			if(lineTowerSystem.EnemyBottomTawer==true) {
		        				lineTowerSystem.damegingTower(gankingOrder, finalyPhase.damage, enemyTopTowerArl, enemyMidTowerArl, enemyBottomTowerArl);
		        			}
		        			else if (lineTowerSystem.EnemyBottomTawer==false) {
		        				finalTowerSystem.damegingFinalTower(finalyPhase.damage, enemyFinalTowerArl);
		        			}
		        		}
		        		else if (gankingOrder == 4) {
		        			if(bottomObjectSystem.dragonExistence==true) {
		        				finalyPhase.bottomObjectTry(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);	
			        			if(finalyPhase.bottomObjectSuccess==true) {
			        				bottomObjectSystem.DragonGain(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
			        			}
		        			}
		        			else if (bottomObjectSystem.dragonExistence==false) {
		        				System.out.println("바텀동선에 집결하여 바텀(미드라이너)를 선공하였습니다!");
		        				finalyPhase.myTeamsuperPlayActivate(
		        		      	luckyNum, comPattern.comRandomNumber, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        				finalyPhase.gankingDamageFormula(gankingOrder, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		       if(lineTowerSystem.EnemyBottomTawer==true) {
			        				lineTowerSystem.damegingTower(gankingOrder, finalyPhase.damage, enemyTopTowerArl, enemyMidTowerArl, enemyBottomTowerArl);
			        			}
			        			else if (lineTowerSystem.EnemyBottomTawer==false) {
			        				finalTowerSystem.damegingFinalTower(finalyPhase.damage, enemyFinalTowerArl);
			        			}
		        			}
		        		}
		        		else if (gankingOrder == 5) {
		        			if(bottomObjectSystem.dragonExistence==true) {
		        				finalyPhase.topObjectTry(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        				if(finalyPhase.topObjectSuccess==true) {
		        					topObjectSystem.topObjectGain(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
		        					finalyPhase.topObjectSuccess=false;
		        				}
		        			}
		        			else if (bottomObjectSystem.dragonExistence==false) {
		        				System.out.println("탑쪽동선에 집결하여 탑(미드라이너)를 선공하였습니다!");
		        				finalyPhase.myTeamsuperPlayActivate(
		        		      	luckyNum, comPattern.comRandomNumber, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        				finalyPhase.gankingDamageFormula(gankingOrder, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		       if(lineTowerSystem.EnemyTopTawer==true) {
			        				lineTowerSystem.damegingTower(gankingOrder, finalyPhase.damage, enemyTopTowerArl, enemyMidTowerArl, enemyBottomTowerArl);
			        			}
			        			else if (lineTowerSystem.EnemyTopTawer==false) {
			        				finalTowerSystem.damegingFinalTower(finalyPhase.damage, enemyFinalTowerArl);
			        			}
		        			}
		        		}
		        		//경험치 적립, 레벨업, 종료 조건확인
		        		levelSystem.acquireExperience(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		levelSystem.levelUpSystem(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		if(finalTowerSystem.EnemyNexus==false) {
		        			if(internationalCompetition==true) {
		        				myInfo.internationalVictory=myInfo.internationalVictory+1;
		        				myInfo.money=myInfo.money+300;
		        			}
		        			else if(internationalCompetition==false) {
		        				myInfo.domesticVictory=myInfo.domesticVictory+1;
		        				myInfo.money=myInfo.money+150;
		        			}
		        		}
		        		//컴퓨터 턴
		        		bottomObjectSystem.DragonAppear(gameturn, battlingMyJungler, battlingEnemyJungler);
		        		topObjectSystem.genieAppear(gameturn);
		        		midPhase.reductionBuffTurn(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		
		        		gameturn++;
		        		System.out.println(gameturn+"번째 턴 입니다.(컴퓨터턴)");
		        		
		        		comPattern.comOenByFive();
		        		comGankingorder=comPattern.comRandomNumber;
		        		
		        		System.out.println("상대 라이너가 행운의 숫자를 입력중 입니다..");
		        		comPattern.comOenByTen();
		        		comLuckyNum=comPattern.comRandomNumber;
		        		System.out.println("수비팀 라이너들의 행운의 숫자 1~10 중 하나를 입력하세요.");
		        		luckyNum = luckyNumInput.nextInt();
		        		if(comGankingorder==1 || comGankingorder==2 || comGankingorder==3) {

		        		finalyPhase.myTeamsuperPlayActivate(comLuckyNum, luckyNum, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
		        		finalyPhase.gankingDamageFormula(comGankingorder, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
		        		lineTowerSystem.damegedTower(comGankingorder, finalyPhase.damage, topTowerArl, midTowerArl, bottomTowerArl);
		        		}
		        		if (comGankingorder == 1) {
		        			if(lineTowerSystem.myTopTawer==true) {
		        		lineTowerSystem.damegedTower(gankingOrder, finalyPhase.damage, topTowerArl, midTowerArl, bottomTowerArl);
		        			}
		        			else if (lineTowerSystem.myTopTawer==false) {
		        				finalTowerSystem.damegedFinalTower(finalyPhase.damage, myFinalTowerArl);
		        			}
		        		}
		        		else if (comGankingorder == 2) {
		        			if(lineTowerSystem.myMidTawer==true) {
		        		lineTowerSystem.damegedTower(gankingOrder, finalyPhase.damage, topTowerArl, midTowerArl, bottomTowerArl);
		        			}
		        			else if (lineTowerSystem.myMidTawer==false) {
		        				finalTowerSystem.damegedFinalTower(finalyPhase.damage, myFinalTowerArl);
		        			}
		        		}
		        		else if (comGankingorder == 3) {
		        			if(lineTowerSystem.mybottomTawer==true) {
		        				lineTowerSystem.damegedTower(gankingOrder, finalyPhase.damage, topTowerArl, midTowerArl, bottomTowerArl);
		        			}
		        			else if (lineTowerSystem.mybottomTawer==false) {
		        				finalTowerSystem.damegedFinalTower(finalyPhase.damage, myFinalTowerArl);
		        			}
		        		}
		        		else if (comGankingorder == 4) {
		        			if(bottomObjectSystem.dragonExistence==true) {
		        				finalyPhase.bottomObjectTry(battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);	
			        			if(finalyPhase.bottomObjectSuccess==true) {
			        				bottomObjectSystem.DragonGain(battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
			        			}
		        			}
		        			else if (bottomObjectSystem.dragonExistence==false) {
		        				System.out.println("적군 정글러가 드래곤이 없어서 바텀 갱킹을 하였습니다!");
		        				finalyPhase.myTeamsuperPlayActivate(comLuckyNum, luckyNum, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
		        				finalyPhase.gankingDamageFormula(3, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
				        		if(lineTowerSystem.mybottomTawer==true) {
			        				lineTowerSystem.damegedTower(gankingOrder, finalyPhase.damage, topTowerArl, midTowerArl, bottomTowerArl);
			        			}
			        			else if (lineTowerSystem.mybottomTawer==false) {
			        				finalTowerSystem.damegingFinalTower(finalyPhase.damage, myFinalTowerArl);
			        			}
		        			}
		        		}
		        		else if (comGankingorder == 5) {
		        			if(bottomObjectSystem.dragonExistence==true) {
		        				finalyPhase.topObjectTry(battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
		        				if(finalyPhase.topObjectSuccess==true) {
		        					topObjectSystem.topObjectGain(battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        					finalyPhase.topObjectSuccess=false;
		        				}
		        			}
		        			else if (bottomObjectSystem.dragonExistence==false) {
		        				System.out.println("적군 정글러가 내셔 둥지에 오브잭트가 없어서 탑 갱킹을 하였습니다!");
		        				finalyPhase.myTeamsuperPlayActivate(comLuckyNum, luckyNum, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
		        				finalyPhase.gankingDamageFormula(1, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp, battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp);
				        		if(lineTowerSystem.mybottomTawer==true) {
			        				lineTowerSystem.damegedTower(gankingOrder, finalyPhase.damage, topTowerArl, midTowerArl, bottomTowerArl);
			        			}
			        			else if (lineTowerSystem.mybottomTawer==false) {
			        				finalTowerSystem.damegedFinalTower(finalyPhase.damage, myFinalTowerArl);
			        			}
		        			}
		        		}
		        		//경험치 적립, 레벨업
		        		levelSystem.acquireExperience(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		levelSystem.levelUpSystem(battlingMyTop, battlingMyJungler, battlingMyMid, battlingMyAdc, battlingMySupp, battlingEnemyTop, battlingEnemyJungler, battlingEnemyMid, battlingEnemyAdc, battlingEnemySupp);
		        		if(finalTowerSystem.myNexus==false) {
		        			if(internationalCompetition==true) {
		        				myInfo.internationalDefeat=myInfo.internationalDefeat+1;
		        				myInfo.money=myInfo.money+150;
		        			}
		        			else if(internationalCompetition==false) {
		        				myInfo.domesticDefeat=myInfo.domesticDefeat+1;
		        				myInfo.money=myInfo.money+100;
		        			}
		        		}
	        	}
	    	}
    	}
       	
    	}
    }
}

