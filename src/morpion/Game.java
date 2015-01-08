package morpion;

import gameboard.Player;
import puissance4.Humain;

public class Game {
	
	public static void main(String[] args) {
		Player p1 = new Humain();
		Player p2 = new Humain();
		TicTacToe t = new TicTacToe(p1,p2);
		
		t.play();
	}
}