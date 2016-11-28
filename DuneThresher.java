/*
Team ADVENT: Jack Cruse, Kevin Li, Victor Teoh
APCS1 pd4
HW35 -- Ye Olde Role Playing Game, Expanded 
2016-11-20
*/

public class DuneThresher extends Monster {
    
    public DuneThresher(){//create monster & set initialized values
	health = 200;
	strength = (int)((Math.random() * 45.0) + 20);//(20,45], not sure if there was an error w the braces on the hw cuz they were reversed
	defense = 30;
	attackR = 1.6;
	runchance = 1.0;
	heal = 20;
	name = "DuneThresher";
    }
    public int healself(){
	health += heal;
	if (health > 200){
	    health = 200;
	}
	return heal;
    }
    public void specialize() {
	defense -= 5;//lose 10 points of defense, could turn into extra damage if player is overzealous with specializing
	attackR *= 1.5;//increase attack by a steady ratio
    }
    
    public void normalize() {
	defense = 30;//return to 30
	attackR = 1.6;//return to 1.6	
    }
    
    public String about() {
	return "I am a misunderstood Dune doooode";
    }
    
}
