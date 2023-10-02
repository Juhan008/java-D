package battleSystem;

import java.util.ArrayList;
import java.util.Random;

import characterMangement.CharaterRegulation;

public class BottomObjectSystem {
    public int dragonKind = 0;
    public boolean dragonExistence = false;
    public int consecutiveDragonCount = 0;
    public int lastDragonAppearanceTurn = 0; // 용 잡은턴 저장
    
    public void DragonAppear(int Turn,
    		ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMyJungler,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlEnemyJungler) {
    	if (Turn>=6 && dragonExistence ==false) {
	    	int myDragon=0;
	    	int enemyDragon=0;
	    	
	    	for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMyJungler) {
	    		myDragon += character.getFireDragon();
	    		myDragon += character.getEarthDragon();
	    		myDragon += character.getWindDragon();
	    		myDragon += character.getSeaDragon();
	    	}
	    	for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlEnemyJungler) {
	    		enemyDragon += character.getFireDragon();
	    		enemyDragon += character.getEarthDragon();
	    		enemyDragon += character.getWindDragon();
	    		enemyDragon += character.getSeaDragon();
	    	}
	    	
	    	if(myDragon >=4 && enemyDragon>=4) {
	    		if (Turn - lastDragonAppearanceTurn >= 4) {
	    			dragonKind=5;
	    			dragonExistence = true;
	    			consecutiveDragonCount++;
	    			lastDragonAppearanceTurn = Turn;
	    			System.out.println("장로드래곤이 출현했습니다.");
	    		} else {
	                dragonExistence = false;	
	    		}
	    	}
	    	
	    	else {
	        // 현재 턴과 마지막 드래곤 출몰 턴의 차이가 4 이상이면 드래곤 출몰
	    		Random random = new Random();
	    		if (Turn - lastDragonAppearanceTurn >= 4) {
		            if (consecutiveDragonCount < 3) {
		                // 처음 세 번의 용은 다른 종류로 설정
		                dragonKind = random.nextInt(4) + 1; // 1부터 4까지 랜덤
		                } else {
		                // 3번째 이후에는 이전에 등장한 용의 종류로 설정
		                // 1, 2, 3, 4중 하나로 설정
		                dragonKind = (dragonKind % 4) + 1;
		            }
		            if (dragonKind==1){
		            	System.out.println("화염 드래곤이 출현했습니다.");
		            }
		            else if(dragonKind==2){
		            	System.out.println("대지 드래곤이 출현했습니다.");
		            }
		            else if(dragonKind==3){
		            	System.out.println("바람 드래곤이 출현했습니다.");
		            }
		            else if(dragonKind==2){
		            	System.out.println("바다 드래곤이 출현했습니다.");
		            }
		            // 용의 존재 여부
		            dragonExistence = true;
		            
		            // 용 잡은턴 턴 저장
		            lastDragonAppearanceTurn = Turn;
		            
		            // 연속 용 등장 횟수 증가
		            consecutiveDragonCount++;
		        } else {
		            dragonExistence = false;
		        }
	    	}
    	}
    	else {dragonExistence = false;}
    }
    public void DragonGain(
    		ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlTop,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlJungler,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMid,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlAdc,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlSupp) {
    	
    	if (dragonKind==1) {
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlTop) {
    			character.setFireDragon(character.getFireDragon()+1);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlJungler) {
    			character.setFireDragon(character.getFireDragon()+1);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMid) {
    			character.setFireDragon(character.getFireDragon()+1);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlAdc) {
    			character.setFireDragon(character.getFireDragon()+1);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlSupp) {
    			character.setFireDragon(character.getFireDragon()+1);
				}
    	}
    	else if (dragonKind==2) {
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlTop) {
    			character.setEarthDragon(character.getEarthDragon()+1);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlJungler) {
    			character.setEarthDragon(character.getEarthDragon()+1);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMid) {
    			character.setEarthDragon(character.getEarthDragon()+1);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlAdc) {
    			character.setEarthDragon(character.getEarthDragon()+1);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlSupp) {
    			character.setEarthDragon(character.getEarthDragon()+1);
				}
    	}
    	else if (dragonKind==3) {
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlTop) {
    			character.setWindDragon(character.getWindDragon()+1);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlJungler) {
    			character.setWindDragon(character.getWindDragon()+1);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMid) {
    			character.setWindDragon(character.getWindDragon()+1);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlAdc) {
    			character.setWindDragon(character.getWindDragon()+1);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlSupp) {
    			character.setWindDragon(character.getWindDragon()+1);
				}
    	}
    	else if (dragonKind==4) {
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlTop) {
    			character.setSeaDragon(character.getSeaDragon()+1);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlJungler) {
    			character.setSeaDragon(character.getSeaDragon()+1);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMid) {
    			character.setSeaDragon(character.getSeaDragon()+1);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlAdc) {
    			character.setSeaDragon(character.getSeaDragon()+1);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlSupp) {
    			character.setSeaDragon(character.getSeaDragon()+1);
				}
    	}
    	else if (dragonKind==5) {
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlTop) {
    			character.setCheckElderDragon(true);
    			character.setElderDragonTurns(2);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlJungler) {
    			character.setCheckElderDragon(true);
    			character.setElderDragonTurns(2);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMid) {
    			character.setCheckElderDragon(true);
    			character.setElderDragonTurns(2);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlAdc) {
    			character.setCheckElderDragon(true);
    			character.setElderDragonTurns(2);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlSupp) {
    			character.setCheckElderDragon(true);
    			character.setElderDragonTurns(2);
				}
    	}
        // 드래곤의 효과를 적용하는 메서드
    }
}
