package de.kunstwerk.owerwirtes;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Graphics2D;

import de.kunstwerk.main.Kunstwerk;
import de.kunstwerk.abstracts.GrafikObjekt;

public class LiniePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private GrafikObjekt linie;

	public LiniePanel(GrafikObjekt linie) {
		this.linie = linie;
		this.setOpaque(false);
		this.setBounds(0, 0, Kunstwerk.WIDTH, Kunstwerk.HEIGHT);
	}
	
	@Override
	public void paint(Graphics gr) {
		super.paint(gr);

	    Graphics2D g2d = (Graphics2D) gr;
		g2d.setColor(linie.getColor());
        g2d.drawLine(linie.getX(), linie.getY(), linie.getWidth(), linie.getHeight());
	}

	public GrafikObjekt getLinie() {
		return linie;
	}

	public void setLinie(GrafikObjekt linie) {
		this.linie = linie;
	}
		
}
