package Factory;

public class CharacterFactory {
	
	//define  a static (factory) method that return specific instance 
	
	public static GameCharacter createCharacter(String name,String type) {
		GameCharacter character;
		switch(type.toLowerCase()) {
		case "warrior":
			character= new Warrior(name);
			break;
		case "witcher":
			character=new Witcher(name);
			break;
		default:
			character=null;
		}
		return character;
	}

}
