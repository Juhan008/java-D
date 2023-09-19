package main;

import java.util.ArrayList;
import java.util.Scanner;

import characterMangement.CharaterRegulation;
import characterMangement.MarketCharacter;
import characterMangement.EnemyCharater;
import teamManagement.TransferMember;
import teamManagement.EquippedTeam;
import membershipManagement.MyInfo;
import messageSystem.OutputStatement;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner move = new Scanner(System.in);//메뉴이동
    	Scanner order = new Scanner(System.in);//배틀페이지
    	Scanner empty = new Scanner(System.in);//메세지 체크
    	
    	MarketCharacter marketCharacter = new MarketCharacter();
    	TransferMember transferMember = new TransferMember();
    	EquippedTeam equippedTeam = new EquippedTeam();
    	OutputStatement outputStatement = new OutputStatement();
    	MyInfo myInfo =new MyInfo();
    	
    	marketCharacter.AddTopLiners();
    	marketCharacter.Addjunglers();
    	marketCharacter.addMidLiners();
    	marketCharacter.addSupporters();
    	marketCharacter.AddTopLiners();
    	 // MarketCharacter 클래스에서 생성한 MarketCharacter ArrayList 호출
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> topLinersArl = marketCharacter.topLinerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> junglerArl = marketCharacter.junglerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> midLinerArl = marketCharacter.midLinerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> adcArl = marketCharacter.adcArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> supporterArl = marketCharacter.supporterArl;
        // TransferMember 클래스에서 메서드에 MarketCharacter ArrayList 추가
        
        outputStatement.Registration();
        myInfo.Name(order.nextLine());
        outputStatement.CheckRegistration(myInfo);
        
        transferMember.AddArlTransferedLiner(topLinersArl);
        transferMember.AddArlTransferedLiner(junglerArl);
        transferMember.AddArlTransferedLiner(midLinerArl);
        transferMember.AddArlTransferedLiner(adcArl);
        transferMember.AddArlTransferedLiner(supporterArl);
        // TransferMember 클래스에서 생성한 TransferMember ArrayList 호출
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedtopArl = transferMember.TransferedToplinerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedjunglerArl = transferMember.TransferedjunglerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedmidArl = transferMember.TransferedMidlinerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedadcArl = transferMember.TransferedAdcArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedsuppArl = transferMember.TransferedSupporterArl;
        // EquippedTeam 클래스에서 메서드에 TransferMember ArrayList 추가
        equippedTeam.AddArlEquippedLiner(TransferedtopArl);
        equippedTeam.AddArlEquippedLiner(TransferedjunglerArl);
        equippedTeam.AddArlEquippedLiner(TransferedmidArl);
        equippedTeam.AddArlEquippedLiner(TransferedadcArl);
        equippedTeam.AddArlEquippedLiner(TransferedsuppArl);
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedtopArl = transferMember.TransferedToplinerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedjunglerArl = transferMember.TransferedjunglerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedmidArl = transferMember.TransferedMidlinerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedadcArl = transferMember.TransferedAdcArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedsuppArl = transferMember.TransferedSupporterArl;

        
    }
}
