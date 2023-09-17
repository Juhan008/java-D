package main;

import java.util.ArrayList;

import characterMangement.CharaterRegulation;
import characterMangement.MarketCharacter;
import characterMangement.EnemyCharater;

import teamManagement.TransferMember;
import teamManagement.EquippedTeam;


public class Main {
    public static void main(String[] args) {
    	MarketCharacter marketCharacter = new MarketCharacter();
    	marketCharacter.AddTopLiners();
    	marketCharacter.Addjunglers();
    	marketCharacter.addMidLiners();
    	marketCharacter.addSupporters();
    	marketCharacter.AddTopLiners();
    	 // MarketCharacter 클래스에서 생성한 ArrayList 호출
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> topLinersArl = marketCharacter.topLinerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> junglerArl = marketCharacter.junglerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> midLinerArl = marketCharacter.midLinerArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> adcArl = marketCharacter.adcArl;
        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> supporterArl = marketCharacter.supporterArl;
        // ArrayList의 원소에 접근
        for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : topLinersArl) {
            System.out.println("등급: " + character.getLinerRating());
            System.out.println("포지션: " + character.getPosition());
            System.out.println("타입: " + character.getLinerType());
            System.out.println("이름: " + character.getLinerName());
            System.out.println("성장력: " + character.getGrowthPower());
            System.out.println("운영력: " + character.getOperationalPower());
            System.out.println("한타력: " + character.getTeamBattingPower());
            System.out.println("슈퍼플레이: " + character.getSuperPlay());
            System.out.println("장착유무: " + character.getEquippedOrNot());
            System.out.println("구매 가격: " + character.getTransferPrice());
            System.out.println("이적유무: " + character.getTransferStatus());
            System.out.println();
        }
    
        
    }
}
