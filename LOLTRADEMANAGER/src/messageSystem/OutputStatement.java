package messageSystem;


public class OutputStatement {
	public void Registration() {
		System.out.println("안녕하세요 감독님");
		System.out.println("이름이 어떻게 되시나요?");
	}
	public void CheckRegistration (String name) {
		System.out.println(name+" 감독님 어서오세요.");
		System.out.println("감독님 능력을 보여주세요.");
	}
	public void Loading() {
		System.out.println("Loading.....");
	}
}
