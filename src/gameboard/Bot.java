package gameboard;

import java.util.Random;

public class Bot extends Player {

	
	
	public Bot(int number,GameBoard board) {
		super(number,board);
		
	}

	@Override
	public Turn play() {
		int[][] plat = board.board();
		Random pos = new Random();
		int x = pos.nextInt() % plat.length;
		int y = pos.nextInt() % plat[0].length;
		switch (plat[x][y]){
		case 0 :
			return new Turn(this, new Position(x,y) );
			
		case 1 :  play();
			break;
			
		case 2 : play();
			break;
		}
		return null;
		
		
		
	}
	
	

}
