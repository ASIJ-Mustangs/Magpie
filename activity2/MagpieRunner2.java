import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
      Magpie2 maggie	= new	Magpie2();
      System.out.println(maggie.getGreeting());
      System.out.println(">My mother and I talked last night.");
      System.out.println(maggie.getResponse("My mother and I talked last night."));
      System.out.println(">I said no.");
      System.out.println(maggie.getResponse("I said no!"));
      System.out.println(">The weather is nice.");
      System.out.println(maggie.getResponse("The weather is nice."));
      System.out.println(">Do you know my brother?");
      System.out.println(maggie.getResponse("Do you know my brother?"));
	}

}
