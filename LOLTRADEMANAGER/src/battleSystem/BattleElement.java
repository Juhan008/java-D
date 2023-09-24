package battleSystem;

public class BattleElement<R, P, T, N, G, O, AO, TB, AT, S, CS, GP, K, D,ES, L, FD, ED, WD, SD, CG, GT, GB, CB, BT, BB, CE, ET, EB> {

	private R linerRating;
	private P position;
	private T linerType;
	private N linerName;
	private G growthPower;//
	private O operationalPower;//기본 운영력
	private AO additionalOperationalPower;//추가 운영력
	private TB teamBattingPower;//기본 한타력
	private AT additionalTeamBattingPower;//추가 한타력
	private S superPlay;//기본 슈퍼플레이
	private CS checkSuperPlay;//슈퍼플레이 T/F
	private GP growthPossible;//성장 T/F
	private K kill;//킬
	private D death;//데스
	private ES exeStack;//쌓이는 경험치
	private L level;//레벨
	private FD fireDragon;//화염드래곤 추가 운영력 증가 
	private ED earthDragon;//대지 드래곤 추가 한타력 증가
	private WD windDragon;//바람드래곤 슈퍼플레이 증가
	private SD seaDragon;//바다드래곤 기본 운영력 기본 한타력 증가 
	private CG canyonGenie;//협곡 정령 T/F
	private GT genieTurns;//협곡 정령 남은턴
	private GB genieBuff;//협곡 정령 증가치
	private CB checkBaron;//바론 T/F
	private BT baronTurns;//바론 남은턴
	private BB Baronbuff;//바론 증가치
	private CE checkElderDragon;//장로 드래곤 T/F
	private ET ElderDragonTurns;//장로 드래곤 증가치
	private EB ElderDragonBuff;//장로 드래곤 버프 증가치
	
	
	public BattleElement(
			 R linerRating,
			 P position,
			 T linerType,
			 N linerName,
			 G growthPower,//
			 O operationalPower,//기본 운영력
			 AO additionalOperationalPower,//추가 운영력
			 TB teamBattingPower,//기본 한타력
			 AT additionalTeamBattingPower,//추가 한타력
			 S superPlay,//기본 슈퍼플레이
			 CS checkSuperPlay,//슈퍼플레이 T/F
			 GP growthPossible,//성장 T/F
			 K kill,//킬
			 D death,//데스
			 ES exeStack,//쌓이는 경험치
			 L level,//레벨
			 FD fireDragon,//화염드래곤 추가 운영력 증가 
			 ED earthDragon,//대지 드래곤 추가 한타력 증가
			 WD windDragon,//바람드래곤 슈퍼플레이 증가
			 SD seaDragon,//바다드래곤 기본 운영력 기본 한타력 증가 
			 CG canyonGenie,//협곡 정령 T/F
			 GT genieTurns,//협곡 정령 남은턴
			 GB genieBuff,//협곡 정령 증가치
			 CB checkBaron,//바론 T/F
			 BT baronTurns,//바론 남은턴
			 BB Baronbuff,//바론 증가치
			 CE checkElderDragon,//장로 드래곤 T/F
			 ET ElderDragonTurns,//장로 드래곤 증가치
			 EB ElderDragonBuff//장로 드래곤 버프 증가치
			 				 ) {
		this.linerRating=linerRating;
		this.position=position;
		this.linerType=linerType;
		this.linerName=linerName;
		this.growthPower=growthPower;
		this.operationalPower=operationalPower;
		this.additionalOperationalPower=additionalOperationalPower;
		this.teamBattingPower=teamBattingPower;
		 this.additionalTeamBattingPower=additionalTeamBattingPower;
		 this.superPlay=superPlay;
		 this.checkSuperPlay=checkSuperPlay;
		 this.growthPossible=growthPossible;
		 this.kill=kill;
		 this.death=death;
		 this.exeStack=exeStack;
		 this.level=level;
		 this.fireDragon=fireDragon;
		 this.earthDragon=earthDragon;
		 this.windDragon=windDragon;
		 this.seaDragon=seaDragon;
		 this.canyonGenie=canyonGenie;
		 this.genieTurns=genieTurns;
		 this.genieBuff=genieBuff;
		 this.checkBaron=checkBaron;
		 this.baronTurns=baronTurns;
		 this.Baronbuff=Baronbuff;
		 this.checkElderDragon=checkElderDragon;
		 this.ElderDragonTurns=ElderDragonTurns;
		 this.ElderDragonBuff=ElderDragonBuff;
	
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

	    public AO getAdditionalOperationalPower() {
	        return additionalOperationalPower;
	    }

	    public void setAdditionalOperationalPower(AO additionalOperationalPower) {
	        this.additionalOperationalPower = additionalOperationalPower;
	    }

	    public TB getTeamBattingPower() {
	        return teamBattingPower;
	    }

	    public void setTeamBattingPower(TB teamBattingPower) {
	        this.teamBattingPower = teamBattingPower;
	    }

	    public AT getAdditionalTeamBattingPower() {
	        return additionalTeamBattingPower;
	    }

	    public void setAdditionalTeamBattingPower(AT additionalTeamBattingPower) {
	        this.additionalTeamBattingPower = additionalTeamBattingPower;
	    }

	    public S getSuperPlay() {
	        return superPlay;
	    }
	    public void setSuperPlay(S superPlay) {
	        this.superPlay = superPlay;
	    }
	    public CS getCheckSuperPlay() {
	        return checkSuperPlay;
	    }

	    public void setCheckSuperPlay(CS checkSuperPlay) {
	        this.checkSuperPlay = checkSuperPlay;
	    }

	    public GP getGrowthPossible() {
	        return growthPossible;
	    }

	    public void setGrowthPossible(GP growthPossible) {
	        this.growthPossible = growthPossible;
	    }
	    public K getKill() {
	        return kill;
	    }

	    public void setKill(K kill) {
	        this.kill = kill;
	    }

	    public D getDeath() {
	        return death;
	    }

	    public void setDeath(D death) {
	        this.death = death;
	    }

	    public ES getExeStack() {
	        return exeStack;
	    }

	    public void setExeStack(ES exeStack) {
	        this.exeStack = exeStack;
	    }

	    public L getLevel() {
	        return level;
	    }

	    public void setLevel(L level) {
	        this.level = level;
	    }

	    public FD getFireDragon() {
	        return fireDragon;
	    }

	    public void setFireDragon(FD fireDragon) {
	        this.fireDragon = fireDragon;
	    }

	    public ED getEarthDragon() {
	        return earthDragon;
	    }

	    public void setEarthDragon(ED earthDragon) {
	        this.earthDragon = earthDragon;
	    }

	    public WD getWindDragon() {
	        return windDragon;
	    }

	    public void setWindDragon(WD windDragon) {
	        this.windDragon = windDragon;
	    }

	    public SD getSeaDragon() {
	        return seaDragon;
	    }

	    public void setSeaDragon(SD seaDragon) {
	        this.seaDragon = seaDragon;
	    }
	    public CG getCanyonGenie() {
	        return canyonGenie;
	    }

	    public void setCanyonGenie(CG canyonGenie) {
	        this.canyonGenie = canyonGenie;
	    }

	    public GT getGenieTurns() {
	        return genieTurns;
	    }

	    public void setGenieTurns(GT genieTurns) {
	        this.genieTurns = genieTurns;
	    }

	    public GB getGenieBuff() {
	        return genieBuff;
	    }

	    public void setGenieBuff(GB genieBuff) {
	        this.genieBuff = genieBuff;
	    }

	    public CB getCheckBaron() {
	        return checkBaron;
	    }

	    public void setCheckBaron(CB checkBaron) {
	        this.checkBaron = checkBaron;
	    }

	    public BT getBaronTurns() {
	        return baronTurns;
	    }

	    public void setBaronTurns(BT baronTurns) {
	        this.baronTurns = baronTurns;
	    }

	    public BB getBaronbuff() {
	        return Baronbuff;
	    }

	    public void setBaronbuff(BB Baronbuff) {
	        this.Baronbuff = Baronbuff;
	    }

	    public CE getCheckElderDragon() {
	        return checkElderDragon;
	    }

	    public void setCheckElderDragon(CE checkElderDragon) {
	        this.checkElderDragon = checkElderDragon;
	    }

	    public ET getElderDragonTurns() {
	        return ElderDragonTurns;
	    }

	    public void setElderDragonTurns(ET ElderDragonTurns) {
	        this.ElderDragonTurns = ElderDragonTurns;
	    }

	    public EB getElderDragonBuff() {
	        return ElderDragonBuff;
	    }

	    public void setElderDragonBuff(EB ElderDragonBuff) {
	        this.ElderDragonBuff = ElderDragonBuff;
	    }
}