package gameboard;

import java.io.Serializable;
import java.util.List;


public abstract class GameBoard implements Serializable {
	
	private int width ;
	private int length ; 
	protected  int [][] board ;
	protected List<Turn> history; 

	
public GameBoard(int width , int length , List<Turn>  history ){

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
	return this.history.get(history.size() - 1);
	
}

public int [][] board(){
	return this.board;
}


}
	


