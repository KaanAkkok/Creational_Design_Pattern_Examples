package Factory;

public class Warrior extends GameCharacter{

	public Warrior(String name) {
		super(name, 100, 20);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("I am warrior");
	}

	@Override
	public void defend() {
		// TODO Auto-generated method stub
		System.out.println("I am defending the wall");
	}
	
	

}
