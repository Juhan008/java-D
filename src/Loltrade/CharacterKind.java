package Loltrade;

public class CharacterKind  {
 
		
		static String characterName=" ";
		static int ability=50;
		static int cooperation=50;
		static int operate= 50;
		static int hp=5;
		static int[] myInventory=new int[] {0,0,0,0,0};
		static int[] myteam = new int[] {0,0,0,0,0};
		public static int CharacterNum01()
		
			{
			characterName="기본 탑";
			ability=50;
			cooperation=50;
			operate=50;
			hp =5;
			myInventory[0]=1;
			
			return myteam[0];
			}
		public static int CharacterNum02()
		{
			characterName="기본 미드";
			ability=50;
			cooperation=50;
			operate=50;
			hp =5;
			myInventory[1]=1;
			
			return myteam[1];
		}	
		public static int CharacterNum03()
		{
			characterName="기본 정글";
			ability=50;
			cooperation=50;
			operate=50;
			hp =5;
			myInventory[2]=1;
			
			return myteam[2];
		}
		public static int CharacterNum04()
		{
			characterName="기본 정글";
			ability=50;
			cooperation=50;
			operate=50;
			hp =5;
			myInventory[3]=1;
			
			return myteam[3];
		}	
		public static int CharacterNum05()
		{
			characterName="기본 정글";
			ability=50;
			cooperation=50;
			operate=50;
			hp =5;
			myInventory[4]=1;;
			
			return myteam[4];
	
		}	
}