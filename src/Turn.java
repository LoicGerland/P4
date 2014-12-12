
public class Turn {
	public int  player ;
	public Position position;
	
	
	public Turn(int player, Position position ){
		this.player = player;
		this.position = position;
	}
	
	
	public String toString(){
		return("Joueur: " + player + "\n" + this.position.toString());
	}
}
