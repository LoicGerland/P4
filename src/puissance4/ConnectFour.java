package puissance4;

import java.util.List;

import gameboard.GameBoard;
import gameboard.Player;
import gameboard.Turn;


public class ConnectFour extends GameBoard {

	public ConnectFour(int width, int length, List<Turn> history) {
		super(width, length, history);
		// TODO Auto-generated constructor stub
	}
	
	public ConnectFour(int width, int length){
		super(width,length);
	}

	@Override
	public void play(Turn t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Player win() {
		// TODO Auto-generated method stub
		return null;
	}

}
