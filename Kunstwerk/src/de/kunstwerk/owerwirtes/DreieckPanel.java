package de.kunstwerk.owerwirtes;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Graphics2D;

import de.kunstwerk.main.Kunstwerk;
import de.kunstwerk.abstracts.GrafikObjekt;

public class DreieckPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private GrafikObjekt dreieck;
	
	public DreieckPanel(GrafikObjekt dreieck) {
		this.dreieck = dreieck;
		this.setOpaque(false);
		this.setBounds(0, 0, Kunstwerk.WIDTH, Kunstwerk.HEIGHT);
	}
	
	@Override
	public void paint(Graphics gr) {
		super.paint(gr);
		
		Graphics2D g2d = (Graphics2D) gr;	
		g2d.setColor(dreieck.getColor());
		g2d.fillPolygon(new int[] { dreieck.getWidth(), dreieck.getX(), dreieck.getWidthX2() }, 
				new int[] { dreieck.getY(), dreieck.getHeight(), dreieck.getHeight() }, 3);
		
		g2d.setColor(Color.black);
		g2d.drawPolygon(new int[] { dreieck.getWidth(), dreieck.getX(), dreieck.getWidthX2() }, 
				new int[] { dreieck.getY(), dreieck.getHeight(), dreieck.getHeight() }, 3);
	}

	public GrafikObjekt getDreieck() {
		return dreieck;
	}

	public void setDreieck(GrafikObjekt dreieck) {
		this.dreieck = dreieck;
	}

}
