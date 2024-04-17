package AbstractFactory;

public class FactoryCreator {
	
	private OrgFactory createOrgFactory() {
		return new OrgFactory();
	}
	
	private HumanFactory createHumanFactory() {
		return new HumanFactory();
	}
	
	public CharacterFactory createFactory(String nation) {
		if(nation.equals("human")) {
			return createHumanFactory();
		}
		else if(nation.equals("org")) {
			return createOrgFactory();
		}
		else { 
			return null; 
		}
	}
	
	public GameCharacter createCharacter(String nation, String type) {
		CharacterFactory factory = createFactory(nation);
		return factory.createCharacter(type);
	}
}
