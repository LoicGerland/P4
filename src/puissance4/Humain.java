package puissance4;

import gameboard.InvalidTurnException;
import gameboard.Player;
import gameboard.Position;
import gameboard.Turn;

import java.util.Scanner;

public class Humain extends Player {

	public Humain() {
		super();
	}

	public Humain(int num,String name) {
		super(num,name);
	}

	@Override
	public Turn play() throws InvalidTurnException {
		System.out.print(super.getName() + " entrer la position de la colonne où vous voulez jouer : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
//		sc.close();
		return new Turn(this,parsePos(str));
	}
	
	public Position parsePos(String str){
		String[] a;
		a = str.split("\0");
		int x = Integer.parseInt(a[0]);
		int y = 0;		
		Position p = new Position(x-1,y) ;
		return p;
	}
}
