package battleSystem;

import java.util.ArrayList;
import java.util.Random;



public class EarlyPhase {
	int ganking =0;
	int topSuperPlay=0;
	int junglerSuperPlay=0;
	int midSuperPlay=0;
	int adcSuperPlay=0;
	int suppSuperPlay=0;
	int ETopSuperPlay=0;
	int EJunglerSuperPlay=0;
	int EMidSuperPlay=0;
	int EAdcSuperPlay=0;
	int ESuppSuperPlay=0;
	int TSActiveCoin=0;
	int JSActiveCoin=0;
	int MSActiveCoin=0;
	int ASActiveCoin=0;
	int SSActiveCoin=0;
	int ETSActiveCoin=0;
	int EJSActiveCoin=0;
	int EMSActiveCoin=0;
	int EASActiveCoin=0;
	int ESSActiveCoin=0;
	
	
	int Random =0;
	Random random = new Random();
	public void myTeamsuperPlayActivate(int orderNum, int myLiner, int myJungler, int enemyLiner,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyTop,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyJungler,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyMid,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyAdc,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMySupp,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyTop,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyJungler,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyMid,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyAdc,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemySupp) {
		if(orderNum ==1) {
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyTop) {
				 
				if (myLiner >= 1 && myLiner <= 10) {
			            Random random = new Random(myLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);}
			           else {character.setCheckSuperPlay(false);}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
				if (myJungler >= 1 && myJungler <= 10) {
		            Random random = new Random(myLiner);

		            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
		           if(result==1) {character.setCheckSuperPlay(true);}
		           else {character.setCheckSuperPlay(false);}
			}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyTop) {
				if (enemyLiner >= 1 && enemyLiner <= 10) {
			            Random random = new Random(myLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);}
			           else {character.setCheckSuperPlay(false);}
				}
			}
		
		}
		if(orderNum ==2) {
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyMid) {
				 
				if (myLiner >= 1 && myLiner <= 10) {
			            Random random = new Random(myLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);}
			           else {character.setCheckSuperPlay(false);}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
				if (myJungler >= 1 && myJungler <= 10) {
		            Random random = new Random(myLiner);

		            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
		           if(result==1) {character.setCheckSuperPlay(true);}
		           else {character.setCheckSuperPlay(false);}
			}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyMid) {
				if (enemyLiner >= 1 && enemyLiner <= 10) {
			            Random random = new Random(myLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);}
			           else {character.setCheckSuperPlay(false);}
				}
			}
		
		}
		if(orderNum ==3) {
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyAdc) {
				 
				if (myLiner >= 1 && myLiner <= 10) {
			            Random random = new Random(myLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);}
			           else {character.setCheckSuperPlay(false);}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMySupp) {
					 
					if (myLiner >= 1 && myLiner <= 10) {
				            Random random = new Random(myLiner);

				            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
				           if(result==1) {character.setCheckSuperPlay(true);}
				           else {character.setCheckSuperPlay(false);}
					}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
				if (myJungler >= 1 && myJungler <= 10) {
		            Random random = new Random(myLiner);

		            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
		           if(result==1) {character.setCheckSuperPlay(true);}
		           else {character.setCheckSuperPlay(false);}
			}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyAdc) {
				if (enemyLiner >= 1 && enemyLiner <= 10) {
			            Random random = new Random(myLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);}
			           else {character.setCheckSuperPlay(false);}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemySupp) {
				if (enemyLiner >= 1 && enemyLiner <= 10) {
			            Random random = new Random(myLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);}
			           else {character.setCheckSuperPlay(false);}
				}
			}
		}	
		
	}
	public void myTeamGanking(int orderNum,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyTop,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyJungler,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyMid,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyAdc,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMySupp,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyTop,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyJungler,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyMid,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyAdc,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemySupp) {
		
		
		if(orderNum ==1) {
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyTop) {
			
			}
		}
		
	}
}
