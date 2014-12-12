package gameboard;

public class Turn {
	public Player  player ;
	public Position position;
	
	
	public Turn(Player player, Position position ){
		this.player = player;
		this.position = position;
	}
	
	
	public String toString(){
		return("Joueur: " + player + "\n" + this.position.toString());
	}
}
