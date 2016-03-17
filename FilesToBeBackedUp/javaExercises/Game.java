import java.util.*;

public class Game {
	List<Player> players;
	Scanner read;
	public Game()
	{
		players = new ArrayList<Player>();
		read = new Scanner(System.in);
	}
	public void Start()
	{
		Greeting();
		GetPlayers();
		TakeTurns();
	}
	public void Greeting()
	{
		System.out.println("Welcome to our Bar Dice Game!");
	}
	public void GetPlayers()
	{
		System.out.println("How many players would you like to play with?");
		int numberOfPlayers = read.nextInt();
		for(int i =0; i < numberOfPlayers; i++)
		{
			System.out.println("Is this player (1) Human or (2) AI?");
			int HumanOrAI = read.nextInt();
			System.out.println("What is his or her name?");
			read.nextLine();
			String name = read.nextLine();
			if(HumanOrAI == 1)
			{
				players.add(new HumanPlayer(name));
			}
			if(HumanOrAI == 2)
			{
				players.add(new AIPlayer(name));
			}
		}
	}
	public void TakeTurns()
	{
		for(Player player : players)
		{
			player.TakeTurn();
		}
	}
}
