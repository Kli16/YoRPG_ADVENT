/*
Team ADVENT: Jack Cruse, Kevin Li, Victor Teoh
APCS1 pd4
HW32 -- Ye Olde Role Playing Game, Expanded
2016-11-20
*/

/*=============================================
  class YoRPG -- Driver file for Ye Olde Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Warrior, Monster
  =============================================*/

import java.io.*;
import java.util.*;

public class YoRPG
{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Warrior and a Monster will be instantiated...
    private Character pat;   //Is it man or woman? WE STAY UPDATNG OUT HERE
    private Monster smaug; //Friendly generic monster name?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  

    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG()
    {
	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- gathers info to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Warrior
      =============================================*/
    
    public void newGame()
    {
	String s;
	String name = "";
	String path = "";
	boolean choice = true;
	
	s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	s = "Intrepid adventurer, what doth thy call thyself? (State your name): ";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }

	while (choice) {
	    choice = false;

	    s = "What kind of adventurer are you?\n";
	    s += "\tWarrior\n";
	    s += "\tMage\n";
	    s += "\tRogue\n";
	    s += "\tDruid\n";
	    s += "\tUnicorn\n";
	    System.out.print(s);

	    try {
		path = in.readLine();
	    }

	    catch ( IOException e ) { }

	    if (path.toLowerCase().equals("warrior")) {
		pat = new Warrior( name );
	    }

	    else if (path.toLowerCase().equals("mage")) {
		pat = new Mage( name );
	    }

	    else if (path.toLowerCase().equals("rogue")) {
		pat = new Rogue( name );
	    }

	    else if (path.toLowerCase().equals("druid")) {
		pat = new Druid( name );
	    }

	    else if (path.toLowerCase().equals("unicorn")) {
		pat = new Unicorn( name );
	    }

	    else {
		System.out.println("That doth not be a valid choice");
		choice = true;
	    }
	}

	//instantiate the player's character
	//OLD VERSION STUFF WE OUT HERE UPDATING THIS GAME	pat = new Warrior( name ); 

    }//end newGame()


    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Warrior pat has been initialized
      post: Returns true if player wins (monster dies).
      Returns false if monster wins (player dies).
      =============================================*/
    
    public boolean playTurn()
    {
	int i = 1;
	int d1, d2;

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
	else {
	    System.out.println( "\nLo, yonder monster approacheth!" );

	    smaug = new Monster();
	    System.out.println("Player: " + pat.about());
	    System.out.println("Monster: " + smaug.about());
	
	    while( smaug.isAlive() && pat.isAlive() ) {

		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		try {
		    System.out.println( "\nDo you feel lucky?" );
		    System.out.println( "\t1: Nay.\n\t2: Aye!" );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }

		if ( i == 2 )
		    pat.specialize();
		else
		    pat.normalize();

		//	System.out.println(pat.attackR);
		//	System.out.println(pat.strength);
		//	System.out.println(smaug.defense);
		d1 = pat.attack( smaug );
		d2 = smaug.attack( pat );

		System.out.println( "\n" + pat.getName() + " dealt " + d1 +
				    " points of damage.");

		if (d2 == 0) {
		    System.out.println("\n" + "Ye Puny Monster's smack had no effect on " +
				       pat.getName() + " the Great.");
		}

		else {
		    System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
				    " for " + d2 + " points of damage.");
		}
		
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde monster down, but " +
				    "with its dying breath ye olde monster. " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead." );
		return false;
	    }
	}//end else

	return true;
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void main( String[] args )
    {
	//As usual, move the begin-comment bar down as you progressively 
	//test each new bit of functionality...


	//loading...
	YoRPG game = new YoRPG();

	int encounters = 0;

	while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	}

	System.out.println( "Thy game doth be over." );

    }//end main

}//end class YoRPG


