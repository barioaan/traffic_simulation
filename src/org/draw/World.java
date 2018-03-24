package org.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

import org.logic.Banda;
import org.logic.Coordonate;
import org.logic.Masina;

public class World implements ActionListener{

	public static World world;
	
	public final int WIDTH = 1800, HEIGHT = 1000;
	
	public Renderer renderer;
	
	Masina masina_1, masina_2;
	
	Banda bandaA1I, bandaA2I, bandaA1N, bandaA2N, bandaCI, bandaCN, bandaB, bandaDN, bandaDI;
	
	Banda sep_A1I_A2I_SI, sep_A1N_A2N_SN, sep_SN_SI_A, sep_C, sep_D;
	
	JButton button = new JButton("Click");
	
	public World() {
		JFrame jframe = new JFrame();
		Timer timer = new Timer(100, this);
		
		renderer = new Renderer();
		
		jframe.add(renderer);
		jframe.setSize(WIDTH,HEIGHT);
		jframe.setVisible(true);
		//jframe.setResizable(false);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		timer.start();
				
	}
	
	
	public void desenareWorld() {
		desenareBenzi();
	}
	private void desenareBenzi() {
		
		// SI - sens invers  sN- pentru normal
		
		Coordonate cordBandaA1I = new Coordonate(0,416);
		bandaA1I = new Banda(cordBandaA1I,WIDTH,40);
		
		Coordonate cordSep_A1I_A2I_SI = new Coordonate(0,456);
		sep_A1I_A2I_SI = new Banda(cordSep_A1I_A2I_SI,WIDTH,2);
		
		Coordonate cordBandaA2I = new Coordonate(0,458);
		bandaA2I = new Banda(cordBandaA2I,WIDTH,40);
		
		
		
		
		
		
		Coordonate cordBandaA1N = new Coordonate(0,502);
		bandaA1N = new Banda(cordBandaA1N,WIDTH,40);
		
		Coordonate cordSep_A1N_A2N_SN = new Coordonate(0,542);
		sep_A1N_A2N_SN = new Banda(cordSep_A1N_A2N_SN,WIDTH,2);
		
		Coordonate cordBandaA2N = new Coordonate(0,544);
		bandaA2N = new Banda(cordBandaA2N,WIDTH,40);
		
		
		
		
		
		Coordonate cordSep_SN_SI_A = new Coordonate(0,498);
		sep_SN_SI_A = new Banda(cordSep_SN_SI_A,584,4);
		
		
		
		
		
		Coordonate cordBandaCI = new Coordonate(558,0);
		bandaCI = new Banda(cordBandaCI,40,HEIGHT);
		
		Coordonate cordSep_C = new Coordonate(0,598);
		sep_C = new Banda(cordSep_C,4,HEIGHT);
		
		Coordonate cordBandaCN = new Coordonate(602,0);
		bandaCN = new Banda(cordBandaCN,40,HEIGHT);
		
		
		
		
		
		
		Coordonate cordBandaB = new Coordonate(1286,0);
		bandaB = new Banda(cordBandaB,40,416);
		
		
		
		
		
		
		
		Coordonate cordBandaDI = new Coordonate(1242,584);
		bandaDI = new Banda(cordBandaDI,40,416);

		Coordonate cordSep_D = new Coordonate(1282,584);
		sep_D = new Banda(cordSep_D,4,416);
		
		Coordonate cordBandaDN = new Coordonate(1286,584);
		bandaDN = new Banda(cordBandaDN,40,416);
		
		
		
		
		
	}


