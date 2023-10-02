package battleSystem;

import java.util.ArrayList;

public class FinalTowerSystem {
	public ArrayList<FinalTowerElement<Integer, Boolean, Integer, Boolean>> myFinalTowerArl = new ArrayList<>();
	public ArrayList<FinalTowerElement<Integer, Boolean, Integer, Boolean>> enemyFinalTowerArl = new ArrayList<>();
	public boolean myNexus=true;
	public boolean EnemyNexus=true;
	
	public void addFinalTowerStatus() {
		FinalTowerElement<Integer, Boolean, Integer, Boolean> initialFinalTowerArl = new FinalTowerElement<>(
			400, true, 300, true);
		myFinalTowerArl.add(initialFinalTowerArl);
		enemyFinalTowerArl.add(initialFinalTowerArl);
		}
	public void damegingFinalTower(int damege, 
			ArrayList<FinalTowerElement<Integer, Boolean, Integer, Boolean>> inputFinalTowerArl
			) {
		for(FinalTowerElement<Integer, Boolean, Integer, Boolean> status : inputFinalTowerArl) {
			if(status.getFinalTowerBreak()==true) {
				if((status.getFinalTower()-damege)>0) {
					status.setFinalTower(status.getFinalTower()-damege);
					System.out.println("적팀 쌍둥이타워에 "+damege+" 데미지를 가했습니다.");
					System.out.println("적팀 쌍둥이타워 남은 체력 :"+status.getFinalTower());
				}
				else if ((status.getFinalTower()-damege)<=0) {
					status.setFinalTower(status.getFinalTower()-damege);
					status.setFinalTowerBreak(false);
					System.out.println("적팀 쌍둥이타워에 "+damege+" 데미지를 가했습니다.");
					System.out.println("적팀 쌍둥이타워가 파괴되었습니다.");
				}
			}
			else if (status.getFinalTowerBreak()==false) {
				if((status.getnexus()-damege)>0){
					status.setNexus(status.getnexus()-damege);
					System.out.println("적팀 넥서스에 "+damege+" 데미지를 가했습니다.");
					System.out.println("적팀 넥서스 남은 체력 :"+status.getnexus());
				}
				else if((status.getnexus()-damege)<=0) {
						status.setNexus(status.getFinalTower()-damege);
						System.out.println("적팀 쌍둥이타워에 "+damege+" 데미지를 가했습니다.");
						System.out.println("적팀 넥서스가 파괴되었습니다.");
						EnemyNexus=false;
				}
			}
		}
	}
	public void damegedFinalTower(int damege, 
			ArrayList<FinalTowerElement<Integer, Boolean, Integer, Boolean>> inputFinalTowerArl
			) {
		for(FinalTowerElement<Integer, Boolean, Integer, Boolean> status : inputFinalTowerArl) {
			if(status.getFinalTowerBreak()==true) {
				if((status.getFinalTower()-damege)>0) {
					status.setFinalTower(status.getFinalTower()-damege);
					System.out.println("아군 쌍둥이타워에 "+damege+" 데미지를 가했습니다.");
					System.out.println("아군 쌍둥이타워 남은 체력 :"+status.getFinalTower());
				}
				else if ((status.getFinalTower()-damege)<=0) {
					status.setFinalTower(status.getFinalTower()-damege);
					status.setFinalTowerBreak(false);
					System.out.println("아군 쌍둥이타워에 "+damege+" 데미지를 가했습니다.");
					System.out.println("아군 쌍둥이타워가 파괴되었습니다.");
				}
			}
			else if (status.getFinalTowerBreak()==false) {
				if((status.getnexus()-damege)>0){
					status.setNexus(status.getnexus()-damege);
					System.out.println("아군 넥서스에 "+damege+" 데미지를 가했습니다.");
					System.out.println("아군 넥서스 남은 체력 :"+status.getnexus());
				}
				else if((status.getnexus()-damege)<=0) {
						status.setNexus(status.getFinalTower()-damege);
						System.out.println("아군 쌍둥이타워에 "+damege+" 데미지를 가했습니다.");
						System.out.println("아군 넥서스가 파괴되었습니다.");
						myNexus=false;
				}
			}
		}
	}
}
