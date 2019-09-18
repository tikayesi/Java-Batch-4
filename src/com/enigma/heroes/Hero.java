package com.enigma.heroes;

public class Hero {
	private String name;
	private int hp;
	private int baseDamage;
	private boolean canBeHealed = true;
	private int maxHp;

	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(int hp, int baseDamage, String name) {
		this.hp = hp;
		this.baseDamage = baseDamage;
		this.name = name;
		this.maxHp = hp;
	}

	/*
	 * Hero can attack more than one hero on one attack - if HP hero <= 0, hero has
	 * been slain. - hero has been slain can't attack - @param hero target
	 */

	public void attack(Hero... heroes) {
		for(int a = 0; a < heroes.length; a++) {
			System.out.println(name + " attack " + heroes[a].getName());
			heroes[a].getHit(baseDamage);
		}
	}

	public void getHit(int damage) {
		if (this.hp > 0) {
			hp -= damage;
			System.out.println(name + " taken " + damage + " points of damage");
		} else {
			System.out.println(name + " has been slain !");
		}
	}

	@Override
	public String toString() {
		return "Hero [name = 	" + name + ", hp = " + hp + ", baseDamage = " + baseDamage + "]";
	}

	/*
	 * Hero can be healed (add heal method) - If HP target hero <= 0, then cannot
	 * heal. - If HP target hero > 0, then heal add 25% of HP that hero. - Healing
	 * of hero can't be more than hero HP on constructor
	 */

	public void heal(Hero... target) {
		for(int a = 0; a < target.length; a++) {
		if (hp <= 0)
			System.out.println(target[a].getName() + " has been slain.");
		else if (target[a].getHp() >= this.getMaxHp()) {
			//this.canBeHealed = false;
			System.out.println(target[a].getName() + " is healty.");
		} else {
			hp += (target[a].getMaxHp() * 25/100);
			System.out.println(target[a].getName() + " add " + (target[a].getMaxHp() * 25/100) + " of hp.");
		}
		}
	}
	

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getBaseDamage() {
		return baseDamage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
}
