package battleSystem;

import java.util.ArrayList;

public class LineTowerSystem {
	
	public ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> TopTowerArl = new ArrayList<>();
	public ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> MidTowerArl = new ArrayList<>();
	public ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> bottomTowerArl = new ArrayList<>();
	public ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> EnemyTopTowerArl = new ArrayList<>();
	public ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> EnemyMidTowerArl = new ArrayList<>();
	public ArrayList<LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> EnemyBottomTowerArl = new ArrayList<>();
	
	public void addTowerStatus() {
		LineTowerElement<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean> initialTowerArl = new LineTowerElement<>(
			500 , true, 500, true, 500, true, 200, true);
			TopTowerArl.add(initialTowerArl);
			MidTowerArl.add(initialTowerArl);
			bottomTowerArl.add(initialTowerArl);
			EnemyTopTowerArl.add(initialTowerArl);
			EnemyMidTowerArl.add(initialTowerArl);
			EnemyBottomTowerArl.add(initialTowerArl);
		}
	
	}