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
	
	public Bot(int num,String name) {
		super(num,name);
		this.pos = new Random();		
	}
	

	@Override
	public Turn play() throws InvalidTurnException {
		int x = pos.nextInt(ConnectFour.WIDTH-1);
		int y = pos.nextInt(ConnectFour.HEIGHT-1);
			return new Turn(this, new Position(x,y) );		
		
	}
}
