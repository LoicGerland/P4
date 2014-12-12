package gameboard;

public abstract class Player {

	private static int number;
	
	public Player(int number){
		this.number = number;
	}
	
	public abstract Turn play();
	
	
	
}
