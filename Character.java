/*
Team ADVENT: Jack Cruse, Kevin Li, Victor Teoh
APCS1 pd4
HW32 -- Ye Olde Role Playing Game, Expanded
2016-11-20
*/

public abstract class Character {
    protected int health;//init hp, strength, defense, regular attack val
    protected int strength;
    protected int defense;
    protected double attackR;
    protected String name;

    protected boolean isAlive() {
	if (health > 0) {//state of monster
	    return true;
	}
	return false;
    }
    
    protected int getDefense() {
	return defense;//returns val for fights w warrior
    }
    
    protected String getName() {
	return name;
    }
    protected void lowerHP(int damage) {
	health -= damage;
    }
    protected int attack(Character c) {
	int damage = (int)((strength * attackR) - c.getDefense());//calculate damage done
	//	System.out.println(strength*attackR);
	if (damage > 0) {
	    c.lowerHP(damage);//this lowers the other character's hp while still allowing us to independently return the damage val for the output to the terminal
	}
	else {
	    damage = 0;
	}
	return damage;
    }

    protected abstract void specialize();/* {
	defense -= 5;//lose 10 points of defense, could turn into extra damage if player is overzealous with specializing
	attackR *= 1.5;//increase attack by a steady ratio
    }*/
    protected abstract void normalize();/* {
	defense = 40;//return to 40
	attackR = 0.4;//return to 0.4	
	}*/

    protected abstract String about(); //{
	//	return c.toString();
    //}
    
}
    
