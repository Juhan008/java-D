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
            	2, "Top", "Offensive", "적탑공이", 60, 60, 60, 90, true, 100, true
            );
            enemyTopLinerArl.add(top2);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top3 = new CharaterRegulation<>(
            	3, "Top", "Offensive", "적탑공삼", 70, 70, 70, 100, true, 100, true
            );
            enemyTopLinerArl.add(top3);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top4 = new CharaterRegulation<>(
            	4, "Top", "Offensive", "적탑공사", 80, 80, 80, 110, true, 100, true
            );
            enemyTopLinerArl.add(top4);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top5 = new CharaterRegulation<>(
                5, "Top", "Offensive", "적탑공오", 90, 90, 90, 120, true, 100, true
            );
            enemyTopLinerArl.add(top5);

            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top6 = new CharaterRegulation<>(
            	1, "Top", "Balancive", "적탑벨일", 50, 50, 50, 80, true, 100, true
            );
            enemyTopLinerArl.add(top6);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top7 = new CharaterRegulation<>(
            	2, "Top", "Balancive", "적탑벨이", 60, 60, 60, 90, true, 100, true
            );
            enemyTopLinerArl.add(top7);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top8 = new CharaterRegulation<>(
            	3, "Top", "Balancive", "적탑벨삼", 70, 70, 70, 100, true, 100, true
            );
            enemyTopLinerArl.add(top8);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top9 = new CharaterRegulation<>(
            	4, "Top", "Balancive", "적탑벨사", 80, 80, 80, 110, true, 100, true
            );
            enemyTopLinerArl.add(top9);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top10 = new CharaterRegulation<>(
                5, "Top", "Balancive", "적탑벨오", 90, 90, 90, 120, true, 100, true
            );
            enemyTopLinerArl.add(top10);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top11 = new CharaterRegulation<>(
            	1, "Top", "Defensive", "적탑방일", 50, 50, 50, 80, true, 100, true
            );
            enemyTopLinerArl.add(top11);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top12 = new CharaterRegulation<>(
            	2, "Top", "Defensive", "적탑방이", 60, 60, 60, 90, true, 100, true
            );
            enemyTopLinerArl.add(top12);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top13 = new CharaterRegulation<>(
            	3, "Top", "Defensive", "적탑방삼", 70, 70, 70, 100, true, 100, true
            );
            enemyTopLinerArl.add(top13);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top14 = new CharaterRegulation<>(
            	4, "Top", "Defensive", "적탑방사", 80, 80, 80, 110, true, 100, true
            );
            enemyTopLinerArl.add(top14);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top15 = new CharaterRegulation<>(
                5, "Top", "Defensive", "적탑방오", 90, 90, 90, 120, true, 100, true
            );
            enemyTopLinerArl.add(top15);   
    }
    public void addEnemyJunglers(){
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler1 = new CharaterRegulation<>(
	        	1, "jungler", "Offensive", "적정공일", 50, 50, 50, 80, true, 100, true
	        );
	        enemyJunglerArl.add(jungler1);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler2 = new CharaterRegulation<>(
	        	2, "jungler", "Offensive", "적정공이", 60, 60, 60, 90, true, 100, true
	        );
	        enemyJunglerArl.add(jungler2);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler3 = new CharaterRegulation<>(
	        	3, "jungler", "Offensive", "적정공삼", 70, 70, 70, 100, true, 100, true
	        );
	        enemyJunglerArl.add(jungler3);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler4 = new CharaterRegulation<>(
	        	4, "jungler", "Offensive", "적정공사", 80, 80, 80, 110, true, 100, true
	        );
	        enemyJunglerArl.add(jungler4);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler5 = new CharaterRegulation<>(
	            5, "jungler", "Offensive", "적정공오", 90, 90, 90, 120, true, 100, true
	        );
	        enemyJunglerArl.add(jungler5);
	
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler6 = new CharaterRegulation<>(
	        	1, "jungler", "Balancive", "적정벨일", 50, 50, 50, 80, true, 100, true
	        );
	        enemyJunglerArl.add(jungler6);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler7 = new CharaterRegulation<>(
	        	2, "jungler", "Balancive", "적정벨이", 60, 60, 60, 90, true, 100, true
	        );
	        enemyJunglerArl.add(jungler7);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler8 = new CharaterRegulation<>(
	        	3, "jungler", "Balancive", "적정벨삼", 70, 70, 70, 100, true, 100, true
	        );
	        enemyJunglerArl.add(jungler8);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler9 = new CharaterRegulation<>(
	        	4, "jungler", "Balancive", "적정벨사", 80, 80, 80, 110, true, 100, true
	        );
	        enemyJunglerArl.add(jungler9);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler10 = new CharaterRegulation<>(
	            5, "jungler", "Balancive", "적정벨오", 90, 90, 90, 120, true, 100, true
	        );
	        enemyJunglerArl.add(jungler10);
	
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler11 = new CharaterRegulation<>(
	        	1, "jungler", "Defensive", "적정방일", 50, 50, 50, 80, true, 100, true
	        );
	        enemyJunglerArl.add(jungler11);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler12 = new CharaterRegulation<>(
	        	2, "jungler", "Defensive", "적정방이", 60, 60, 60, 90, true, 100, true
	        );
	        enemyJunglerArl.add(jungler12);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler13 = new CharaterRegulation<>(
	        	3, "jungler", "Defensive", "적정방삼", 70, 70, 70, 100, true, 100, true
	        );
	        enemyJunglerArl.add(jungler13);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler14 = new CharaterRegulation<>(
	        	4, "jungler", "Defensive", "적정방사", 80, 80, 80, 110, true, 100, true
	        );
	        enemyJunglerArl.add(jungler14);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler15 = new CharaterRegulation<>(
	            5, "jungler", "Defensive", "적정방오", 90, 90, 90, 120, true, 100, true
	        );
	        enemyJunglerArl.add(jungler15);
	
	}
    public void addEnemyMidLiners() {
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid1 = new CharaterRegulation<>(
	            1, "Mid", "Offensive", "적미공일", 50, 50, 50, 80, true, 100, true
	        );
	        enemyMidLinerArl.add(mid1);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid2 = new CharaterRegulation<>(
	            2, "Mid", "Offensive", "적미공이", 60, 60, 60, 90, true, 100, true
	        );
	        enemyMidLinerArl.add(mid2);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid3 = new CharaterRegulation<>(
		        3, "Mid", "Offensive", "적미공삼", 70, 70, 70, 100, true, 100, true
		    );
	        enemyMidLinerArl.add(mid3);
		    CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid4 = new CharaterRegulation<>(
				4, "Mid", "Offensive", "적미공사", 80, 80, 80, 110, true, 100, true
			);
		    enemyMidLinerArl.add(mid4);
			CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid5 = new CharaterRegulation<>(
				5, "Mid", "Offensive", "적미공오", 90, 90, 90, 120, true, 100, true
			);
			enemyMidLinerArl.add(mid5);
			
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid6 = new CharaterRegulation<>(
	            1, "Mid", "Balancive", "적미벨일", 50, 50, 50, 80, true, 100, true
	        );
	        enemyMidLinerArl.add(mid6);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid7 = new CharaterRegulation<>(
	            2, "Mid", "Balancive", "적미벨이", 60, 60, 60, 90, true, 100, true
	        );
	        enemyMidLinerArl.add(mid7);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid8 = new CharaterRegulation<>(
		        3, "Mid", "Balancive", "적미벨삼", 70, 70, 70, 100, true, 100, true
		    );
	        enemyMidLinerArl.add(mid8);
		    CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid9 = new CharaterRegulation<>(
				4, "Mid", "Balancive", "적미벨사", 80, 80, 80, 110, true, 100, true
			);
		    enemyMidLinerArl.add(mid9);
			CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid10 = new CharaterRegulation<>(
				5, "Mid", "Balancive", "적미벨오", 90, 90, 90, 120, true, 100, true
			);
			enemyMidLinerArl.add(mid10);

	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid11 = new CharaterRegulation<>(
	            1, "Mid", "Defensive", "적미방일", 50, 50, 50, 80, true, 100, true
	        );
	        enemyMidLinerArl.add(mid11);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid12 = new CharaterRegulation<>(
	            2, "Mid", "Defensive", "적미방이", 60, 60, 60, 90, true, 100, true
	        );
	        enemyMidLinerArl.add(mid12);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid13 = new CharaterRegulation<>(
		        3, "Mid", "Defensive", "적미방삼", 70, 70, 70, 100, true, 100, true
		    );
	        enemyMidLinerArl.add(mid13);
		    CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid14 = new CharaterRegulation<>(
				4, "Mid", "Defensive", "적미방사", 80, 80, 80, 110, true, 100, true
			);
		    enemyMidLinerArl.add(mid14);
			CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid15 = new CharaterRegulation<>(
				5, "Mid", "Offensive", "적미방오", 90, 90, 90, 120, true, 100, true
			);
			enemyMidLinerArl.add(mid15);
	}
    public void addEnemyAdCarries() {
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc1 = new CharaterRegulation<>(
	            1, "Adc", "Offensive", "적원공일", 50, 50, 50, 80, true, 100, true
	        );
	        enemyAdcArl.add(adc1);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc2 = new CharaterRegulation<>(
	            2, "Adc", "Offensive", "적원공이", 60, 60, 60, 90, true, 100, true
	        );
	        enemyAdcArl.add(adc2);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc3 = new CharaterRegulation<>(
	            3, "Adc", "Offensive", "적원공삼", 70, 70, 70, 100, true, 100, true
	        );
	        enemyAdcArl.add(adc3);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc4 = new CharaterRegulation<>(
	            4, "Adc", "Offensive", "적원공사", 80, 80, 80, 110, true, 100, true
	        );
	        enemyAdcArl.add(adc4);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc5 = new CharaterRegulation<>(
	            5, "Adc", "Offensive", "적원공오", 90, 90, 90, 120, true, 100, true
	        );
	        enemyAdcArl.add(adc5);
   
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc6 = new CharaterRegulation<>(
	            1, "Adc", "Balancive", "적원벨일", 50, 50, 50, 80, true, 100, true
	        );
	        enemyAdcArl.add(adc6);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc7 = new CharaterRegulation<>(
	            2, "Adc", "Balancive", "적원벨이", 60, 60, 60, 90, true, 100, true
	        );
	        enemyAdcArl.add(adc7);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc8 = new CharaterRegulation<>(
	            3, "Adc", "Balancive", "적원벨삼", 70, 70, 70, 100, true, 100, true
	        );
	        enemyAdcArl.add(adc8);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc9 = new CharaterRegulation<>(
	            4, "Adc", "Balancive", "적원벨사", 80, 80, 80, 110, true, 100, true
	        );
	        enemyAdcArl.add(adc9);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc10 = new CharaterRegulation<>(
	            5, "Adc", "Balancive", "적원벨오", 90, 90, 90, 120, true, 100, true
	        );
	        enemyAdcArl.add(adc10);
    
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc11 = new CharaterRegulation<>(
	            1, "Adc", "Defensive", "적원방일", 50, 50, 50, 80, true, 100, true
	        );
	        enemyAdcArl.add(adc11);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc12 = new CharaterRegulation<>(
	            2, "Adc", "Defensive", "적원방이", 60, 60, 60, 90, true, 100, true
	        );
	        enemyAdcArl.add(adc12);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc13 = new CharaterRegulation<>(
	            3, "Adc", "Defensive", "적원방삼", 70, 70, 70, 100, true, 100, true
	        );
	        enemyAdcArl.add(adc13);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc14 = new CharaterRegulation<>(
	            4, "Adc", "Defensive", "적원방사", 80, 80, 80, 110, true, 100, true
	        );
	        enemyAdcArl.add(adc14);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc15 = new CharaterRegulation<>(
	            5, "Adc", "Defensive", "적원방오", 90, 90, 90, 120, true, 100, true
	        );
	        enemyAdcArl.add(adc15);
    }
    public void addEnemySupporters() {
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp1 = new CharaterRegulation<>(
	            1, "Supporter", "Offensive", "적서공일", 50, 50, 50, 80, true, 100, true
	        );
	        enemySupporterArl.add(supp1);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp2 = new CharaterRegulation<>(
	            2, "Supporter", "Offensive", "적서공이", 60, 60, 60, 90, true, 100, true
	        );
	        enemySupporterArl.add(supp2);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp3 = new CharaterRegulation<>(
	            3, "Supporter", "Offensive", "적서공삼", 70, 70, 70, 100, true, 100, true
	        );
	        enemySupporterArl.add(supp3);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp4 = new CharaterRegulation<>(
	            4, "Supporter", "Offensive", "적서공사", 80, 80, 80, 110, true, 100, true
	        );
	        enemySupporterArl.add(supp4);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp5 = new CharaterRegulation<>(
	            5, "Supporter", "Offensive", "적서공오", 90, 90, 90, 120, true, 100, true
	        );
	        enemySupporterArl.add(supp5);
   
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp6 = new CharaterRegulation<>(
	            1, "Supporter", "Balancive", "적서벨일", 50, 50, 50, 80, true, 100, true
	        );
	        enemySupporterArl.add(supp6);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp7 = new CharaterRegulation<>(
	            2, "Supporter", "Balancive", "적서벨이", 60, 60, 60, 90, true, 100, true
	        );
	        enemySupporterArl.add(supp7);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp8 = new CharaterRegulation<>(
	            3, "Supporter", "Balancive", "적서벨삼", 70, 70, 70, 100, true, 100, true
	        );
	        enemySupporterArl.add(supp8);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp9 = new CharaterRegulation<>(
	            4, "Supporter", "Balancive", "적서벨사", 80, 80, 80, 110, true, 100, true
	        );
	        enemySupporterArl.add(supp9);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp10 = new CharaterRegulation<>(
	            5, "Supporter", "Balancive", "적서벨오", 90, 90, 90, 120, true, 100, true
	        );
	        enemySupporterArl.add(supp10);
    
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp11 = new CharaterRegulation<>(
	            1, "Supporter", "Defensive", "적서방일", 50, 50, 50, 80, true, 100, true
	        );
	        enemySupporterArl.add(supp11);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp12 = new CharaterRegulation<>(
	            2, "Supporter", "Defensive", "적서방이", 60, 60, 60, 90, true, 100, true
	        );
	        enemySupporterArl.add(supp12);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp13 = new CharaterRegulation<>(
	            3, "Supporter", "Defensive", "적서방삼", 70, 70, 70, 100, true, 100, true
	        );
	        enemySupporterArl.add(supp13);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp14 = new CharaterRegulation<>(
	            4, "Supporter", "Defensive", "적서방사", 80, 80, 80, 110, true, 100, true
	        );
	        enemySupporterArl.add(supp14);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp15 = new CharaterRegulation<>(
	            5, "Supporter", "Defensive", "적서방오", 90, 90, 90, 120, true, 100, true
	        );
	        enemySupporterArl.add(supp15);
    }
}