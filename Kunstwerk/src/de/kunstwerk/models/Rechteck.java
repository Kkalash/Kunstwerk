package de.kunstwerk.models;

import de.kunstwerk.abstracts.GrafikObjekt;
import de.kunstwerk.enums.GrafikTyp;

public class Rechteck extends GrafikObjekt {

	public Rechteck(int x, int y, int width, int height) {
		super(x, y, width, height);
		
		this.grafikTyp = GrafikTyp.RECHTECK;
	}

}
