package gameboard;

import java.io.Serializable;

public class Turn implements Serializable{
	private Player  player ;
	private Position position;
	
	
	public Turn(Player player, Position position ){
		this.player = player;
		this.position = position;
	}
	
	
	public String toString(){
		return("Joueur: " + player + "\n" + this.position.toString());
	}
	
	public Position getPosition(){
		return this.position;
	}
	
	public Player getPlayer(){
		return this.player;
	}
}
