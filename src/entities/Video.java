package entities;

import interfaces.Brightness;
import interfaces.Volume;

public class Video extends PlayerMulti implements Volume, Brightness {
	public Video(String title) {
		super(title);
	}
	public void play( ){
	}

	@Override
	public void brightUp() {

	}

	@Override
	public void brightDown() {

	}

	@Override
	public void volumeUp() {

	}

	@Override
	public void volumeDown() {

	}
}

