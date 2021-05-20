package de.kunstwerk.models;

import de.kunstwerk.abstracts.GrafikObjekt;
import de.kunstwerk.enums.GrafikTyp;

public class Kreis extends GrafikObjekt {

	public Kreis(int x, int y, int size) {
		super(x, y, size, size);
		
		this.grafikTyp = GrafikTyp.KREIS;
	}

}
