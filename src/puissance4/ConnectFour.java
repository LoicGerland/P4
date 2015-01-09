package puissance4;

import java.util.List;

import gameboard.GameBoard;
import gameboard.InvalidTurnException;
import gameboard.Player;
import gameboard.Turn;


public class ConnectFour extends GameBoard {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public final static int WIDTH = 7;
	
	public final static int HEIGHT = 6;
	
	
	private Player J1;
	
	private Player J2;
	
	private Player[] P = new Player[2];

	public ConnectFour(Player j1, Player j2,List<Turn> history) {
		super(WIDTH,HEIGHT,history);
		this.J1 = j1;
		this.J2 = j2;
		P[0] = this.J1;
		P[1] = this.J2;
 	}
	
	public ConnectFour(Player j1, Player j2){
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
		int nextP = 0;
		Player nextPlayer = this.P[nextP];
		int nbCoups = 0;
		System.out.println(this);
		
		do {
		try {
				t = nextPlayer.play();
			} catch (InvalidTurnException e) {
				
			}
		
		int y = ConnectFour.HEIGHT - 1;
		while(!super.isEmpty(t.getPosition().getX(),y) && y >= 0)
		{
			y--;
		}
		
		if(super.isEmpty(t.getPosition().getX(),y)){
			this.board[t.getPosition().getX()][y] = nextPlayer.getNumber();
			super.history.add(t);
			nbCoups++;
			nextP = (nextP + 1) % 2;
			nextPlayer = this.P[nextP];
			System.out.println(this);
		}
		else System.out.println("La colonne est pleine, jouez dans une autre colonne");
		
		if(nbCoups >= 7){
			p = this.win();
			if(p != null)
			{
				System.out.println(p+" a gagn� !");
			}
		}
		
		}while(nbCoups < ConnectFour.WIDTH*ConnectFour.HEIGHT && p == null );
		
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
		
		if(this.checkLine(t,p) || this.checkColumn(t,p) ||this.checkDiagonalTop(t,p) || this.checkDiagonalBot(t,p) ){
			return p;
		}
		
		return null;
	}
	
	public boolean checkLine(Turn t, Player p ){
		System.out.println("Check Line");
		int y = t.getPosition().getY();
		int numP = p.getNumber();
		
		int i = 0;
		int nb = 0;
		
		while(nb<4 && i <= ConnectFour.WIDTH - 1){
			if(super.board[i][y]==numP){
				nb += 1;
			}
			else nb = 0;
			i = i+1;
		}
		
		if(nb == 4){
			return true;
		}
		else return false;
	}
	
	public boolean checkColumn(Turn t, Player p){
		System.out.println("Check Column");
		int x = t.getPosition().getX();
		int numP = p.getNumber();
		
		int i = 0;
		int nb = 0;
		
		while(nb<4 && i < ConnectFour.HEIGHT - 1){
			if(super.board[x][i]==numP){
				nb += 1;
			}
			else nb = 0;
			i = i+1;
		}
		
		if(nb == 4){
			return true;
		}
		else return false;
	}
		
	
	public boolean checkDiagonalTop(Turn t, Player p){
		System.out.println("Check diagonalsTop");
		int x = t.getPosition().getX();
		int y = t.getPosition().getY();
		int numP = p.getNumber();
		
		int nb = 0;
		
		while(x >0 && y>0){
			x = x-1;
			y = y-1;					
		}
		
		while(nb<4 && x > ConnectFour.WIDTH - 1 && y > ConnectFour.HEIGHT - 1){
			if(super.board[x][y]==numP){
				nb += 1;
			}
			else nb = 0;
			x = x+1;
			y = y+1;
		}
		
		if(nb == 4){
			return true;
		}
		return false;
	}
	
	public boolean checkDiagonalBot(Turn t, Player p){
		System.out.println("Check diagonalsBot");
		int x = t.getPosition().getX();
		int y = t.getPosition().getY();
		int numP = p.getNumber();
		
		 int nb = 0;
		
		while(x < ConnectFour.WIDTH -1 && y>0){
			x = x+1;
			y = y-1;					
		}
		
		while(nb<4 && x >= 0 && y < ConnectFour.HEIGHT - 1){
			if(super.board[x][y]==numP){
				nb += 1;
			}
			else nb = 0;
			x = x-1;
			y = y+1;
		}
		
		if(nb == 4){
			return true;
		}
		
		return false;
	}

}
