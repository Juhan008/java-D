package marketSystem;

import java.util.ArrayList;

import characterMangement.CharaterRegulation;

public class MarketList {
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> UntransferedToplinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> UntransferedjunglerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> UntransferedMidlinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> UntransferedAdcArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> UntransferedSupporterArl = new ArrayList<>();

	public void AddArlTransferedLiner(ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputList) {
		UntransferedToplinerArl.clear();
		UntransferedjunglerArl.clear();
		UntransferedMidlinerArl.clear();
		UntransferedAdcArl.clear();
		UntransferedSupporterArl.clear();
	    
	    for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputList) {
		     if (!character.getTransferStatus() && "Top".equals(character.getPosition())) {
		    	 UntransferedToplinerArl.add(character); // 필터링된 원소 추가
		        }
		     else if (!character.getTransferStatus() && "jungler".equals(character.getPosition())) {
		    	 UntransferedjunglerArl.add(character); // 필터링된 원소 추가
		        }
		     else if (!character.getTransferStatus() && "Mid".equals(character.getPosition())) {
		    	 UntransferedMidlinerArl.add(character); // 필터링된 원소 추가
		        }
		     else if (!character.getTransferStatus() && "Adc".equals(character.getPosition())) {
		    	 UntransferedAdcArl.add(character); // 필터링된 원소 추가
		        }
		     else if (!character.getTransferStatus() && "Supporter".equals(character.getPosition())) {
		    	 UntransferedSupporterArl.add(character); // 필터링된 원소 추가
		        }
	    }
	}   
}


