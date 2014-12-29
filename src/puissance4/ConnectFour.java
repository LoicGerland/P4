package puissance4;

import java.util.List;

import gameboard.GameBoard;
import gameboard.Player;
import gameboard.Turn;


public class ConnectFour extends GameBoard {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final static int WIDTH = 7;
	
	private final static int LENGTH = 6;
	
	private Player J1;
	
	private Player J2;

	public ConnectFour(Player j1, Player j2,List<Turn> history) {
		super(WIDTH,LENGTH,history);
		this.J1 = j1;
		this.J2 = j2;
	}
	
	public ConnectFour(Player j1, Player j2){
		super(WIDTH,LENGTH);
		this.J1 = j1;
		this.J2 = j2;
	}

	@Override
	public void play(Turn t) {
		
		Player nextPlayer = this.J1;
		int nbCoups = 0;
		System.out.println(this);
				
			do
			{
				t = nextPlayer.play();
			} while(t.getPosition().getX() < 0 || t.getPosition().getX() > ConnectFour.WIDTH-1);
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
		int x = t.getPosition().getX();
		int y = t.getPosition().getY();
		int numP = p.getNumber();
		
		int i = 0;
		int nb = 0;
		
		while(nb<4 && i < ConnectFour.WIDTH){
			if(super.board[i][y]==numP){
				nb += 1;
			}
			else nb = 0;
		}
		
		if(nb == 4){
			return true;
		}
		else return false;
	}
	
	public boolean checkColumn(Turn t, Player p){
		int x = t.getPosition().getX();
		int y = t.getPosition().getY();
		int numP = p.getNumber();
		
		int i = 0;
		int nb = 0;
		
		while(nb<4 && i < ConnectFour.LENGTH){
			if(super.board[x][i]==numP){
				nb += 1;
			}
			else nb = 0;
		}
		
		if(nb == 4){
			return true;
		}
		else return false;
	}
		
	
	public boolean checkDiagonal(Turn t, Player p){
		int x = t.getPosition().getX();
		int y = t.getPosition().getY();
		return false;
	}

}
