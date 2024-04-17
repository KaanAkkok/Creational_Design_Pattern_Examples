package Factory;

public class Witcher extends GameCharacter{

	public Witcher(String name) {
		super(name, 50, 100);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("I am witcher");
	}

	@Override
	public void defend() {
		// TODO Auto-generated method stub
		System.out.println("I am defending myself");
	}
}