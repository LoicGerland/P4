package gameboard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public abstract class GameBoard implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int width ;
	private int height ; 
	protected  int [][] board ;
	protected List<Turn> history;
	private final static int EMPTY = 0;

	
public GameBoard(int width , int height , List<Turn>  history ){

		this.width = width ;
		this.height = height;
		this.history =  history;
		this.board = new int [width][height];
		for(int i = 0; i < height ; i++ ){
			for (int j = 0; j< width; j++){
				this.board[j][i]=0;
				}
			
	}
}

public GameBoard(int width, int height){
	
	this.width = width ;
	this.height = height;
	this.history = new ArrayList<Turn>();
	this.board = new int [width][height];
	for(int i = 0; i < height ; i++ ){
		for (int j = 0; j< width; j++){
			this.board[j][i]=0;
			}
		
	}
}


public String toString(){
	StringBuilder b = new StringBuilder();
	
	for(int i = 0; i < height ; i++ ){
		for (int j = 0; j< width; j++){
			switch ( this.board[j][i]){
			case 0 : b.append("_");
				break;
			case 1 : b.append("X");
				break;
			case 2 : b.append("O");
				break;
			}
		}
		b.append("\n");
		
	}
	 return  b.toString();
		
}



public abstract void play ();
	


public abstract void cancel();

public abstract Player win();	
	
public Turn lastTurn(){
	return this.history.get(this.history.size() - 1);
	
}

public int [][] board(){
	return this.board;
}

public boolean isEmpty(int x, int y){
	
	if(this.board[x][y] == GameBoard.EMPTY){
		return true;
	}
	else return false;
}

}
	


