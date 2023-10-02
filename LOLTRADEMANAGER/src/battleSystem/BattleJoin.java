package battleSystem;

import java.util.ArrayList;
import java.util.Random;

import characterMangement.CharaterRegulation;

public class BattleJoin {
	public ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> ArlMyTop = new ArrayList<>();
	public ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> ArlMyJungler = new ArrayList<>();
	public ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> ArlMyMid = new ArrayList<>();
	public ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> ArlMyAdc = new ArrayList<>();
	public ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> ArlMySupp = new ArrayList<>();
	public ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> ArlEnemyTop = new ArrayList<>();
	public ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> ArlEnemyJungler = new ArrayList<>();
	public ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> ArlEnemyMid = new ArrayList<>();
	public ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> ArlEnemyAdc = new ArrayList<>();
	public ArrayList<BattleElement<Integer,String,String,String,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Boolean,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer,Boolean,Integer,Integer>> ArlEnemySupp = new ArrayList<>();
	int linerRating=0;
	String position = "";
	String linerType = "";
	String linerName = "";
	int growthPower = 0;
	int operationalPower = 0;
	int teamBattingPower = 0;
	int superPlay = 0;
	
//	public class BattleElement<R, P, T, N, G, O, AO, TB, AT, S, CS, GP, K, D,ES, L, FD, ED, WD, SD, CG, GT, GB, CB, BT, BB, CE, ET, EB> {

//		private R linerRating;//I
//		private P position;
//		private T linerType;
//		private N linerName;
//		private G growthPower;//
//		private O operationalPower;//기본 운영력
//		private AO additionalOperationalPower;//추가 운영력
//		private TB teamBattingPower;//기본 한타력
//		private AT additionalTeamBattingPower;//추가 한타력
//		private S superPlay;//기본 슈퍼플레이
//		private CS checkSuperPlay;//슈퍼플레이 T/F
//		private GP growthPossible;//성장 T/F
//		private K kill;//킬
//		private D death;//데스
//		private ES exeStack;//쌓이는 경험치
//		private L level;//레벨
//		private FD fireDragon;//화염드래곤 추가 운영력 증가 
//		private ED earthDragon;//대지 드래곤 추가 한타력 증가
//		private WD windDragon;//바람드래곤 슈퍼플레이 증가
//		private SD seaDragon;//바다드래곤 기본 운영력 기본 한타력 증가 
//		private CG canyonGenie;//협곡 정령 T/F
//		private GT genieTurns;//협곡 정령 남은턴
//		private GB genieBuff;//협곡 정령 증가치
//		private CB checkBaron;//바론 T/F
//		private BT baronTurns;//바론 남은턴
//		private BB Baronbuff;//바론 증가치
//		private CE checkElderDragon;//장로 드래곤 T/F
//		private ET ElderDragonTurns;//장로 드래곤 턴
//		private EB ElderDragonBuff;//장로 드래곤 버프 증가치
//		private R linerRating;
//		private P position;
//		private T linerType;
//		private N linerName;
//		private G growthPower;
//		private O operationalPower;
//		private TB teamBattingPower;
//		private S superPlay;
//		private E equippedOrNot;
//		private TP transferPrice;
//		private TS transferStatus;
	public void AddArlBattle(
				ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlTop,
				ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlJungler,
				ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlMid,
				ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlAdc,
				ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlSupp,
				ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlEnemyTop,
				ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlEnemyJungler,
				ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlEnemyMid,
				ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlEnemyAdc,
				ArrayList<CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean>> inputArlEnemySupp) {
		
			for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlTop) {
				linerRating = character.getLinerRating();
				position =character.getPosition();
				linerType = character.getLinerType();
				linerName = character.getLinerName();
				growthPower = character.getGrowthPower();
				operationalPower = character.getOperationalPower();
				teamBattingPower = character.getTeamBattingPower();
				superPlay = character.getSuperPlay();
				
			        }
			
