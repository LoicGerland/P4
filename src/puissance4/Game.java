package puissance4;

import gameboard.GameBoard;
import gameboard.Player;

public class Game {

	public static void main(String[] args) {
		Player p1 = new Humain();
		Player p2 = new Humain();
		GameBoard p4 = new ConnectFour(p1,p2);
		
		p4.play();
	}

}
