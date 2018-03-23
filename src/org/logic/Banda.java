package org.logic;

import java.util.ArrayList;

public class Banda {
	ArrayList<Masina> listaMasini = new ArrayList<Masina>();
	public int Xstart,Ystart,Xfinish,Yfinish;
	public Banda(int xstart, int ystart, int xfinish, int yfinish) {
		super();
		Xstart = xstart;
		Ystart = ystart;
		Xfinish = xfinish;
		Yfinish = yfinish;
	}
	
}
