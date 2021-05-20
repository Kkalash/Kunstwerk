package de.kunstwerk.models;

import de.kunstwerk.enums.GrafikTyp;

public class Quadrat extends Rechteck {
	
	public Quadrat(int x, int y, int size) {
		super(x, y, size, size);
		
		this.grafikTyp = GrafikTyp.QUADRAT;
	}

}
