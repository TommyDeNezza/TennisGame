import java.util.ArrayList;
public class PlayerDataBase
	{
	static ArrayList <Player> playerInfo = new ArrayList <Player>();
	public static void playerLoad()
		{
		playerInfo.add(new Player("G-Money", -2.8, 81, -3, 96, 5, 98, -2, "Balanced player that specializes in groundstrokes. Fact: Whenever he speaks to an adult his voice goes up one octave."));
		playerInfo.add(new Player("Lurn", -3.5, 85, -2.4, 93, 3, 96, -2.3, "Offensive player who tries to win points earlier. Fact: Did not have a good time at homecoming."));
		playerInfo.add(new Player("Maclin", -3.5, 90, -2.4, 94, 3, 98, -3, "Highly aggressive player who can't last very long. Fact: His greatest aspiration is to attend CSU, his favorite school of all time."));
		playerInfo.add(new Player("Lotion", -2.2, 87, 1.4, 98, 7, 100, -1.8, "Very defensive player who rarely misses shots. Fact: Writes to people who don't even know who he is."));
		playerInfo.add(new Player("DeNasty", -2.8, 85, -2, 94, 4, 98, -2, "Balanced player who isn't bad nor good at anything. Fact: Made this game."));
		playerInfo.add(new Player("GERG", -4, 90, -3, 98, 1, 102, -1.5, "Absolute monster at Tennis, no flaws. Fact: Not many people are known to be able to tame the GERG."));
		}
	}