	public void actionPerformed(ActionEvent e) {
		
		renderer.repaint();
	}
	
	
	public void repaint(Graphics g) {
		
		desenareWorld();
		//Banda A1 sens invers
		g.setColor(Color.GRAY);
		g.fillRect(bandaA1I.pozitieInceput.x, bandaA1I.pozitieInceput.y, bandaA1I.lungime, bandaA1I.latime);
		//Banda A2 sens invers
		g.setColor(Color.GRAY);
		g.fillRect(bandaA2I.pozitieInceput.x, bandaA2I.pozitieInceput.y, bandaA2I.lungime, bandaA2I.latime);
		//Separator benzi A sens invers
		g.setColor(Color.WHITE);
		g.fillRect(sep_A1I_A2I_SI.pozitieInceput.x,sep_A1I_A2I_SI.pozitieInceput.y, sep_A1I_A2I_SI.lungime, sep_A1I_A2I_SI.latime);
		
		
		//Banda A2 sens normal
		g.setColor(Color.GRAY);
		g.fillRect(bandaA2N.pozitieInceput.x, bandaA2N.pozitieInceput.y, bandaA2N.lungime, bandaA2N.latime);
		//Banda A1 sens normal
		g.setColor(Color.GRAY);
		g.fillRect(bandaA1N.pozitieInceput.x, bandaA1N.pozitieInceput.y, bandaA1N.lungime, bandaA1N.latime);
		//Separator benzi A sens normal
		g.setColor(Color.WHITE);
		g.fillRect(sep_A1N_A2N_SN.pozitieInceput.x, sep_A1N_A2N_SN.pozitieInceput.y, sep_A1N_A2N_SN.lungime, sep_A1N_A2N_SN.latime);
		
		
		//Separator sensuri benzi A
		g.setColor(Color.WHITE);
		g.fillRect(sep_SN_SI_A.pozitieInceput.x, sep_SN_SI_A.pozitieInceput.y, sep_SN_SI_A.lungime, sep_SN_SI_A.latime);
		
		
		
		//BANDA C sens invers
		g.setColor(Color.GRAY);
		g.fillRect(bandaCI.pozitieInceput.x, bandaCI.pozitieInceput.y, bandaCI.lungime, bandaCI.latime);
		//BANDA C separator
		g.setColor(Color.WHITE);
		g.fillRect(sep_C.pozitieInceput.x, sep_C.pozitieInceput.y, sep_C.lungime, sep_C.latime);
		//BANDA C sens normal
		g.setColor(Color.GRAY);
		g.fillRect(bandaCN.pozitieInceput.x, bandaCN.pozitieInceput.y, bandaCN.lungime, bandaCN.latime);
		
		
		
		//BANDA B sens unic
		g.setColor(Color.GRAY);
		g.fillRect(bandaB.pozitieInceput.x, bandaB.pozitieInceput.y, bandaB.lungime, bandaB.latime);
		
		
		
		//BANDA D sens invers
		g.setColor(Color.GRAY);
		g.fillRect(bandaDI.pozitieInceput.x, bandaDI.pozitieInceput.y, bandaDI.lungime, bandaDI.latime);
		//BANDA D sens normal
		g.setColor(Color.GRAY);
		g.fillRect(bandaDN.pozitieInceput.x, bandaDN.pozitieInceput.y, bandaDN.lungime, bandaDN.latime);
		//BANDA D separator
		
		
		
		
		
		
		
		
		
		//g.setColor(Color.WHITE);
		//g.drawLine(0, 432, 1200, 432);
		//g.fillRect(sep_A1N_A2N_SN.pozitieInceput.x,sep_A1N_A2N_SN.pozitieInceput.y, sep_A1N_A2N_SN.lungime, sep_A1N_A2N_SN.latime);
		
		
		
		/*g.setColor(Color.GRAY);
		g.fillRect(banda_2.Xstart,banda_2.Ystart, banda_2.Xfinish, banda_2.Yfinish);
		
		Banda separator_banda = new Banda(0,350,550,3);
		Banda separator_banda_2 = new Banda(600,0,3,300);
		Banda separator_banda_3 = new Banda(600,400,3,800);
		Banda separator_banda_4 = new Banda(650,350,550,3);
		
		g.setColor(Color.RED);
		button.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				   
				  } 
				});
		
		g.setColor(Color.WHITE);
		g.fillRect(separator_banda.Xstart,separator_banda.Ystart, separator_banda.Xfinish, separator_banda.Yfinish);
		
		g.setColor(Color.WHITE);
		g.fillRect(separator_banda_2.Xstart,separator_banda_2.Ystart, separator_banda_2.Xfinish, separator_banda_2.Yfinish);
		
		g.setColor(Color.WHITE);
		g.fillRect(separator_banda_3.Xstart,separator_banda_3.Ystart, separator_banda_3.Xfinish, separator_banda_3.Yfinish);
		
		g.setColor(Color.WHITE);
		g.fillRect(separator_banda_4.Xstart,separator_banda_4.Ystart, separator_banda_4.Xfinish, separator_banda_4.Yfinish);
		
		g.setColor(Color.RED);
		if(masina_1.x<=535) {
			masina_1.x=masina_1.x+15;
		}else {
			masina_1.x=550;
			if(masina_1.y<=800) {
				masina_1.y=masina_1.y+15;
			}else {
				masina_1.y=350;
				masina_1.x=0;
			}
		}
		g.fillRect(masina_1.x,masina_1.y, 50, 50);
		
		g.setColor(Color.BLUE);
		if(masina_2.x<=585) {
			masina_2.x=masina_2.x+15;
		}else {
			masina_2.x=600;
			if(masina_2.y>=0) {
				masina_2.y=masina_2.y - 15;
			}else {
				masina_2.y=350;
				masina_2.x=0;
			}
		}
		g.fillRect(masina_2.x,masina_2.y, 50, 50);
		
		*/
	}

	

	public static void main(String[] args) {
		
		world = new World();
		
	}
	
}
