package battleSystem;

import java.util.Random;

public class ComPattern {
	public int comRandomNumber=0;
    
	public void comOenByTen() {
        Random random = new Random();
        comRandomNumber = random.nextInt(10) + 1;  
    }
	public void comOenByThree() {
        Random random = new Random();
        comRandomNumber = random.nextInt(3) + 1;  
    }
	public void comOenByFive() {
        Random random = new Random();
        comRandomNumber = random.nextInt(5) + 1;  
    }
	
}
