package org.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

import org.logic.Banda;
import org.logic.Coordonate;
import org.logic.Intersectie;
import org.logic.Masina;

public class World implements ActionListener{

	public static World world;
	
	public final int WIDTH = 1800, HEIGHT = 1000;
	
	public Renderer renderer;
	
	Masina masina_1, masina_2;
	
	Banda bandaA1I, bandaA2I, bandaA1N, bandaA2N, bandaCI, bandaCN, bandaB, bandaDN, bandaDI, bandaEI, bandaEN;
	
	Banda sep_A1I_A2I_SI, sep_A1N_A2N_SN, sep_SN_SI_A, sep_C, sep_D, sep_A1I_A2I_SI_2, sep_A1I_A2I_SI_3, sep_A1N_A2N_SN_2, sep_A1N_A2N_SN_3, sep_SN_SI_A_2, sep_SN_SI_A_3, sep_E;
	
	JButton button = new JButton("Click");
	
	Random random = new Random();
	
	Intersectie intersectia1;
	
	
	Masina m1;
	
	public World() {
		JFrame jframe = new JFrame();
		Timer timer = new Timer(100, this);
		
		renderer = new Renderer();
		
		jframe.add(renderer);
		jframe.setSize(WIDTH,HEIGHT);
		jframe.setVisible(true);
		//jframe.setResizable(false);
		jframe.setBackground(new Color(0,0,0));
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		timer.start();
				
		////////////////////////////////////////////////////////////////////////////////////
		
		//BENZI A CU SEPARATORI SENS INVERS
				Coordonate cordBandaA1I = new Coordonate(0,418);
				bandaA1I = new Banda(cordBandaA1I,WIDTH,40);
				
				Coordonate cordSep_A1I_A2I_SI = new Coordonate(0,456);
				sep_A1I_A2I_SI = new Banda(cordSep_A1I_A2I_SI,558,2);
				
				Coordonate cordSep_A1I_A2I_SI_2 = new Coordonate(638,456);
				sep_A1I_A2I_SI_2 = new Banda(cordSep_A1I_A2I_SI_2,606,2);
				
				Coordonate cordSep_A1I_A2I_SI_3 = new Coordonate(1326,456);
				sep_A1I_A2I_SI_3 = new Banda(cordSep_A1I_A2I_SI_3,474,2);
				
				Coordonate cordBandaA2I = new Coordonate(0,458);
				bandaA2I = new Banda(cordBandaA2I,WIDTH,40);
				
				
				
				
				
				//BENZI A CU SEPARATORI SENS NORMAL
				Coordonate cordBandaA1N = new Coordonate(0,498);
				bandaA1N = new Banda(cordBandaA1N,WIDTH,40);
				
				Coordonate cordSep_A1N_A2N_SN = new Coordonate(0,538);
				sep_A1N_A2N_SN = new Banda(cordSep_A1N_A2N_SN,558,2);
				
				Coordonate cordSep_A1N_A2N_SN_2 = new Coordonate(638,538);
				sep_A1N_A2N_SN_2 = new Banda(cordSep_A1N_A2N_SN_2,606,2);
				
				Coordonate cordSep_A1N_A2N_SN_3 = new Coordonate(1326,538);
				sep_A1N_A2N_SN_3 = new Banda(cordSep_A1N_A2N_SN_3,474,2);
				
				Coordonate cordBandaA2N = new Coordonate(0,538);
				bandaA2N = new Banda(cordBandaA2N,WIDTH,40);
				
				
				
				
				//SEPARATOR SENSURI BANDA A
				Coordonate cordSep_SN_SI_A = new Coordonate(0,498);
				sep_SN_SI_A = new Banda(cordSep_SN_SI_A,558,4);
				
				Coordonate cordSep_SN_SI_A_2 = new Coordonate(638,498);
				sep_SN_SI_A_2 = new Banda(cordSep_SN_SI_A_2,606,4);
				
				Coordonate cordSep_SN_SI_A_3 = new Coordonate(1326,498);
				sep_SN_SI_A_3 = new Banda(cordSep_SN_SI_A_3,474,4);
				
				
				
				
				//BANDA C CU SEPARATORI de sensuri
				Coordonate cordBandaCI = new Coordonate(558,0);
				bandaCI = new Banda(cordBandaCI,40,418);
				
				Coordonate cordSep_C = new Coordonate(596,0);
				sep_C = new Banda(cordSep_C,4,418);
				
				Coordonate cordBandaCN = new Coordonate(598,0);
				bandaCN = new Banda(cordBandaCN,40,418);
				
				
				
				//Banda B
				Coordonate cordBandaB = new Coordonate(1286,0);
				bandaB = new Banda(cordBandaB,40,418);
						
				
				
				
				// BANDA D cu separator sensuri
				Coordonate cordBandaDI = new Coordonate(1246,578);
				bandaDI = new Banda(cordBandaDI,40,416);

				Coordonate cordSep_D = new Coordonate(1284,578);
				sep_D = new Banda(cordSep_D,4,416);
				
				Coordonate cordBandaDN = new Coordonate(1286,578);
				bandaDN = new Banda(cordBandaDN,40,416);
				
				
				
				
				
				// BANDA E cu separator sensuri
				Coordonate cordBandaEI = new Coordonate(558,578);
				bandaEI = new Banda(cordBandaEI,40,416);

				Coordonate cordSep_E = new Coordonate(596,578);
				sep_E = new Banda(cordSep_E,4,416);
						
				Coordonate cordBandaEN = new Coordonate(598,578);
				bandaEN = new Banda(cordBandaEN,40,416);
				
				
				///////////////////////////////////////////////////////////////////////////////////////////////////
				
				
				
		intersectia1 = new Intersectie();
		
		intersectia1.listaBenzi.add(bandaA1N);
		intersectia1.listaBenzi.add(bandaA2N);
		intersectia1.listaBenzi.add(bandaA2I);
		intersectia1.listaBenzi.add(bandaA1I);
		
		intersectia1.listaBenzi.add(bandaB);
		
		intersectia1.listaBenzi.add(bandaDI);
		intersectia1.listaBenzi.add(bandaDN);
		
		intersectia1.listaBenzi.add(bandaCI);
		intersectia1.listaBenzi.add(bandaCN);
		
		intersectia1.listaBenzi.add(bandaEI);
		intersectia1.listaBenzi.add(bandaEN);
		
		
		
		
		
		
		// LISTA SEPARATORI BENZI
		
		//intersectia1.listaSeparator.add
	}
	
	
	public void desenareWorld() {
		desenareBenzi();
		
		desenareMasini();
	}
	private void desenareBenzi() {
		
		// SI - sens invers  sN- pentru normal
		
		
		
		

		
		
	}

