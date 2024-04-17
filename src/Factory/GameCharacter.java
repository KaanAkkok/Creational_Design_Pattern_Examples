package Factory;

public abstract class GameCharacter {

	private String name;
	private int health;
	private int mana;
	
	public GameCharacter(String name, int health, int mana) {
		super();
		this.name = name;
		this.health = health;
		this.mana = mana;
	}
	
	public abstract void attack();
	public abstract void defend();
	
	
	
}
