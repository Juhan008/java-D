package teamManagement;

import characterMangement.CharaterRegulation;
import characterMangement.MarketCharacter;

import java.util.ArrayList;
import java.util.List;

public class TransferMember {
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedToplinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedjunglerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedMidlinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedAdcArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> TransferedSupporterArl = new ArrayList<>();

	public void AddArlTransferedLiner(ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputList) {
	    TransferedToplinerArl.clear();
	    TransferedjunglerArl.clear();
	    TransferedMidlinerArl.clear();
	    TransferedAdcArl.clear();
	    TransferedSupporterArl.clear();
	    
	    for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputList) {
		     if (character.getTransferStatus() && "Top".equals(character.getPosition())) {
		    	 TransferedToplinerArl.add(character); // 필터링된 원소 추가
		        }
		     else if (character.getTransferStatus() && "jungler".equals(character.getPosition())) {
		         TransferedjunglerArl.add(character); // 필터링된 원소 추가
		        }
		     else if (character.getTransferStatus() && "Mid".equals(character.getPosition())) {
		    	 TransferedMidlinerArl.add(character); // 필터링된 원소 추가
		        }
		     else if (character.getTransferStatus() && "Adc".equals(character.getPosition())) {
		    	 TransferedAdcArl.add(character); // 필터링된 원소 추가
		        }
		     else if (character.getTransferStatus() && "Supporter".equals(character.getPosition())) {
		    	 TransferedSupporterArl.add(character); // 필터링된 원소 추가
		        }
	    }
	}   
}

