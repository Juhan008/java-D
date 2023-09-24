package membershipManagement;

import java.util.ArrayList;
import characterMangement.CharaterRegulation;


public class MyInfo {
	public ArrayList<MyInfoElement<String, Integer, Integer, Integer, Integer, Integer, Integer>> myInfoArl = new ArrayList<>();
	
	public String name="";
	public int money=0;
	public int rating=0;
	public int domesticVictory=0;
	public int domesticDefeat=0;
	public int internationalVictory=0;
	public int internationalDefeat=0;
	
	public void renewMyInfo () {
		myInfoArl.clear();
		MyInfoElement<String, Integer, Integer, Integer, Integer, Integer, Integer> mainInfoArl = new MyInfoElement<>(
				name,money,rating,domesticVictory,domesticDefeat,internationalVictory,internationalDefeat);
		myInfoArl.add(mainInfoArl);
		System.out.println("회원 정보 갱신 완료");}
		
	
	
	//장비된 캐릭터 ArrayList로 내 레이팅 계산.
	public int renewMyRating (
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> equippedtopArl,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> equippedjunglerArl,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> equippedmidArl,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> equippedadcArl,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> equippedsuppArl
			) {
		
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> information :equippedtopArl) {
			rating += information.getLinerRating();}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> information :equippedjunglerArl) {
			rating += information.getLinerRating();}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> information :equippedmidArl) {
			rating += information.getLinerRating();}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> information :equippedadcArl) {
			rating += information.getLinerRating();}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> information :equippedsuppArl) {
			rating += information.getLinerRating();}
		
		 return rating;
	}
	public void checkMyInfo () {
		for (MyInfoElement<String, Integer, Integer, Integer, Integer, Integer, Integer> information :myInfoArl) {
			System.out.println("감독 ID : "+information.getName());
			System.out.println("팀 레이팅 : "+information.getRating());
			System.out.println("보유 게임 Money : "+information.getMoney());
			System.out.println("지역 대회 전적 : "+(information.getDomesticVictory()+information.getDomesticDefeat())+"전 "
			+information.getDomesticVictory()+"승 "+information.getDomesticDefeat()+"패");
			System.out.println("세계 대회 전적 : "+(information.getInternationalVictory()+information.getInternationalDefeat())+"전 "
			+information.getInternationalVictory()+"승 "+information.getInternationalDefeat()+"패");
		}
	}
}

