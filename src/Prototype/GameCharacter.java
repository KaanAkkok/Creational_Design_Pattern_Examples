package Prototype;

public class GameCharacter implements Prototype {

	int health;
	int mana;
	int attack;
	int defense;
	
	public GameCharacter(int health, int mana, int attack, int defense) {
		super();
		this.health = health;
		this.mana = mana;
		this.attack = attack;
		this.defense = defense;
	}
	
	private GameCharacter(GameCharacter character) {
		this.attack=character.attack;
		this.defense=character.defense;
		this.health=character.health;
		this.mana=character.mana;
	}

	public GameCharacter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getHealth() {
		return health;
	}

	public int getMana() {
		return mana;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	@Override
	public GameCharacter getclone() {
		// TODO Auto-generated method stub
		return new GameCharacter(this);
	}
	
	
}
