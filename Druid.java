/*
Team ADVENT: Jack Cruse, Kevin Li, Victor Teoh
APCS1 pd4
HW32 -- Ye Olde Role Playing Game, Expanded
2016-11-20
*/

public class Druid extends Character {
    
    public Druid(){//basic constructor
	name = "p1";
	health = 150;
	strength = 80;
	defense = 60;
	attackR = 0.2;
<<<<<<< HEAD
	title = "Druid";
=======
	runchance = 0.2;
	heal = 50;
>>>>>>> 80fcc0a2550645c09dbb4b436598d2ebd3122902
    }
    
    public Druid(String newname){//overloaded constructor
	this();
	name = newname;//set warrior name
    }
    public int healself(){
	health += heal;
	if (health > 150){
	    health = 150;
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
}
