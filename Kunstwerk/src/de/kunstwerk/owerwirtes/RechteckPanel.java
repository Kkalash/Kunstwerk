package de.kunstwerk.owerwirtes;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Graphics2D;

import de.kunstwerk.main.Kunstwerk;
import de.kunstwerk.abstracts.GrafikObjekt;

public class RechteckPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private GrafikObjekt rechteck;

	public RechteckPanel(GrafikObjekt rechteck) {
		this.rechteck = rechteck;
		this.setOpaque(false);
		this.setBounds(0, 0, Kunstwerk.WIDTH, Kunstwerk.HEIGHT);
	}
	
	@Override
	public void paint(Graphics gr) {
		super.paint(gr);
		
		Graphics2D g2d = (Graphics2D) gr;
		g2d.setColor(rechteck.getColor());
		g2d.fillRect(rechteck.getX(), rechteck.getY(), rechteck.getWidth(), rechteck.getHeight());
		g2d.setColor(Color.black);
		g2d.drawRect(rechteck.getX(), rechteck.getY(), rechteck.getWidth(), rechteck.getHeight());

	}

	public GrafikObjekt getRechteck() {
		return rechteck;
	}

	public void setRechteck(GrafikObjekt rechteck) {
		this.rechteck = rechteck;
	}
	
}
