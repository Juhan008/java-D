package characterMangement;
test

public class CharaterRegulation<R,P,T,N,G,O,TB,S,E,TP,TS> {

	private R linerRating;
	private P position;
	private T linerType;
	private N linerName;
	private G growthPower;
	private O operationalPower;
	private TB teamBattingPower;
	private S superPlay;
	private E equippedOrNot;
	private TP transferPrice;
	private TS transferStatus;
	
	public CharaterRegulation(R linerRating,
							 P position, 
			 				 T linerType,
			 				 N linerName,
			 				 G growthPower,
			 				 O operationalPower,
			 				 TB teamBattingPower,
			 				 S superPlay,
			 				 E equippedOrNot,
			 				 TP transferPrice,
			 				 TS transferStatus
			 				 ) {
			this.linerRating = linerRating;
			this.position = position;
	        this.linerType = linerType;
	        this.linerName = linerName;
	        this.growthPower = growthPower;
	        this.operationalPower = operationalPower;
	        this.teamBattingPower = teamBattingPower;
	        this.superPlay = superPlay;
	        this.equippedOrNot = equippedOrNot;
	        this.transferPrice = transferPrice;
	        this.transferStatus = transferStatus;
	}
	public R getLinerRating() {
        return linerRating;
    }
    public void setLinerRating(R linerRating) {
        this.linerRating = linerRating;
    }
    public P getPosition() {
        return position;
    }
    public void setPosition(P position) {
        this.position = position;
    }
    public T getLinerType() {
        return linerType;
    }
    public void setLinerType(T linerType) {
        this.linerType = linerType;
    }
    public N getLinerName() {
        return linerName;
    }
    public void setLinerName(N linerName) {
        this.linerName = linerName;
    }
    public G getGrowthPower() {
        return growthPower;
    }
    public void setGrowthPower(G growthPower) {
        this.growthPower = growthPower;
    }
    public O getOperationalPower() {
        return operationalPower;
    }
    public void setOperationalPower(O operationalPower) {
        this.operationalPower = operationalPower;
    }
    public TB getTeamBattingPower() {
        return teamBattingPower;
    }
    public void setTeamBattingPower(TB teamBattingPower) {
        this.teamBattingPower = teamBattingPower;
    }
    public S getSuperPlay() {
        return superPlay;
    }
    public void setSuperPlay(S superPlay) {
        this.superPlay = superPlay;
    }
    public E getEquippedOrNot() {
        return equippedOrNot;
    }
    public void setEquippedOrNot(E equippedOrNot) {
        this.equippedOrNot = equippedOrNot;
    }
    public TP getTransferPrice() {
        return transferPrice;
    }
    public void setTransferPrice(TP transferPrice) {
        this.transferPrice = transferPrice;
    }
    public TS getTransferStatus() {
        return transferStatus;
    }
    public void setTransferStatus(TS transferStatus) {
        this.transferStatus = transferStatus;
    }
}
