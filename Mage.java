/*
Team ADVENT: Jack Cruse, Kevin Li, Victor Teoh
APCS1 pd4
HW32 -- Ye Olde Role Playing Game, Expanded
2016-11-20
*/

public class Mage extends Character {
	
    public Mage(){//basic constructor
	name = "p1";
	health = 140;
	oghp = 140;
	strength = 85;
	defense = 25;
	attackR = 1.0;
	title = "Mage";
	runchance = 0.25;
	heal = 35;
    }
    
    public Mage(String newname){//overloaded constructor
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
	defense = 25;//return to 40
	attackR = 1.0;//return to 0.4	
	}
    public String about(){
	return "I am a magical doooode";
    }
    
    public void upgrade() {
	if (title.equals("Mage")) {
	    oghp += 15;
	    health += 15;
	    strength += 10;
	    runchance += 0.15;
	    heal += 10;
	    title = "Sorcerer";
	}
	
	else if (title.equals("Sorcerer")) {
	    oghp += 30;
	    health += 30;
	    strength += 35;
	    runchance += 0.3;
	    heal += 10;
	    title = "Wizard";
	}

	System.out.println("You just became a " + title + ".");
    }
        
}
