package spice.tic_tac_toe;

import java.util.Random;

public class AI extends Player{
	
	public AI(char mark){
		super(getCompName(),mark);
	}
	
	private static String getCompName(){
		Random r = new Random();
		int name = r.nextInt(6);
		if(name == 0){
			return "HAL 9000";
		}
		else if(name == 1){
			return "Glados";
		}
		else if(name == 2){
			return "Deep Blue";
		}
		else if(name == 3){
			return "Megatron";
		}
		else if(name == 4){
			return "Ultron";
		}
		else{
			return "IBM's Watson";
		}
	}
	
	public int getMove(GameBoard gameBoard){
		
		for(int i = 1; i < 10; i++){
			if(gameBoard.isLegalMove(i)){
				return i;
			}
		}
		//this should never happen
		return 0;
	}
}
