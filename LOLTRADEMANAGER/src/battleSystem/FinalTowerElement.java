package battleSystem;


public class FinalTowerElement<F,FB,N,NB> {
	private F finalTower;
	private FB finalTowerBreak;
	private N nexus;
	private NB nexusBreak;

	
	public FinalTowerElement (F finalTower,
						FB finalTowerBreak,
						N nexus,
						NB nexusBreak	
			) {
		this.finalTower = finalTower;
		this.finalTowerBreak = finalTowerBreak;
		this.nexus = nexus;
		this.nexusBreak = nexusBreak;
	}
	public F getFinalTower() {
        return finalTower;
    }
    public void setFinalTower(F finalTower) {
        this.finalTower = finalTower;
    }
    public FB getFinalTowerBreak() {
        return finalTowerBreak;
    }
    public void setFristTowerBreak(FB finalTowerBreak) {
        this.finalTowerBreak = finalTowerBreak;
    }
    public N getnexus() {
        return nexus;
    }
    public void setNexus(N nexus) {
        this.nexus = nexus;
    }
    public NB getNexusBreak() {
        return nexusBreak;
    }
    public void setNexusBreak(NB nexusBreak) {
        this.nexusBreak = nexusBreak;
    }
}






