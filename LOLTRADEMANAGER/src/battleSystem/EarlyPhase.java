package battleSystem;

import java.util.ArrayList;
import java.util.Random;



public class EarlyPhase {

	public int damage=0;
	
	int Random =0;
	Random random = new Random();
	public void myTeamsuperPlayActivate(int orderNum, int myLiner, int myJungler, int enemyLiner,
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
		if(orderNum ==1) {
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyTop) {
				 
				if (myLiner >= 1 && myLiner <= 10) {
			            Random random = new Random(myLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);
			           System.out.println("공격팀 라이너 슈퍼플레이 ON!");}
			           else {character.setCheckSuperPlay(false);}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
				if (myJungler >= 1 && myJungler <= 10) {
		            Random random = new Random(myLiner);

		            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
		           if(result==1) {character.setCheckSuperPlay(true);
		           System.out.println("공격팀 정글러 슈퍼플레이 ON!");}
		           else {character.setCheckSuperPlay(false);}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyTop) {
				if (enemyLiner >= 1 && enemyLiner <= 10) {
			            Random random = new Random(enemyLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);
			           System.out.println("수비팀 라이너 슈퍼플레이 ON!");}
			           else {character.setCheckSuperPlay(false);}
				}
			}
		
		}
		if(orderNum ==2) {
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyMid) {
				 
				if (myLiner >= 1 && myLiner <= 10) {
			            Random random = new Random(myLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);
			           System.out.println("공격팀 라이너 슈퍼플레이 ON!");}
			           else {character.setCheckSuperPlay(false);}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
				if (myJungler >= 1 && myJungler <= 10) {
		            Random random = new Random(myLiner);

		            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
		           if(result==1) {character.setCheckSuperPlay(true);
		           System.out.println("공격팀 정글러 슈퍼플레이 ON!");}
		           else {character.setCheckSuperPlay(false);}
			}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyMid) {
				if (enemyLiner >= 1 && enemyLiner <= 10) {
			            Random random = new Random(enemyLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);
			           System.out.println("수비팀 라이너 슈퍼플레이 ON!");}
			           else {character.setCheckSuperPlay(false);}
				}
			}
		
		}
		if(orderNum ==3) {
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyAdc) {
				 
				if (myLiner >= 1 && myLiner <= 10) {
			            Random random = new Random(myLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);
			           System.out.println("공격팀 라이너 슈퍼플레이 ON!");}
			           else {character.setCheckSuperPlay(false);}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMySupp) {
					 
					if (myLiner >= 1 && myLiner <= 10) {
				            Random random = new Random(myLiner);

				            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
				           if(result==1) {character.setCheckSuperPlay(true);
				           System.out.println("공격팀 서포터 슈퍼플레이 ON!");}
				           else {character.setCheckSuperPlay(false);}
					}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
				if (myJungler >= 1 && myJungler <= 10) {
		            Random random = new Random(myLiner);

		            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
		           if(result==1) {character.setCheckSuperPlay(true);
		           System.out.println("공격팀 정글러 슈퍼플레이 ON!");}
		           else {character.setCheckSuperPlay(false);}
			}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyAdc) {
				if (enemyLiner >= 1 && enemyLiner <= 10) {
			            Random random = new Random(enemyLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);
			           System.out.println("수비팀 라이너 슈퍼플레이 ON!");}
			           else {character.setCheckSuperPlay(false);}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemySupp) {
				if (enemyLiner >= 1 && enemyLiner <= 10) {
			            Random random = new Random(enemyLiner);

			            int result = random.nextInt(100) < (character.getSuperPlay()/10) ? 1 : 0;
			           if(result==1) {character.setCheckSuperPlay(true);
			           System.out.println("수비팀 서포터 슈퍼플레이 ON!");}
			           else {character.setCheckSuperPlay(false);}
				}
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
		int attackLiner=0;
		int attackSupp=0;
		int attackJungler=0;
		int gankingedLiner=0;
		int gankingedSupp=0;
		int genieBuff=0;
		int dragonBuff=0;
		int baronBuff=0;
		int elderDragonBuff=0;
		damage=0;
		//boolean gankingSuccess =false;
		
		if(orderNum ==1) {
			attackSupp=0;
			gankingedSupp=0;
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyTop) {
				if (character.getCheckSuperPlay()==true) {
					if("Offensive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.70));
					}
					else if ("Balancive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
					}
					else if ("Defensive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.30));	
					}
				}
				else if (character.getCheckSuperPlay()==false) {
					if("Offensive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
						}
					else if ("Balancive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
						}
					else if ("Defensive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
						}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
				if(character.getCanyonGenie()==true) {
					genieBuff=character.getGenieBuff();
				}else {genieBuff=0;}
				if(character.getCheckBaron()==true) {
					baronBuff=character.getBaronbuff();
				}else {baronBuff=0;}
				if(character.getCheckElderDragon()==true) {
					elderDragonBuff=character.getElderDragonBuff();
				}else {elderDragonBuff=0;}
				dragonBuff=(character.getFireDragon()+character.getEarthDragon()+character.getWindDragon()+character.getSeaDragon())*10;
				if (character.getCheckSuperPlay()==true) {
					if("Offensive".equals(character.getLinerType())) {
						attackJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.40));
					}
					else if ("Balancive".equals(character.getLinerType())) {
						attackJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.40)/2);	
					}
					else if ("Defensive".equals(character.getLinerType())) {
						attackJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.30));	
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
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyTop) {
				if (character.getCheckSuperPlay()==true) {
					if("Offensive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.40));
					}
					else if ("Balancive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.40)/2);	
					}
					else if ("Defensive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.30));	
					}
				}
				else if (character.getCheckSuperPlay()==false) {
					if("Offensive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
						}
					else if ("Balancive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
						}
					else if ("Defensive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				}
				character.setGrowthPossible(false);
			}
		}
		else if(orderNum ==2) {
			attackSupp=0;
			gankingedSupp=0;
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyMid) {
				if (character.getCheckSuperPlay()==true) {
					if("Offensive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.70));
					}
					else if ("Balancive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
					}
					else if ("Defensive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.30));	
					}
				}
				else if (character.getCheckSuperPlay()==false) {
					if("Offensive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
						}
					else if ("Balancive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
						}
					else if ("Defensive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
				if(character.getCanyonGenie()==true) {
					genieBuff=character.getGenieBuff();
				}else {genieBuff=0;}
				if(character.getCheckBaron()==true) {
					baronBuff=character.getBaronbuff();
				}else {baronBuff=0;}
				if(character.getCheckElderDragon()==true) {
					elderDragonBuff=character.getElderDragonBuff();
				}else {elderDragonBuff=0;}
				dragonBuff=(character.getFireDragon()+character.getEarthDragon()+character.getWindDragon()+character.getSeaDragon())*10;
				if (character.getCheckSuperPlay()==true) {
					if("Offensive".equals(character.getLinerType())) {
						attackJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.40));
					}
					else if ("Balancive".equals(character.getLinerType())) {
						attackJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.40)/2);	
					}
					else if ("Defensive".equals(character.getLinerType())) {
						attackJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.30));	
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
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyMid) {
				if (character.getCheckSuperPlay()==true) {
					if("Offensive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.40));
					}
					else if ("Balancive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.40)/2);	
					}
					else if ("Defensive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.30));	
					}
				}
				else if (character.getCheckSuperPlay()==false) {
					if("Offensive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
						}
					else if ("Balancive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
						}
					else if ("Defensive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				}
				character.setGrowthPossible(false);
			}
		}
		if(orderNum ==3) {
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyAdc) {
				if (character.getCheckSuperPlay()==true) {
					if("Offensive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.70));
					}
					else if ("Balancive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
					}
					else if ("Defensive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.30));	
					}
				}
				else if (character.getCheckSuperPlay()==false) {
					if("Offensive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
						}
					else if ("Balancive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
						}
					else if ("Defensive".equals(character.getLinerType())) {
						attackLiner=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				}
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMySupp) {
				if (character.getCheckSuperPlay()==true) {
					if("Offensive".equals(character.getLinerType())) {
						attackSupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.70));
					}
					else if ("Balancive".equals(character.getLinerType())) {
						attackSupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
					}
					else if ("Defensive".equals(character.getLinerType())) {
						attackSupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.30));	
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
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
				if(character.getCanyonGenie()==true) {
					genieBuff=character.getGenieBuff();
				}else {genieBuff=0;}
				if(character.getCheckBaron()==true) {
					baronBuff=character.getBaronbuff();
				}else {baronBuff=0;}
				if(character.getCheckElderDragon()==true) {
					elderDragonBuff=character.getElderDragonBuff();
				}else {elderDragonBuff=0;}
				dragonBuff=(character.getFireDragon()+character.getEarthDragon()+character.getWindDragon()+character.getSeaDragon())*10;
				if (character.getCheckSuperPlay()==true) {
					if("Offensive".equals(character.getLinerType())) {
						attackJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.40));
					}
					else if ("Balancive".equals(character.getLinerType())) {
						attackJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.40)/2);	
					}
					else if ("Defensive".equals(character.getLinerType())) {
						attackJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.30));	
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
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyTop) {
				if (character.getCheckSuperPlay()==true) {
					if("Offensive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.40));
					}
					else if ("Balancive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.40)/2);	
					}
					else if ("Defensive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.30));	
					}
				}
				else if (character.getCheckSuperPlay()==false) {
					if("Offensive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
					}
					else if ("Balancive".equals(character.getLinerType())) {
						gankingedLiner=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
					else if ("Defensive".equals(character.getLinerType())) {
					gankingedLiner=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				}
				character.setGrowthPossible(false);
			}
			for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemySupp) {
				if (character.getCheckSuperPlay()==true) {
					if("Offensive".equals(character.getLinerType())) {
						gankingedSupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.40));
					}
					else if ("Balancive".equals(character.getLinerType())) {
						gankingedSupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.40)/2);	
					}
					else if ("Defensive".equals(character.getLinerType())) {
						gankingedSupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.30));	
					}
				}
				else if (character.getCheckSuperPlay()==false) {
					if("Offensive".equals(character.getLinerType())) {
						gankingedSupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())));
						}
					else if ("Balancive".equals(character.getLinerType())) {
						gankingedSupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
						}
					else if ("Defensive".equals(character.getLinerType())) {
					gankingedSupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())));	
					}
				}
				character.setGrowthPossible(false);
			}	
		}
		damage =(attackLiner+attackSupp+attackJungler+genieBuff+dragonBuff+baronBuff+elderDragonBuff)-(gankingedLiner+gankingedSupp);
	}
}
