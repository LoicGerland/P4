import java.util.ArrayList;

public class GameBoard {
	
	private int width ;
	private int length ; 
	private int [][] board ;
	public ArrayList<Turn> history; 
	
	


	public int getWidth() {
		return width;
	}



	public int getLength() {
		return length;
	}


	
public GameBoard(int width , int length ){
		this.width = width ;
		this.length = length;
		this.history = new ArrayList(0);
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

public void play (Turn t){
	this.board[t.position.x][t.position.y] = t.player ;
	this.history.add(t);
		
}

public void cancel(){
	System.out.println("Dernier coup annulé ;" + this.history.get(this.history.size()-1));
	this.history.remove(this.history.size() -1 );
	
	}
 

}
	


