package baseballGame;

public class Director {
	public static void main(String[] args) {
		Director director = new Director();
		director.playScenario();
		
	}

	private void playScenario() {
		System.out.println("Director:�߱������� �ó����� �����մϴ�");
		System.out.println("Director:�߱� ������ ����");
		BattingPlace battingPlace = new BattingPlace();
		System.out.println("Director:������ȯ�� ����");
		CoinChanger coinChanger = new CoinChanger();
		System.out.println("Director:������� ����");
		CoinMachine coinMachine = new CoinMachine();
		System.out.println("Director:Customer�� �����մϴ�");
		Customer customer = new Customer();
		System.out.println("Director:Customer���� ������ ��ȯ�϶�� �����մϴ�");
		customer.changeCoin(coinChanger);
		System.out.println("Director:Customer���� �����忡 ������ �����մϴ�");
		customer.playBaseballGame(battingPlace);
		
	}
}
