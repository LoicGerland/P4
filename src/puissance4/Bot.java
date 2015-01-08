package puissance4;

import gameboard.InvalidTurnException;
import gameboard.Player;
import gameboard.Position;
import gameboard.Turn;

import java.util.Random;

public class Bot extends Player {

	private Random pos;
	
	public Bot() {
		super();
		this.pos = new Random();
	}
	
	public Bot(String name) {
		super(name);
		this.pos = new Random();		
	}
	

	@Override
	public Turn play() throws InvalidTurnException {
		int x = pos.nextInt() % ConnectFour.WIDTH;
		int y = pos.nextInt() % ConnectFour.HEIGHT;
			return new Turn(this, new Position(x,y) );		
		
	}
}
