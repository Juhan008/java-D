package characterMangement;

public class EnemyCharater {
    // 탑 라이너
    public CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> topLiner() {
        return new CharaterRegulation<>(
            5,        // 등급 Liner Rating
            "Top",    // 포지션 Position
            "Offensive", // 타입 Liner Type
            "적탑오",    // 이름 Liner Name
            50,       // 성장력 Growth Power
            50,       // 운영력 Operational Power
            50,       // 한타력 Team Batting Power
            80,       // 슈퍼플레이 Super Play
            true,     // 장착유무 Equipped or Not
            100,      // 구매 가격 Transfer Price
            true      // 이적유무 Transfer Status
        );
    }
    
    // 정글러 캐릭터 생성
    public CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> jungler() {
        return new CharaterRegulation<>(
            5,        // 등급 Liner Rating
            "Jungler", // 포지션 Position
            "Offensive", // 타입 Liner Type
            "적정오",    // 이름 Liner Name
            50,       // 성장력 Growth Power
            50,       // 운영력 Operational Power
            50,       // 한타력 Team Batting Power
            80,       // 슈퍼플레이 Super Play
            true,     // 장착유무 Equipped or Not
            100,      // 구매 가격 Transfer Price
            true      // 이적유무 Transfer Status
        );
    }
    
    // 미드 라이너 캐릭터 생성
    public CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> midLiner() {
        return new CharaterRegulation<>(
            5,        // 등급 Liner Rating
            "Mid",    // 포지션 Position
            "Offensive", // 타입 Liner Type
            "적미오",    // 이름 Liner Name
            50,       // 성장력 Growth Power
            50,       // 운영력 Operational Power
            50,       // 한타력 Team Batting Power
            80,       // 슈퍼플레이 Super Play
            true,     // 장착유무 Equipped or Not
            100,      // 구매 가격 Transfer Price
            true      // 이적유무 Transfer Status
        );
    }
    
    // 원거리 딜러 캐릭터 생성
    public CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> adCarry() {
        return new CharaterRegulation<>(
            5,        // 등급 Liner Rating
            "Adc",    // 포지션 Position
            "Offensive", // 타입 Liner Type
            "적원오",    // 이름 Liner Name
            50,       // 성장력 Growth Power
            50,       // 운영력 Operational Power
            50,       // 한타력 Team Batting Power
            80,       // 슈퍼플레이 Super Play
            true,     // 장착유무 Equipped or Not
            100,      // 구매 가격 Transfer Price
            true      // 이적유무 Transfer Status
        );
    }
    
    // 서포터 캐릭터 생성
    public CharaterRegulation<Integer, String, String, String, Integer, Integer, Integer, Integer, Boolean, Integer, Boolean> supporter() {
        return new CharaterRegulation<>(
            5,        // 등급 Liner Rating
            "Supporter", // 포지션 Position
            "Offensive", // 타입 Liner Type
            "적서오",    // 이름 Liner Name
            50,       // 성장력 Growth Power
            50,       // 운영력 Operational Power
            50,       // 한타력 Team Batting Power
            80,       // 슈퍼플레이 Super Play
            true,     // 장착유무 Equipped or Not
            100,      // 구매 가격 Transfer Price
            true      // 이적유무 Transfer Status
        );
    }
}
