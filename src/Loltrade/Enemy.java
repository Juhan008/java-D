package Loltrade;

public class Enemy {

	String characterName=" ";
	int ability=50;
	int cooperation=50;
	int operate= 50;
	int[] position =new int[] {0,0,0,0,0};
	double enemyDifficulty =0.00;
	int previousOrder=1;
	
	public int globalEnemy0()
	{
	characterName="초기 적팀 탑";
	ability=50;
	cooperation=50;
	operate=50;
	position[0]=0;
	return 0;
	}
	public int globalEnemy1()
	{
		characterName="초기 적팀 미드";
		ability=50;
		cooperation=50;
		operate=50;
		position[1]=1;
		return 0;
	}	
	public int globalEnemy2()
	{
		characterName="초기 적팀 정글";
		ability=50;
		cooperation=50;
		operate=50;
		position[2]=2;
		return 0;
	}
	public int globalEnemy3()
	{
		characterName="초기 적팀 원딜";
		ability=50;
		cooperation=50;
		operate=50;
		position[3]=3;
		return 0;
	}	
	public int globalEnemy4()
	{
		characterName="초기 적팀 서폿";
		ability=20;
		cooperation=50;
		operate=50;
		position[4]=4;
		return 0;
	
	}	
	public int enemyOrder() {
		double previousOrderRate = Math.random();
        
        //이전 난수가 나올 확률로 난이도 조절
        if (previousOrderRate <= enemyDifficulty) {
        }
        else {
            previousOrder = (int) (Math.random() * 3) + 1;
        }
        return previousOrder;
	}
}
