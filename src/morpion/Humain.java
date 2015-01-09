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

		public Humain(int num,String name) {
			super(num,name);
		}

		@Override
		public Turn play() throws InvalidTurnException {
			System.out.print(super.getName() + " entrer la position où vous voulez jouer (exemple 1,1) : ");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
//			sc.close();
			return new Turn(this,parsePos(str));
		}
		
		public Position parsePos(String str) throws InvalidTurnException{
			int x = 0;
			int y = 0;
			String[] a;
			a = str.split(",");
			try
			{
				x = Integer.parseInt(a[0]);
			}
			catch(NumberFormatException e)
			{
				x = -1;
			}
			try
			{
				y = Integer.parseInt(a[1]);
			}
			catch(NumberFormatException e)
			{
				y = -1;
			}
			if(x == -1 || y == -1){
				System.out.println("Coordonnées non valables");
				throw new InvalidTurnException();
			}
			Position p = new Position(x,y) ;
			return p;
		}
}
