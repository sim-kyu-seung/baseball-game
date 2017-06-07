package baseballGame;

public class Customer {

	private boolean isPlace;
	private int money = 1000;
	private int numOf500;
	public void playBaseballGame(BattingPlace battingPlace) {
		System.out.println("Customer:battingPlace에게 자리가 있는지 물어봅니다");
		isPlace=battingPlace.isPossiblePlace();
		if(isPlace){
			System.out.println("Customer: CoinChanger에게 동전을 교환합니다");
			CoinChanger coinChanger = new CoinChanger();
			coinChanger.changeCoin(1000);
			playGame();
		
		}else{
			System.out.println("Customer: 나중에 다시 오겠습니다");
		}
		
	}

	private void playGame() {
		System.out.println("Customer: 배팅장에 들어가 동전을 투입합니다");
		//500원짜리가 있으면 넣고 아니면 돈이 없다고하고 끝내기
		if(numOf500>0) {
			CoinMachine coinMachine = new CoinMachine();
			coinMachine.insertCoin();
			numOf500--;
		}
		else {
			System.out.println("Customer: 돈이 부족합니다.");
		}
			
	}

	public void changeCoin(CoinChanger coinChanger) {
		numOf500 = coinChanger.putInMoney(1000);
	}

}
