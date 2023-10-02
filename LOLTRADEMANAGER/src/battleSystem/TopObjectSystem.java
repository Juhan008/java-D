package battleSystem;

import java.util.ArrayList;


public class TopObjectSystem {
	    
	public int genieRemainingTurns = 0;
	public boolean objectExistence = false;
	public int objectKind = 0;  
	public int lastBaronAppearanceTurn = 0; // 바론 잡은턴 저장
	public int lastgenieAppearanceTurn = 0;    
	   
	public void genieAppear(int Turn) {
	    if(Turn >= 6 && objectExistence==false) {
			if(Turn >= 20) {
		    		if (Turn-lastBaronAppearanceTurn>=4) {
		    			objectKind=2;
		    			objectExistence = true;		
		    			lastBaronAppearanceTurn = Turn;
		    			System.out.println("내셔 남작이 등장하였습니다.");
		    		} else {
		    			objectExistence = false;	
		    		}
		    	}
			else if(Turn >= 6 && Turn < 20) {
		    		if (Turn - lastgenieAppearanceTurn >= 4) {
		    			objectKind=1;
		    			objectExistence = true;	
		    			lastgenieAppearanceTurn = Turn;
		    			System.out.println("협곡 정령이 등장하였습니다.");
			          }
			        } else {
			        	objectExistence = false;
			        }
	    }else {objectExistence = false;}
	}
	public void topObjectGain(
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlTop,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlJungler,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlMid,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlAdc,
			ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> inputArlSupp) {
    	
    	if (objectKind==1) {
    		
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlJungler) {
    			character.setCanyonGenie(true);
    			character.setGenieTurns(2);
    			character.setExeStack(character.getExeStack()+50);
				}
    	}
    	else if (objectKind==2) {
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlTop) {
    			character.setCheckBaron(true);
    			character.setBaronTurns(2);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlJungler) {
    			character.setCheckBaron(true);
    			character.setBaronTurns(2);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlMid) {
    			character.setCheckBaron(true);
    			character.setBaronTurns(2);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlAdc) {
    			character.setCheckBaron(true);
    			character.setBaronTurns(2);
				}
    		for (BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer> character : inputArlSupp) {
    			character.setCheckBaron(true);
    			character.setBaronTurns(2);
				}
    	}
        // 탑오브잭트의 효과를 적용하는 메서드
    }
}
