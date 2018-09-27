package br.senaigo.fatesg.main;

import java.awt.Color;

import org.joda.time.LocalTime;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImagePlus imp = IJ.openImage("C:\\AmbienteTrabalho\\workspace\\Fatesg\\Atividade_N1\\src\\img\\skull.jpg");
		ImageProcessor ip = imp.getProcessor();
		ip.setColor(Color.YELLOW);
		ip.setLineWidth(4);
		ip.drawRect(10, 10, imp.getWidth() - 20, imp.getHeight() - 20);
		imp.show();
	}
	
	public static LocalTime getHorario() {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime.toString());
		return currentTime;
	}
}
