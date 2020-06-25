package datastructures;

public class HighScore implements Comparable <HighScore> {
	private String player;
	private int score;
	
	public HighScore(String player, int score) {
		super();
		this.player = player;
		this.score = score;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(HighScore other) {
		if (this.score > other.score) {
			return -1;
		} else if (this.score < other.score) {
			return 1;
		}
		return player.compareTo(other.player);
	}
	
	

}
