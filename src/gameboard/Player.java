package gameboard;

public abstract class Player {

	private static int number;
	protected static GameBoard board;
	
	public Player(int number, GameBoard board){
		this.number = number;
		this.board = board;
	}
	
	public abstract Turn play();

	
}
