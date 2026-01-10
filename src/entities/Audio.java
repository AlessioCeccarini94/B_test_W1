package entities;

import interfaces.Volume;

public class Audio extends PlayerMulti implements Volume {
	private int volume;
	private int duration;

	public Audio(String title, int volume, int duration) {
		super(title);
		this.volume = volume;
		this.duration = duration;

	}
	public void play() {
        for (int i =0; i<duration;i++) {
			System.out.println(title + " ! " + volume);
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
		if (volume>0)volume--;
	}
}
