package characterMangemaet;

public class MarketCharacter {
	public void topLiner() {//탑라이너
        // CharaterRegulation제네릭을 사용하여 캐릭터 객체 생성
        CharaterRegulation<Integer, 
        				   String, 
        				   String, 
        				   String, 
        				   Integer, 
        				   Integer, 
        				   Integer, 
        				   Integer, 
        				   Boolean, 
        				   Integer, Boolean> 
        top5 = new CharaterRegulation<>(
                5,        // 등릅 Liner Rating
                "Top",      // 포지션 Position
                "Offensive",// 타입 Liner Type
                "탑오", // 이름 Liner Name
                50,         // 성장력 Growth Power
                50,       //  운영력 Operational Power
                50,       // 한타력 Team Batting Power
                80,       // 슈퍼플레이 Super Play
                true,          // 장착유무 Equipped or Not
                100,     // 구매 가격Transfer Price
                true     // 보유유무 Having or Not
            );
        
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		top4 = new CharaterRegulation<>(
				4,        // 등릅 Liner Rating
				"Top",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"탑사", // 이름 Liner Name
				60,         // 성장력 Growth Power
				60,       //  운영력 Operational Power
				60,       // 한타력 Team Batting Power
				90,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				200,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
       
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		top3 = new CharaterRegulation<>(
				3,        // 등릅 Liner Rating
				"Top",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"탑삼", // 이름 Liner Name
				70,         // 성장력 Growth Power
				70,       //  운영력 Operational Power
				70,       // 한타력 Team Batting Power
				100,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				300,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
        
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		top2 = new CharaterRegulation<>(
				4,        // 등릅 Liner Rating
				"Top",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"탑이", // 이름 Liner Name
				80,         // 성장력 Growth Power
				80,       //  운영력 Operational Power
				80,       // 한타력 Team Batting Power
				110,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				400,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		top1 = new CharaterRegulation<>(
				4,        // 등릅 Liner Rating
				"Top",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"탑일", // 이름 Liner Name
				90,         // 성장력 Growth Power
				90,       //  운영력 Operational Power
				90,       // 한타력 Team Batting Power
				120,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				500,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
    }
	public void jungler() {//정글러
        // CharaterRegulation제네릭을 사용하여 캐릭터 객체 생성
        CharaterRegulation<Integer, 
        				   String, 
        				   String, 
        				   String, 
        				   Integer, 
        				   Integer, 
        				   Integer, 
        				   Integer, 
        				   Boolean, 
        				   Integer, Boolean> 
        jungler5 = new CharaterRegulation<>(
                5,        // 등릅 Liner Rating
                "jungler",      // 포지션 Position
                "Offensive",// 타입 Liner Type
                "정오", // 이름 Liner Name
                50,         // 성장력 Growth Power
                50,       //  운영력 Operational Power
                50,       // 한타력 Team Batting Power
                80,       // 슈퍼플레이 Super Play
                true,          // 장착유무 Equipped or Not
                100,     // 구매 가격Transfer Price
                true     // 보유유무 Having or Not
            );
        
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		jungler4 = new CharaterRegulation<>(
				4,        // 등릅 Liner Rating
				"jungler",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"정사", // 이름 Liner Name
				60,         // 성장력 Growth Power
				60,       //  운영력 Operational Power
				60,       // 한타력 Team Batting Power
				90,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				200,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
       
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		jungler3 = new CharaterRegulation<>(
				3,        // 등릅 Liner Rating
				"jungler",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"정삼", // 이름 Liner Name
				70,         // 성장력 Growth Power
				70,       //  운영력 Operational Power
				70,       // 한타력 Team Batting Power
				100,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				300,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
        
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		jungler2 = new CharaterRegulation<>(
				4,        // 등릅 Liner Rating
				"jungler",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"정이", // 이름 Liner Name
				80,         // 성장력 Growth Power
				80,       //  운영력 Operational Power
				80,       // 한타력 Team Batting Power
				110,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				400,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		jungler1 = new CharaterRegulation<>(
				4,        // 등릅 Liner Rating
				"jungler",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"정일", // 이름 Liner Name
				90,         // 성장력 Growth Power
				90,       //  운영력 Operational Power
				90,       // 한타력 Team Batting Power
				120,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				500,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
    }
	public void midLiner() {//미드라이너
        // CharaterRegulation제네릭을 사용하여 캐릭터 객체 생성
        CharaterRegulation<Integer, 
        				   String, 
        				   String, 
        				   String, 
        				   Integer, 
        				   Integer, 
        				   Integer, 
        				   Integer, 
        				   Boolean, 
        				   Integer, Boolean> 
        mid5 = new CharaterRegulation<>(
                5,        // 등릅 Liner Rating
                "mid",      // 포지션 Position
                "Offensive",// 타입 Liner Type
                "미오", // 이름 Liner Name
                50,         // 성장력 Growth Power
                50,       //  운영력 Operational Power
                50,       // 한타력 Team Batting Power
                80,       // 슈퍼플레이 Super Play
                true,          // 장착유무 Equipped or Not
                100,     // 구매 가격Transfer Price
                true     // 보유유무 Having or Not
            );
        
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		mid4 = new CharaterRegulation<>(
				4,        // 등릅 Liner Rating
				"mid",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"미사", // 이름 Liner Name
				60,         // 성장력 Growth Power
				60,       //  운영력 Operational Power
				60,       // 한타력 Team Batting Power
				90,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				200,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
       
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		mid3 = new CharaterRegulation<>(
				3,        // 등릅 Liner Rating
				"mid",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"미삼", // 이름 Liner Name
				70,         // 성장력 Growth Power
				70,       //  운영력 Operational Power
				70,       // 한타력 Team Batting Power
				100,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				300,     // 구매 가격Transfer Price
				false     // 보유유무 Equipped or Not
		);
        
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		mid2 = new CharaterRegulation<>(
				4,        // 등릅 Liner Rating
				"mid",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"미이", // 이름 Liner Name
				80,         // 성장력 Growth Power
				80,       //  운영력 Operational Power
				80,       // 한타력 Team Batting Power
				110,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				400,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		mid1 = new CharaterRegulation<>(
				4,        // 등릅 Liner Rating
				"mid",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"미일", // 이름 Liner Name
				90,         // 성장력 Growth Power
				90,       //  운영력 Operational Power
				90,       // 한타력 Team Batting Power
				120,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				500,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
    }
	public void adCarry() {//원거리딜러
        // CharaterRegulation제네릭을 사용하여 캐릭터 객체 생성
        CharaterRegulation<Integer, 
        				   String, 
        				   String, 
        				   String, 
        				   Integer, 
        				   Integer, 
        				   Integer, 
        				   Integer, 
        				   Boolean, 
        				   Integer, Boolean> 
        adc5 = new CharaterRegulation<>(
                5,        // 등릅 Liner Rating
                "adc",      // 포지션 Position
                "Offensive",// 타입 Liner Type
                "원오", // 이름 Liner Name
                50,         // 성장력 Growth Power
                50,       //  운영력 Operational Power
                50,       // 한타력 Team Batting Power
                80,       // 슈퍼플레이 Super Play
                true,          // 장착유무 Equipped or Not
                100,     // 구매 가격Transfer Price
                true     // 보유유무 Having or Not
            );
        
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		adc4 = new CharaterRegulation<>(
				4,        // 등릅 Liner Rating
				"adc",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"원사", // 이름 Liner Name
				60,         // 성장력 Growth Power
				60,       //  운영력 Operational Power
				60,       // 한타력 Team Batting Power
				90,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				200,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
       
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		adc3 = new CharaterRegulation<>(
				3,        // 등릅 Liner Rating
				"adc",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"원삼", // 이름 Liner Name
				70,         // 성장력 Growth Power
				70,       //  운영력 Operational Power
				70,       // 한타력 Team Batting Power
				100,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				300,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
        
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		adc2 = new CharaterRegulation<>(
				4,        // 등릅 Liner Rating
				"adc",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"원이", // 이름 Liner Name
				80,         // 성장력 Growth Power
				80,       //  운영력 Operational Power
				80,       // 한타력 Team Batting Power
				110,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				400,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		adc1 = new CharaterRegulation<>(
				4,        // 등릅 Liner Rating
				"adc",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"원일", // 이름 Liner Name
				90,         // 성장력 Growth Power
				90,       //  운영력 Operational Power
				90,       // 한타력 Team Batting Power
				120,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				500,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
    }
	public void supporter() {//서포터
        // CharaterRegulation제네릭을 사용하여 캐릭터 객체 생성
        CharaterRegulation<Integer, 
        				   String, 
        				   String, 
        				   String, 
        				   Integer, 
        				   Integer, 
        				   Integer, 
        				   Integer, 
        				   Boolean, 
        				   Integer, Boolean> 
        supporter5 = new CharaterRegulation<>(
                5,        // 등릅 Liner Rating
                "supporter",      // 포지션 Position
                "Offensive",// 타입 Liner Type
                "서오", // 이름 Liner Name
                50,         // 성장력 Growth Power
                50,       //  운영력 Operational Power
                50,       // 한타력 Team Batting Power
                80,       // 슈퍼플레이 Super Play
                true,          // 장착유무 Equipped or Not
                100,     // 구매 가격Transfer Price
                true     // 보유유무 Having or Not
            );
        
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		supporter4 = new CharaterRegulation<>(
				4,        // 등릅 Liner Rating
				"supporter",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"서사", // 이름 Liner Name
				60,         // 성장력 Growth Power
				60,       //  운영력 Operational Power
				60,       // 한타력 Team Batting Power
				90,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				200,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
       
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		supporter3 = new CharaterRegulation<>(
				3,        // 등릅 Liner Rating
				"supporter",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"서삼", // 이름 Liner Name
				70,         // 성장력 Growth Power
				70,       //  운영력 Operational Power
				70,       // 한타력 Team Batting Power
				100,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				300,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
        
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		supporter2 = new CharaterRegulation<>(
				4,        // 등릅 Liner Rating
				"supporter",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"서이", // 이름 Liner Name
				80,         // 성장력 Growth Power
				80,       //  운영력 Operational Power
				80,       // 한타력 Team Batting Power
				110,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				400,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
        CharaterRegulation<Integer, 
				   String, 
				   String, 
				   String, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Integer, 
				   Boolean, 
				   Integer, Boolean> 
		supporter1 = new CharaterRegulation<>(
				4,        // 등릅 Liner Rating
				"supporter",      // 포지션 Position
				"Offensive",// 타입 Liner Type
				"서일", // 이름 Liner Name
				90,         // 성장력 Growth Power
				90,       //  운영력 Operational Power
				90,       // 한타력 Team Batting Power
				120,       // 슈퍼플레이 Super Play
				false,          // 장착유무 Equipped or Not
				500,     // 구매 가격Transfer Price
				false     // 보유유무 Having or Not
		);
    }
}