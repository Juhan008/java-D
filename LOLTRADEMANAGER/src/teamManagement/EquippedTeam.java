package teamManagement;

import java.util.ArrayList;
import java.util.List;

import characterMangement.CharaterRegulation;
import teamManagement.TransferMember;

public class EquippedTeam {
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedToplinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedjunglerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedMidlinerArls = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedAdcArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> EquippedSupporterArl = new ArrayList<>();

	public void AddArlEquippedLiner(ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputList) {
		EquippedToplinerArl.clear();
		EquippedjunglerArl.clear();
		EquippedMidlinerArls.clear();
		EquippedAdcArl.clear();
		EquippedSupporterArl.clear();
	    
	    for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputList) {
		     if (character.getEquippedOrNot() && "Top".equals(character.getPosition())) {
		    	 EquippedToplinerArl.add(character); // 필터링된 원소 추가
		        }
		     else if (character.getEquippedOrNot() && "jungler".equals(character.getPosition())) {
		    	 EquippedjunglerArl.add(character); // 필터링된 원소 추가
		        }
		     else if (character.getEquippedOrNot() && "Mid".equals(character.getPosition())) {
		    	 EquippedMidlinerArls.add(character); // 필터링된 원소 추가
		        }
		     else if (character.getEquippedOrNot() && "Adc".equals(character.getPosition())) {
		    	 EquippedAdcArl.add(character); // 필터링된 원소 추가
		        }
		     else if (character.getEquippedOrNot() && "Supporter".equals(character.getPosition())) {
		    	 EquippedSupporterArl.add(character); // 필터링된 원소 추가
		        }
	    }
	}   

}

