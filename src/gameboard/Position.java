package gameboard;

public class Position {
	public int x;
	public int y;
	
	public Position(int x, int y){
		this.x= x;
		this.y= y;
	}

	public String toString(){
		return("Position en x " + x + "\n" + " Position en y " + y);
	}
}

