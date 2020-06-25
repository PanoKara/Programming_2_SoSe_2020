package datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class HighScoreMain {
	
	public static void main (String[] args) {
		ArrayList<HighScore> highscore = new ArrayList<>();
		highscore.add(new HighScore ("Pika", 42));
		highscore.add(new HighScore ("Chuck", 10000));
		highscore.add(new HighScore ("Vegeta", 9001));
		highscore.add(new HighScore ("Edi Weitz", 42));
		highscore.add(new HighScore ("Covid", 19));
		highscore.add(new HighScore ("Covid", 1337));
		highscore.add(new HighScore ("Saul Goodman", 1234));
		highscore.add(new HighScore ("Pano", 13));
		highscore.add(new HighScore ("Zanetti",45 ));
		
		
		
		Collections.sort(highscore);
		
		for (HighScore score : highscore) {
			System.out.println(score.getPlayer() + ":\t" + score.getScore() );
		}
		
	}
}
