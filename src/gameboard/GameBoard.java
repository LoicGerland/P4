package gameboard;
import java.awt.List;
import java.util.ArrayList;

public abstract class GameBoard {
	
	private int width ;
	private int length ; 
	private int [][] board ;
	public List history; 
	
	


	


	
public GameBoard(int width , int length , List  history ){

		this.width = width ;
		this.length = length;
		this.history =  history;
		this.board = new int [length][width];
		for(int i = 0; i < width ; i++ ){
			for (int j = 0; j< length; j++){
				this.board[j][i]=0;
				}
			
	}
}

public GameBoard(int width, int length){
	
	this.width = width ;
	this.length = length;
	
	this.board = new int [length][width];
	for(int i = 0; i < width ; i++ ){
		for (int j = 0; j< length; j++){
			this.board[j][i]=0;
			}
		
}
}







public String toString(){
	StringBuilder b = new StringBuilder();
	
	for(int i = 0; i < width ; i++ ){
		for (int j = 0; j< length; j++){
			switch ( this.board[j][i]){
			case 0 : b.append("◌");
				break;
			case 1 : b.append("○");
				break;
			case 2 : b.append("●");
				break;
			}
		}
		b.append("\n");
		
	}
	 return  b.toString();
		
}












public abstract void play (Turn t);
	


public abstract void cancel();

public abstract Player win();	
	
public Turn lastTurn(){
	return this.history(history.size() - 1);
	
}

}
	


