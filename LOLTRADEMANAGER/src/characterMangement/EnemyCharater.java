package characterMangement;

import java.util.ArrayList;

public class EnemyCharater {
    
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> enemyTopLinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> enemyJunglerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> enemyMidLinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> enemyAdcArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> enemySupporterArl = new ArrayList<>();
   
   
    public void addEnemyTopLiners() {
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top1 = new CharaterRegulation<>(
            	1, "Top", "Offensive", "적탑공일", 50, 50, 50, 80, true, 100, true
            );
            enemyTopLinerArl.add(top1);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top2 = new CharaterRegulation<>(
            	2, "Top", "Offensive", "적탑공이", 50, 50, 50, 80, true, 100, true
            );
            enemyTopLinerArl.add(top2);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top3 = new CharaterRegulation<>(
            	3, "Top", "Offensive", "적탑공삼", 50, 50, 50, 80, true, 100, true
            );
            enemyTopLinerArl.add(top3);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top4 = new CharaterRegulation<>(
            	4, "Top", "Offensive", "적탑공사", 50, 50, 50, 80, true, 100, true
            );
            enemyTopLinerArl.add(top4);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top5 = new CharaterRegulation<>(
                5, "Top", "Offensive", "적탑공오", 50, 50, 50, 80, true, 100, true
            );
            enemyTopLinerArl.add(top5);
    }
    public void addEnemyJunglers() {
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler1 = new CharaterRegulation<>(
	        	1, "jungler", "Offensive", "적정공일", 50, 50, 50, 80, true, 100, true
	        );
	        enemyJunglerArl.add(jungler1);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler2 = new CharaterRegulation<>(
	        	2, "jungler", "Offensive", "적정공사", 50, 50, 50, 80, true, 100, true
	        );
	        enemyJunglerArl.add(jungler2);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler3 = new CharaterRegulation<>(
	        	3, "jungler", "Offensive", "적정공삼", 50, 50, 50, 80, true, 100, true
	        );
	        enemyJunglerArl.add(jungler3);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler4 = new CharaterRegulation<>(
	        	4, "jungler", "Offensive", "적정공사", 50, 50, 50, 80, true, 100, true
	        );
	        enemyJunglerArl.add(jungler4);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler5 = new CharaterRegulation<>(
	            5, "jungler", "Offensive", "적정공오", 50, 50, 50, 80, true, 100, true
	        );
	        enemyJunglerArl.add(jungler5);
	}
    public void addEnemyMidLiners() {
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid1 = new CharaterRegulation<>(
	            1, "Mid", "Offensive", "적미공일", 50, 50, 50, 80, true, 100, true
	        );
	        enemyMidLinerArl.add(mid1);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid2 = new CharaterRegulation<>(
	            2, "Mid", "Offensive", "적미공사", 50, 50, 50, 80, true, 100, true
	        );
	        enemyMidLinerArl.add(mid2);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid3 = new CharaterRegulation<>(
		        3, "Mid", "Offensive", "적미공삼", 50, 50, 50, 80, true, 100, true
		    );
	        enemyMidLinerArl.add(mid3);
		    CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid4 = new CharaterRegulation<>(
				4, "Mid", "Offensive", "적미공사", 50, 50, 50, 80, true, 100, true
			);
		    enemyMidLinerArl.add(mid4);
			CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid5 = new CharaterRegulation<>(
				5, "Mid", "Offensive", "적미공오", 50, 50, 50, 80, true, 100, true
			);
			enemyMidLinerArl.add(mid5);
	}
    public void addEnemyAdCarries() {
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc1 = new CharaterRegulation<>(
	            1, "Adc", "Offensive", "적원공일", 50, 50, 50, 80, true, 100, true
	        );
	        enemyAdcArl.add(adc1);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc2 = new CharaterRegulation<>(
	            2, "Adc", "Offensive", "적원공이", 50, 50, 50, 80, true, 100, true
	        );
	        enemyAdcArl.add(adc2);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc3 = new CharaterRegulation<>(
	            3, "Adc", "Offensive", "적원공삼", 50, 50, 50, 80, true, 100, true
	        );
	        enemyAdcArl.add(adc3);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc4 = new CharaterRegulation<>(
	            4, "Adc", "Offensive", "적원공사", 50, 50, 50, 80, true, 100, true
	        );
	        enemyAdcArl.add(adc4);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc5 = new CharaterRegulation<>(
	            5, "Adc", "Offensive", "적원공오", 50, 50, 50, 80, true, 100, true
	        );
	        enemyAdcArl.add(adc5);
    }
    public void addEnemySupporters() {
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp1 = new CharaterRegulation<>(
	            1, "Supporter", "Offensive", "적서공일", 50, 50, 50, 80, true, 100, true
	        );
	        enemySupporterArl.add(supp1);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp2 = new CharaterRegulation<>(
	            2, "Supporter", "Offensive", "적서공이", 50, 50, 50, 80, true, 100, true
	        );
	        enemySupporterArl.add(supp2);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp3 = new CharaterRegulation<>(
	            3, "Supporter", "Offensive", "적서공삼", 50, 50, 50, 80, true, 100, true
	        );
	        enemySupporterArl.add(supp3);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp4 = new CharaterRegulation<>(
	            4, "Supporter", "Offensive", "적서공사", 50, 50, 50, 80, true, 100, true
	        );
	        enemySupporterArl.add(supp4);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp5 = new CharaterRegulation<>(
	            5, "Supporter", "Offensive", "적서공오", 50, 50, 50, 80, true, 100, true
	        );
	        enemySupporterArl.add(supp5);
    }
}