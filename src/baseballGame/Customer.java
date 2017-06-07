package baseballGame;

public class Customer {

	private boolean isPlace;
	private int money = 1000;
	private int numOf500;
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
		//500��¥���� ������ �ְ� �ƴϸ� ���� ���ٰ��ϰ� ������
		if(numOf500>0) {
			CoinMachine coinMachine = new CoinMachine();
			coinMachine.insertCoin();
			numOf500--;
		}
		else {
			System.out.println("Customer: ���� �����մϴ�.");
		}
			
	}

	public void changeCoin(CoinChanger coinChanger) {
		numOf500 = coinChanger.putInMoney(1000);
	}

}
