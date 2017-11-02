// Anthony Carpenetti
// AP Computer Science A
// 2 November 2017

//import java.util.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class LuckySevens_v2
{
   public static void main(String[] args)
   {
      System.out.println("Welcome to LuckySevens_v2!");
      System.out.print("How much money are you starting with? $");
      Scanner input = new Scanner(System.in); // declare & initialize Scanner input from console
      double userCashLevel = input.nextDouble(); // declare and initialize userCashLevel from console input
      System.out.println("Starting Money: $" + userCashLevel + "\n");
      boolean playing = true;
      double nextBet = 0;
      Random randomNumberGenerator = new Random();
      int dieOne = 0;
      int dieTwo = 0;
      while(playing)
      {
         System.out.print("How much money would you like to bet on this roll? $");
         nextBet = input.nextDouble(); // initialize nextBet from console input
         userCashLevel -= nextBet;
         System.out.println("You bet: $" + nextBet);
         dieOne = randomNumberGenerator.nextInt(6) + 1;
         dieTwo = randomNumberGenerator.nextInt(6) + 1;
         System.out.println("[" + dieOne + "][" + dieTwo + "]");
         if(dieOne == dieTwo)
         {
            
         }
         else if(dieOne + dieTwo == 7)
         {
            System.out.println("~~ Lucky Sevens! ~~");
            int winnings = nextBet * 5;
            System.out.println("You win: " + winnings);
            userCashLevel += winnings;
         }
         System.out.println("Money: $" + userCashLevel + "\n");
         if(userCashLevel <= 0)
         {
            playing = false;
            System.out.println("You went broke!");
            System.out.print("Thanks for playing!");
         }
      }
      input.close();
   }
}