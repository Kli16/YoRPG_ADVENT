/*
Team ADVENT: Jack Cruse, Kevin Li, Victor Teoh
APCS1 pd4
HW32 -- Ye Olde Role Playing Game, Expanded
2016-11-20
*/

public class Rogue extends Character {
    
    public Rogue(){//basic constructor
	name = "p1";
	oghp = 100;
	health = 100;
	strength = 80;
	defense = 30;
	attackR = 1.2;
	title = "Rogue";
	runchance = 0.6;
	heal = 20;

    }
    
    public Rogue(String newname){//overloaded constructor
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
    public void normalize() {
	defense = 30;//return to 40
	attackR = 1.2;//return to 0.4	
	}
    public String about(){
	return "I am a stealthy doooode";
    }
    
    public void upgrade() {
	if (title.equals("Rogue")) {
	    oghp += 15;
	    health += 15;
	    strength += 10;
	    runchance += 0.2;
	    heal += 8;
	    title = "Thief";
	}
	
	else if (title.equals("Thief")) {
	    oghp += 25;
	    health += 25;
	    strength += 30;
	    runchance += 0.2;
	    heal += 15;
	    title = "Ghost";
	}

	System.out.println("You just became a " + title + ".");
    }
        
}
