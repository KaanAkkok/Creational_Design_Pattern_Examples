package Factory;

public class Gamer {
	

	
	public static void main(String[] args) {
		
		GameCharacter character =
				CharacterFactory.createCharacter("MyWarrior", "witcher");
		
		
		character.attack();
		character.defend();
		
		
		
	}

}
