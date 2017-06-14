package baseballGame;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private List<BattingCage>cage = new ArrayList<BattingCage>();
	private boolean isPlace;
	private int money = 1000;
	private int numOf500;

	public void playBaseballGame(BattingPlace battingPlace) {
		System.out.println("Customer:battingPlace���� �ڸ��� �ִ��� ����ϴ�");
		isPlace = battingPlace.isPossiblePlace();
		if (isPlace) {
			cage.get(3);	// 3�� ������ ����
			playGame();
		} else {
			System.out.println("Customer: ���߿� �ٽ� ���ڽ��ϴ�");
		}

	}

	private void playGame() {
		cage.get(3).setIsused(false);
		System.out.println("Customer: �����忡 �� ������ �����մϴ�");
		// 500��¥���� ������ �ְ� �ƴϸ� ���� ���ٰ��ϰ� ������
		if (numOf500 > 0) {
			CoinMachine coinMachine = new CoinMachine();
			coinMachine.insertCoin();
			numOf500--;
		} else {
			System.out.println("Customer: ���� �����մϴ�.");
		}
	}

	public void changeCoin(CoinChanger coinChanger) {
		numOf500 = coinChanger.putInMoney(1000);
	}

}
