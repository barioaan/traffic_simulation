package org.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class World implements ActionListener{

	public static World world;
	
	public final int WIDTH = 1200, HEIGHT = 800;
	
	public Renderer renderer;
	
	int x=0,y=0;
	
	public World() {
		JFrame jframe = new JFrame();
		Timer timer = new Timer(20, this);
		
		renderer = new Renderer();
		
		jframe.add(renderer);
		jframe.setSize(WIDTH,HEIGHT);
		jframe.setVisible(true);
		jframe.setResizable(false);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		timer.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		renderer.repaint();
	}
	
	
	public void repaint(Graphics g) {
		
		System.out.println("SALUT");
		g.setColor(Color.RED);
		x=x+5;
		
		g.fillRect(x,y, 50, 50);
		
	}

	

	public static void main(String[] args) {
		
		world = new World();
		
	}
	
}
