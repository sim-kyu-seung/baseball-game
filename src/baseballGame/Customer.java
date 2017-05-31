package baseballGame;

public class Customer {

	private boolean isPlace;
	
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
		CoinMachine coinMachine = new CoinMachine();
		coinMachine.insertCoin();
	}

}
