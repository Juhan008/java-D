package characterMangement;

import java.util.ArrayList;

public class MarketCharacter {
	
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> topLinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> junglerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> midLinerArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> adcArl = new ArrayList<>();
	public ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> supporterArl = new ArrayList<>();
   // 등급 포지션 타입 이름 성장력 운영력 한타력 슈퍼플레이 장착유무 구매 가격 이적유무
   
    public void AddTopLiners() {
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top1 = new CharaterRegulation<>(
            	1, "Top", "Offensive", "탑일", 50, 50, 50, 80, true, 100, true
            );
            topLinerArl.add(top1);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top2 = new CharaterRegulation<>(
            	2, "Top", "Offensive", "탑사", 50, 50, 50, 80, true, 100, true
            );
            topLinerArl.add(top2);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top3 = new CharaterRegulation<>(
            	3, "Top", "Offensive", "탑삼", 50, 50, 50, 80, true, 100, true
            );
            topLinerArl.add(top3);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top4 = new CharaterRegulation<>(
            	4, "Top", "Offensive", "탑사", 50, 50, 50, 80, true, 100, true
            );
            topLinerArl.add(top4);
            CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> top5 = new CharaterRegulation<>(
                5, "Top", "Offensive", "탑오", 50, 50, 50, 80, true, 100, true
            );
            topLinerArl.add(top5);
    }
    public void Addjunglers() {
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler1 = new CharaterRegulation<>(
	        	1, "jungler", "Offensive", "정일", 50, 50, 50, 80, true, 100, true
	        );
	        junglerArl.add(jungler1);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler2 = new CharaterRegulation<>(
	        	2, "jungler", "Offensive", "정사", 50, 50, 50, 80, true, 100, true
	        );
	        junglerArl.add(jungler2);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler3 = new CharaterRegulation<>(
	        	3, "jungler", "Offensive", "정삼", 50, 50, 50, 80, true, 100, true
	        );
	        junglerArl.add(jungler3);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler4 = new CharaterRegulation<>(
	        	4, "jungler", "Offensive", "정사", 50, 50, 50, 80, true, 100, true
	        );
	        junglerArl.add(jungler4);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler5 = new CharaterRegulation<>(
	            5, "jungler", "Offensive", "정오", 50, 50, 50, 80, true, 100, true
	        );
	        junglerArl.add(jungler5);
	}
    public void addMidLiners() {
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid1 = new CharaterRegulation<>(
	            1, "Mid", "Offensive", "미일", 50, 50, 50, 80, true, 100, true
	        );
	        midLinerArl.add(mid1);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid2 = new CharaterRegulation<>(
	            2, "Mid", "Offensive", "미사", 50, 50, 50, 80, true, 100, true
	        );
	        midLinerArl.add(mid2);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid3 = new CharaterRegulation<>(
		        3, "Mid", "Offensive", "미삼", 50, 50, 50, 80, true, 100, true
		    );
		    midLinerArl.add(mid3);
		    CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid4 = new CharaterRegulation<>(
				3, "Mid", "Offensive", "미사", 50, 50, 50, 80, true, 100, true
			);
			midLinerArl.add(mid4);
			CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> mid5 = new CharaterRegulation<>(
				3, "Mid", "Offensive", "미오", 50, 50, 50, 80, true, 100, true
			);
			midLinerArl.add(mid5);
	}
    public void addAdCarries() {
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc1 = new CharaterRegulation<>(
	            1, "Adc", "Offensive", "원일", 50, 50, 50, 80, true, 100, true
	        );
	        adcArl.add(adc1);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc2 = new CharaterRegulation<>(
	            2, "Adc", "Offensive", "원이", 50, 50, 50, 80, true, 100, true
	        );
	        adcArl.add(adc2);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc3 = new CharaterRegulation<>(
	            3, "Adc", "Offensive", "원삼", 50, 50, 50, 80, true, 100, true
	        );
	        adcArl.add(adc3);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc4 = new CharaterRegulation<>(
	            4, "Adc", "Offensive", "원사", 50, 50, 50, 80, true, 100, true
	        );
	        adcArl.add(adc4);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adc5 = new CharaterRegulation<>(
	            5, "Adc", "Offensive", "원오", 50, 50, 50, 80, true, 100, true
	        );
	        adcArl.add(adc5);
    }
    public void addSupporters() {
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp1 = new CharaterRegulation<>(
	            5, "Supporter", "Offensive", "서일", 50, 50, 50, 80, true, 100, true
	        );
	        supporterArl.add(supp1);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp2 = new CharaterRegulation<>(
	            4, "Supporter", "Offensive", "서이", 50, 50, 50, 80, true, 100, true
	        );
	        supporterArl.add(supp2);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp3 = new CharaterRegulation<>(
	            3, "Supporter", "Offensive", "서삼", 50, 50, 50, 80, true, 100, true
	        );
	        supporterArl.add(supp3);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp4 = new CharaterRegulation<>(
	            2, "Supporter", "Offensive", "서사", 50, 50, 50, 80, true, 100, true
	        );
	        supporterArl.add(supp4);
	        CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supp5 = new CharaterRegulation<>(
	            1, "Supporter", "Offensive", "서오", 50, 50, 50, 80, true, 100, true
	        );
	        supporterArl.add(supp5);
    }
}