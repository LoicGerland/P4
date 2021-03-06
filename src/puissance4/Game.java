package puissance4;

import gameboard.Player;

import java.util.Scanner;

public class Game {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		Player j1 = null, j2 = null;
		System.out.println("Mode de jeu");
		System.out.println("\t1 : J1 vs IA");
		System.out.println("\t2 : J1 vs J2");
		System.out.println("\t3 : Revenir au menu");
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
			j1 = new Humain(1,"J1");
			j2 = new Bot(2,"The Bot");
			break;
		case 2:
			j1 = new Humain(1,"J1");
			j2 = new Humain(2,"J2");
			break;
		case 3:
			break;
		default:
			n = 0;
		}
		if (n != 3)
		{
			ConnectFour puissance4 = null;
			puissance4 = new ConnectFour(j1, j2); 
			puissance4.play();
		}
	}
}

