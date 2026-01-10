package entities;

import interfaces.Brightness;

public class Image extends PlayerMulti implements Brightness {
	private int bright;
	public Image(String name, int bright) {
		super(name);
		this.bright = bright;
	}
	public void show(){
		System.out.println(title + " * ".repeat(bright));
	}

	@Override
	public void brightUp() {
		bright++;
	}

	@Override
	public void brightDown() {
		if (bright>0)bright--;
	}

}
