
public class Game {
	public Player player1, player2;
	public Toss matchToss;

	public Game(Player player1, Player player2) {
		super();
		this.player1 = player1;
		this.player2 = player2;
		this.matchToss = new Toss(this.player1, this.player2);
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public void playInnings(Player batsmen, Player bowler) {
		System.out.println(batsmen.getName() + " -------INNINGS STARTED------------------------------- ");
		while (true) {
			int batsmenOption = batsmen.Play();
			int bowlerOption = bowler.Play();
			if (batsmenOption != bowlerOption) {
				batsmen.addScore(batsmenOption);
			} else {
				break;
			}
		}
		System.out.println(batsmen.getName() + " score is " + batsmen.getScore());
	}

	public void startMatch() {
		Player batsmen = matchToss.putToss();
		if (batsmen.getName().equals(player1.getName())) {
			playInnings(player1, player2);
			playInnings(player2, player1);
		} else {
			playInnings(player2, player1);
			playInnings(player1, player2);
		}

		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " is the winner of the match");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " is the winner of the match");
		} else {
			System.out.println("Draw the match");
		}

	}

}
