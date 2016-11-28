/*
Team ADVENT: Jack Cruse, Kevin Li, Victor Teoh
APCS1 pd4
HW32 -- Ye Olde Role Playing Game, Expanded
2016-11-20
*/

public class Unicorn extends Character {
    
    public Unicorn(){//basic constructor
	name = "p1";
	oghp = 250;
	health = 250;
	strength = 999;
	defense = 100;
	attackR = 1.5;
	title = "Unicorn";
	runchance = 1.0;
	heal = 250;

    }
    
    public Unicorn(String newname){//overloaded constructor
	this();
	name = newname;//set warrior name
    }
    public int healself(){
	health += heal;
	if (health > oghp){
	    health = oghp;
	}
	return heal;
    }
    public void specialize() {
	defense -= 5;//lose 10 points of defense, could turn into extra damage if player is overzealous with specializing
	attackR *= 1.5;//increase attack by a steady ratio
    }
    public void normalize(){
	defense = 100;//return to 40
	attackR = 1.5;//return to 0.4	
	}
    public String about(){
	return "I am a unicornical doooode";
    }
    
    public void upgrade() {
	String msg = "";
	
	if (title.equals("Unicorn")) {
	    health += 50;
	    oghp += 50;
	    strength += 1;
	    runchance += 0.5;
	    heal += 50;
	    title = "Cocoon";
	    msg = "The Unicorn formed a cocoon around itself";
	}
	
	else if (title.equals("Cocoon")) {
	    oghp += 700;
	    health += 700;
	    strength += 1500;
	    runchance += 1.0;
	    heal += 200;
	    title = "Unipegasus";
	    msg = "The Cocoon's shell burst open to reveal a unipegasus";
	}

	System.out.println(msg);
    }
        
}
