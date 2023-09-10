package Loltrade;

public class CharacterKind  {
 
		
		static String characterName=" ";
		int ability=50;
		int cooperation=50;
		int operate= 50;
		int hp=5;
		int[] position =new int[] {0,0,0,0,0};
		int[] myInventory=new int[] {0,0,0,0,0};
		int[] myteam = new int[] {0,0,0,0,0};
		
		public int CharacterNum0()
		
		{
			characterName="기본 탑";
			ability=50;
			cooperation=50;
			operate=50;
			hp =5;
			myInventory[0]=1;
			position[0]=0;
			return myteam[0];
		}
		public int CharacterNum1()
		{
			characterName="기본 미드";
			ability=50;
			cooperation=50;
			operate=50;
			hp =5;
			myInventory[1]=1;
			position[1]=1;
			return myteam[1];
		}	
		public int CharacterNum2()
		{
			characterName="기본 정글";
			ability=50;
			cooperation=50;
			operate=50;
			hp =5;
			myInventory[2]=1;
			position[2]=2;
			return myteam[2];
		}
		public int CharacterNum3()
		{
			characterName="기본 원딜";
			ability=50;
			cooperation=50;
			operate=50;
			hp =5;
			myInventory[3]=1;
			position[3]=3;
			return myteam[3];
		}	
		public int CharacterNum4()
		{
			characterName="기본 서폿";
			ability=20;
			cooperation=50;
			operate=50;
			hp =5;
			myInventory[4]=1;
			position[4]=4;
			return myteam[4];
	
		}	
}