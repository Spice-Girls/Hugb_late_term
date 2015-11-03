package spice.tic_tac_toe;

public abstract class Player{

	private String name;
	private char mark;

	public Player(String name, char mark){
		this.name = name;
		this.mark = mark;
	}

	public String getName(){
		return this.name;
	}

	public char getMark(){
		return mark;
	}

}
