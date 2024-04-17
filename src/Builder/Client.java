package Builder;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCharacter character = new GameCharacter.Builder().setHealth(100).setMana(20).setAttack(150).setDefence(50).build();
	}

}
