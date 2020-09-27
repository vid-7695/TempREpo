import java.util.Random;

public class Player {
	private String name;
	private int score;
	private Random rand;

	public Player(String name) {
		super();
		this.name = name;
		this.score = 0;
		this.rand = new Random();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int Play() {
		return rand.nextInt(1000) % 7;
	}

	public void addScore(int value) {
		score += value;
	}

	public TossOptions callToss() {
		int val = rand.nextInt(100);

		if (val % 2 == 0)
			return TossOptions.TAILS;

		return TossOptions.HEADS;
	}

}
