package teamManagement;

import java.util.ArrayList;
import java.util.Random;

import characterMangement.CharaterRegulation;

public class InternationalTeam {

	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> internationalToplinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> internationaljunglerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> internationalMidlinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> internationalAdcArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> internationalSupporterArl = new ArrayList<>();
	public int teamRating=0;
	public int averageRating=0;
	

	public void internationalTeamMatching(
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlTop,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlJungler,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlMid,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlAdc,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlSupp,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlEnemyTop,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlEnemyJungler,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlEnemyMid,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlEnemyAdc,
			ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlEnemySupp) {
		
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlTop) {
			teamRating += character.getLinerRating();
		        }
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlJungler) {
			teamRating += character.getLinerRating();
		        }
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlMid) {
			teamRating += character.getLinerRating();
		        }
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlAdc) {
			teamRating += character.getLinerRating();
		        }
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlSupp) {
			teamRating += character.getLinerRating();
		        }
		averageRating= teamRating/5;
		 ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchingTop = new ArrayList<>();
		 ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchingJungle = new ArrayList<>();
		 ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchingMid = new ArrayList<>();
		 ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchingAdc = new ArrayList<>();
		 ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> matchingSupp = new ArrayList<>();
		
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlEnemyTop) {
	            if (character.getLinerRating() == averageRating || (character.getLinerRating() == (averageRating)+1)) {
	            	matchingTop.add(character);
		        }
	            if (!matchingTop.isEmpty()) {
	                Random random = new Random();
	                int randomIndex = random.nextInt(matchingTop.size());
	                CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> selectedCharacter = matchingTop.get(randomIndex);
	                internationalToplinerArl.add(selectedCharacter);
	            }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlEnemyJungler) {
			 if (character.getLinerRating() == averageRating || (character.getLinerRating() == (averageRating)+1)) {
				 matchingJungle.add(character);
		        }
			  if (!matchingJungle.isEmpty()) {
	                Random random = new Random();
	                int randomIndex = random.nextInt(matchingJungle.size());
	                CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> selectedCharacter = matchingJungle.get(randomIndex);
	                internationaljunglerArl.add(selectedCharacter);
			  }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlEnemyMid) {
			 if (character.getLinerRating() == averageRating || (character.getLinerRating() == (averageRating)+1)) {
				 matchingMid.add(character);
		        }
			  if (!matchingMid.isEmpty()) {
	                Random random = new Random();
	                int randomIndex = random.nextInt(matchingMid.size());
	                CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> selectedCharacter = matchingMid.get(randomIndex);
	                internationalMidlinerArl.add(selectedCharacter);
			  }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlEnemyAdc) {
			 if (character.getLinerRating() == averageRating || (character.getLinerRating() == (averageRating)+1)) {
				 matchingAdc.add(character);
		        }
			  if (!matchingAdc.isEmpty()) {
	                Random random = new Random();
	                int randomIndex = random.nextInt(matchingAdc.size());
	                CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> selectedCharacter = matchingAdc.get(randomIndex);
	                internationalAdcArl.add(selectedCharacter);
			  }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlEnemySupp) {
			 if (character.getLinerRating() == averageRating || (character.getLinerRating() == (averageRating)+1)) {
				 matchingSupp.add(character);
		        }
			  if (!matchingSupp.isEmpty()) {
	                Random random = new Random();
	                int randomIndex = random.nextInt(matchingSupp.size());
	                CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> selectedCharacter = matchingSupp.get(randomIndex);
	                internationalSupporterArl.add(selectedCharacter);
			  }
		
		}
	}
}

