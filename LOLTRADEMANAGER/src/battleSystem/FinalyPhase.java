package battleSystem;

import java.util.ArrayList;
import java.util.Random;

public class FinalyPhase {

	public int damage=0;
	public boolean topObjectSuccess=false;
	public boolean bottomObjectSuccess=false;
	public void myTeamsuperPlayActivate(int myLiner, int enemyLiner,
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
				 
				if (myLiner >= 1 && myLiner <= 10) {
			            Random random = new Random(myLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/5) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);
			           System.out.println("공격팀 탑 라이너 슈퍼플레이 ON!");}
			           else {character.setCheckSuperPlay(false);}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
				if (myLiner >= 1 && myLiner <= 10) {
		            Random random = new Random(myLiner);

		            int result = random.nextInt(100) < (character.getSuperPlay()/5) ? 1 : 0;
		           if(result==1) {character.setCheckSuperPlay(true);
		           System.out.println("공격팀 정글러 슈퍼플레이 ON!");}
		           else {character.setCheckSuperPlay(false);}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyMid) {
				if (myLiner >= 1 && myLiner <= 10) {
			            Random random = new Random(myLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/5) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);
			           System.out.println("공격팀 미드 라이너 슈퍼플레이 ON!");}
			           else {character.setCheckSuperPlay(false);}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyAdc) {
				 
				if (myLiner >= 1 && myLiner <= 10) {
			            Random random = new Random(myLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/5) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);
			           System.out.println("공격팀 원딜러 슈퍼플레이 ON!");}
			           else {character.setCheckSuperPlay(false);}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMySupp) {
				if (myLiner >= 1 && myLiner <= 10) {
		            Random random = new Random(myLiner);

		            int result = random.nextInt(100) < (character.getSuperPlay()/5) ? 1 : 0;
		           if(result==1) {character.setCheckSuperPlay(true);
		           System.out.println("공격팀 서포터 슈퍼플레이 ON!");}
		           else {character.setCheckSuperPlay(false);}
			}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyTop) {
				if (enemyLiner >= 1 && enemyLiner <= 10) {
			            Random random = new Random(enemyLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/5) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);
			           System.out.println("수비팀 탑 라이너 슈퍼플레이 ON!");}
			           else {character.setCheckSuperPlay(false);}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyJungler) {
				 
				if (enemyLiner >= 1 && enemyLiner <= 10) {
			            Random random = new Random(enemyLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/5) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);
			           System.out.println("수비팀 정글러 슈퍼플레이 ON!");}
			           else {character.setCheckSuperPlay(false);}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyMid) {		 
					if (enemyLiner >= 1 && enemyLiner <= 10) {
				            Random random = new Random(enemyLiner);

				            int result = random.nextInt(100) < (character.getSuperPlay()/5) ? 1 : 0;
				           if(result==1) {character.setCheckSuperPlay(true);
				           System.out.println("수비팀 미드 라이너 슈퍼플레이 ON!");}
				           else {character.setCheckSuperPlay(false);}
					}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyAdc) {
				if (enemyLiner >= 1 && enemyLiner <= 10) {
		            Random random = new Random(enemyLiner);

		            int result = random.nextInt(100) < (character.getSuperPlay()/5) ? 1 : 0;
		           if(result==1) {character.setCheckSuperPlay(true);
		           System.out.println("수비팀 원딜러 슈퍼플레이 ON!");}
		           else {character.setCheckSuperPlay(false);}
			}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemySupp) {
				if (enemyLiner >= 1 && enemyLiner <= 10) {
			            Random random = new Random(enemyLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/5) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);
			           System.out.println("수비팀 서포터 슈퍼플레이 ON!");}
			           else {character.setCheckSuperPlay(false);}
				}
			}
	}
	public void gankingDamageFormula(int orderNum,
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
		int attackTop=0;
		int attackJungler=0;
		int attackMid=0;
		int attackAdc=0;
		int attackSupp=0;
		int defenceTop=0;
		int defenceJungler=0;
		int defenceMid=0;
		int defenceAdc=0;
		int defenceSupp=0;
		
		int attackGenieBuff=0;
		int attackDragonBuff=0;
		int attackBaronBuff=0;
		int attackElderDragonBuff=0;
		int defenceGenieBuff=0;
		int defenceDragonBuff=0;
		int defenceBaronBuff=0;
		int defenceElderDragonBuff=0;
		damage=0;
	//boolean gankingSuccess =false;
	
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyTop) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					attackTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.70));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					attackTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					attackTop=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					attackTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					attackTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					attackTop=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
			if (character.getCanyonGenie()==true) {attackGenieBuff=character.getGenieBuff();}else {attackGenieBuff=0;}
			if(character.getCheckBaron()==true) {attackBaronBuff=character.getBaronbuff();}else {attackBaronBuff=0;}
			if(character.getCheckElderDragon()==true) {attackElderDragonBuff=character.getElderDragonBuff();}else {attackElderDragonBuff=0;}
			attackDragonBuff=(character.getFireDragon()+character.getEarthDragon()+character.getWindDragon()+character.getSeaDragon())*10;
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					attackJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.40));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					attackJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					attackJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					attackJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					attackJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					attackJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyMid) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					attackMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					attackMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					attackMid=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.80));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					attackMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					attackMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					attackMid=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
			character.setGrowthPossible(false);
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyAdc) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					attackAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.80));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					attackAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.80)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					attackAdc=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*2));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					attackAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					attackAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					attackAdc=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMySupp) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					attackSupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.30));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					attackSupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					attackSupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					attackSupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					attackSupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					attackSupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyTop) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					defenceTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.70));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					defenceTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					defenceTop=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					defenceTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					defenceTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					defenceTop=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyJungler) {
			if (character.getCanyonGenie()==true) {defenceGenieBuff=character.getGenieBuff();}else {defenceGenieBuff=0;}
			if(character.getCheckBaron()==true) {defenceBaronBuff=character.getBaronbuff();}else {defenceBaronBuff=0;}
			if(character.getCheckElderDragon()==true) {defenceElderDragonBuff=character.getElderDragonBuff();}else {defenceElderDragonBuff=0;}
			defenceDragonBuff=(character.getFireDragon()+character.getEarthDragon()+character.getWindDragon()+character.getSeaDragon())*10;
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					defenceJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.40));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					defenceJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					defenceJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					defenceJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					defenceJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					defenceJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyMid) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					defenceMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					defenceMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					defenceMid=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.80));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					defenceMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					defenceMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					defenceMid=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
			character.setGrowthPossible(false);
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyAdc) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					defenceAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.80));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					defenceAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.80)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					defenceAdc=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*2));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					defenceAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					defenceAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					defenceAdc=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemySupp) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					defenceSupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.30));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					defenceSupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					defenceSupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					defenceSupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					defenceSupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					defenceSupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		if(orderNum==1) {
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyMid) {
				if (character.getCheckSuperPlay()==true) {
					damage=(attackTop+attackJungler+attackMid+attackAdc+attackSupp+attackGenieBuff+attackDragonBuff+attackBaronBuff+attackElderDragonBuff)
							-(defenceTop+defenceJungler+defenceMid+defenceAdc+defenceSupp+defenceGenieBuff+defenceDragonBuff+defenceBaronBuff+defenceElderDragonBuff);
				}
				else {damage=(attackTop+attackJungler+attackMid+attackAdc+attackSupp+attackGenieBuff+attackDragonBuff+attackBaronBuff+attackElderDragonBuff)
						-(defenceTop+defenceJungler+defenceAdc+defenceSupp+defenceGenieBuff+defenceDragonBuff+defenceBaronBuff+defenceElderDragonBuff);}
			}
		}
		else if(orderNum==2) {
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyAdc) {
				if (character.getCheckSuperPlay()==true) {
				damage=(attackTop+attackJungler+attackMid+attackAdc+attackSupp+attackGenieBuff+attackDragonBuff+attackBaronBuff+attackElderDragonBuff)
						-(defenceTop+defenceJungler+defenceMid+defenceAdc+defenceSupp+defenceGenieBuff+defenceDragonBuff+defenceBaronBuff+defenceElderDragonBuff);
			}
			else {damage=(attackTop+attackJungler+attackMid+attackAdc+attackSupp+attackGenieBuff+attackDragonBuff+attackBaronBuff+attackElderDragonBuff)
					-(defenceTop+defenceJungler+defenceMid+defenceSupp+defenceGenieBuff+defenceDragonBuff+defenceBaronBuff+defenceElderDragonBuff);}
			}	
		}
		else if(orderNum==3) {
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyTop) {
				if (character.getCheckSuperPlay()==true) {
				damage=(attackTop+attackJungler+attackMid+attackAdc+attackSupp+attackGenieBuff+attackDragonBuff+attackBaronBuff+attackElderDragonBuff)
						-(defenceTop+defenceJungler+defenceMid+defenceAdc+defenceSupp+defenceGenieBuff+defenceDragonBuff+defenceBaronBuff+defenceElderDragonBuff);
			}
			else {damage=(attackTop+attackJungler+attackMid+attackAdc+attackSupp+attackGenieBuff+attackDragonBuff+attackBaronBuff+attackElderDragonBuff)
					-(defenceJungler+defenceMid+defenceSupp+defenceGenieBuff+defenceDragonBuff+defenceBaronBuff+defenceElderDragonBuff);}
			}	
		}
		
	}

	public void bottomObjectTry(
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
		
		int tryTop=0;
		int tryJungler=0;
		int tryMid=0;
		int tryAdc=0;
		int trySupp=0;
		int denyTop=0;
		int denyJungler=0;
		int denyMid=0;
		int denyAdc=0;
		int denySupp=0;
		int tryGenieBuff=0;
		int tryDragonBuff=0;
		int tryBaronBuff=0;
		int tryElderDragonBuff=0;
		int denyGenieBuff=0;
		int denyDragonBuff=0;
		int denyBaronBuff=0;
		int denyElderDragonBuff=0;
		
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyTop) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.70));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
			if (character.getCanyonGenie()==true) {tryGenieBuff=character.getGenieBuff();}else {tryGenieBuff=0;}
			if(character.getCheckBaron()==true) {tryBaronBuff=character.getBaronbuff();}else {tryBaronBuff=0;}
			if(character.getCheckElderDragon()==true) {tryElderDragonBuff=character.getElderDragonBuff();}else {tryElderDragonBuff=0;}
			tryDragonBuff=(character.getFireDragon()+character.getEarthDragon()+character.getWindDragon()+character.getSeaDragon())*10;
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.40));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyMid) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					tryMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					tryMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					tryMid=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.80));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					tryMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					tryMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					tryMid=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
			character.setGrowthPossible(false);
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyAdc) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					tryAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.80));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					tryAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.80)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					tryAdc=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*2));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					tryAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					tryAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					tryAdc=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMySupp) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.30));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyTop) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.70));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyJungler) {
			if (character.getCanyonGenie()==true) {denyGenieBuff=character.getGenieBuff();}else {denyGenieBuff=0;}
			if(character.getCheckBaron()==true) {denyBaronBuff=character.getBaronbuff();}else {denyBaronBuff=0;}
			if(character.getCheckElderDragon()==true) {denyElderDragonBuff=character.getElderDragonBuff();}else {denyElderDragonBuff=0;}
			denyDragonBuff=(character.getFireDragon()+character.getEarthDragon()+character.getWindDragon()+character.getSeaDragon())*10;
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.40));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyMid) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					denyMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denyMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denyMid=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.80));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					denyMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					denyMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					denyMid=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
			character.setGrowthPossible(false);
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyAdc) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					denyAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.80));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denyAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.80)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denyAdc=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*2));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					denyAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					denyAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					denyAdc=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemySupp) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.30));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		if((tryTop+tryJungler+tryMid+tryMid+tryAdc+trySupp+tryGenieBuff+tryDragonBuff+tryBaronBuff+tryElderDragonBuff)
				-(denyTop+denyJungler+denyMid+denyAdc+denySupp+denyGenieBuff+denyDragonBuff+denyBaronBuff+denyElderDragonBuff)>=50){
			bottomObjectSuccess=true;
		}
	}

	public void topObjectTry(
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
		
		int tryTop=0;
		int tryJungler=0;
		int tryMid=0;
		int tryAdc=0;
		int trySupp=0;
		int denyTop=0;
		int denyJungler=0;
		int denyMid=0;
		int denyAdc=0;
		int denySupp=0;
		int tryGenieBuff=0;
		int tryDragonBuff=0;
		int tryBaronBuff=0;
		int tryElderDragonBuff=0;
		int denyGenieBuff=0;
		int denyDragonBuff=0;
		int denyBaronBuff=0;
		int denyElderDragonBuff=0;
		
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyTop) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.70));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
			if (character.getCanyonGenie()==true) {tryGenieBuff=character.getGenieBuff();}else {tryGenieBuff=0;}
			if(character.getCheckBaron()==true) {tryBaronBuff=character.getBaronbuff();}else {tryBaronBuff=0;}
			if(character.getCheckElderDragon()==true) {tryElderDragonBuff=character.getElderDragonBuff();}else {tryElderDragonBuff=0;}
			tryDragonBuff=(character.getFireDragon()+character.getEarthDragon()+character.getWindDragon()+character.getSeaDragon())*10;
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.40));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyMid) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					tryMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					tryMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					tryMid=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.80));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					tryMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					tryMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					tryMid=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
			character.setGrowthPossible(false);
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyAdc) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					tryAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.80));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					tryAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.80)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					tryAdc=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*2));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					tryAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					tryAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					tryAdc=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMySupp) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.30));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyTop) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.70));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyJungler) {
			if (character.getCanyonGenie()==true) {denyGenieBuff=character.getGenieBuff();}else {denyGenieBuff=0;}
			if(character.getCheckBaron()==true) {denyBaronBuff=character.getBaronbuff();}else {denyBaronBuff=0;}
			if(character.getCheckElderDragon()==true) {denyElderDragonBuff=character.getElderDragonBuff();}else {denyElderDragonBuff=0;}
			denyDragonBuff=(character.getFireDragon()+character.getEarthDragon()+character.getWindDragon()+character.getSeaDragon())*10;
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.40));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyMid) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					denyMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denyMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denyMid=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.80));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					denyMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					denyMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					denyMid=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
			character.setGrowthPossible(false);
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyAdc) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					denyAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.80));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denyAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.80)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denyAdc=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*2));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					denyAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					denyAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					denyAdc=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemySupp) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.30));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.70));	
				}
			}
			else if (character.getCheckSuperPlay()==false) {
				if("Offensive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
				else if ("Balancive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				else if ("Defensive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
				}
			}
		}
		if((tryTop+tryJungler+tryMid+tryMid+tryAdc+trySupp+tryGenieBuff+tryDragonBuff+tryBaronBuff+tryElderDragonBuff)
				-(denyTop+denyJungler+denyMid+denyAdc+denySupp+denyGenieBuff+denyDragonBuff+denyBaronBuff+denyElderDragonBuff)>=100){
			topObjectSuccess=true;
		}	
	}
}

