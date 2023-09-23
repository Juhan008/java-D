package battleSystem;
import java.util.ArrayList;

public class TowerSystem<F,FB,S,SB,T,TB,I,IB> {
	private F fristTower;
	private FB fristTowerBreak;
	private S secondTower;
	private SB secondTowerBreak;
	private T thirdTower;
	private TB thirdTowerBreak;
	private I inhitor;
	private IB inhitorBreak;
	
	public TowerSystem (F fristTower,
						FB fristTowerBreak,
						S secondTower,
						SB secondTowerBreak,
						T thirdTower,
						TB thirdTowerBreak,
						I inhitor,
						IB inhitorBreak
			) {
		this.fristTower = fristTower;
		this.fristTowerBreak = fristTowerBreak;
		this.secondTower = secondTower;
		this.secondTowerBreak = secondTowerBreak;
		this.thirdTower = thirdTower;
		this.thirdTowerBreak = thirdTowerBreak;
		this.inhitor = inhitor;
		this.inhitorBreak = inhitorBreak;
	}
	public F getFristTower() {
        return fristTower;
    }
    public void setFristTower(F fristTower) {
        this.fristTower = fristTower;
    }
    public FB getFristTowerBreak() {
        return fristTowerBreak;
    }
    public void setFristTowerBreak(FB fristTowerBreak) {
        this.fristTowerBreak = fristTowerBreak;
    }
    public S getSecondTower() {
        return secondTower;
    }
    public void setSecondTower(S secondTower) {
        this.secondTower = secondTower;
    }
    public SB getSecondTowerBreak() {
        return secondTowerBreak;
    }
    public void setSecondTowerBreak(SB secondTowerBreak) {
        this.secondTowerBreak = secondTowerBreak;
    }
    public T getThirdTower() {
        return thirdTower;
    }
    public void setThirdTower(T thirdTower) {
        this.thirdTower = thirdTower;
    }
    public TB getThirdTowerBreak() {
        return thirdTowerBreak;
    }
    public void setThirdTowerBreak(TB thirdTowerBreak) {
        this.thirdTowerBreak = thirdTowerBreak;
    }
    public I getInhitor() {
        return inhitor;
    }
    public void setInhitor(I inhitor) {
        this.inhitor = inhitor;
    }
    public IB getThInhitorBreak() {
        return inhitorBreak;
    }
    public void setThirdTowerBreak(IB thirdTowerBreak) {
        this.inhitorBreak = inhitorBreak;
    }
}


public class TowerSystemArl {
	
	public ArrayList<TowerSystem<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> TopTowerArl = new ArrayList<>();
	public ArrayList<TowerSystem<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> MidTowerArl = new ArrayList<>();
	public ArrayList<TowerSystem<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> bottomTowerArl = new ArrayList<>();
	public ArrayList<TowerSystem<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> EnemyTopTowerArl = new ArrayList<>();
	public ArrayList<TowerSystem<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> EnemyMidTowerArl = new ArrayList<>();
	public ArrayList<TowerSystem<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean>> EnemyBottomTowerArl = new ArrayList<>();
	
	public void addTowerStatus() {
		TowerSystem<Integer, Boolean, Integer, Boolean, Integer, Boolean, Integer, Boolean> initialTowerArl = new TowerSystem<>(
			500 , true, 500, true, 500, true, 200, true);
			TopTowerArl.add(initialTowerArl);
			MidTowerArl.add(initialTowerArl);
			bottomTowerArl.add(initialTowerArl);
			EnemyTopTowerArl.add(initialTowerArl);
			EnemyMidTowerArl.add(initialTowerArl);
			EnemyBottomTowerArl.add(initialTowerArl);
		}
	
	}


}
