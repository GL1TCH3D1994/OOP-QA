package DataAccess;

public class Colours {

	private int colourID;
	private String colourName;
	
	public Colours() {};
	
	public Colours(int colourID, String colourName) {
		super();
		this.colourID = colourID;
		this.colourName = colourName;
	}
	
	public int getColourID() {
		return colourID;
	}
	public void setColourID(int colourID) {
		this.colourID = colourID;
	}
	public String getColourName() {
		return colourName;
	}
	public void setColourName(String colourName) {
		this.colourName = colourName;
	}
}
