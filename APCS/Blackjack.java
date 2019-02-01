//Madhav's BlackJack Game Using Java
/**
 * Assignment on programmingbydoing.com
 * Description of Game is provided
 */ 

 /*  The simplified blackjack rules are as follows:

    Don't worry about suits or face cards; "cards" will have values from 2-11, and all values are equally likely (that is, unlike a real blackjack game, there's no greater chance of drawing a card with value 10).
    Draw two cards for the better and display them.
    Draw two cards for the "dealer" and display one of them, keeping the other one hidden.
    Allow the better to "hit" as many times as he would like.
    If the better "busts" (gets a total over 21), the dealer automatically wins.
    Allow the dealer to hit as many times as he would like. Dealer should probably hit on sixteen or lower.
    If the dealer busts, the better automatically wins.
    Assuming no one has busted, the better with the highest total wins. Dealer wins all ties. */

    import java.util.Scanner;
import java.util.Random;

public class Blackjack
{
	public static void main( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int better_card1, better_card2;
		int dealer_card1, dealer_card2;
		int new_card;
		int better_total, dealer_total;
		int wallet = 1000, wager;
		String replay;
		String choice;
		
		System.out.println( "How do you do Homo Sapien \n Welcome to Madhav's Black Jack Program. !" );
		
		do
		{
			// betting loop. better can bet a maximum of 100 
			System.out.println( "\n***********************************************" );
			System.out.println( "Now taking bets for the next hand of blackjack." );
			System.out.println( "You're Rich \n You currently have $" + wallet + "." );
			System.out.println( "***********************************************" );
			do
			{
				System.out.println( "How much do you put down sir/ ma'am (Min: $5 Max: $300, increments of 5)? " );
				System.out.print( "> $" );
				wager = keyboard.nextInt();
				if ( wager < 1 || wager > 300 || wager > wallet || wager % 5 != 0) //conditions not to continue forward as wager is unacceptable
					System.out.println( "You cannot bet $" + wager + ". Please try again." );
			} while ( wager < 1 || wager > 300 || wager > wallet || wager % 5 != 0);
			
			
			better_card1 = 2 + r.nextInt(10); 
			better_card2 = 2 + r.nextInt(10);
			better_total = better_card1 + better_card2;
			dealer_card1 = 2 + r.nextInt(10);
			dealer_card2 = 2 + r.nextInt(10);
			dealer_total = dealer_card1 + dealer_card2;
			
			
			// Display first dealing
			System.out.println( "\nYou get a " + better_card1 + " and a " + better_card2 + "." );
			System.out.println( "Your total is " + better_total + ".\n" );
			System.out.println( "The dealer has a " + dealer_card1 + " showing, and a hidden card." );
			System.out.println( "His total is hidden, too.\n" );
			
			// better's turn
			do
			{
				System.out.print( "Would you like to \"hit\" or \"stay\"? " );
				choice = keyboard.next();
				
				if ( choice.equals("hit") )
				{
					new_card = 2 + r.nextInt(10);
					System.out.println( "You drew a " + new_card + "." );
					better_total += new_card;
					System.out.println( "Your total is " + better_total + ".\n" );
				}
			} while ( better_total <= 21 && (! choice.equals("stay") ) );
			
			// Dealer's turn does not play if better busts
			if ( better_total <= 21 )
			{
				System.out.println( "\n******************" );
				System.out.println( "Okay, sir/ma'am it's the dealer's turn now." );
				System.out.println( "His hidden card was a " + dealer_card2 + "." );
				System.out.println( "His total was " + dealer_total + ".\n" );
				
				do
				{
					// Dealer will hit until it has 17 or greater
					if ( dealer_total < 17 )
					{
						choice = "hit";
						System.out.println( "Dealer chooses to hit." );
						new_card = 2 + r.nextInt(10);
						System.out.println( "He draws a " + new_card + "." );
						dealer_total += new_card;
						System.out.println( "His total is " + dealer_total + ".\n" );
					}
					else
					{
						choice = "stay";
						System.out.println( "Dealer stays.\n" );
					}
				} while ( dealer_total <= 21 && (! choice.equals("stay") ) );
				
			}
			
			System.out.println( "Dealer's total is " + dealer_total + "." );
			System.out.println( "Your total is " + better_total + ".\n" );
			
			// Determines who wins
			
			if ( better_total <= 21 )
			{
				if ( dealer_total <= 21 )
				{
					if (better_total > dealer_total )
					{
						System.out.println( "Congrats Homo Sapien ! \n YOU WIN!" );
						wallet += wager;
					}
					else if ( better_total == dealer_total )
					{
						System.out.println( "Well, What a co-incidence \n You DREW." );
					}
					else
					{
						System.out.println( "you LOSE \n Nothing to be ashamed of..." );
						wallet -= wager;
					}
				}
				else
				{
					System.out.println( "YOU WIN!" );
					wallet += wager;
				}
			}
			else
			{
				System.out.println( "you lose" );
				wallet -= wager;
			}
			
			// checks if user can play then if they want to continue
			if ( wallet <= 0 )
			{
				System.out.println( "\nYou are broke. Better luck next time!" );
				break;
			}
			
			System.out.println( "\nYou now have $" + wallet );
			System.out.print( "Care to play again (y/n)? " );
			replay = keyboard.next();
			
		} while (! replay.equals("n") );
	}
}