package baseballGame;

public class BattingPlace {

	private int battingCage = 2;	// ���� ������ ������ ��
	
	public void makeBattingCage() {
		// TODO Auto-generated method stub
		
	}

	public boolean isPossiblePlace() {
		// TODO Auto-generated method stub
		if(battingCage>=1) {
			System.out.println("battingCage: �ڸ��� �ֽ��ϴ�");
			return true;
		}
		else {
			System.out.println("battingCage: �ڸ��� �����ϴ�");
			return false;
		}
	}

}
