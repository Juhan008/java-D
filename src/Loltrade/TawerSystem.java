package Loltrade;

public class TawerSystem {
	int myTopTower = 0;// 탑 타워 
	int myMidTower = 0;// 미드 타워
	int myBottomTower = 0;//바텀 타워
	boolean myTopInhibitor = true;// 탑 억제기
	boolean myMidInhibitor = true;;//미드 억제기
	boolean myBottomInhibitor = true;;// 바텀 억제기
	
	int enemyTopTower = 0;// 탑 타워 
	int enemyMidTower = 0;// 미드 타워
	int enemyBottomTower = 0;//바텀 타워
	boolean enemyTopInhibitor = true;// 탑 억제기
	boolean enemyMidInhibitor = true;;//미드 억제기
	boolean enemyBottomInhibitor = true;;// 바텀 억제기
	int bouns = 4;
	double balon = 1.20;
	double dregon = 1.20;		
	
	boolean myTopLinerFlesh=true;
	boolean myMidLinerFlesh=true;
	boolean myBottomLinerFlesh=true;
	boolean enemyTopLinerFlesh=true;
	boolean enemyMidLinerFlesh=true;
	boolean enemyBottomLinerFlesh=true;
	
	
	public void myTawer() {
		if(myTopTower ==4) {
			System.out.println("아군 탑 1차포탑이 파괴되었습니다.");}
		if(myTopTower ==8) {
			System.out.println("아군 탑 2차포탑이 파괴되었습니다.");}
		if(myTopTower ==12) {
			System.out.println("아군 탑 3차포탑이 파괴되었습니다.");}
		if(myMidTower ==4) {
			System.out.println("아군 미드 1차포탑이 파괴되었습니다.");}
		if(myMidTower ==8) {
			System.out.println("아군 미드 2차포탑이 파괴되었습니다.");}
		if(myMidTower ==12) {
			System.out.println("아군 미드 3차포탑이 파괴되었습니다.");}
		if(myBottomTower ==4) {
			System.out.println("아군 바텀 1차포탑이 파괴되었습니다.");}
		if(myBottomTower ==8) {
			System.out.println("아군 바텀 2차포탑이 파괴되었습니다.");}
		if(myBottomTower ==12) {
			System.out.println("아군 바텀 3차포탑이 파괴되었습니다.");}
		
		if(myTopTower>12) //탑타워
			{myTopInhibitor=false;}
		if(myMidTower>12)// 미드 타워
			{myMidInhibitor=false;}//미드 억제기
		if(myBottomTower>12)//바텀 타워
			{myBottomInhibitor=false;}
	}
	public void enemyTawer() {
		if(enemyTopTower ==4) {
			System.out.println("적군 탑 1차포탑을 파괴하였습니다.");}
		if(enemyTopTower ==8) {
			System.out.println("적군 탑 2차포탑을 파괴하였습니다.");}
		if(enemyTopTower ==12) {
			System.out.println("적군 탑 3차포탑을 파괴하였습니다.");}
		if(enemyMidTower ==4) {
			System.out.println("적군 미드 1차포탑을 파괴하였습니다.");}
		if(enemyMidTower ==8) {
			System.out.println("적군 미드 2차포탑을 파괴하였습니다.");}
		if(enemyMidTower ==12) {
			System.out.println("적군 미드 3차포탑을 파괴하였습니다.");}
		if(enemyBottomTower ==4) {
			System.out.println("적군 바텀 1차포탑을 파괴하였습니다.");}
		if(enemyBottomTower ==8) {
			System.out.println("적군 바텀 2차포탑을 파괴하였습니다.");}
		if(enemyBottomTower ==12) {
			System.out.println("적군 바텀 3차포탑을 파괴하였습니다.");}
		
		if(enemyTopTower>12) //탑타워
			{enemyTopInhibitor=false;}
		if(enemyMidTower>12)// 미드 타워
			{enemyMidInhibitor=false;}//미드 억제기
		if(enemyBottomTower>12)//바텀 타워
			{enemyBottomInhibitor=false;}
	}
}
