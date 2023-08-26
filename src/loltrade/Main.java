package loltrade;
import java.util.Scanner;
public class Main extends Lobby {

	
	
public Main(String lobbyanswer1, String lobbyanswer2) {
		super(lobbyanswer1, lobbyanswer2);
		// TODO Auto-generated constructor stub
	}

public static void main(String []args) {
	Scanner sc =new Scanner(System.in);	
	
	System.out.println("당신의 이름은 무엇입니까?");
	
	Myinfo myinfo= new Myinfo();
	
	
	
	String name = sc.nextLine();
	 Myinfo.myName(name);
	 
	System.out.println(name+"님 환영합니다.");
	
	while(true) {
	System.out.println(lobbyanswer1); 
	System.out.println(lobbyanswer2);
	
	
	}
}
}
