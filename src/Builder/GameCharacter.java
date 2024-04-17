package Builder;

public class GameCharacter {
	
	public int health;
	public int mana;
	public int attack;
	public int defence;
	
	public GameCharacter(Builder builder) {
		this.health = builder.health;
		this.mana = builder.mana;
		this.attack = builder.attack;
		this.defence = builder.defence;
	}
	
	public static class Builder {
		private int health;
		private int mana;
		private int attack;
		private int defence;
		
		public Builder() {
			super();
		}

		public Builder setHealth(int health) {
			this.health = health;
			return this;
		}

		public Builder setMana(int mana) {
			this.mana = mana;
			return this;
		}

		public Builder setAttack(int attack) {
			this.attack = attack;
			return this;
		}

		public Builder setDefence(int defence) {
			this.defence = defence;
			return this;
		}
		
		public GameCharacter build() {
			return new GameCharacter(this);
		}
	}
}
