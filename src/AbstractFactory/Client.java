package AbstractFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryCreator creator = new FactoryCreator();
		
		GameCharacter character = creator.createCharacter("human", "knight");
		
		character.attack();
	}

}
