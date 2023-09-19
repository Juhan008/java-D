package Loltrade;

public class BattleSystem{
//초반 1억제기까지 정글 활용
	
	int sellectTawer; int anotherTawerA; int anotherTawerB;
	int success=0;
	
	
	public void jungleBattle(int jungleAblilty) {
		int gankingRate = (int)(Math.random()*100);
		
		if(gankingRate>=jungleAblilty) {
			sellectTawer=1;
			anotherTawerA=0;
			anotherTawerB=0;
		}
		else if (gankingRate<jungleAblilty &&
				gankingRate>((100-jungleAblilty)/2)) {
			sellectTawer=0;
			anotherTawerA=1;
			anotherTawerB=0;
		}
		else {
			sellectTawer=0;
			anotherTawerA=0;
			anotherTawerB=1;
		}
	}
	public void ganking(int liner, int jungle, int enemy) {
		int attacker =liner+jungle;
		int effectiving = liner+jungle+50;
		int depender=liner+jungle+enemy+50;
		
		int ganking = (int)(Math.random()*(liner+jungle+enemy+50));
		
		if (ganking<=attacker) {
			success=0;
		}
		if (attacker<ganking && ganking<=effectiving) {
			success=1;
		}
		if(effectiving<ganking) {
			success=2;
		}
	}
}
