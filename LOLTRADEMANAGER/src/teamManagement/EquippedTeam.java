package teamManagement;

import java.util.ArrayList;
import characterMangement.CharaterRegulation;


public class EquippedTeam {
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedToplinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedjunglerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedMidlinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedAdcArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedSupporterArl = new ArrayList<>();

	public void addArlEquippedLiner(
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlTop,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlJungler,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlMid,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlAdc,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlSupp) {
		EquippedToplinerArl.clear();
		EquippedjunglerArl.clear();
		EquippedMidlinerArl.clear();
		EquippedAdcArl.clear();
		EquippedSupporterArl.clear();
	    
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlTop) {
		     if (character.getEquippedOrNot()) {
		    	 EquippedToplinerArl.add(character); // 필터링된 원소 추가
		    	 System.out.println("탑 라인 선수를 갱신하였습니다.");
		        }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlJungler) {
		     if (character.getEquippedOrNot()) {
		    	 EquippedjunglerArl.add(character); // 필터링된 원소 추가
		    	 System.out.println("정글러 선수를 갱신하였습니다.");
		     }
		}        
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlMid) {       
		     if (character.getEquippedOrNot()) {
		    	 EquippedMidlinerArl.add(character); // 필터링된 원소 추가
		    	 System.out.println("미드 라인 선수를 갱신하였습니다.");
		        }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlAdc) {		     
		     if (character.getEquippedOrNot()) {
		    	 EquippedAdcArl.add(character); // 필터링된 원소 추가\
		    	 System.out.println("원딜 선수를 갱신하였습니다.");
		     } 	 
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlSupp) {		     
		     if (character.getEquippedOrNot()) {
		    	 EquippedSupporterArl.add(character); // 필터링된 원소 추가
		    	 System.out.println("서포터 선수를 갱신하였습니다.");
		     }
	    }
	}   

	public void checkEquippedLiner(
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlTop,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlJungler,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlMid,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlAdc,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlSupp) {
		
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlTop) {
		     if (character.getEquippedOrNot()) {
		    	 System.out.println("장착된 탑라이너 | 타입 : " + character.getLinerType());
		    	 System.out.println("선수 등급 : "+character.getLinerRating()+" | 선수 이름 : "+character.getLinerName());
		    	 System.out.println("성장력 : "+character.getGrowthPower()+" | 운영력 : "+character.getOperationalPower()+" | 한타력 : "+character.getTeamBattingPower() +" | 슈퍼플레이 : "+character.getSuperPlay());
		        }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlJungler) {
		     if (character.getEquippedOrNot())  {
		    	 System.out.println("장착된 정글러 | 타입 : " + character.getLinerType());
		    	 System.out.println("선수 등급 : "+character.getLinerRating()+" | 선수 이름 : "+character.getLinerName());
		    	 System.out.println("성장력 : "+character.getGrowthPower()+" | 운영력 : "+character.getOperationalPower()+" | 한타력 : "+character.getTeamBattingPower() +" | 슈퍼플레이 : "+character.getSuperPlay());
		        }
		}        
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlMid) {       
		     if (character.getEquippedOrNot())  {
		    	 System.out.println("장착된 미드라이너 | 타입 : " + character.getLinerType());
		    	 System.out.println("선수 등급 : "+character.getLinerRating()+" | 선수 이름 : "+character.getLinerName());
		    	 System.out.println("성장력 : "+character.getGrowthPower()+" | 운영력 : "+character.getOperationalPower()+" | 한타력 : "+character.getTeamBattingPower() +" | 슈퍼플레이 : "+character.getSuperPlay());
		        }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlAdc) {		     
		     if (character.getEquippedOrNot()) {
		    	 System.out.println("장착된 원딜러 | 타입 : " + character.getLinerType());
		    	 System.out.println("선수 등급 : "+character.getLinerRating()+" | 선수 이름 : "+character.getLinerName());
		    	 System.out.println("성장력 : "+character.getGrowthPower()+" | 운영력 : "+character.getOperationalPower()+" | 한타력 : "+character.getTeamBattingPower() +" | 슈퍼플레이 : "+character.getSuperPlay());
		        } 
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlSupp) {		     
		     if (character.getEquippedOrNot()) {
		    	 System.out.println("장착된 서포터 | 타입 : " + character.getLinerType());
		    	 System.out.println("선수 등급 : "+character.getLinerRating()+" | 선수 이름 : "+character.getLinerName());
		    	 System.out.println("성장력 : "+character.getGrowthPower()+" | 운영력 : "+character.getOperationalPower()+" | 한타력 : "+character.getTeamBattingPower() +" | 슈퍼플레이 : "+character.getSuperPlay());
		     }
	    }
	}	
}

