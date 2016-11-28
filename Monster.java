/*
Team ADVENT: Jack Cruse, Kevin Li, Victor Teoh
APCS1 pd4
HW32 -- Ye Olde Role Playing Game, Expanded 
2016-11-20
*/

public class Monster extends Character {
    
    public Monster(){//create monster & set initialized values
	health = 150;
	strength = (int)((Math.random() * 45.0) + 20);//(20,45], not sure if there was an error w the braces on the hw cuz they were reversed
	defense = 20;
	attackR = 1.0;
	runchance = 1.0;
	heal = 5;
	name = "Monster";
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
	defense = 20;//return to 40
	attackR = 1.0;//return to 0.4	
	}
    public String about() {
	return "I am a misunderstood doooode";
    }
    
}
