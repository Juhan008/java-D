package teamManagement;

import characterMangement.CharaterRegulation;


import java.util.ArrayList;

public class TransferMember {
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedToplinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedjunglerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedMidlinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedAdcArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedSupporterArl = new ArrayList<>();

	public void addArlTransferedLiner(ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlTop,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlJungler,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlMid,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlAdc,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlSupp) {
		TransferedToplinerArl.clear();
		TransferedjunglerArl.clear();
		TransferedMidlinerArl.clear();
		TransferedAdcArl.clear();
		TransferedSupporterArl.clear();
	    for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlTop) {
		     if (character.getTransferStatus()) {
		    	 TransferedToplinerArl.add(character); // 필터링된 원소 추가
		        }
	    }
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlJungler) {     
		     if (character.getTransferStatus()) {
		    	 TransferedjunglerArl.add(character); // 필터링된 원소 추가
		        }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlMid) {     
		     if (character.getTransferStatus()) {
		    	 
		    	 TransferedMidlinerArl.add(character); // 필터링된 원소 추가
		        }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlAdc) {      
		     if (character.getTransferStatus()) {
		    	 TransferedAdcArl.add(character); // 필터링된 원소 추가
		        }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlSupp) {      
		     if (character.getTransferStatus()) {
		    	 TransferedSupporterArl.add(character); // 필터링된 원소 추가
		        }
	    }
	}   
	public void checkTransferedLiner(ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArl) {
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArl) {
		     if (character.getTransferStatus() && "Top".equals(character.getPosition())) {
		    	 System.out.println("보유 중인 탑라이너 | 타입 : " + character.getLinerType());}
		     else if (character.getTransferStatus() && "jungler".equals(character.getPosition())){
		    	 System.out.println("보유 중인 정글러 | 타입 : " + character.getLinerType());}
		     else if (character.getTransferStatus() && "Mid".equals(character.getPosition()))  {
		    	 System.out.println("보유 중인 미드라이너 | 타입 : " + character.getLinerType());}    
		     else if (character.getTransferStatus() && "Adc".equals(character.getPosition())) {
		    	 System.out.println("보유 중인 원딜러 | 타입 : " + character.getLinerType());}
		     else if (character.getTransferStatus() && "Supporter".equals(character.getPosition())) {
		    	 System.out.println("보유 중인 서포터 | 타입 : " + character.getLinerType());}
		    	 System.out.println("선수 등급 : "+character.getLinerRating()+" | 선수 이름 : "+character.getLinerName());
		    	 System.out.println("성장력 : "+character.getGrowthPower()+" | 운영력 : "+character.getOperationalPower()+" | 한타력 : "+character.getTeamBattingPower() +" | 슈퍼플레이 : "+character.getSuperPlay());
		}System.out.println("변경할 선수가 있다면 1번을 입력하세요");
	}
	public void changeLiner(
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputAllArl,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputEquippedArl,
			String linerName) {
		String beforeLiner="";
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputEquippedArl) {
		     if (character.getTransferStatus()&&character.getEquippedOrNot() && "Top".equals(character.getPosition())) {
		    	 System.out.println("교체전 탑라이너 : "+character.getLinerName()+" 타입 : "+character.getLinerType());
		    	 beforeLiner=character.getLinerName();}
		     else if (character.getTransferStatus()&&character.getEquippedOrNot() && "jungler".equals(character.getPosition())) {
		    	 System.out.println("교체전 정글러 : "+character.getLinerName()+" 타입 : "+character.getLinerType());
		    	 beforeLiner=character.getLinerName();}
		     else if (character.getTransferStatus()&&character.getEquippedOrNot() && "Mid".equals(character.getPosition())) {
		    	 System.out.println("교체전 미드라이너 : "+character.getLinerName()+" 타입 : "+character.getLinerType());
		    	 beforeLiner=character.getLinerName();}
		     else if (character.getTransferStatus()&&character.getEquippedOrNot() && "Adc".equals(character.getPosition())) {
		    	 System.out.println("교체전 원딜러 : "+character.getLinerName()+" 타입 : "+character.getLinerType());
		    	 beforeLiner=character.getLinerName();}
		     else if (character.getTransferStatus()&&character.getEquippedOrNot() && "Supporter".equals(character.getPosition())) {
		    	 System.out.println("교체전 서포터 : "+character.getLinerName()+" 타입 : "+character.getLinerType());
		    	 beforeLiner=character.getLinerName();}
		     else {System.out.println("교체 선수를 찾을 수없 습니다.");}
		} 
		     inputEquippedArl.clear();
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputAllArl) {
				if (beforeLiner.equals(character.getLinerName())){
				character.setEquippedOrNot(false);
				}
				if (character.getTransferStatus()&&character.getEquippedOrNot() && "Top".equals(character.getPosition())) {
			    	 System.out.println("교체 후 탑라이너 : "+character.getLinerName()+" 타입 : "+character.getLinerType());
			    	 character.setEquippedOrNot(true);
				}
			     else if (character.getTransferStatus()&&character.getEquippedOrNot() && "jungler".equals(character.getPosition())) {
			    	 System.out.println("교체 후 정글러 : "+character.getLinerName()+" 타입 : "+character.getLinerType());
			    	 character.setEquippedOrNot(true);	 
			     }
			     else if (character.getTransferStatus()&&character.getEquippedOrNot() && "Mid".equals(character.getPosition())) {
			    	 System.out.println("교체 후 미드라이너 : "+character.getLinerName()+" 타입 : "+character.getLinerType());
			    	 character.setEquippedOrNot(true); 
			     }
			     else if (character.getTransferStatus()&&character.getEquippedOrNot() && "Adc".equals(character.getPosition())) {
			    	 System.out.println("교체 후 원딜러 : "+character.getLinerName()+" 타입 : "+character.getLinerType());
			    	 character.setEquippedOrNot(true);	 
			     }
			     else if (character.getTransferStatus()&&character.getEquippedOrNot() && "Supporter".equals(character.getPosition())) {
			    	 System.out.println("교체 후 서포터 : "+character.getLinerName()+" 타입 : "+character.getLinerType());
			    	 character.setEquippedOrNot(true);	 
			     }
		}System.out.println("선수 교체 완료");
	}
}

