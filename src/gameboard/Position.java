package gameboard;

public class Position {
	private int x;
	private int y;
	
	public Position(int x, int y){
		this.x= x;
		this.y= y;
	}

	public String toString(){
		return("Position en x " + x + "\n" + " Position en y " + y);
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
}


