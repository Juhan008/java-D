package teamManagement;

import java.util.ArrayList;
import java.util.Random;

import characterMangement.CharaterRegulation;

public class DomesticCompetitionTeam {
	
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> domesticCToplinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> domesticCjunglerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> domesticCMidlinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> domesticCAdcArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> domesticCSupporterArl = new ArrayList<>();
	public int teamRating=0;
	public int averageRating=0;
	

	public void domesticTeamMatching(
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
	            if (character.getLinerRating() == averageRating) {
	            	matchingTop.add(character);
		        }
	            if (!matchingTop.isEmpty()) {
	                Random random = new Random();
	                int randomIndex = random.nextInt(matchingTop.size());
	                CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> selectedCharacter = matchingTop.get(randomIndex);
	                domesticCToplinerArl.add(selectedCharacter);
	            }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlEnemyJungler) {
			 if (character.getLinerRating() == averageRating) {
				 matchingJungle.add(character);
		        }
			  if (!matchingJungle.isEmpty()) {
	                Random random = new Random();
	                int randomIndex = random.nextInt(matchingJungle.size());
	                CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> selectedCharacter = matchingJungle.get(randomIndex);
	                domesticCjunglerArl.add(selectedCharacter);
			  }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlEnemyMid) {
			 if (character.getLinerRating() == averageRating) {
				 matchingMid.add(character);
		        }
			  if (!matchingMid.isEmpty()) {
	                Random random = new Random();
	                int randomIndex = random.nextInt(matchingMid.size());
	                CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> selectedCharacter = matchingMid.get(randomIndex);
	                domesticCMidlinerArl.add(selectedCharacter);
			  }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlEnemyAdc) {
			 if (character.getLinerRating() == averageRating) {
				 matchingAdc.add(character);
		        }
			  if (!matchingAdc.isEmpty()) {
	                Random random = new Random();
	                int randomIndex = random.nextInt(matchingAdc.size());
	                CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> selectedCharacter = matchingAdc.get(randomIndex);
	                domesticCAdcArl.add(selectedCharacter);
			  }
		}
		for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlEnemySupp) {
			 if (character.getLinerRating() == averageRating) {
				 matchingSupp.add(character);
		        }
			  if (!matchingSupp.isEmpty()) {
	                Random random = new Random();
	                int randomIndex = random.nextInt(matchingSupp.size());
	                CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> selectedCharacter = matchingSupp.get(randomIndex);
	                domesticCSupporterArl.add(selectedCharacter);
			  }
		
		}
	}
}

	