import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 */
public class MagpieRunner4
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie4 maggie = new Magpie4();
      
      String statement = "I want to build a robot.";
      System.out.println("Statement: " + statement);
      System.out.println("Response: " + maggie.getResponse(statement));
	}

}
