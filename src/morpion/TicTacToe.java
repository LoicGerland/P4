package morpion;

import gameboard.GameBoard;
import gameboard.InvalidTurnException;
import gameboard.Player;
import gameboard.Turn;

import java.util.List;

public class TicTacToe extends GameBoard{

	private static final long serialVersionUID = 1L;
	
	public final static int WIDTH = 3;
	
	public final static int HEIGHT = 3;
	
	
	private Player J1;
	
	private Player J2;
	
	private Player[] P = new Player[2];

	public TicTacToe(Player j1, Player j2,List<Turn> history) {
		super(WIDTH,HEIGHT,history);
		this.J1 = j1;
		this.J2 = j2;
		P[0] = this.J1;
		P[1] = this.J2;
 	}
	
	public TicTacToe(Player j1, Player j2){
		super(WIDTH,HEIGHT);
		this.J1 = j1;
		this.J2 = j2;
		P[0] = this.J1;
		P[1] = this.J2;
	}

	@Override
	public void play() {
		
		Turn t = null;
		Player p = null;
		Player nextPlayer = this.P[0];
		int nbCoups = 0;
		System.out.println(this);
		
		do {
		try {
				t = nextPlayer.play();
			} catch (InvalidTurnException e) {
				
			}
		
		if(super.isEmpty(t.getPosition().getX(),t.getPosition().getY())){
			this.board[t.getPosition().getX()][t.getPosition().getY()] = nextPlayer.getNumber();
			nbCoups++;
			nextPlayer = this.P[(0 + 1) % 2];
			System.out.println(this);
		}
		else System.out.println("La case est pleine, jouez dans une autre case");
		
		if(nbCoups > 7){
			p = this.win();
			if(p != null)
			{
				System.out.println(p+" a gagné !");
			}
		}
		
		}while(nbCoups < TicTacToe.WIDTH*TicTacToe.HEIGHT && p == null);
		
		if(p == null){
			System.out.println("Il n'y aucun vainqueur !");
		}
		
	}	

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Player win() {
		
		Turn t = super.lastTurn();
		Player p = t.getPlayer();
		
		if(this.checkLine(t,p) || this.checkColumn(t,p) ||this.checkDiagonal(t,p)){
			return p;
		}
		
		return null;
	}
	
	public boolean checkLine(Turn t, Player p){
		int y = t.getPosition().getY();
		int numP = p.getNumber();
		
		int i = 0;
		int nb = 0;
		
		while(nb<3 && i < TicTacToe.WIDTH){
			if(super.board[i][y]==numP){
				nb += 1;
				i = i+1;
			}
			else nb = 0;
		}
		
		if(nb == 3){
			return true;
		}
		else return false;
	}
	
	public boolean checkColumn(Turn t, Player p){
		int x = t.getPosition().getX();
		int numP = p.getNumber();
		
		int i = 0;
		int nb = 0;
		
		while(nb<3 && i < TicTacToe.HEIGHT){
			if(super.board[x][i]==numP){
				nb += 1;
				i= i+1;
			}
			else nb = 0;
		}
		
		if(nb == 3){
			return true;
		}
		else return false;
	}
		
	
	public boolean checkDiagonal(Turn t, Player p){
		int x = t.getPosition().getX();
		int y = t.getPosition().getY();
		int numP = p.getNumber();
		
		int nb = 0;
		
		while(x !=0 || y!=0){
			x = x-1;
			y = y-1;					
		}
		
		while(nb<3 && x > TicTacToe.WIDTH && y > TicTacToe.HEIGHT){
			if(super.board[x][y]==numP){
				nb += 1;
				x = x+1;
				y = y+1;
			}
			else nb = 0;
		}
		
		if(nb == 3){
			return true;
		}
		
		nb = 0;
		
		while(x < TicTacToe.WIDTH || y!=0){
			x = x+1;
			y = y-1;					
		}
		
		while(nb<3 && x < TicTacToe.WIDTH && y > TicTacToe.HEIGHT){
			if(super.board[x][y]==numP){
				nb += 1;
				x = x-1;
				y = y+1;
			}
			else nb = 0;
		}
		
		if(nb == 3){
			return true;
		}
		
		return false;
	}
}
