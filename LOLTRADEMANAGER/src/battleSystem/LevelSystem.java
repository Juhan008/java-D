package battleSystem;

import java.util.ArrayList;

import battleSystem.BattleElement;
import characterMangement.CharaterRegulation;

public class LevelSystem {
	//경험치 누적
	public void acquireExperience(
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyTop,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyJungler,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyMid,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyAdc,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMySupp,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyTop,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyJungler,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyMid,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyAdc,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemySupp) {
		
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyTop) {
    			if(character.getGrowthPossible()==true) {
    				character.setExeStack(character.getExeStack()+character.getGrowthPower());
				}
    				character.setGrowthPossible(true);	
    		}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
    			if(character.getGrowthPossible()==true) {
    				character.setExeStack(character.getExeStack()+character.getGrowthPower());
				}
    				character.setGrowthPossible(true);	
    		}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyMid) {
    			if(character.getGrowthPossible()==true) {
    				character.setExeStack(character.getExeStack()+character.getGrowthPower());
				}
    				character.setGrowthPossible(true);	
    		}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyAdc) {
    			if(character.getGrowthPossible()==true) {
    				character.setExeStack(character.getExeStack()+character.getGrowthPower());
				}
    				character.setGrowthPossible(true);	
    		}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMySupp) {
    			if(character.getGrowthPossible()==true) {
    				character.setExeStack(character.getExeStack()+character.getGrowthPower());
				}
    				character.setGrowthPossible(true);	
    		}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyTop) {
    			if(character.getGrowthPossible()==true) {
    				character.setExeStack(character.getExeStack()+character.getGrowthPower());
				}
    				character.setGrowthPossible(true);	
    		}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyJungler) {
    			if(character.getGrowthPossible()==true) {
    				character.setExeStack(character.getExeStack()+character.getGrowthPower());
				}
    				character.setGrowthPossible(true);	
    		}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyMid) {
    			if(character.getGrowthPossible()==true) {
    				character.setExeStack(character.getExeStack()+character.getGrowthPower());
				}
    				character.setGrowthPossible(true);	
    		}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyAdc) {
    			if(character.getGrowthPossible()==true) {
    				character.setExeStack(character.getExeStack()+character.getGrowthPower());
				}
    				character.setGrowthPossible(true);	
    		}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemySupp) {
    			if(character.getGrowthPossible()==true) {
    				character.setExeStack(character.getExeStack()+character.getGrowthPower());
				}
    				character.setGrowthPossible(true);	
    		}    
}
	//레벨업
	public void levelUpSystem(
				ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyTop,
				ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyJungler,
				ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyMid,
				ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyAdc,
				ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMySupp,
				ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyTop,
				ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyJungler,
				ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyMid,
				ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyAdc,
				ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemySupp) {
			
	    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyTop) {
	    			if(character.getExeStack()>=200 && "Offensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*4);
	    			}
	    			else if(character.getExeStack()>=200 && "Balancive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*2);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*2);
	    			}
	    			else if(character.getExeStack()>=200 && "Defensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*4);
	    			}
				}
	    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
	    			if(character.getExeStack()>=200 && "Offensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*4);
	    			}
	    			else if(character.getExeStack()>=200 && "Balancive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*2);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*2);
	    			}
	    			else if(character.getExeStack()>=200 && "Defensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*4);
	    			}
				}
	    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyMid) {
	    			if(character.getExeStack()>=200 && "Offensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*4);
	    			}
	    			else if(character.getExeStack()>=200 && "Balancive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*2);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*2);
	    			}
	    			else if(character.getExeStack()>=200 && "Defensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*4);
	    			}
				}
	    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyAdc) {
	    			if(character.getExeStack()>=200 && "Offensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*4);
	    			}
	    			else if(character.getExeStack()>=200 && "Balancive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*2);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*2);
	    			}
	    			else if(character.getExeStack()>=200 && "Defensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*4);
	    			}
				}
	    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMySupp) {
	    			if(character.getExeStack()>=200 && "Offensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*4);
	    			}
	    			else if(character.getExeStack()>=200 && "Balancive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*2);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*2);
	    			}
	    			else if(character.getExeStack()>=200 && "Defensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*4);
	    			}
				}
	    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyTop) {
	    			if(character.getExeStack()>=200 && "Offensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*4);
	    			}
	    			else if(character.getExeStack()>=200 && "Balancive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*2);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*2);
	    			}
	    			else if(character.getExeStack()>=200 && "Defensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*4);
	    			}
				}
	    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyJungler) {
	    			if(character.getExeStack()>=200 && "Offensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*4);
	    			}
	    			else if(character.getExeStack()>=200 && "Balancive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*2);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*2);
	    			}
	    			else if(character.getExeStack()>=200 && "Defensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*4);
	    			}
				}
	    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyMid) {
	    			if(character.getExeStack()>=200 && "Offensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*4);
	    			}
	    			else if(character.getExeStack()>=200 && "Balancive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*2);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*2);
	    			}
	    			else if(character.getExeStack()>=200 && "Defensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*4);
	    			}
				}
	    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyAdc) {
	    			if(character.getExeStack()>=200 && "Offensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*4);
	    			}
	    			else if(character.getExeStack()>=200 && "Balancive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*2);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*2);
	    			}
	    			else if(character.getExeStack()>=200 && "Defensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*4);
	    			}
				}
	    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemySupp) {
	    			if(character.getExeStack()>=200 && "Offensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*4);
	    			}
	    			else if(character.getExeStack()>=200 && "Balancive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalOperationalPower(character.getLevel()*2);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*2);
	    			}
	    			else if(character.getExeStack()>=200 && "Defensive".equals(character.getLinerType())){
	    				character.setExeStack(character.getExeStack()-200);
	    				character.setLevel(character.getLevel()+1);
	    				character.setAdditionalTeamBattingPower(character.getLevel()*4);
	    			}
				}
			        }
}

