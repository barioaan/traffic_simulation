package org.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

import org.logic.Banda;
import org.logic.Masina;

public class World implements ActionListener{

	public static World world;
	
	public final int WIDTH = 1200, HEIGHT = 800;
	
	public Renderer renderer;
	
	Masina masina_1, masina_2;
	
	JButton button = new JButton("Click");
	
	public World() {
		JFrame jframe = new JFrame();
		Timer timer = new Timer(100, this);
		
		renderer = new Renderer();
		
		jframe.add(renderer);
		jframe.setSize(WIDTH,HEIGHT);
		jframe.setVisible(true);
		jframe.setResizable(false);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		timer.start();
		
		
		masina_1 = new Masina(0,350);
		masina_2 = new Masina(0,350);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		renderer.repaint();
	}
	
	
	public void repaint(Graphics g) {
		
		Banda banda_1 = new Banda(0,300,1200,100);
		Banda banda_2 = new Banda(550,0,100,1200);
		
		g.setColor(Color.GRAY);
		g.fillRect(banda_1.Xstart,banda_1.Ystart, banda_1.Xfinish, banda_1.Yfinish);
		
		g.setColor(Color.GRAY);
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
		
		
	}

	

	public static void main(String[] args) {
		
		world = new World();
		
	}
	
}
