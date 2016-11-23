/*
Team ADVENT: Jack Cruse, Kevin Li, Victor Teoh
APCS1 pd4
HW32 -- Ye Olde Role Playing Game, Expanded
2016-11-20
*/

public class Unicorn extends Character {
    
    public Unicorn(){//basic constructor
	name = "p1";
	health = 250;
	strength = 999;
	defense = 100;
	attackR = 1.5;
    }
    
    public Unicorn(String newname){//overloaded constructor
	this();
	name = newname;//set warrior name
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
}
