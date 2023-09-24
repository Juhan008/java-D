package membershipManagement;

public class MyInfoElement<N, M, R, DV, DD, IV, ID> {
	private N name;
	private M money;
	private R rating;
	private DV domesticVictory;
	private DD domesticDefeat;
	private IV internationalVictory;
	private ID internationalDefeat;
	
	public MyInfoElement(N name,
						 M money,
						 R rating,
						 DV domesticVictory,
						 DD domesticDefeat,
						 IV internationalVictory,
						 ID internationalDefeat
			) {
		this.name=name;
		this.money=money;
		this.rating=rating;
		this.domesticVictory=domesticVictory;
		this.domesticDefeat=domesticDefeat;
		this.internationalVictory=internationalVictory;
		this.internationalDefeat=internationalDefeat;
	}
	public N getName() {
		return name;
	}
	public void setName(N name) {
		this.name = name;
	}
	public M getMoney() {
		return money;
	}
	public void setMoney(M money) {
		this.money = money;
	}
	public R getRating() {
		return rating;
	}
	public void setRating(R rating) {
		this.rating = rating;
	}
	public DV getDomesticVictory() {
		return domesticVictory;
	}
	public void setDomesticVictory(DV domesticVictory) {
		this.domesticVictory = domesticVictory;
	}
	public DD getDomesticDefeat() {
		return domesticDefeat;
	}
	public void setDomesticDefeat(DD domesticDefeat) {
		this.domesticDefeat = domesticDefeat;
	}
	public IV getInternationalVictory() {
		return internationalVictory;
	}
	public void setInternationalVictory(IV internationalVictory) {
		this.internationalVictory = internationalVictory;
	}
	public ID getInternationalDefeat() {
		return internationalDefeat;
	}
	public void setInternationalDefeat(ID internationalDefeat) {
		this.internationalDefeat = internationalDefeat;
	}
}
