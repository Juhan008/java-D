package weekendTesk2;



class AWM{
		 
	
	public String kind = "SR";
	public String bullet = ".300megnum";
	public String name = "AWM";
	public int speedOfABullet= 945; //탄
	public int stoppingPower = 40000;//저지력
	public int minimumRange = 100;//최소 범위
	public int maximumRange = 1000;//최대 범위
	public double theSpeedOfAProjection = 1.850;
	public int volume = 500;//소모 용
	 
	public String[] acquisitionDestination = new String[] //출현맵
			{"erangel","miramar","sanok","vikendi","karakin","heaven","paramo","taeigo"};
	public String[][] parts = new String[][]//파츠
		{
		{"총구","SR보정기"},{"총구","SR소염기"},{"총구","SR소음기"},
		{"조준경","레드도트사이트"},{"조준경","홀로그램조준기"},{"조준경","2배율 스코프"},{"조준경","4배율 스코프"},
		{"조준경","8배율 스코프"},{"조준경","3배율 스코프"},{"조준경","16배율 스코프"},{"조준경","캔티드사이트"},{"조준경","6배율 스코프"},
		{"탄창","SR대용량 탄창"},{"탄창","SR대용량 퀵드로우 탄창"},{"탄창","SR퀵드로우 탄창"},
		{"개머리판","칙패드"}
		};



	public double[][] damageScale = new double[/*타격부위*/][/*방어구 레벨*/]{
	
	
	
	{0,262.5},{1,183.75},{2,157.5},{3,118.13},
	{0,196.88},{1,137.81},{2,118.13},{3,88.59},
	{0,136.5},{1,95.55},{2,81.9},{3,61.43},
	{0,150.15},{1,105.11},{2,90.09},{3,67.57},
	{0,129.68},{1,90.77},{2,77.81},{3,58.35},
	{0,59.85},{1,59.85},{2,59.85},{3,59.85},
	{0,49.88},{1,49.88},{2,49.88},{3,49.88},
	{0,29.93},{1,29.93},{2,29.93},{3,29.93}
	};

	
		
	 
}
	
class Groza{
		 
	
	public String kind = "AR";
	public String bullet = "7.6mm";
	public String name = "Groza";
	public int speedOfABullet= 715; //탄속
	public int stoppingPower = 10000;//저지력
	public int minimumRange = 100;//최소 범위
	public int maximumRange = 300;//최대 범위
	public double theSpeedOfAProjection = 0.080;
	public int volume = 500;//소모 용량
	 
	public String[] acquisitionDestination = new String[] //출현맵
			{"erangel","miramar","sanok","vikendi","karakin","heaven","paramo","taeigo"};
	public String[][] parts = new String[][]//파츠
		{
		{"총구","AR소음기"},
		{"조준경","레드도트사이트"},{"조준경","홀로그램조준기"},{"조준경","2배율 스코프"},{"조준경","4배율 스코프"},
		{"조준경","3배율 스코프"},{"조준경","6배율 스코프"},
		{"탄창","AR대용량 탄창"},{"탄창","AR대용량 퀵드로우 탄창"},{"탄창","AR퀵드로우 탄창"},
		{"개머리판","칙패드"}
		};



	public double[][] damageScale = new double[/*타격부위*/][/*방어구 레벨*/]{
	
	
		{0,110.45},{1,77.32},{2,66.27},{3,49.7},
		{0,82.84},{1,57.99},{2,49.7},{3,37.28},
		{0,47},{1,32.9},{2,28.2},{3,21.15},
		{0,51.7},{1,36.19},{2,31.02},{3,23.27},
		{0,44.65},{1,31.26},{2,26.79},{3,20.09},
		{0,25.38},{1,25.38},{2,25.38},{3,25.38},
		{0,21.15},{1,21.15},{2,21.15},{3,21.15},
		{0,12.69},{1,12.69},{2,12.69},{3,12.69}
	
	};

		
		
	
		
	 
}
	
class UMP45{
		 
	
	public String kind = "SMG";
	public String bullet = ".45ACP";
	public String name = "UMP45";
	public int speedOfABullet= 360; //탄속
	public int stoppingPower = 7000;//저지력
	public int minimumRange = 100;//최소 범위
	public int maximumRange = 300;//최대 범위
	public double theSpeedOfAProjection = 0.092;
	public int volume = 500;//소모 용량
	 
	public String[] acquisitionDestination = new String[] //출현맵
			{"erangel","miramar","sanok","vikendi","karakin","heaven","paramo","taeigo"};
	public String[][] parts = new String[][]//파츠
		{
		{"총구","SMG소음기"},{"총구","SMG소음기"},{"총구","SMG소음기"},
		{"손잡이","앵글손잡이"},{"손잡이","수직손잡이"},{"손잡이","하프손잡이"},{"손잡이","라이트손잡이"},{"손잡이","엄지손잡이"},{"손잡이","레이저사이트"},
		{"조준경","레드도트사이트"},{"조준경","홀로그램조준기"},{"조준경","2배율 스코프"},{"조준경","4배율 스코프"},
		{"조준경","3배율 스코프"},{"조준경","캔티드사이트"},{"조준경","6배율 스코프"},
		{"탄창","SMG대용량 탄창"},{"탄창","SMG대용량 퀵드로우 탄창"},{"탄창","SMG퀵드로우 탄창"},
		{"개머리판","칙패드"}
		};



	public double[][] damageScale = new double[/*타격부위*/][/*방어구 레벨*/]{
		
	
	{0,73.8},{1,51.66},{2,44.28},{3,33.21},
	{0,55.35},{1,38.75},{2,33.21},{3,24.91},
	{0,43.05},{1,30.14},{2,25.83},{3,19.37},
	{0,47.36},{1,33.15},{2,28.41},{3,21.31},
	{0,40.9},{1,28.63},{2,24.54},{3,18.4},
	{0,31.98},{1,31.98},{2,31.98},{3,31.98},
	{0,26.65},{1,26.65},{2,26.65},{3,26.65},
	{0,15.99},{1,15.99},{2,15.99},{3,15.99}
	
	};
}
