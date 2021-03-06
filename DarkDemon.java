/*
Team ADVENT: Jack Cruse, Kevin Li, Victor Teoh
APCS1 pd4
HW35 -- Ye Olde Role Playing Game, Expanded 
2016-11-20
*/

public class DarkDemon extends Monster {
    
    public DarkDemon(){//create monster & set initialized values
	health = 100;
	strength = (int)((Math.random() * 45.0) + 20);//(20,45], not sure if there was an error w the braces on the hw cuz they were reversed
	defense = 40;
	attackR = 1.0;
	runchance = 1.0;
	heal = 40;
	name = "DarkDemon";
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
	defense = 40;//return to 40
	attackR = 1.0;//return to 1.0	
	}
    public String about() {
	return "I am a misunderstood Dark doooode";
    }
}
