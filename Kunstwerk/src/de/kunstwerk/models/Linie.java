package de.kunstwerk.models;

import de.kunstwerk.abstracts.GrafikObjekt;
import de.kunstwerk.enums.GrafikTyp;

public class Linie extends GrafikObjekt {

	public Linie(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2);

		this.grafikTyp = GrafikTyp.LINIE;
	}
	
}
