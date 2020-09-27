import java.util.Random;

public class Toss {

	public Player player1, player2;
	public Random rand;

	public Toss(Player player1, Player player2) {
		super();
		this.player1 = player1;
		this.player2 = player2;
		this.rand = new Random();
	}

	public Player putToss() {
		int randomValue = rand.nextInt(100);
		TossOptions tossResult = (randomValue % 2 == 0) ? TossOptions.TAILS : TossOptions.HEADS;
		TossOptions player2Option = player2.callToss();
		if (tossResult == player2Option)
			return player2;
		
		return player1;
	}

}
