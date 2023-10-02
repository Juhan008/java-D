package characterMangement;

import java.util.ArrayList;

public class PlayerCharacter {
	
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> topLinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> junglerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> midLinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> adcArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> supporterArl = new ArrayList<>();
   // 등급 포지션 타입 이름 성장력 운영력 한타력 슈퍼플레이 장착유무 구매 가격 이적유무
   
    public void addTopLiners() {
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top1 = new CharaterRegulation<>(
            	1, "Top", "Offensive", "탑공일", 50, 50, 50, 80, true, 100, true
            );
            topLinerArl.add(top1);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top2 = new CharaterRegulation<>(
            	2, "Top", "Offensive", "탑공이", 60, 60, 60, 90, false, 100, false
            );
            topLinerArl.add(top2);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top3 = new CharaterRegulation<>(
            	3, "Top", "Offensive", "탑공삼", 70, 70, 70, 100, false, 100, false
            );
            topLinerArl.add(top3);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top4 = new CharaterRegulation<>(
            	4, "Top", "Offensive", "탑공사", 80, 80, 80, 110, false, 100, false
            );
            topLinerArl.add(top4);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top5 = new CharaterRegulation<>(
                5, "Top", "Offensive", "탑공오", 90, 90, 90, 120, false, 100, false
            );
            topLinerArl.add(top5);

            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top6 = new CharaterRegulation<>(
            	1, "Top", "Balancive", "탑벨일", 50, 50, 50, 80, false, 100, true
            );
            topLinerArl.add(top6);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top7 = new CharaterRegulation<>(
            	2, "Top", "Balancive", "탑벨이", 60, 60, 60, 90, false, 100, false
            );
            topLinerArl.add(top7);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top8 = new CharaterRegulation<>(
            	3, "Top", "Balancive", "탑벨삼", 70, 70, 70, 100, false, 100, false
            );
            topLinerArl.add(top8);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top9 = new CharaterRegulation<>(
            	4, "Top", "Balancive", "탑벨사", 80, 80, 80, 110, false, 100, false
            );
            topLinerArl.add(top9);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top10 = new CharaterRegulation<>(
                5, "Top", "Balancive", "탑벨오", 90, 90, 90, 120, false, 100, false
            );
            topLinerArl.add(top10);

            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top11 = new CharaterRegulation<>(
            	1, "Top", "Defensive", "탑방일", 50, 50, 50, 80, false, 100, true
            );
            topLinerArl.add(top11);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top12 = new CharaterRegulation<>(
            	2, "Top", "Defensive", "탑방이", 60, 60, 60, 90, false, 100, false
            );
            topLinerArl.add(top12);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top13 = new CharaterRegulation<>(
            	3, "Top", "Defensive", "탑방삼", 70, 70, 70, 100, false, 100, false
            );
            topLinerArl.add(top13);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top14 = new CharaterRegulation<>(
            	4, "Top", "Defensive", "탑방사", 80, 80, 80, 110, false, 100, false
            );
            topLinerArl.add(top14);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top15 = new CharaterRegulation<>(
                5, "Top", "Defensive", "탑방오", 90, 90, 90, 120, false, 100, false
            );
            topLinerArl.add(top15);   
    }
    public void addJunglers() {
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler1 = new CharaterRegulation<>(
	        	1, "jungler", "Offensive", "정공일", 50, 50, 50, 80, true, 100, true
	        );
	        junglerArl.add(jungler1);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler2 = new CharaterRegulation<>(
	        	2, "jungler", "Offensive", "정공이", 60, 60, 60, 90, false, 100, false
	        );
	        junglerArl.add(jungler2);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler3 = new CharaterRegulation<>(
	        	3, "jungler", "Offensive", "정공삼", 70, 70, 70, 100, false, 100, false
	        );
	        junglerArl.add(jungler3);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler4 = new CharaterRegulation<>(
	        	4, "jungler", "Offensive", "정공사", 80, 80, 80, 110, false, 100, false
	        );
	        junglerArl.add(jungler4);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler5 = new CharaterRegulation<>(
	            5, "jungler", "Offensive", "정공오", 90, 90, 90, 120, false, 100, false
	        );
	        junglerArl.add(jungler5);
	
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler6 = new CharaterRegulation<>(
	        	1, "jungler", "Balancive", "정벨일", 50, 50, 50, 80, false, 100, true
	        );
	        junglerArl.add(jungler6);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler7 = new CharaterRegulation<>(
	        	2, "jungler", "Balancive", "정벨이", 60, 60, 60, 90, false, 100, false
	        );
	        junglerArl.add(jungler7);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler8 = new CharaterRegulation<>(
	        	3, "jungler", "Balancive", "정벨삼", 70, 70, 70, 100, false, 100, false
	        );
	        junglerArl.add(jungler8);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler9 = new CharaterRegulation<>(
	        	4, "jungler", "Balancive", "정벨사", 80, 80, 80, 110, false, 100, false
	        );
	        junglerArl.add(jungler9);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler10 = new CharaterRegulation<>(
	            5, "jungler", "Balancive", "정벨오", 90, 90, 90, 120, false, 100, false
	        );
	        junglerArl.add(jungler10);
	
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler11 = new CharaterRegulation<>(
	        	1, "jungler", "Defensive", "정방일", 50, 50, 50, 80, false, 100, true
	        );
	        junglerArl.add(jungler11);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler12 = new CharaterRegulation<>(
	        	2, "jungler", "Defensive", "정방이", 60, 60, 60, 90, false, 100, false
	        );
	        junglerArl.add(jungler12);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler13 = new CharaterRegulation<>(
	        	3, "jungler", "Defensive", "정방삼", 70, 70, 70, 100, false, 100, false
	        );
	        junglerArl.add(jungler13);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler14 = new CharaterRegulation<>(
	        	4, "jungler", "Defensive", "정방사", 80, 80, 80, 110, false, 100, false
	        );
	        junglerArl.add(jungler14);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler15 = new CharaterRegulation<>(
	            5, "jungler", "Defensive", "정방오", 90, 90, 90, 120, false, 100, false
	        );
	        junglerArl.add(jungler15);
	
	}
    public void addMidLiners() {
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid1 = new CharaterRegulation<>(
	            1, "Mid", "Offensive", "미공일", 50, 50, 50, 80, true, 100, true
	        );
	        midLinerArl.add(mid1);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid2 = new CharaterRegulation<>(
	            2, "Mid", "Offensive", "미공이", 60, 60, 60, 90, false, 100, false
	        );
	        midLinerArl.add(mid2);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid3 = new CharaterRegulation<>(
		        3, "Mid", "Offensive", "미공삼", 70, 70, 70, 100, false, 100, false
		    );
		    midLinerArl.add(mid3);
		    CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid4 = new CharaterRegulation<>(
				4, "Mid", "Offensive", "미공사", 80, 80, 80, 110, false, 100, false
			);
			midLinerArl.add(mid4);
			CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid5 = new CharaterRegulation<>(
				5, "Mid", "Offensive", "미공오", 90, 90, 90, 120, false, 100, false
			);
			midLinerArl.add(mid5);
			
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid6 = new CharaterRegulation<>(
	            1, "Mid", "Balancive", "미벨일", 50, 50, 50, 80, false, 100, true
	        );
	        midLinerArl.add(mid6);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid7 = new CharaterRegulation<>(
	            2, "Mid", "Balancive", "미벨이", 60, 60, 60, 90, false, 100, false
	        );
	        midLinerArl.add(mid7);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid8 = new CharaterRegulation<>(
		        3, "Mid", "Balancive", "미벨삼", 70, 70, 70, 100, false, 100, false
		    );
		    midLinerArl.add(mid8);
		    CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid9 = new CharaterRegulation<>(
				4, "Mid", "Balancive", "미벨사", 80, 80, 80, 110, false, 100, false
			);
			midLinerArl.add(mid9);
			CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid10 = new CharaterRegulation<>(
				5, "Mid", "Balancive", "미벨오", 90, 90, 90, 120, false, 100, false
			);
			midLinerArl.add(mid10);

	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid11 = new CharaterRegulation<>(
	            1, "Mid", "Defensive", "미방일", 50, 50, 50, 80, false, 100, true
	        );
	        midLinerArl.add(mid11);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid12 = new CharaterRegulation<>(
	            2, "Mid", "Defensive", "미방이", 60, 60, 60, 90, false, 100, false
	        );
	        midLinerArl.add(mid12);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid13 = new CharaterRegulation<>(
		        3, "Mid", "Defensive", "미방삼", 70, 70, 70, 100, false, 100, false
		    );
		    midLinerArl.add(mid13);
		    CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid14 = new CharaterRegulation<>(
				4, "Mid", "Defensive", "미방사", 80, 80, 80, 110, false, 100, false
			);
			midLinerArl.add(mid14);
			CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid15 = new CharaterRegulation<>(
				5, "Mid", "Offensive", "미방오", 90, 90, 90, 120, false, 100, false
			);
			midLinerArl.add(mid15);
	}
    public void addAdCarries() {
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc1 = new CharaterRegulation<>(
	            1, "Adc", "Offensive", "원공일", 50, 50, 50, 80, true, 100, true
	        );
	        adcArl.add(adc1);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc2 = new CharaterRegulation<>(
	            2, "Adc", "Offensive", "원공이", 60, 60, 60, 90, false, 100, false
	        );
	        adcArl.add(adc2);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc3 = new CharaterRegulation<>(
	            3, "Adc", "Offensive", "원공삼", 70, 70, 70, 100, false, 100, false
	        );
	        adcArl.add(adc3);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc4 = new CharaterRegulation<>(
	            4, "Adc", "Offensive", "원공사", 80, 80, 80, 110, false, 100, false
	        );
	        adcArl.add(adc4);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc5 = new CharaterRegulation<>(
	            5, "Adc", "Offensive", "원공오", 90, 90, 90, 120, false, 100, false
	        );
	        adcArl.add(adc5);
   
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc6 = new CharaterRegulation<>(
	            1, "Adc", "Balancive", "원벨일", 50, 50, 50, 80, false, 100, true
	        );
	        adcArl.add(adc6);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc7 = new CharaterRegulation<>(
	            2, "Adc", "Balancive", "원벨이", 60, 60, 60, 90, false, 100, false
	        );
	        adcArl.add(adc7);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc8 = new CharaterRegulation<>(
	            3, "Adc", "Balancive", "원벨삼", 70, 70, 70, 100, false, 100, false
	        );
	        adcArl.add(adc8);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc9 = new CharaterRegulation<>(
	            4, "Adc", "Balancive", "원벨사", 80, 80, 80, 110, false, 100, false
	        );
	        adcArl.add(adc9);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc10 = new CharaterRegulation<>(
	            5, "Adc", "Balancive", "원벨오", 90, 90, 90, 120, false, 100, false
	        );
	        adcArl.add(adc10);
    
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc11 = new CharaterRegulation<>(
	            1, "Adc", "Defensive", "원방일", 50, 50, 50, 80, false, 100, true
	        );
	        adcArl.add(adc11);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc12 = new CharaterRegulation<>(
	            2, "Adc", "Defensive", "원방이", 60, 60, 60, 90, false, 100, false
	        );
	        adcArl.add(adc12);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc13 = new CharaterRegulation<>(
	            3, "Adc", "Defensive", "원방삼", 70, 70, 70, 100, false, 100, false
	        );
	        adcArl.add(adc13);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc14 = new CharaterRegulation<>(
	            4, "Adc", "Defensive", "원방사", 80, 80, 80, 110, false, 100, false
	        );
	        adcArl.add(adc14);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc15 = new CharaterRegulation<>(
	            5, "Adc", "Defensive", "원방오", 90, 90, 90, 120, false, 100, false
	        );
	        adcArl.add(adc15);
    }
    public void addSupporters() {
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp1 = new CharaterRegulation<>(
	            1, "Supporter", "Offensive", "서공일", 50, 50, 50, 80, true, 100, true
	        );
	        supporterArl.add(supp1);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp2 = new CharaterRegulation<>(
	            2, "Supporter", "Offensive", "서공이", 60, 60, 60, 90, false, 100, false
	        );
	        supporterArl.add(supp2);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp3 = new CharaterRegulation<>(
	            3, "Supporter", "Offensive", "서공삼", 70, 70, 70, 100, false, 100, false
	        );
	        supporterArl.add(supp3);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp4 = new CharaterRegulation<>(
	            4, "Supporter", "Offensive", "서공사", 80, 80, 80, 110, false, 100, false
	        );
	        supporterArl.add(supp4);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp5 = new CharaterRegulation<>(
	            5, "Supporter", "Offensive", "서공오", 90, 90, 90, 120, false, 100, false
	        );
	        supporterArl.add(supp5);
   
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp6 = new CharaterRegulation<>(
	            1, "Supporter", "Balancive", "서벨일", 50, 50, 50, 80, false, 100, true
	        );
	        supporterArl.add(supp6);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp7 = new CharaterRegulation<>(
	            2, "Supporter", "Balancive", "서벨이", 60, 60, 60, 90, false, 100, false
	        );
	        supporterArl.add(supp7);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp8 = new CharaterRegulation<>(
	            3, "Supporter", "Balancive", "서벨삼", 70, 70, 70, 100, false, 100, false
	        );
	        supporterArl.add(supp8);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp9 = new CharaterRegulation<>(
	            4, "Supporter", "Balancive", "서벨사", 80, 80, 80, 110, false, 100, false
	        );
	        supporterArl.add(supp9);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp10 = new CharaterRegulation<>(
	            5, "Supporter", "Balancive", "서벨오", 90, 90, 90, 120, false, 100, false
	        );
	        supporterArl.add(supp10);
    
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp11 = new CharaterRegulation<>(
	            1, "Supporter", "Defensive", "서방일", 50, 50, 50, 80, false, 100, true
	        );
	        supporterArl.add(supp11);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp12 = new CharaterRegulation<>(
	            2, "Supporter", "Defensive", "서방이", 60, 60, 60, 90, false, 100, false
	        );
	        supporterArl.add(supp12);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp13 = new CharaterRegulation<>(
	            3, "Supporter", "Defensive", "서방삼", 70, 70, 70, 100, false, 100, false
	        );
	        supporterArl.add(supp13);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp14 = new CharaterRegulation<>(
	            4, "Supporter", "Defensive", "서방사", 80, 80, 80, 110, false, 100, false
	        );
	        supporterArl.add(supp14);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp15 = new CharaterRegulation<>(
	            5, "Supporter", "Defensive", "서방오", 90, 90, 90, 120, false, 100, false
	        );
	        supporterArl.add(supp15);
    }
}