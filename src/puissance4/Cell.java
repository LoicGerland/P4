package puissance4;

public enum Cell {
	VIDE("◌"),
	BLANC("○"),
	NOIR("●");
	
	public String content;
	
	private Cell(String content){
		this.content = content;
	}
}
