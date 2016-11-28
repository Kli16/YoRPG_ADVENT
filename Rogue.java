/*
Team ADVENT: Jack Cruse, Kevin Li, Victor Teoh
APCS1 pd4
HW32 -- Ye Olde Role Playing Game, Expanded
2016-11-20
*/

public class Rogue extends Character {
    
    public Rogue(){//basic constructor
	name = "p1";
	health = 100;
	strength = 80;
	defense = 30;
<<<<<<< HEAD
	attackR = 1.2;
	title = "Rogue";
=======
	attackR = 0.8;
	runchance = 0.6;
	heal = 20;
>>>>>>> 80fcc0a2550645c09dbb4b436598d2ebd3122902
    }
    
    public Rogue(String newname){//overloaded constructor
	this();
	name = newname;//set warrior name
    }
    public int healself(){
	health += heal;
	if (health > 100){
	    health = 100;
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
}
