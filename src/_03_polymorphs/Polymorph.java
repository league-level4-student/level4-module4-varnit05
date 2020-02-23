package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int WIDTH;
    private int HEIGHT;
    
    public int getWIDTH() {
		return WIDTH;
	}


	public void setWIDTH(int wIDTH) {
		WIDTH = wIDTH;
	}


	public int getHEIGHT() {
		return HEIGHT;
	}


	public void setHEIGHT(int hEIGHT) {
		HEIGHT = hEIGHT;
	}


	Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }


	public void update(){
   	 
    }
    
    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
    
    public abstract void draw(Graphics g);
    
}
