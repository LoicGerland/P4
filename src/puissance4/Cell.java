package puissance4;

public enum Cell {
	VIDE("_"),
	BLANC("X"),
	NOIR("O");
	
	public String content;
	
	private Cell(String content){
		this.content = content;
	}
}
