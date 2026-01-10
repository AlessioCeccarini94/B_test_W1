import entities.Audio;
import entities.Image;
import entities.PlayerMulti;
import entities.Video;

public class Main {
	public static void main(String[] args) {
		PlayerMulti audio1 = new Audio("audio1", 4,2 );
		audio1.run();
		PlayerMulti video1 = new Video("video1", 3, 4,5);
		video1.run();
		PlayerMulti image1 = new Image("image1", 3);
		image1.run();
	}
	}