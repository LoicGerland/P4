package morpion;

import gameboard.InvalidTurnException;
import gameboard.Player;
import gameboard.Position;
import gameboard.Turn;

import java.util.Scanner;

public class Humain extends Player{

		public Humain() {
			super();
		}

		public Humain(String name) {
			super(name);
		}

		@Override
		public Turn play() throws InvalidTurnException {
			System.out.print(super.getName() + " entrer la position où vous voulez jouer (exemple 1,1) : ");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
//			sc.close();
			return new Turn(this,parsePos(str));
		}
		
		public Position parsePos(String str){
			String[] a;
			a = str.split(",");
			int x = Integer.parseInt(a[0]);
			int y = Integer.parseInt(a[1]);		
			Position p = new Position(x-1,y) ;
			return p;
		}
}
