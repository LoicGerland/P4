package gameboard;

public abstract class Player {

	private static int PlayerNUM = 0;
	private final int number;
	private String name;
	
	public Player(){
		Player.PlayerNUM++;
		this.number = Player.PlayerNUM;
		this.name = "Joueur "+this.number;
	}
	
	public Player(String name){
		Player.PlayerNUM++;
		this.number = Player.PlayerNUM;
		this.name = name;
	}
	
	public abstract Turn play() throws InvalidTurnException;

	public int getNumber(){
		return this.number;
	}
	
	public String getName(){
		return this.name;
	}
}
