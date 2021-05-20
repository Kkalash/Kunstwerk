package de.kunstwerk.models;

import java.util.List;
import java.util.ArrayList;

import de.kunstwerk.abstracts.GrafikObjekt;

public class Figur {
	private int x;
	private int y;
	private int width;
	private int height;
	private List<GrafikObjekt> figuren = new ArrayList<GrafikObjekt>();
	
	public Figur() {}
	
	public void addGrafkObjekt(GrafikObjekt obj) {
		if (obj == null) throw new IllegalArgumentException();
		
		figuren.add(obj);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public List<GrafikObjekt> getFiguren() {
		return figuren;
	}

	public void setFiguren(List<GrafikObjekt> figuren) {
		this.figuren = figuren;
	}

}
