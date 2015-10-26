package spice.tic_tac_toe;

public class ttt {
	
	private String[] board;
	public ttt()
	{
		this.board = new String[9];
	}
	public String toString() { 
		String board = "| --- | --- | --- |"
					 + "|	  | 	|     |"
					 + "| --- | --- | --- |"
					 + "|	  | 	|     |"
					 + "| --- | --- | --- |"
					 + "|	  | 	|     |"
					 + "| --- | --- | --- |";
		return board;
	}
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
