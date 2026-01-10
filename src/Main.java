import entities.Audio;
import entities.PlayerMulti;

public class Main {
	public static void main(String[] args) {
		PlayerMulti audio1 = new Audio("audio1", 4,2 );
		PlayerMulti audio2 = new Audio("audio2", 3, 3);
		audio1.run();
		audio2.run();

	}
	}