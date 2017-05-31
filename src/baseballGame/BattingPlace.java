package baseballGame;

public class BattingPlace {

	private int battingCage = 2;	// 게임 가능한 배팅장 수
	
	public void makeBattingCage() {
		// TODO Auto-generated method stub
		
	}

	public boolean isPossiblePlace() {
		// TODO Auto-generated method stub
		if(battingCage>=1) {
			System.out.println("battingCage: 자리가 있습니다");
			return true;
		}
		else {
			System.out.println("battingCage: 자리가 없습니다");
			return false;
		}
	}

}
