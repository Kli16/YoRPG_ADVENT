/*
Team ADVENT: Jack Cruse, Kevin Li, Victor Teoh
APCS1 pd4
HW35 -- Ye Olde Role Playing Game, Expanded 
2016-11-20
*/

public class Goat extends Monster {
    
    public Goat(){//create monster & set initialized values
	health = 400;
	strength = (int)((Math.random() * 45.0) + 30);//(20,45], not sure if there was an error w the braces on the hw cuz they were reversed
	defense = 20;
	attackR = 2.0;
	name = "Goat";
    }
    public void specialize() {
	defense -= 5;//lose 10 points of defense, could turn into extra damage if player is overzealous with specializing
	attackR *= 1.5;//increase attack by a steady ratio
    }
    public void normalize() {
	defense = 20;//return to 20
	attackR = 2.0;//return to 2.0	
	}
    
    public String about() {
	return "I am a misunderstood gooooat doooode";
    }
    
}
