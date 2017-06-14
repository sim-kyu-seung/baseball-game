package baseballGame;

public class Director {
	public static void main(String[] args) {
		Director director = new Director();
		director.playScenario();
		
	}

	private void playScenario() {
		System.out.println("Director:야구배팅장 시나리오 시작합니다");
		System.out.println("Director:야구 배팅장 생성");
		BattingPlace battingPlace = new BattingPlace();
		System.out.println("Director:동전교환원 생성");
		CoinChanger coinChanger = new CoinChanger();
		System.out.println("Director:동전기계 생성");
		CoinMachine coinMachine = new CoinMachine();
		System.out.println("Director:Customer을 생성합니다");
		Customer customer = new Customer();
		System.out.println("Director:Customer에게 동전을 교환하라고 지시합니다");
		customer.changeCoin(coinChanger);
		System.out.println("Director:Customer에게 배팅장에 들어가도록 지시합니다");
		customer.playBaseballGame(battingPlace);
		
	}
}
