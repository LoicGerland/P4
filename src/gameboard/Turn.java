package gameboard;

import java.io.Serializable;

public class Turn implements Serializable{
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
