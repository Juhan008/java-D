package marketSystem;

import java.util.ArrayList;

import characterMangement.CharaterRegulation;

public class MarketList {
	public int pay=0;
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> UntransferedToplinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> UntransferedjunglerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> UntransferedMidlinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> UntransferedAdcArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> UntransferedSupporterArl = new ArrayList<>();

	public void addArlUntransferedLiner(ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlTop,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlJungler,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlMid,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlAdc,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlSupp) {
		
			UntransferedToplinerArl.clear();
			UntransferedjunglerArl.clear();
			UntransferedMidlinerArl.clear();
			UntransferedAdcArl.clear();
			UntransferedSupporterArl.clear();
	    for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlTop) {
		     if (!character.getTransferStatus()) {
		    	 UntransferedToplinerArl.add(character); // 필터링된 원소 추가
		        }
	    }
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlJungler) {     
		     if (!character.getTransferStatus()) {
		    	 UntransferedjunglerArl.add(character); // 필터링된 원소 추가
		        }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlMid) {     
		     if (!character.getTransferStatus()) {	 
		    	 UntransferedMidlinerArl.add(character); // 필터링된 원소 추가
		        }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlAdc) {      
		     if (!character.getTransferStatus()) {
		    	 UntransferedAdcArl.add(character); // 필터링된 원소 추가
		        }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlSupp) {      
		     if (!character.getTransferStatus()) {
		    	 UntransferedSupporterArl.add(character); // 필터링된 원소 추가
		        }
	    }
	}   
	public void checkUntransferedLiner(ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArl) {
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArl) {
		     if (!character.getTransferStatus() && "Top".equals(character.getPosition())) {
		    	 System.out.println("이적 시장 탑라이너 | 타입 : " + character.getLinerType());}
		     else if (!character.getTransferStatus() && "jungler".equals(character.getPosition())){
		    	 System.out.println("이적 시장 정글러 | 타입 : " + character.getLinerType());}
		     else if (!character.getTransferStatus() && "Mid".equals(character.getPosition()))  {
		    	 System.out.println("이적 시장 미드라이너 | 타입 : " + character.getLinerType());}    
		     else if (!character.getTransferStatus() && "Adc".equals(character.getPosition())) {
		    	 System.out.println("이적 시장 원딜러 | 타입 : " + character.getLinerType());}
		     else if (!character.getTransferStatus() && "Supporter".equals(character.getPosition())) {
		    	 System.out.println("이적 시장 서포터 | 타입 : " + character.getLinerType());}
		    	 System.out.println("선수 등급 : "+character.getLinerRating()+" | 선수 이름 : "+character.getLinerName());
		    	 System.out.println("성장력 : "+character.getGrowthPower()+" | 운영력 : "+character.getOperationalPower()+" | 한타력 : "+character.getTeamBattingPower() +" | 슈퍼플레이 : "+character.getSuperPlay());
		    	 System.out.println("선수 입단 금액 : " + character.getTransferPrice());
		}System.out.println("구매할 선수가 있다면 1번을 입력하세요");
	}
	public int toTransferLiner(ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArl, String characterName, int money) {
		
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArl) {
		     if (!character.getTransferStatus() && characterName.equals(character.getLinerName()) && character.getTransferPrice()>=money) {
		    	 System.out.println(character.getLinerName()+" 선수 구매 완료 ");
		    	 character.setTransferStatus(true);
		    	 pay = character.getTransferPrice();
		     }
		     else if(!character.getTransferStatus() && !characterName.equals(character.getLinerName()) && character.getTransferPrice()>=money) {
		    	 System.out.println(characterName+" : 찾을 수 없는 선수명 입니다. ");
		    	 pay = 0;
		     }
		     else if(!character.getTransferStatus() && characterName.equals(character.getLinerName()) && character.getTransferPrice()<money) {
		    	 System.out.println("선구 이적 가격 : "+character.getTransferPrice());
		    	 System.out.println("현재 보유금 : "+money+" 이며, 구매 불가합니다.");
		    	 pay = 0;
		     }
		     else {System.out.println("구매 실패 : 다시 시도해주세요.");
		    	 pay = 0;
		     }
		}return pay;
	}	
}



