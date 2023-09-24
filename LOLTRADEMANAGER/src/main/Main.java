package main;

import java.util.ArrayList;
import java.util.Scanner;

import battleSystem.BattleElement;
import battleSystem.BattleJoin;
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
    	
    	String name ="";
    	int money=0;
    	int rating=0;
    	int domesticVictory=0;
    	int domesticDefeat=0;
    	int internationalVictory=0;
    	int internationalDefeat=0;
    	String outPut="";
    	
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
        //int begin=1;
    	//while(begin)
        
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
        myInfo.checkMyInfo();
        
        //내 보유 선수 조회 및 라인선수 교체 메뉴선택(임시번호 2번 ) 라인 선택시 >> 1 : 탑, 2 : 정글, 3 : 미드, 4 : 원딜, 5 : 서폿)
        switch (move.nextInt()) {
		case 1->{transferMember.checkTransferedLiner(TransferedtopArl);
				order.nextInt();
				if(order.nextInt()==1) {
					System.out.println("교체 시킬 탑라이너 선수명은 ?");
					outPut = order.nextLine();
					transferMember.changeLiner(topLinersArl, EquippedtopArl, outPut);}
				else {System.out.println("else 교체 실패");
					break;
				}
				}
		case 2->{transferMember.checkTransferedLiner(TransferedjunglerArl);
				order.nextInt();
				if(order.nextInt()==1) {
					System.out.println("교체 시킬 정글러 선수명은 ?");
					outPut = order.nextLine();
					transferMember.changeLiner(junglerArl, EquippedjunglerArl, outPut);}
				else {System.out.println("else 교체 실패");
					break;
				}
				}
		case 3->{transferMember.checkTransferedLiner(TransferedmidArl);
				order.nextInt();
				if(order.nextInt()==1) {
					System.out.println("교체 시킬 미드라이너 선수명은 ?");
					outPut = order.nextLine();
					transferMember.changeLiner(midLinerArl, EquippedmidArl, outPut);}
				else {System.out.println("else 교체 실패");
					break;
				}
				}
		case 4->{transferMember.checkTransferedLiner(TransferedadcArl);
				order.nextInt();
				if(order.nextInt()==1) {
					System.out.println("교체 시킬 원딜러 선수명은 ?");
					outPut = order.nextLine();
					transferMember.changeLiner(adcArl, EquippedadcArl, outPut);}
				else {System.out.println("else 교체 실패");
					break;
				}
				}
		case 5->{transferMember.checkTransferedLiner(TransferedsuppArl);
				order.nextInt();
				if(order.nextInt()==1) {
					System.out.println("교체 시킬 서포터 선수명은 ?");
					outPut = order.nextLine();
					transferMember.changeLiner(supporterArl, EquippedsuppArl, outPut);}
				else {System.out.println("else 교체 실패");
					break;
				}
				}
		default->throw new IllegalArgumentException("Unexpected value: " + outPut);}

        //작창 선수조회 메뉴 선택(임시번호 3번)
        equippedTeam.checkEquippedLiner(EquippedtopArl,EquippedjunglerArl,EquippedmidArl,EquippedadcArl,EquippedsuppArl);
 
        //선수 이적시장 마켓 조회 및 변경(임시번호 4번) 라인 선택시 >> 1 : 탑, 2 : 정글, 3 : 미드, 4 : 원딜, 5 : 서폿)
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
					break;
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
					break;
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
					break;
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
					break;
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
					break;
				}
				}
		default->throw new IllegalArgumentException("보유 금액 " + money+"Unexpected value:"+outPut);}
        

        //대회 출전 메뉴 선택(임시번호 5번)
       
        domesticCompetitionTeam.DomesticTeamMatching(EquippedtopArl, EquippedjunglerArl, EquippedmidArl, EquippedadcArl, EquippedsuppArl, enemyTopLinersArl, enemyJunglerArl, enemyMidLinerArl, enemyAdcArl, enemySupporterArl);
        
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchedETopArl = domesticCompetitionTeam.DomesticCToplinerArl;       
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchedEJunglerArl = domesticCompetitionTeam.DomesticCjunglerArl; 
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchedEMidArl = domesticCompetitionTeam.DomesticCMidlinerArl;       
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchedEAdcArl = domesticCompetitionTeam.DomesticCAdcArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchedESuppArl = domesticCompetitionTeam.DomesticCSupporterArl;
        
        battleJoin.AddArlBattle(EquippedtopArl, EquippedjunglerArl, EquippedmidArl, EquippedadcArl, EquippedsuppArl, matchedETopArl, matchedEJunglerArl, matchedEMidArl, matchedEAdcArl, matchedESuppArl);
    
        ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
        battlingMyTop = battleJoin.ArlEnemyTop;
		ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
		battlingMyJungler =  battleJoin.ArlMyJungler;
		ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
		battlingMyMid = battleJoin.ArlMyMid;
		ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
		battlingMyAdc =  battleJoin.ArlMyAdc;
		ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
		battlingMySupp =  battleJoin.ArlMySupp;
		ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
		battlingEnemyTop =  battleJoin.ArlEnemyTop;
		ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
		battlingEnemyJungler = battleJoin.ArlEnemyJungler;
		ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
		battlingEnemyMid = battleJoin.ArlEnemyMid;
		ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
		battlingEnemyAdc =  battleJoin.ArlEnemyAdc;
		ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> 
		battlingEnemySupp =  battleJoin.ArlEnemySupp;
    
    
    }
}
