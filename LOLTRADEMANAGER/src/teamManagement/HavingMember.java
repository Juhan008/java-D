package teamManagement;

import java.util.ArrayList;

import characterMangemaet.CharaterRegulation;

public class HavingMember {
	 private ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> teamMembers = new ArrayList<>();
	 	//ArrayList에 데이터 추가
	    public void addCharacter(CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> characterAdd) {
	        teamMembers.add(characterAdd);
	    }
	    //HavingOrNot
	    public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> getHavingCharacters() {
	        ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> HavingCharacters = new ArrayList<>();
	        
	        for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : teamMembers) {
	            if (character.getHavingOrNot()==true) {
	            	HavingCharacters.add(character);
	            }
	        }
	        
	        return HavingCharacters;
	    }

	   
	}

