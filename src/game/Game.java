package game;

import java.util.Scanner;

public class Game{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		do
		{
			System.out.println("Choisir le jeu");
			System.out.println("\t1 : Puissance 4");
			System.out.println("\t2 : Morpion");
			System.out.println("\t3 : Quitter");
			System.out.print("Choix : ");
			try
			{
				n = Integer.parseInt(sc.nextLine());
			}
			catch(NumberFormatException e)
			{
				n = 0;
			}
			switch(n)
			{
			case 1:
				puissance4.Game.main(args);
				break;
			case 2:
				morpion.Game.main(args);
				break;
			case 3 :
				break;
			default:
				n = 0;
			}
		}while (n != 3);
		System.out.println("Adieu pleutre !");
	}
}
