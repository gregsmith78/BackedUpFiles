import java.util.*;

public class HumanPlayer extends Player {
	Dice dice;
	Scanner read;
	List<Integer> farmedDice;
	public HumanPlayer(String name)
	{
		super(name);
		dice = new Dice();
		read = new Scanner(System.in);
		farmedDice = new ArrayList<Integer>();
	}
	public void TakeTurn()
	{
		dice.Roll(5);
		FarmDice();
		dice.Roll(dice.currentValue.length);
		FarmDice();
		dice.Roll(dice.currentValue.length);
		FarmDice();
	}
	private void FarmDice()
	{
		if(Arrays.asList(dice.currentValue).contains(1) || farmedDice.contains(1))
		{
			for(Integer roll : dice.currentValue)
			{
				System.out.println(name + " rolled a " + roll);
			}
			System.out.println("What dice would you like to farm?(x,x,x)");
			String[] diceToFarm = read.nextLine().split(",");
			for(Integer i = 0; i < diceToFarm.length; i++)
			{
				try
				{
					if(Arrays.asList(dice.currentValue).contains(Integer.parseInt(diceToFarm[i])))
					{
						farmedDice.add(Integer.parseInt(diceToFarm[i]));
						Remove(Integer.parseInt(diceToFarm[i]));
					}
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
					e.printStackTrace();
					System.out.println("Your entry was invalid please try again");
					//FarmDice();
				}
			}
		}
		else
		{
			System.out.println("You did not roll a 1 yet, you suck, you dont get to farm");
		}
		for(Integer roll : farmedDice)
		{
			System.out.println("farmed:" + roll);
		}
		for(Integer roll : dice.currentValue)
		{
			System.out.println("remaining:" + roll);
		}
	}
	public void Remove(Integer thing)
    {
        Boolean isFound = false;
        Integer[] tempInnerArray = new Integer[dice.currentValue.length - 1];
        for(Integer i = 0; i < dice.currentValue.length; i++)
        {
            if (dice.currentValue[i] == thing && !isFound)
            {
                isFound = true;
                continue;
            }
            tempInnerArray[isFound ? i - 1 : i] = dice.currentValue[i];
        }
        dice.currentValue = tempInnerArray;
    }
}
