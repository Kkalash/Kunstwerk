package de.kunstwerk.abstracts;

import java.awt.Color;
import de.kunstwerk.enums.GrafikTyp;

public abstract class GrafikObjekt {
	private int x;
	private int y;
	private int width;
	private int height;
	private int widthX2;
	private Color color;
	protected GrafikTyp grafikTyp;
	
	public GrafikObjekt(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = new Color((int)(Math.random() * 0x1000000));
	}
	
	public GrafikObjekt(int x, int y, int widthX1, int widthX2, int height) {
		this.x = x;
		this.y = y;
		this.width = widthX1;
		this.height = height;
		this.widthX2 = widthX2;
		this.color = new Color((int)(Math.random() * 0x1000000));
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
	

	public int getWidthX2() {
		return widthX2;
	}

	public void setWidthX2(int widthX2) {
		this.widthX2 = widthX2;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public GrafikTyp getGrafikTyp() {
		return grafikTyp;
	}

	public void setGrafikTyp(GrafikTyp grafikTyp) {
		this.grafikTyp = grafikTyp;
	}
}
