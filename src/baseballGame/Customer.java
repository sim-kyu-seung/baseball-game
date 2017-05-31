package baseballGame;

public class Customer {

	private boolean isPlace;
	
	public void playBaseballGame(BattingPlace battingPlace) {
		System.out.println("Customer:battingPlace���� �ڸ��� �ִ��� ����ϴ�");
		isPlace=battingPlace.isPossiblePlace();
		if(isPlace){
			System.out.println("Customer: CoinChanger���� ������ ��ȯ�մϴ�");
			CoinChanger coinChanger = new CoinChanger();
			coinChanger.changeCoin(1000);
			playGame();
		
		}else{
			System.out.println("Customer: ���߿� �ٽ� ���ڽ��ϴ�");
		}
		
	}

	private void playGame() {
		System.out.println("Customer: �����忡 �� ������ �����մϴ�");
		CoinMachine coinMachine = new CoinMachine();
		coinMachine.insertCoin();
	}

}
