package gameboard;

import java.util.Scanner;

public class Humain extends Player {

	public Humain(int number,GameBoard board ) {
		super(number,board);
		
	}

	@Override
	public Turn play() {
		System.out.println("Entrer la position que vous voulez jouer");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		return new Turn(this,parsePos(str));
	}
	
	public Position parsePos(String str){
		String[] a;
		a = str.split(",");
		int x = Integer.parseInt(a[0]);
		int y = Integer.parseInt(a[1]);		
		Position p = new Position(x,y) ;
		return p;
	}

}
