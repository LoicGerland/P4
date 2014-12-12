package gameboard;

public class Game {

	public static void main(String[] args) {
	
		GameBoard plateau = new GameBoard(3,3);
		System.out.println( plateau.toString() );
		Turn J1 = new Turn(1,new Position(1,2));
		plateau.play(J1);
		System.out.println( plateau.toString() );
		
	}

}
