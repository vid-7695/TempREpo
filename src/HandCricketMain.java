
public class HandCricketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1 = new Player("Vignesh");
		Player player2 = new Player("Karthick");
		Game match1 = new Game(player1, player2);
		match1.startMatch();
		
		Player player3 = new Player("Arun");
		Player player4 = new Player("Kumar");
		Game match2 = new Game(player3, player4);
		match2.startMatch();
	}

}
