package de.kunstwerk.models;

import de.kunstwerk.abstracts.GrafikObjekt;
import de.kunstwerk.enums.GrafikTyp;

public class Dreieck extends GrafikObjekt {
	
	public Dreieck(int x, int y, int widthX1, int widthX2, int height) {
		super(x, y, widthX1, widthX2, height);
		
		this.grafikTyp = GrafikTyp.DREIECK;
	}
	
}
