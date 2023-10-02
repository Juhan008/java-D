package battleSystem;

import java.util.ArrayList;

public class MidPhase {
	
public boolean topObjectSuccess=false;
public boolean bottomObjectSuccess=false;
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
				System.out.println("드래곤 선공팀 탑라이너가 합류하였습니다.(슈퍼플레이)");
				if("Offensive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
			if(character.getCanyonGenie()==true) {
				tryGenieBuff=character.getGenieBuff();
			}else {tryGenieBuff=0;}
			if(character.getCheckBaron()==true) {
				tryBaronBuff=character.getBaronbuff();
			}else {tryBaronBuff=0;}
			if(character.getCheckElderDragon()==true) {
				tryElderDragonBuff=character.getElderDragonBuff();
			}else {tryElderDragonBuff=0;}
			tryDragonBuff=(character.getFireDragon()+character.getEarthDragon()+character.getWindDragon()+character.getSeaDragon())*10;
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
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
					tryMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					tryMid=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
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
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyAdc) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					tryAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					tryAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					tryAdc=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
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
					trySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
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
				System.out.println("드래곤 방해팀 탑라이너가 합류하였습니다.(슈퍼플레이)");
				if("Offensive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
				}
			}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyJungler) {
			if(character.getCanyonGenie()==true) {
				denyGenieBuff=character.getGenieBuff();
			}else {denyGenieBuff=0;}
			if(character.getCheckBaron()==true) {
				denyBaronBuff=character.getBaronbuff();
			}else {denyBaronBuff=0;}
			if(character.getCheckElderDragon()==true) {
				denyElderDragonBuff=character.getElderDragonBuff();
			}else {denyElderDragonBuff=0;}
			denyDragonBuff=(character.getFireDragon()+character.getEarthDragon()+character.getWindDragon()+character.getSeaDragon())*10;
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
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
					denyMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denyMid=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
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
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyAdc) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					denyAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denyAdc=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denyAdc=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
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
					denySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
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
		if((tryTop+tryJungler+tryMid+tryMid+tryAdc+trySupp-30+tryGenieBuff+tryDragonBuff+tryBaronBuff+tryElderDragonBuff)
				-(denyTop+denyJungler+denyMid+denyAdc+denySupp+denyGenieBuff+denyDragonBuff+denyBaronBuff+denyElderDragonBuff)>=0){
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
		int trySupp=0;
		int denyTop=0;
		int denyJungler=0;
		int denyMid=0;
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
					tryTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					tryTop=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
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
			if(character.getCanyonGenie()==true) {
				tryGenieBuff=character.getGenieBuff();
			}else {tryGenieBuff=0;}
			if(character.getCheckBaron()==true) {
				tryBaronBuff=character.getBaronbuff();
			}else {tryBaronBuff=0;}
			if(character.getCheckElderDragon()==true) {
				tryElderDragonBuff=character.getElderDragonBuff();
			}else {tryElderDragonBuff=0;}
			tryDragonBuff=(character.getFireDragon()+character.getEarthDragon()+character.getWindDragon()+character.getSeaDragon())*10;
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					tryJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
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
					tryMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					tryMid=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
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
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMySupp) {
			if (character.getCheckSuperPlay()==true) {
				System.out.println("탑오브잭트 선공팀 서폿터가 합류하였습니다.(슈퍼플레이)");
				if("Offensive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					trySupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
				}	
			}	
		}for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyTop) {
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denyTop=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
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
			if(character.getCanyonGenie()==true) {
				denyGenieBuff=character.getGenieBuff();
			}else {denyGenieBuff=0;}
			if(character.getCheckBaron()==true) {
				denyBaronBuff=character.getBaronbuff();
			}else {denyBaronBuff=0;}
			if(character.getCheckElderDragon()==true) {
				denyElderDragonBuff=character.getElderDragonBuff();
			}else {denyElderDragonBuff=0;}
			denyDragonBuff=(character.getFireDragon()+character.getEarthDragon()+character.getWindDragon()+character.getSeaDragon())*10;
			if (character.getCheckSuperPlay()==true) {
				if("Offensive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denyJungler=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
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
					denyMid=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denyMid=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
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
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemySupp) {
			if (character.getCheckSuperPlay()==true) {
				System.out.println("탑오브잭트 방해팀 서폿터가 합류하였습니다.(슈퍼플레이)");
				if("Offensive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower())*1.50));
				}
				else if ("Balancive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getOperationalPower()+character.getAdditionalOperationalPower()+character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.50)/2);	
				}
				else if ("Defensive".equals(character.getLinerType())) {
					denySupp=(int) (((character.getTeamBattingPower()+character.getAdditionalTeamBattingPower())*1.60));	
				}	
			}	
		}
		if((tryTop+tryJungler+tryMid+tryMid+trySupp-30+tryGenieBuff+tryDragonBuff+tryBaronBuff+tryElderDragonBuff)
				-(denyTop+denyJungler+denyMid+denySupp+denyGenieBuff+denyDragonBuff+denyBaronBuff+denyElderDragonBuff)>=0){
			topObjectSuccess=true;
		}
	}
	public void reductionBuffTurn(
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
			if(character.getGenieTurns()>0) {character.setGenieTurns(character.getGenieTurns()-1);}
			else {character.setCanyonGenie(false);}
			if(character.getBaronTurns()>0) {character.setBaronTurns(character.getBaronTurns()-1);}
			else {character.setCheckBaron(false);}
			if(character.getElderDragonTurns()>0) {character.setElderDragonTurns(character.getElderDragonTurns()-1);}
			else {character.setCheckElderDragon(false);}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
			if(character.getGenieTurns()>0) {character.setGenieTurns(character.getGenieTurns()-1);}
			else {character.setCanyonGenie(false);}
			if(character.getBaronTurns()>0) {character.setBaronTurns(character.getBaronTurns()-1);}
			else {character.setCheckBaron(false);}
			if(character.getElderDragonTurns()>0) {character.setElderDragonTurns(character.getElderDragonTurns()-1);}
			else {character.setCheckElderDragon(false);}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyMid) {
			if(character.getGenieTurns()>0) {character.setGenieTurns(character.getGenieTurns()-1);}
			else {character.setCanyonGenie(false);}
			if(character.getBaronTurns()>0) {character.setBaronTurns(character.getBaronTurns()-1);}
			else {character.setCheckBaron(false);}
			if(character.getElderDragonTurns()>0) {character.setElderDragonTurns(character.getElderDragonTurns()-1);}
			else {character.setCheckElderDragon(false);}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyAdc) {
			if(character.getGenieTurns()>0) {character.setGenieTurns(character.getGenieTurns()-1);}
			else {character.setCanyonGenie(false);}
			if(character.getBaronTurns()>0) {character.setBaronTurns(character.getBaronTurns()-1);}
			else {character.setCheckBaron(false);}
			if(character.getElderDragonTurns()>0) {character.setElderDragonTurns(character.getElderDragonTurns()-1);}
			else {character.setCheckElderDragon(false);}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMySupp) {
			if(character.getGenieTurns()>0) {character.setGenieTurns(character.getGenieTurns()-1);}
			else {character.setCanyonGenie(false);}
			if(character.getBaronTurns()>0) {character.setBaronTurns(character.getBaronTurns()-1);}
			else {character.setCheckBaron(false);}
			if(character.getElderDragonTurns()>0) {character.setElderDragonTurns(character.getElderDragonTurns()-1);}
			else {character.setCheckElderDragon(false);}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyTop) {
			if(character.getGenieTurns()>0) {character.setGenieTurns(character.getGenieTurns()-1);}
			else {character.setCanyonGenie(false);}
			if(character.getBaronTurns()>0) {character.setBaronTurns(character.getBaronTurns()-1);}
			else {character.setCheckBaron(false);}
			if(character.getElderDragonTurns()>0) {character.setElderDragonTurns(character.getElderDragonTurns()-1);}
			else {character.setCheckElderDragon(false);}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyJungler) {
			if(character.getGenieTurns()>0) {character.setGenieTurns(character.getGenieTurns()-1);}
			else {character.setCanyonGenie(false);}
			if(character.getBaronTurns()>0) {character.setBaronTurns(character.getBaronTurns()-1);}
			else {character.setCheckBaron(false);}
			if(character.getElderDragonTurns()>0) {character.setElderDragonTurns(character.getElderDragonTurns()-1);}
			else {character.setCheckElderDragon(false);}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyMid) {
			if(character.getGenieTurns()>0) {character.setGenieTurns(character.getGenieTurns()-1);}
			else {character.setCanyonGenie(false);}
			if(character.getBaronTurns()>0) {character.setBaronTurns(character.getBaronTurns()-1);}
			else {character.setCheckBaron(false);}
			if(character.getElderDragonTurns()>0) {character.setElderDragonTurns(character.getElderDragonTurns()-1);}
			else {character.setCheckElderDragon(false);}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyAdc) {
			if(character.getGenieTurns()>0) {character.setGenieTurns(character.getGenieTurns()-1);}
			else {character.setCanyonGenie(false);}
			if(character.getBaronTurns()>0) {character.setBaronTurns(character.getBaronTurns()-1);}
			else {character.setCheckBaron(false);}
			if(character.getElderDragonTurns()>0) {character.setElderDragonTurns(character.getElderDragonTurns()-1);}
			else {character.setCheckElderDragon(false);}
		}
		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemySupp) {
			if(character.getGenieTurns()>0) {character.setGenieTurns(character.getGenieTurns()-1);}
			else {character.setCanyonGenie(false);}
			if(character.getBaronTurns()>0) {character.setBaronTurns(character.getBaronTurns()-1);}
			else {character.setCheckBaron(false);}
			if(character.getElderDragonTurns()>0) {character.setElderDragonTurns(character.getElderDragonTurns()-1);}
			else {character.setCheckElderDragon(false);}
		}
	}
}

