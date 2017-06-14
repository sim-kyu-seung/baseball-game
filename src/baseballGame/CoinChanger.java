package baseballGame;

public class CoinChanger {

	public void changeCoin(int money) {
		System.out.println("CoinChanger: 500원짜리 동전 2개입니다");
	}

	public int putInMoney(int i) {
		int numOf500 = i/500;
		System.out.println("동전 교환 완료");
		return numOf500;
	}

}