			BattleElement<Integer, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Boolean, Boolean, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Boolean,Integer,Integer, Boolean, Integer, Integer, Boolean, Integer, Integer> Top = new BattleElement<>(
					linerRating, position,linerType,linerName,growthPower, operationalPower, 0, teamBattingPower, 0, superPlay, false, true, 0, 0, 0, 0, 0, 0, 0, 0, false, 0,50, false, 0, 80, false, 0, 80);
				ArlMyTop.add(Top);

			for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlJungler) {
				linerRating = character.getLinerRating();
				position =character.getPosition();
				linerType = character.getLinerType();
				linerName = character.getLinerName();
				growthPower = character.getGrowthPower();
				operationalPower = character.getOperationalPower();
				teamBattingPower = character.getTeamBattingPower();
				superPlay = character.getSuperPlay();
			        }
			BattleElement<Integer, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Boolean, Boolean, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Boolean,Integer,Integer, Boolean, Integer, Integer, Boolean, Integer, Integer> Jungler = new BattleElement<>(
					linerRating, position,linerType,linerName,growthPower, operationalPower, 0, teamBattingPower, 0, superPlay, false, true, 0, 0, 0, 0, 0, 0, 0, 0, false, 0,50, false, 0, 80, false, 0, 80);
			ArlMyJungler.add(Jungler);
			for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlMid) {
				linerRating = character.getLinerRating();
				position =character.getPosition();
				linerType = character.getLinerType();
				linerName = character.getLinerName();
				growthPower = character.getGrowthPower();
				operationalPower = character.getOperationalPower();
				teamBattingPower = character.getTeamBattingPower();
				superPlay = character.getSuperPlay();
			        }
			BattleElement<Integer, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Boolean, Boolean, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Boolean,Integer,Integer, Boolean, Integer, Integer, Boolean, Integer, Integer> Mid = new BattleElement<>(
					linerRating, position,linerType,linerName,growthPower, operationalPower, 0, teamBattingPower, 0, superPlay, false, true, 0, 0, 0, 0, 0, 0, 0, 0, false, 0,50, false, 0, 80, false, 0, 80);
				ArlMyMid.add(Mid);
			for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlAdc) {
				linerRating = character.getLinerRating();
				position =character.getPosition();
				linerType = character.getLinerType();
				linerName = character.getLinerName();
				growthPower = character.getGrowthPower();
				operationalPower = character.getOperationalPower();
				teamBattingPower = character.getTeamBattingPower();
				superPlay = character.getSuperPlay();
			        }
			BattleElement<Integer, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Boolean, Boolean, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Boolean,Integer,Integer, Boolean, Integer, Integer, Boolean, Integer, Integer> Adc = new BattleElement<>(
					linerRating, position,linerType,linerName,growthPower, operationalPower, 0, teamBattingPower, 0, superPlay, false, true, 0, 0, 0, 0, 0, 0, 0, 0, false, 0,50, false, 0, 80, false, 0, 80);
			ArlMyAdc.add(Adc);
			for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlSupp) {
				linerRating = character.getLinerRating();
				position =character.getPosition();
				linerType = character.getLinerType();
				linerName = character.getLinerName();
				growthPower = character.getGrowthPower();
				operationalPower = character.getOperationalPower();
				teamBattingPower = character.getTeamBattingPower();
				superPlay = character.getSuperPlay();
			        }
			BattleElement<Integer, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Boolean, Boolean, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Boolean,Integer,Integer, Boolean, Integer, Integer, Boolean, Integer, Integer> Supp = new BattleElement<>(
					linerRating, position,linerType,linerName,growthPower, operationalPower, 0, teamBattingPower, 0, superPlay, false, true, 0, 0, 0, 0, 0, 0, 0, 0, false, 0,50, false, 0, 80, false, 0, 80);
			ArlMySupp.add(Supp);
			for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlEnemyTop) {
				linerRating = character.getLinerRating();
				position =character.getPosition();
				linerType = character.getLinerType();
				linerName = character.getLinerName();
				growthPower = character.getGrowthPower();
				operationalPower = character.getOperationalPower();
				teamBattingPower = character.getTeamBattingPower();
				superPlay = character.getSuperPlay();  
			}
			BattleElement<Integer, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Boolean, Boolean, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Boolean,Integer,Integer, Boolean, Integer, Integer, Boolean, Integer, Integer> ETop = new BattleElement<>(
					linerRating, position,linerType,linerName,growthPower, operationalPower, 0, teamBattingPower, 0, superPlay, false, true, 0, 0, 0, 0, 0, 0, 0, 0, false, 0,50, false, 0, 80, false, 0, 80);
			ArlEnemyTop.add(ETop);
			for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlEnemyJungler) {
				linerRating = character.getLinerRating();
				position =character.getPosition();
				linerType = character.getLinerType();
				linerName = character.getLinerName();
				growthPower = character.getGrowthPower();
				operationalPower = character.getOperationalPower();
				teamBattingPower = character.getTeamBattingPower();
				superPlay = character.getSuperPlay();
			}
			BattleElement<Integer, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Boolean, Boolean, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Boolean,Integer,Integer, Boolean, Integer, Integer, Boolean, Integer, Integer> EJungler = new BattleElement<>(
					linerRating, position,linerType,linerName,growthPower, operationalPower, 0, teamBattingPower, 0, superPlay, false, true, 0, 0, 0, 0, 0, 0, 0, 0, false, 0,50, false, 0, 0, false, 0, 0);
			ArlEnemyJungler.add(EJungler);
			for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlEnemyMid) {
				linerRating = character.getLinerRating();
				position =character.getPosition();
				linerType = character.getLinerType();
				linerName = character.getLinerName();
				growthPower = character.getGrowthPower();
				operationalPower = character.getOperationalPower();
				teamBattingPower = character.getTeamBattingPower();
				superPlay = character.getSuperPlay();
			}
			BattleElement<Integer, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Boolean, Boolean, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Boolean,Integer,Integer, Boolean, Integer, Integer, Boolean, Integer, Integer> EMid = new BattleElement<>(
					linerRating, position,linerType,linerName,growthPower, operationalPower, 0, teamBattingPower, 0, superPlay, false, true, 0, 0, 0, 0, 0, 0, 0, 0, false, 0,50, false, 0, 80, false, 0, 80);
			ArlEnemyMid.add(EMid);
			for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlEnemyAdc) {
				linerRating = character.getLinerRating();
				position =character.getPosition();
				linerType = character.getLinerType();
				linerName = character.getLinerName();
				growthPower = character.getGrowthPower();
				operationalPower = character.getOperationalPower();
				teamBattingPower = character.getTeamBattingPower();
				superPlay = character.getSuperPlay();
			}
			BattleElement<Integer, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Boolean, Boolean, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Boolean,Integer,Integer, Boolean, Integer, Integer, Boolean, Integer, Integer> EAdc = new BattleElement<>(
					linerRating, position,linerType,linerName,growthPower, operationalPower, 0, teamBattingPower, 0, superPlay, false, true, 0, 0, 0, 0, 0, 0, 0, 0, false, 0,50, false, 0, 80, false, 0, 80);
			ArlEnemyAdc.add(EAdc);
			for (CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> character : inputArlEnemySupp) {
				linerRating = character.getLinerRating();
				position =character.getPosition();
				linerType = character.getLinerType();
				linerName = character.getLinerName();
				growthPower = character.getGrowthPower();
				operationalPower = character.getOperationalPower();
				teamBattingPower = character.getTeamBattingPower();
				superPlay = character.getSuperPlay();
			}
			BattleElement<Integer, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Boolean, Boolean, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Boolean,Integer,Integer, Boolean, Integer, Integer, Boolean, Integer, Integer> ESupp = new BattleElement<>(
					linerRating, position,linerType,linerName,growthPower, operationalPower, 0, teamBattingPower, 0, superPlay, false, true, 0, 0, 0, 0, 0, 0, 0, 0, false, 0,50, false, 0, 80, false, 0, 80);
			ArlEnemySupp.add(ESupp);
	}
}
