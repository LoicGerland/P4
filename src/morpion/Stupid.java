package morpion;

import gameboard.InvalidTurnException;
import gameboard.Player;
import gameboard.Position;
import gameboard.Turn;

import java.util.Random;

public class Stupid extends Player {

private Random pos;
	
	public Stupid() {
		super();
		this.pos = new Random();
	}
	
	public Stupid(int num,String name) {
		super(num,name);
		this.pos = new Random();		
	}
	

	@Override
	public Turn play() throws InvalidTurnException {
		int x = pos.nextInt(TicTacToe.WIDTH);
		int y = pos.nextInt(TicTacToe.HEIGHT);
			return new Turn(this, new Position(x,y) );		
		
	}
}
