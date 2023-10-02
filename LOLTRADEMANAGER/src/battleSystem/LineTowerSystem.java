package battleSystem;

import java.util.ArrayList;

public class LineTowerSystem {
	
	public ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> TopTowerArl = new ArrayList<>();
	public ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> midTowerArl = new ArrayList<>();
	public ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> bottomTowerArl = new ArrayList<>();
	public ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> EnemyTopTowerArl = new ArrayList<>();
	public ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> EnemyMidTowerArl = new ArrayList<>();
	public ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> EnemyBottomTowerArl = new ArrayList<>();
	
	public boolean myTopTawer=true;
	public boolean myMidTawer=true;
	public boolean mybottomTawer=true;
	public boolean EnemyTopTawer=true;
	public boolean EnemymidTawer=true;
	public boolean EnemyBottomTawer=true;
	
	public void addTowerStatus() {
		LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean> initialTowerArl = new LineTowerElement<>(
			500 , true, 500, true, 500, true, 200, true);
			TopTowerArl.add(initialTowerArl);
			midTowerArl.add(initialTowerArl);
			bottomTowerArl.add(initialTowerArl);
			EnemyTopTowerArl.add(initialTowerArl);
			EnemyMidTowerArl.add(initialTowerArl);
			EnemyBottomTowerArl.add(initialTowerArl);
		}
	//플레이어가 적팀타워 데미지 입힘
	public void damegingTower(int orderNum, int damege,
			ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> inputTopTowerArl,
			ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> inputmidTowerArl,
			ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> inputBottomTowerArl
			) {
		if (orderNum==1) {
			for(LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean> status : inputTopTowerArl) {
				if(status.getFristTowerBreak()==true) {
					if ((status.getFristTower()-damege)>0) {
						status.setFristTower(status.getFristTower()-damege);
						System.out.println("적팀 탑 1차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 탑 1차 타워 체력: "+status.getFristTower());
					}
					else if ((status.getFristTower()-damege)<=0) {
						status.setFristTower(status.getFristTower()-damege);
						status.setFristTowerBreak(false);
						System.out.println("적팀 탑 1차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 탑 1차 타워가 파괴되었습니다");
					}
				}
				else if(status.getFristTowerBreak()==false && status.getSecondTowerBreak()==true) {
					if ((status.getSecondTower()-damege)>0) {
						status.setSecondTower(status.getSecondTower()-damege);
						System.out.println("적팀 탑 2차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 탑 2차 타워 체력: "+status.getSecondTower());
					}
					else if ((status.getSecondTower()-damege)<=0) {
						status.setSecondTower(status.getSecondTower()-damege);
						status.setSecondTowerBreak(false);
						System.out.println("적팀 탑 2차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 탑 2차 타워가 파괴되었습니다");
					}
				}
				else if(status.getSecondTowerBreak()==false && status.getThirdTowerBreak()==true) {
					if ((status.getThirdTower()-damege)>0) {
						status.setThirdTower(status.getThirdTower()-damege);
						System.out.println("적팀 탑 3차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 탑 3차 타워 체력: "+status.getThirdTower());
					}
					else if ((status.getThirdTower()-damege)<=0) {
						status.setThirdTower(status.getThirdTower()-damege);
						status.setThirdTowerBreak(false);
						System.out.println("적팀 탑 3차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 탑 3차 타워가 파괴되었습니다");
					}
				}
				else if(status.getThirdTowerBreak()==false && status.getInhitorBreak()==true) {
					if ((status.getInhitor()-damege)>0) {
						status.setInhitor(status.getInhitor()-damege);
						System.out.println("적팀 탑 억제기에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 탑 억제기 체력: "+status.getSecondTower());
					}
					else if ((status.getThirdTower()-damege)<=0) {
						status.setInhitor(status.getInhitor()-damege);
						status.setInhitorBreak(false);
						System.out.println("적팀 탑 억제기에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 탑 억제기가 파괴되었습니다");
						EnemyTopTawer=false;
					}
				}
			}
		}
		if (orderNum==2) {
			for(LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean> status : inputmidTowerArl) {
				if(status.getFristTowerBreak()==true) {
					if ((status.getFristTower()-damege)>0) {
						status.setFristTower(status.getFristTower()-damege);
						System.out.println("적팀 미드 1차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 미드 1차 타워 체력: "+status.getFristTower());
					}
					else if ((status.getFristTower()-damege)<=0) {
						status.setFristTower(status.getFristTower()-damege);
						status.setFristTowerBreak(false);
						System.out.println("적팀 미드 1차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 미드 1차 타워가 파괴되었습니다");
					}
				}
				else if(status.getFristTowerBreak()==false && status.getSecondTowerBreak()==true) {
					if ((status.getSecondTower()-damege)>0) {
						status.setSecondTower(status.getSecondTower()-damege);
						System.out.println("적팀 미드 2차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 미드 2차 타워 체력: "+status.getSecondTower());
					}
					else if ((status.getSecondTower()-damege)<=0) {
						status.setSecondTower(status.getSecondTower()-damege);
						status.setSecondTowerBreak(false);
						System.out.println("적팀 미드 2차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 미드 2차 타워가 파괴되었습니다");
					}
				}
				else if(status.getSecondTowerBreak()==false && status.getThirdTowerBreak()==true) {
					if ((status.getThirdTower()-damege)>0) {
						status.setThirdTower(status.getThirdTower()-damege);
						System.out.println("적팀 미드 3차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 미드 3차 타워 체력: "+status.getThirdTower());
					}
					else if ((status.getThirdTower()-damege)<=0) {
						status.setThirdTower(status.getThirdTower()-damege);
						status.setThirdTowerBreak(false);
						System.out.println("적팀 미드 3차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 미드 3차 타워가 파괴되었습니다");
					}
				}
				else if(status.getThirdTowerBreak()==false && status.getInhitorBreak()==true) {
					if ((status.getInhitor()-damege)>0) {
						status.setInhitor(status.getInhitor()-damege);
						System.out.println("적팀 미드 억제기에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 미드 억제기 체력: "+status.getSecondTower());
					}
					else if ((status.getThirdTower()-damege)<=0) {
						status.setInhitor(status.getInhitor()-damege);
						status.setInhitorBreak(false);
						System.out.println("적팀 미드 억제기에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 미드 억제기가 파괴되었습니다");
						EnemymidTawer=false;
					}
				}
			}
		}
		if (orderNum==3) {
			for(LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean> status : inputBottomTowerArl) {
				if(status.getFristTowerBreak()==true) {
					if ((status.getFristTower()-damege)!=0) {
						status.setFristTower(status.getFristTower()-damege);
						System.out.println("적팀 바텀 1차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 바텀 1차 타워 체력: "+status.getFristTower());
					}
					else if ((status.getFristTower()-damege)==0) {
						status.setFristTower(status.getFristTower()-damege);
						status.setFristTowerBreak(false);
						System.out.println("적팀 바텀 1차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 바텀 1차 타워가 파괴되었습니다");
					}
				}
				else if(status.getFristTowerBreak()==false && status.getSecondTowerBreak()==true) {
					if ((status.getSecondTower()-damege)!=0) {
						status.setSecondTower(status.getSecondTower()-damege);
						System.out.println("적팀 바텀 2차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 바텀 2차 타워 체력: "+status.getSecondTower());
					}
					else if ((status.getSecondTower()-damege)==0) {
						status.setSecondTower(status.getSecondTower()-damege);
						status.setSecondTowerBreak(false);
						System.out.println("적팀 바텀 2차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 바텀 2차 타워가 파괴되었습니다");
					}
				}
				else if(status.getSecondTowerBreak()==false && status.getThirdTowerBreak()==true) {
					if ((status.getThirdTower()-damege)!=0) {
						status.setThirdTower(status.getThirdTower()-damege);
						System.out.println("적팀 바텀 3차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 바텀 3차 타워 체력: "+status.getThirdTower());
					}
					else if ((status.getThirdTower()-damege)==0) {
						status.setThirdTower(status.getThirdTower()-damege);
						status.setThirdTowerBreak(false);
						System.out.println("적팀 바텀 3차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 바텀 3차 타워가 파괴되었습니다");
					}
				}
				else if(status.getThirdTowerBreak()==false && status.getInhitorBreak()==true) {
					if ((status.getInhitor()-damege)!=0) {
						status.setInhitor(status.getInhitor()-damege);
						System.out.println("적팀 바텀 억제기에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 바텀 억제기 체력: "+status.getSecondTower());
					}
					else if ((status.getThirdTower()-damege)==0) {
						status.setInhitor(status.getInhitor()-damege);
						status.setInhitorBreak(false);
						System.out.println("적팀 바텀 억제기에 "+damege+" 데미지를 입었습니다.");
						System.out.println("적팀 바텀 억제기가 파괴되었습니다");
						EnemyBottomTawer=false;
					}
				}
			}
		}
	}
	//플레이어 타워에 데미지를 입음
	public void damegedTower(int orderNum, int damege,
			ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> inputTopTowerArl,
			ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> inputmidTowerArl,
			ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> inputBottomTowerArl
			) {
		if (orderNum==1) {
			for(LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean> status : inputTopTowerArl) {
				if(status.getFristTowerBreak()==true) {
					if ((status.getFristTower()-damege)!=0) {
						status.setFristTower(status.getFristTower()-damege);
						System.out.println("아군 탑 1차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 탑 1차 타워 체력: "+status.getFristTower());
					}
					else if ((status.getFristTower()-damege)==0) {
						status.setFristTower(status.getFristTower()-damege);
						status.setFristTowerBreak(false);
						System.out.println("아군 탑 1차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 탑 1차 타워가 파괴되었습니다");
					}
				}
				else if(status.getFristTowerBreak()==false && status.getSecondTowerBreak()==true) {
					if ((status.getSecondTower()-damege)!=0) {
						status.setSecondTower(status.getSecondTower()-damege);
						System.out.println("아군 탑 2차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 탑 2차 타워 체력: "+status.getSecondTower());
					}
					else if ((status.getSecondTower()-damege)==0) {
						status.setSecondTower(status.getSecondTower()-damege);
						status.setSecondTowerBreak(false);
						System.out.println("아군 탑 2차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 탑 2차 타워가 파괴되었습니다");
					}
				}
				else if(status.getSecondTowerBreak()==false && status.getThirdTowerBreak()==true) {
					if ((status.getThirdTower()-damege)!=0) {
						status.setThirdTower(status.getThirdTower()-damege);
						System.out.println("아군 탑 3차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 탑 3차 타워 체력: "+status.getThirdTower());
					}
					else if ((status.getThirdTower()-damege)==0) {
						status.setThirdTower(status.getThirdTower()-damege);
						status.setThirdTowerBreak(false);
						System.out.println("아군 탑 3차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 탑 3차 타워가 파괴되었습니다");
					}
				}
				else if(status.getThirdTowerBreak()==false && status.getInhitorBreak()==true) {
					if ((status.getInhitor()-damege)!=0) {
						status.setInhitor(status.getInhitor()-damege);
						System.out.println("아군 탑 억제기에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 탑 억제기 체력: "+status.getSecondTower());
					}
					else if ((status.getThirdTower()-damege)==0) {
						status.setInhitor(status.getInhitor()-damege);
						status.setInhitorBreak(false);
						System.out.println("아군 탑 억제기에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 탑 억제기가 파괴되었습니다");
						myTopTawer=false;
					}
				}
			}
		}
		if (orderNum==2) {
			for(LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean> status : inputmidTowerArl) {
				if(status.getFristTowerBreak()==true) {
					if ((status.getFristTower()-damege)!=0) {
						status.setFristTower(status.getFristTower()-damege);
						System.out.println("아군 미드 1차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 미드 1차 타워 체력: "+status.getFristTower());
					}
					else if ((status.getFristTower()-damege)==0) {
						status.setFristTower(status.getFristTower()-damege);
						status.setFristTowerBreak(false);
						System.out.println("아군 미드 1차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 미드 1차 타워가 파괴되었습니다");
					}
				}
				else if(status.getFristTowerBreak()==false && status.getSecondTowerBreak()==true) {
					if ((status.getSecondTower()-damege)!=0) {
						status.setSecondTower(status.getSecondTower()-damege);
						System.out.println("아군 미드 2차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 미드 2차 타워 체력: "+status.getSecondTower());
					}
					else if ((status.getSecondTower()-damege)==0) {
						status.setSecondTower(status.getSecondTower()-damege);
						status.setSecondTowerBreak(false);
						System.out.println("아군 미드 2차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 미드 2차 타워가 파괴되었습니다");
					}
				}
				else if(status.getSecondTowerBreak()==false && status.getThirdTowerBreak()==true) {
					if ((status.getThirdTower()-damege)!=0) {
						status.setThirdTower(status.getThirdTower()-damege);
						System.out.println("아군 미드 3차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 미드 3차 타워 체력: "+status.getThirdTower());
					}
					else if ((status.getThirdTower()-damege)==0) {
						status.setThirdTower(status.getThirdTower()-damege);
						status.setThirdTowerBreak(false);
						System.out.println("아군 미드 3차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 미드 3차 타워가 파괴되었습니다");
					}
				}
				else if(status.getThirdTowerBreak()==false && status.getInhitorBreak()==true) {
					if ((status.getInhitor()-damege)!=0) {
						status.setInhitor(status.getInhitor()-damege);
						System.out.println("아군 미드 억제기에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 미드 억제기 체력: "+status.getSecondTower());
					}
					else if ((status.getThirdTower()-damege)==0) {
						status.setInhitor(status.getInhitor()-damege);
						status.setInhitorBreak(false);
						System.out.println("아군 미드 억제기에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 미드 억제기가 파괴되었습니다");
						myMidTawer=false;
					}
				}
			}
		}
		if (orderNum==3) {
			for(LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean> status : inputBottomTowerArl) {
				if(status.getFristTowerBreak()==true) {
					if ((status.getFristTower()-damege)!=0) {
						status.setFristTower(status.getFristTower()-damege);
						System.out.println("아군 바텀 1차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 바텀 1차 타워 체력: "+status.getFristTower());
					}
					else if ((status.getFristTower()-damege)==0) {
						status.setFristTower(status.getFristTower()-damege);
						status.setFristTowerBreak(false);
						System.out.println("아군 바텀 1차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 바텀 1차 타워가 파괴되었습니다");
					}
				}
				else if(status.getFristTowerBreak()==false && status.getSecondTowerBreak()==true) {
					if ((status.getSecondTower()-damege)!=0) {
						status.setSecondTower(status.getSecondTower()-damege);
						System.out.println("아군 바텀 2차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 바텀 2차 타워 체력: "+status.getSecondTower());
					}
					else if ((status.getSecondTower()-damege)==0) {
						status.setSecondTower(status.getSecondTower()-damege);
						status.setSecondTowerBreak(false);
						System.out.println("아군 바텀 2차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 바텀 2차 타워가 파괴되었습니다");
					}
				}
				else if(status.getSecondTowerBreak()==false && status.getThirdTowerBreak()==true) {
					if ((status.getThirdTower()-damege)!=0) {
						status.setThirdTower(status.getThirdTower()-damege);
						System.out.println("아군 바텀 3차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 바텀 3차 타워 체력: "+status.getThirdTower());
					}
					else if ((status.getThirdTower()-damege)==0) {
						status.setThirdTower(status.getThirdTower()-damege);
						status.setThirdTowerBreak(false);
						System.out.println("아군 바텀 3차 타워에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 바텀 3차 타워가 파괴되었습니다");
					}
				}
				else if(status.getThirdTowerBreak()==false && status.getInhitorBreak()==true) {
					if ((status.getInhitor()-damege)!=0) {
						status.setInhitor(status.getInhitor()-damege);
						System.out.println("아군 바텀 억제기에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 바텀 억제기 체력: "+status.getSecondTower());
					}
					else if ((status.getThirdTower()-damege)==0) {
						status.setInhitor(status.getInhitor()-damege);
						status.setInhitorBreak(false);
						System.out.println("아군 바텀 억제기에 "+damege+" 데미지를 입었습니다.");
						System.out.println("아군 바텀 억제기가 파괴되었습니다");
						mybottomTawer=false;
					}
				}
			}
		}
	}
}