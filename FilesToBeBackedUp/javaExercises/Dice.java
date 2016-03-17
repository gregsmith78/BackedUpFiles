import java.util.*;

public class Dice {
	Integer[] currentValue;
	Random rand;
	public Dice()
	{
		currentValue = new Integer[0];
		rand = new Random();
	}
	public void Roll(Integer numberOfDiceToRoll)
	{
		currentValue = new Integer[numberOfDiceToRoll];
		for(Integer i = 0; i < currentValue.length;i++)
		{
			currentValue[i] = rand.nextInt(6) + 1;
		}
	}
}
