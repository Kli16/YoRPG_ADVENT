/*
Team ADVENT: Jack Cruse, Kevin Li, Victor Teoh
APCS1 pd4
HW32 -- Ye Olde Role Playing Game, Expanded
2016-11-20
*/

public class Druid extends Character {
    
    public Druid(){//basic constructor
	name = "p1";
	oghp = 150;
	health = 150;
	strength = 80;
	defense = 60;
	attackR = 0.2;
	title = "Druid";
	runchance = 0.2;
	heal = 50;
    }
    
    public Druid(String newname){//overloaded constructor
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
	defense = 60;//return to 40
	attackR = 0.2;//return to 0.4	
	}
    public String about(){
	return "I am a naturey doooode";
    }
    
    public void upgrade() {
	if (title.equals("Druid")) {
	    oghp += 30;
	    health += 30;
	    strength += 10;
	    runchance += 0.1;
	    heal += 15;
	    title = "Shape-Shifter";
	}
	
	else if (title.equals("Shape-Shifter")) {
	    oghp += 45;
	    health += 45;
	    strength += 20;
	    runchance += 0.1;
	    heal += 20;
	    title = "Priest";
	}

	System.out.println("You just became a " + title + ".");
    }
       
}