	public void desenareMasini() {
		
		m1 = new Masina(intersectia1.listaBenzi.get(3),30,30);
		
	}

	public void actionPerformed(ActionEvent e) {
		
		renderer.repaint();
	}
	int xx=0;
	int yy=542;
	int rezultat;
	public void repaint(Graphics g) {
		
		desenareWorld();
		
		
		//Banda A1 sens invers
		g.setColor(Color.GRAY);
		g.fillRect(intersectia1.listaBenzi.get(3).pozitieInceput.x, bandaA1I.pozitieInceput.y, bandaA1I.lungime, bandaA1I.latime);
		//Banda A2 sens invers
		g.setColor(Color.GRAY);
		g.fillRect(intersectia1.listaBenzi.get(2).pozitieInceput.x, bandaA2I.pozitieInceput.y, bandaA2I.lungime, bandaA2I.latime);
		//Separator benzi A sens invers
		g.setColor(Color.WHITE);
		g.fillRect(sep_A1I_A2I_SI.pozitieInceput.x,sep_A1I_A2I_SI.pozitieInceput.y, sep_A1I_A2I_SI.lungime, sep_A1I_A2I_SI.latime);
		//Banda A2 sens invers - 2
		g.setColor(Color.WHITE);
		g.fillRect(sep_A1I_A2I_SI_2.pozitieInceput.x, sep_A1I_A2I_SI_2.pozitieInceput.y, sep_A1I_A2I_SI_2.lungime, sep_A1I_A2I_SI_2.latime);
		//Banda A2 sens invers - 3
		g.setColor(Color.WHITE);
		g.fillRect(sep_A1I_A2I_SI_3.pozitieInceput.x, sep_A1I_A2I_SI_3.pozitieInceput.y, sep_A1I_A2I_SI_3.lungime, sep_A1I_A2I_SI_3.latime);
		
		
		
		
		
		//Banda A2 sens normal
		g.setColor(Color.GRAY);
		g.fillRect(intersectia1.listaBenzi.get(1).pozitieInceput.x, bandaA2N.pozitieInceput.y, bandaA2N.lungime, bandaA2N.latime);
		//Banda A1 sens normal
		g.setColor(Color.GRAY);
		g.fillRect(intersectia1.listaBenzi.get(0).pozitieInceput.x, bandaA1N.pozitieInceput.y, bandaA1N.lungime, bandaA1N.latime);
		//Separator benzi A sens normal
		g.setColor(Color.WHITE);
		g.fillRect(sep_A1N_A2N_SN.pozitieInceput.x, sep_A1N_A2N_SN.pozitieInceput.y, sep_A1N_A2N_SN.lungime, sep_A1N_A2N_SN.latime);
		//Separator benzi A sens normal -2
		g.setColor(Color.WHITE);
		g.fillRect(sep_A1N_A2N_SN_2.pozitieInceput.x, sep_A1N_A2N_SN_2.pozitieInceput.y, sep_A1N_A2N_SN_2.lungime, sep_A1N_A2N_SN_2.latime);
		//Separator benzi A sens normal -3 
		g.setColor(Color.WHITE);
		g.fillRect(sep_A1N_A2N_SN_3.pozitieInceput.x, sep_A1N_A2N_SN_3.pozitieInceput.y, sep_A1N_A2N_SN_3.lungime, sep_A1N_A2N_SN_3.latime);
		
		
		//Separator sensuri benzi A
		g.setColor(Color.WHITE);
		g.fillRect(sep_SN_SI_A.pozitieInceput.x, sep_SN_SI_A.pozitieInceput.y, sep_SN_SI_A.lungime, sep_SN_SI_A.latime);
		//Separator sensuri benzi A -2
		g.setColor(Color.WHITE);
		g.fillRect(sep_SN_SI_A_2.pozitieInceput.x, sep_SN_SI_A_2.pozitieInceput.y, sep_SN_SI_A_2.lungime, sep_SN_SI_A_2.latime);
		//Separator sensuri benzi A -3
		g.setColor(Color.WHITE);
		g.fillRect(sep_SN_SI_A_3.pozitieInceput.x, sep_SN_SI_A_3.pozitieInceput.y, sep_SN_SI_A_3.lungime, sep_SN_SI_A_3.latime);
		
		
		
		
		
		
		//BANDA C sens invers
		g.setColor(Color.GRAY);
		g.fillRect(intersectia1.listaBenzi.get(5).pozitieInceput.x, bandaCI.pozitieInceput.y, bandaCI.lungime, bandaCI.latime);
		//BANDA C sens normal
		g.setColor(Color.GRAY);
		g.fillRect(intersectia1.listaBenzi.get(6).pozitieInceput.x, bandaCN.pozitieInceput.y, bandaCN.lungime, bandaCN.latime);
		//BANDA C separator
		g.setColor(Color.WHITE);
		g.fillRect(sep_C.pozitieInceput.x, sep_C.pozitieInceput.y, sep_C.lungime, sep_C.latime);
		
		
		//BANDA B sens unic
		g.setColor(Color.GRAY);
		g.fillRect(intersectia1.listaBenzi.get(4).pozitieInceput.x, bandaB.pozitieInceput.y, bandaB.lungime, bandaB.latime);
		
		
		
		//BANDA D sens invers
		g.setColor(Color.GRAY);
		g.fillRect(intersectia1.listaBenzi.get(7).pozitieInceput.x, bandaDI.pozitieInceput.y, bandaDI.lungime, bandaDI.latime);
		//BANDA D sens normal
		g.setColor(Color.GRAY);
		g.fillRect(intersectia1.listaBenzi.get(8).pozitieInceput.x, bandaDN.pozitieInceput.y, bandaDN.lungime, bandaDN.latime);
		//BANDA D separator
		g.setColor(Color.WHITE);
		g.fillRect(sep_D.pozitieInceput.x, sep_D.pozitieInceput.y, sep_D.lungime, sep_D.latime);
		
		
		//BANDA E sens invers
		g.setColor(Color.GRAY);
		g.fillRect(intersectia1.listaBenzi.get(9).pozitieInceput.x, bandaEI.pozitieInceput.y, bandaEI.lungime, bandaEI.latime);
		//BANDA D sens normal
		g.setColor(Color.GRAY);
		g.fillRect(intersectia1.listaBenzi.get(10).pozitieInceput.x, bandaEN.pozitieInceput.y, bandaEN.lungime, bandaEN.latime);
		//BANDA D separator
		g.setColor(Color.WHITE);
		g.fillRect(sep_E.pozitieInceput.x, sep_E.pozitieInceput.y, sep_E.lungime, sep_E.latime);
		
		
		
		
		
		g.setColor(Color.RED);
		
		
		if(xx <= 500) {
			xx = xx + 10;
		}else {
			if(xx == 510) {
				
				xx = 568;
				
				 rezultat = random.nextInt(2);
				
				
			}
			if(rezultat == 1) {
				xx = xx + 10;
			}
			if(rezultat == 0) {
				yy = yy + 10;
				//xx= 520;
			}
		}
		g.fillRect(xx, yy, m1.lungime, m1.latime);
		
		
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
				
		/*		
				URL image = getClass().getResource("C:\\Users\\Adela\\Desktop\\imagine");
				Icon sens_unic = new ImageIcon (image);
				int w= sens_unic.getIconHeight();
				int h =sens_unic.getIconHeight(); 
				g.drawImage((Image) sens_unic, 400, 400, w, h, null);
	*/	
	}

	

	public static void main(String[] args) {
		
		world = new World();
		
	}
	
}
