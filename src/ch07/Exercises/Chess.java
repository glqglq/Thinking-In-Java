package ch07.Exercises;
/**
 * Exercise-7.6
 * @author LuckyGong
 *
 */
class Game{
	Game(int i){System.out.println("Game Constructor");}
}
class BoardGame extends Game{
	BoardGame(int i){
		super(i);
		System.out.println("BoardGame Constructor");
	}
}
public class Chess extends BoardGame{

	Chess() {
		super(11);
		System.out.println("Chess constructor");
	}
	public static void main(String[] args) {
		Chess c = new Chess();
	}
}