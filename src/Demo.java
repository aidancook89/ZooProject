import java.util.Scanner;
import java.util.InputMismatchException;

public class Demo
{

   public static void main(String[] args) throws InterruptedException
   {
      Animal a;
      String animalChoice = "";
      Scanner kb = new Scanner(System.in);
      System.out.println("Welcome to the Boone Zoo!");
      System.out.println("Current exhibits are: 1.Gorilla and 2.Panther");
      System.out.print("Please select an exhibit number: ");
      int choice = 0;
      while (true)
      {
         try
	 {
	    choice = kb.nextInt();
	    break;
	 }
	 catch (InputMismatchException e)
	 {
	   System.out.println("Sorry, that is not a valid exhibit.");
	   kb.nextLine();
	 }
      }
      if (choice == 1)
      {
         a = new Gorilla();
	 animalChoice = "Gorilla";
      }
      else
      {
         a = new Panther();
	 animalChoice = "Panther";
      }

      kb.nextLine();

      System.out.printf("Here, toss this to the %s.\n", animalChoice);
      Thread.sleep(2000);
      a.feed();
      Thread.sleep(2000);
      System.out.printf("Now we can see the %s relaxing after its meal: \n", animalChoice);
      Thread.sleep(2000);
      a.groom();
   }

}
