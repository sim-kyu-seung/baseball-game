package baseballGame;

import java.util.ArrayList;
import java.util.List;

public class BattingPlace {

	private int battingCage = 5;	// ���� ������ ������ ��
	private int cageNum=0;
	private boolean isPossibleGame;
	private List<BattingCage>cage = new ArrayList<BattingCage>();
	
	
	public BattingPlace() {
		System.out.println("BattingCage ����");
		for(int i=1; i<=battingCage; i++) {
			cage.add(new BattingCage(i));
		}
	}


	public boolean isPossiblePlace() {
		for(int i=0; i<cage.size(); i++){
			if(cage.get(i).isIsused()==false){
				cageNum++;
			}
		}
		if(cageNum>=1){
			System.out.println("battingPlace : ���ð����� ������ ������ "+cageNum+"�� �Դϴ�.");
			isPossibleGame=true;
			return isPossibleGame;
		} else {
			System.out.println("battingPlace : �������� ������ �ֽ��ϴ�.");
			isPossibleGame=false;
			return isPossibleGame;
			
		}
	}

}
