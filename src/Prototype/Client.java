package Prototype;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameCharacter character = new GameCharacter(100,60,80,50);
		
		GameCharacter copy = character.getclone();
	}

}
