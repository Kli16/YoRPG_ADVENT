/*
Team ADVENT: Jack Cruse, Kevin Li, Victor Teoh
APCS1 pd4
HW35 -- Ye Olde Role Playing Game, Expanded 
2016-11-28
*/

public class Ghoul extends Monster {
    
    public Ghoul(){//create monster & set initialized values
	health = 200;
	strength = (int)((Math.random() * 45.0) + 17);//(20,45], not sure if there was an error w the braces on the hw cuz they were reversed
	defense = 20;
	attackR = 1.2;
	runchance = 1.0;
	heal = 10;
	name = "Ghoul";
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
	defense = 20;//return to 20
	attackR = 1.2;//return to 1.2	
    }
    
    public String about() {
	return "I am a misunderstood evil spirit doooode";
    }
}
