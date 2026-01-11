import entities.Audio;
import entities.Image;
import entities.PlayerMulti;
import entities.Video;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PlayerMulti[] file = new PlayerMulti[5];
		System.out.println("file:1) Audio,2) Video,3) Image, 4) Video,5) Audio ");
		int selectFile = scan.nextInt();
		System.out.println(selectFile);
		switch (selectFile) {
			case 1:
				file[0] = new Audio(scan.nextLine(), scan.nextInt(), scan.nextInt());
				break;
			case 2:
				file[1] = new Video(scan.nextLine(), scan.nextInt(), scan.nextInt(), scan.nextInt());
				break;
			case 3:
				file[2] = new Image(scan.nextLine(), scan.nextInt());
				break;
			case 4:
				file[3] = new Video(scan.nextLine(), scan.nextInt(), scan.nextInt(), scan.nextInt());
				break;
			case 5:
				file[4] = new Audio(scan.nextLine(), scan.nextInt(), scan.nextInt());
				break;
			default:
				String def = "Seleziona un nuovo file";
		}
	}
}
