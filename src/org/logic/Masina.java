package org.logic;

import java.awt.Color;
import java.util.Random;

public class Masina {
	public Banda banda;
	public int culoare;
	public int lungime;
	public int latime;

	public Masina(Banda banda, int lungime, int latime) {
		super();
		this.banda = banda;
		//this.culoare = culoare;
		this.lungime = lungime;
		this.latime = latime;
	}
	
/*	Random randomGenerator = new Random();
	int red = randomGenerator.nextInt(256);
	int green = randomGenerator.nextInt(256);
	int blue = randomGenerator.nextInt(256);

	Color randomColour = new Color(red,green,blue);
	*/

}
