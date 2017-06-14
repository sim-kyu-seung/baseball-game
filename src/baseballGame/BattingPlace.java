package baseballGame;

import java.util.ArrayList;
import java.util.List;

public class BattingPlace {

	private int battingCage = 5;	// 게임 가능한 배팅장 수
	private int cageNum=0;
	private boolean isPossibleGame;
	private List<BattingCage>cage = new ArrayList<BattingCage>();
	
	
	public BattingPlace() {
		System.out.println("BattingCage 생성");
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
			System.out.println("battingPlace : 배팅가능한 배팅장 갯수는 "+cageNum+"개 입니다.");
			isPossibleGame=true;
			return isPossibleGame;
		} else {
			System.out.println("battingPlace : 배팅장이 가득차 있습니다.");
			isPossibleGame=false;
			return isPossibleGame;
			
		}
	}

}
