package entities;

import interfaces.Brightness;
import interfaces.Volume;

public class Video extends PlayerMulti implements Volume, Brightness {
	private int volume;
	private int duration;
	private int bright;
	public Video(String title, int volume, int duration,int bright) {
		super(title);
		this.volume = volume;
		this.duration = duration;
		this.bright = bright;
	}

	public void play() {

		for (int i=0;i<bright;i++){
			System.out.println(title + " * "+bright);
		}
	}

	public void run() {
		play();
	}

	@Override
	public void volumeUp() {
		volume++;
	}

	@Override
	public void volumeDown() {
		if (volume > 0) volume--;
	}


	@Override
	public void brightUp() {
		bright++;
	}

	@Override
	public void brightDown() {
		if (bright>0) bright--;
	}

}

