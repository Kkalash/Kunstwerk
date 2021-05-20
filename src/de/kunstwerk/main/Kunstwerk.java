package de.kunstwerk.main;

import java.io.File;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics2D;
import java.io.IOException;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.imageio.ImageIO;

import de.kunstwerk.models.*;
import de.kunstwerk.owerwirtes.*;
import de.kunstwerk.enums.GrafikTyp;
import de.kunstwerk.abstracts.GrafikObjekt;

public class Kunstwerk {

	public static final int Y = 0;
	public static final int X = 0;
	public static final int WIDTH = 1500;
	public static final int HEIGHT = 800;
	public static final Random random = new Random();

	public static void main(String[] args) {	
		init();
	}
	
	public static void init() {
		JFrame fenster = new JFrame("Kunstwerk");
		fenster.setLayout(null);
		fenster.setBounds(X, Y, WIDTH, HEIGHT);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.getContentPane().setBackground(Color.DARK_GRAY);
		
		Figur figur = new Figur();
		
		createFigure(figur);
		panelFigure(fenster, figur);
		fenster.setVisible(true);

		try {
			savePaint(fenster);
		} catch (Exception ex) {
			System.out.print(ex); 
		}
	}
	
	private static void createFigure(Figur figur) {	
		for (int i = 0; i < random.nextInt(10 - 4) + 4; i++) {
			Linie l = new Linie(random.nextInt(WIDTH), random.nextInt(HEIGHT), random.nextInt(WIDTH), random.nextInt(HEIGHT));
			figur.addGrafkObjekt(l);
			Quadrat q = new Quadrat(random.nextInt(WIDTH), random.nextInt(HEIGHT), random.nextInt(HEIGHT/3));
			figur.addGrafkObjekt(q);
			Rechteck r = new Rechteck(random.nextInt(WIDTH), random.nextInt(HEIGHT), random.nextInt(WIDTH/3), random.nextInt(HEIGHT/4));
			figur.addGrafkObjekt(r);
			Kreis k = new Kreis(random.nextInt(WIDTH), random.nextInt(HEIGHT), random.nextInt(HEIGHT/4));
			figur.addGrafkObjekt(k);
			Dreieck d = new Dreieck(random.nextInt(WIDTH/3), random.nextInt(HEIGHT), random.nextInt(WIDTH), random.nextInt(WIDTH), random.nextInt(HEIGHT/3));
			figur.addGrafkObjekt(d);
		}
	}
	
	private static void panelFigure(JFrame fenster, Figur figur) {
		for (GrafikObjekt go : figur.getFiguren()) {
			if (go.getGrafikTyp() == GrafikTyp.LINIE) {
				LiniePanel liniePanel = new LiniePanel(go);
				fenster.getContentPane().add(liniePanel);
			}
			if (go.getGrafikTyp() == GrafikTyp.QUADRAT) {
				QuadratPanel quadratPanel = new QuadratPanel(go);
				fenster.getContentPane().add(quadratPanel);
			}
			if (go.getGrafikTyp() == GrafikTyp.RECHTECK) {
				RechteckPanel rechteckPanel = new RechteckPanel(go);
				fenster.getContentPane().add(rechteckPanel);
			}
			if (go.getGrafikTyp() == GrafikTyp.KREIS) {
				KreisPanel kreisPanel = new KreisPanel(go);
				fenster.getContentPane().add(kreisPanel);
			}
			if (go.getGrafikTyp() == GrafikTyp.DREIECK) {
				DreieckPanel dreieckPanel = new DreieckPanel(go);
				fenster.getContentPane().add(dreieckPanel);
			}
		}
	}
	
	private static void savePaint(JFrame fenster) throws IOException {
		if (fenster.isVisible()) {
			BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
			Graphics2D graphics2D = image.createGraphics();
			fenster.paint(graphics2D);
			ImageIO.write(image, "PNG", new File("Kunstwerk.png"));			
		}
	}

}
