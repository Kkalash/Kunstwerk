package de.kunstwerk.owerwirtes;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Graphics2D;

import de.kunstwerk.main.Kunstwerk;
import de.kunstwerk.abstracts.GrafikObjekt;

public class KreisPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private GrafikObjekt kreis;
	
	public KreisPanel(GrafikObjekt kreis) {
		this.kreis = kreis;
		this.setOpaque(false);
		this.setBounds(0, 0, Kunstwerk.WIDTH, Kunstwerk.HEIGHT);
	}
	
	@Override
	public void paint(Graphics gr) {
		super.paint(gr);
		
		Graphics2D g2d = (Graphics2D) gr;
		g2d.setColor(kreis.getColor());
		g2d.fillOval(kreis.getX(), kreis.getY(), kreis.getWidth(), kreis.getHeight());
		g2d.setColor(Color.black);
		g2d.drawOval(kreis.getX(), kreis.getY(), kreis.getWidth(), kreis.getHeight());
	}

	public GrafikObjekt getKreis() {
		return kreis;
	}

	public void setKreis(GrafikObjekt kreis) {
		this.kreis = kreis;
	}
	
}
