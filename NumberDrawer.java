import java.awt.Graphics;

public class NumberDrawer {

	
	public static void drawOne(Graphics g, int startX, int startY, int endX, int endY) {
		g.drawLine(startX, startY, endX, startY);
		g.drawLine(startX, startY, startX, endY);
		g.drawLine(endX, startY, endX, endY);
		g.drawLine(startX, endY, endX, endY);
		g.fillRect(startX, startY, endX-startX, endY-startY);

		
	}
	
//------------------------------------------	
	
	public static void drawTwo(Graphics g, int startX, int startY, int endX, int endY) {
		
		drawOne(g, startX, 50, endX, 60);
		drawOne(g, endX-10, 60, endX, 97+70 );
		drawOne(g, startX, 97+70, endX, 97+70+10);
		drawOne(g, startX, 97+70+10, startX+10, 97+70+10+97);
		drawOne(g, startX, 97+70+10+97, endX, 97+70+10+97+10);
		
	}
	
//------------------------------------------	
	
	public static void drawThree(Graphics g, int startX, int startY, int endX, int endY) {
		
		drawOne(g, startX, 50, endX, 60);
		drawOne(g, endX-10, 60, endX, 97+70 );
		drawOne(g, startX, 97+70, endX, 97+70+10);
		drawOne(g, endX-10, 97+70+10, endX, 97+70+10+97 );
		drawOne(g, startX, 97+70+10+97, endX, 97+70+10+97+10);
	}
	
//------------------------------------------	
	
	public static void drawFour(Graphics g, int startX, int startY, int endX, int endY) {
		
		drawOne(g, endX-10, 50, endX, 97+70 );
		drawOne(g, startX, 50, startX+10, 97+70 );
		drawOne(g, startX, 97+70, endX, 97+70+10);
		drawOne(g, endX-10, 97+70+10, endX, 97+70+10+97+10 );
		
	}
	
//------------------------------------------	
	
	public static void drawFive(Graphics g, int startX, int startY, int endX, int endY) {
		
		drawOne(g, startX, 50, endX, 60);
		drawOne(g, startX, 60, startX+10, 97+70);
		drawOne(g, startX, 97+70, endX, 97+70+10);
		drawOne(g, endX-10, 97+70+10, endX, 97+70+10+97);
		drawOne(g, startX, 97+70+10+97, endX, 97+70+10+97+10);
		
	}
	
//------------------------------------------	
	
	public static void drawSix(Graphics g, int startX, int startY, int endX, int endY) {
		
		drawOne(g, startX, 50, endX, 60);
		drawOne(g, startX, 60, startX+10, 97+70);
		drawOne(g, startX, 97+70, endX, 97+70+10);
		drawOne(g, startX, 97+70+10, startX+10, 97+70+10+97);
		drawOne(g, endX-10, 97+70+10, endX, 97+70+10+97);
		drawOne(g, startX, 97+70+10+97, endX, 97+70+10+97+10);
	}
	
//------------------------------------------	
	
	public static void drawSeven(Graphics g, int startX, int startY, int endX, int endY) {
		
		drawOne(g, startX, 50, endX, 60);
		drawOne(g, endX-10, 60, endX, 97+70 );
		drawOne(g, endX-10, 97+70, endX, 97+70+10+97+10);
	}
	
//------------------------------------------	
	
	public static void drawEight(Graphics g, int startX, int startY, int endX, int endY) {
		
		drawOne(g, startX, 50, endX, 60);
		drawOne(g, startX, 60, startX+10, 97+70);
		drawOne(g, endX-10, 60, endX, 97+70 );
		drawOne(g, startX, 97+70, endX, 97+70+10);
		drawOne(g, startX, 97+70+10, startX+10, 97+70+10+97);
		drawOne(g, endX-10, 97+70+10, endX, 97+70+10+97);
		drawOne(g, startX, 97+70+10+97, endX, 97+70+10+97+10);
	}
	
//------------------------------------------	
	
	public static void drawNine(Graphics g, int startX, int startY, int endX, int endY) {
		
		drawOne(g, startX, 50, endX, 60);
		drawOne(g, startX, 60, startX+10, 97+70);
		drawOne(g, endX-10, 60, endX, 97+70 );
		drawOne(g, startX, 97+70, endX, 97+70+10);
		drawOne(g, endX-10, 97+70+10, endX, 97+70+10+97);
		drawOne(g, startX, 97+70+10+97, endX, 97+70+10+97+10);
	}
	
//------------------------------------------	
	
	public static void drawDot(Graphics g, int startX, int startY, int endX, int endY) {
		
		
		drawOne(g, startX, 97+70+10+97, endX, 97+70+10+97);
		drawOne(g, startX, 97+70+10+97, startX+10, 97+70+10+97+10);
		drawOne(g, startX, 97+70+10+97+10, endX, 97+70+10+97+10);
		g.fillRect(startX, startY, endX-startX, endY-startY);
		
		
		
	}
	
//------------------------------------------	
	
	public static void drawZero(Graphics g, int startX, int startY, int endX, int endY) {
		
		drawOne(g, startX, 50, endX, 60);
		drawOne(g, endX-10, 60, endX, 97+70 );
		drawOne(g, endX-10, 97+70, endX, 97+70+10+97);
		drawOne(g, startX, 60, startX+10, 97+70);
		drawOne(g, startX, 97+70, startX+10, 97+70+10+97);
		drawOne(g, startX, 97+70+10+97, endX, 97+70+10+97+10);
		
	}
	
//------------------------------------------	
	
	public static void drawMinus(Graphics g, int startX, int startY, int endX, int endY) {
			
		drawOne(g, startX, 97+70, endX, 97+70+10);
			
	}
	
	
	
	
	
}
