package de.kunstwerk.owerwirtes;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Graphics2D;

import de.kunstwerk.main.Kunstwerk;
import de.kunstwerk.abstracts.GrafikObjekt;

public class QuadratPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private GrafikObjekt quadrat;
	
	public QuadratPanel(GrafikObjekt quadrat) {
		this.quadrat = quadrat;
		this.setOpaque(false);
		this.setBounds(0, 0, Kunstwerk.WIDTH, Kunstwerk.HEIGHT);
	}

	@Override
	public void paint(Graphics gr) {
		super.paint(gr);
		
		Graphics2D g2d = (Graphics2D) gr;
		g2d.setColor(quadrat.getColor());
		g2d.fillRect(quadrat.getX(), quadrat.getY(), quadrat.getWidth(), quadrat.getWidth());
		g2d.setColor(Color.black);
		g2d.drawRect(quadrat.getX(), quadrat.getY(), quadrat.getWidth(), quadrat.getWidth());

	}

	public GrafikObjekt getQuadrat() {
		return quadrat;
	}

	public void setQuadrat(GrafikObjekt quadrat) {
		this.quadrat = quadrat;
	}
	
}
