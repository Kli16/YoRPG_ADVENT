/*
Team ADVENT: Jack Cruse, Kevin Li, Victor Teoh
APCS1 pd4
HW32 -- Ye Olde Role Playing Game, Expanded
2016-11-20
*/

public class Warrior extends Character {
    
    public Warrior(){//basic constructor
	name = "p1";
	oghp = 125;
	health = 125;
	strength = 100;
	defense = 40;
	attackR = 0.4;
	title = "Warrior";
	runchance = 0.1;
	heal = 10;
    }
    
    public Warrior(String newname){//overloaded constructor
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
	defense = 40;//return to 40
	attackR = 0.4;//return to 0.4	
	}
    public String about(){
	return "I am a brolic doooode";
    }

    public void upgrade() {
	if (title.equals("Warrior")) {
	    oghp += 25;
	    health += 25;
	    strength += 25;
	    runchance += 0.1;
	    heal += 5;
	    title = "Knight";
	}
	
	else if (title.equals("Knight")) {
	    oghp += 35;
	    health += 35;
	    strength += 50;
	    runchance += 0.2;
	    heal += 10;
	    title = "Paladin";
	}

	System.out.println("You just became a " + title + ".");
    }
    
}
