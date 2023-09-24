package battleSystem;


public class LineTowerElement<F,FB,S,SB,T,TB,I,IB> {
	private F fristTower;
	private FB fristTowerBreak;
	private S secondTower;
	private SB secondTowerBreak;
	private T thirdTower;
	private TB thirdTowerBreak;
	private I inhitor;
	private IB inhitorBreak;
	
	public LineTowerElement (F fristTower,
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
    public void setinhitorBreak(IB tinhitorBreak) {
        this.inhitorBreak = inhitorBreak;
    }
}






