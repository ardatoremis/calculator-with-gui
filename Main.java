import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.Font;

public class Main extends JFrame implements ActionListener {

	String previous = "", current = "", operator = "", oldprevious = "";
	float result;
	String printer = "";
	boolean check;

//--------------------------------------------------------------------	
		
	
	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(new Color(88,108,196));
		g.clearRect(1,1,799,300);
		g.drawRect(1,1,799,300);
		g.setColor(Color.black);

	if(!printer.equals("")) {	
		char[] digits = printer.toCharArray();
		
		NumberDrawer drawer = new NumberDrawer();
		
		for(int i=0; i<digits.length; i++) {
			
			switch(digits[i]) {
			
			case '0':
				drawer.drawZero(g, 730-((digits.length-(i+1))*73), 50, (730-((digits.length-(i+2))*73))-20, 800);
				break;
			case '1':
				drawer.drawOne(g, 730-((digits.length-(i+1))*73), 50, (730-((digits.length-(i+1))*73))+10, 285);
				break;
			case '2':
				drawer.drawTwo(g, 730-((digits.length-(i+1))*73), 50, (730-((digits.length-(i+2))*73))-20, 800);
				break;
			case '3':
				drawer.drawThree(g, 730-((digits.length-(i+1))*73), 50, (730-((digits.length-(i+2))*73))-20, 800);
				break;
			case '4':
				drawer.drawFour(g, 730-((digits.length-(i+1))*73), 50, (730-((digits.length-(i+2))*73))-20, 800);
				break;
			case '5':
				drawer.drawFive(g, 730-((digits.length-(i+1))*73), 50, (730-((digits.length-(i+2))*73))-20, 800);
				break;
			case '6':
				drawer.drawSix(g, 730-((digits.length-(i+1))*73), 50, (730-((digits.length-(i+2))*73))-20, 800);
				break;
			case '7':
				drawer.drawSeven(g, 730-((digits.length-(i+1))*73), 50, (730-((digits.length-(i+2))*73))-20, 800);
				break;
			case '8':
				drawer.drawEight(g, 730-((digits.length-(i+1))*73), 50, (730-((digits.length-(i+2))*73))-20, 800);
				break;
			case '9':
				drawer.drawNine(g, 730-((digits.length-(i+1))*73), 50, (730-((digits.length-(i+2))*73))-20, 800);
				break;
			case '-':
				drawer.drawMinus(g, (730-((digits.length-(i+2))*73))-40, 50, (730-((digits.length-(i+2))*73))-20, 800);
				break;
				
			case '.':
				drawer.drawDot(g, (730-((digits.length-(i+2))*73))-16, 50, (730-((digits.length-(i+2))*73))-16, 800);
				break;
			}

		}
		
	}		
		

		}
	
	
//---------------------------------------------------------------------	
	
		public Main() {
			
			setSize(800,1000);
			setResizable(false);			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new GridLayout(0,1));
		
			
			JPanel upperPanel = new JPanel();
			upperPanel.setLayout(new GridLayout(0,1));
			upperPanel.setBackground(Color.WHITE);
			upperPanel.setForeground(Color.WHITE);
			
			JPanel screen = new JPanel();
			screen.setPreferredSize(new Dimension(800, 300));
			screen.setBackground(Color.WHITE);
			screen.setForeground(Color.WHITE);
			
			upperPanel.add(screen);
			
			
			JPanel empty = new JPanel();
			empty.setPreferredSize(new Dimension(800,100));
			empty.setBackground(Color.WHITE);
			empty.setForeground(Color.WHITE);
			
			upperPanel.add(empty);
			
			JPanel empty2 = new JPanel();
			empty2.setPreferredSize(new Dimension(800,100));
			empty2.setBackground(Color.WHITE);
			empty2.setForeground(Color.WHITE);
			
			upperPanel.add(empty2);
			
			
			
			

			JButton c = new JButton("C");
			c.setPreferredSize(new Dimension(800, 200));
			c.setBackground(new Color(88,108,196));
			c.setForeground(Color.WHITE);
			c.setFont(c.getFont().deriveFont(Font.BOLD, 20));
			c.addActionListener(this);

			upperPanel.add(c);			
			
			add(upperPanel);

			JPanel buttons = new JPanel();
			buttons.setLayout(new GridLayout(4,4, 30, 30));
			buttons.setBackground(Color.WHITE);
			

			
			JButton seven = new JButton("7");
			seven.setPreferredSize(new Dimension(25, 25));
			seven.setBackground(new Color(88,108,196));
			seven.setForeground(Color.WHITE);
			seven.addActionListener(this);
			seven.setFont(seven.getFont().deriveFont(Font.BOLD, 20));
			add(seven);
			
			JButton eight = new JButton("8");
			eight.setPreferredSize(new Dimension(25, 25));
			eight.setBackground(new Color(88,108,196));
			eight.setForeground(Color.WHITE);
			eight.addActionListener(this);
			eight.setFont(eight.getFont().deriveFont(Font.BOLD, 20));
			add(eight);
			
			JButton nine = new JButton("9");
			nine.setPreferredSize(new Dimension(25, 25));
			nine.setBackground(new Color(88,108,196));
			nine.setForeground(Color.WHITE);
			nine.addActionListener(this);
			nine.setFont(nine.getFont().deriveFont(Font.BOLD, 20));
			add(nine);
			
			JButton plus = new JButton("+");
			plus.setPreferredSize(new Dimension(25, 25));
			plus.setBackground(new Color(88,108,196));
			plus.setForeground(Color.WHITE);
			plus.addActionListener(this);
			plus.setFont(plus.getFont().deriveFont(Font.BOLD, 20));
			add(plus);
			
			JButton four = new JButton("4");
			four.setPreferredSize(new Dimension(25, 25));
			four.setBackground(new Color(88,108,196));
			four.setForeground(Color.WHITE);
			four.addActionListener(this);
			four.setFont(four.getFont().deriveFont(Font.BOLD, 20));
			add(four);
			
			JButton five = new JButton("5");
			five.setPreferredSize(new Dimension(25, 25));
			five.setBackground(new Color(88,108,196));
			five.setForeground(Color.WHITE);
			five.addActionListener(this);
			five.setFont(five.getFont().deriveFont(Font.BOLD, 20));
			add(five);
			
			JButton six = new JButton("6");
			six.setPreferredSize(new Dimension(25, 25));
			six.setBackground(new Color(88,108,196));
			six.setForeground(Color.WHITE);
			six.addActionListener(this);
			six.setFont(six.getFont().deriveFont(Font.BOLD, 20));
			add(six);
			
			JButton minus = new JButton("-");
			minus.setPreferredSize(new Dimension(25, 25));
			minus.setBackground(new Color(88,108,196));
			minus.setForeground(Color.WHITE);
			minus.addActionListener(this);
			minus.setFont(minus.getFont().deriveFont(Font.BOLD, 20));
			add(minus);
			
			JButton one = new JButton("1");
			one.setPreferredSize(new Dimension(25, 25));
			one.setBackground(new Color(88,108,196));
			one.setForeground(Color.WHITE);
			one.addActionListener(this);
			one.setFont(one.getFont().deriveFont(Font.BOLD, 20));
			add(one);
			
			JButton two = new JButton("2");
			two.setPreferredSize(new Dimension(25, 25));
			two.setBackground(new Color(88,108,196));
			two.setForeground(Color.WHITE);
			two.addActionListener(this);
			two.setFont(two.getFont().deriveFont(Font.BOLD, 20));
			add(two);
			
			JButton three = new JButton("3");
			three.setPreferredSize(new Dimension(25, 25));
			three.setBackground(new Color(88,108,196));
			three.setForeground(Color.WHITE);
			three.addActionListener(this);
			three.setFont(three.getFont().deriveFont(Font.BOLD, 20));
			add(three);
			
			JButton x = new JButton("X");
			x.setPreferredSize(new Dimension(25, 25));
			x.setBackground(new Color(88,108,196));
			x.setForeground(Color.WHITE);
			x.addActionListener(this);
			x.setFont(x.getFont().deriveFont(Font.BOLD, 20));
			add(x);
			
			JButton zero = new JButton("0");
			zero.setPreferredSize(new Dimension(25, 25));
			zero.setBackground(new Color(88,108,196));
			zero.setForeground(Color.WHITE);
			zero.addActionListener(this);
			zero.setFont(zero.getFont().deriveFont(Font.BOLD, 20));
			add(zero);
			
			JButton decimal = new JButton(".");
			decimal.setPreferredSize(new Dimension(25, 25));
			decimal.setBackground(new Color(88,108,196));
			decimal.setForeground(Color.WHITE);
			decimal.addActionListener(this);
			decimal.setFont(decimal.getFont().deriveFont(Font.BOLD, 20));
			add(decimal);
			
			JButton equals = new JButton("=");
			equals.setPreferredSize(new Dimension(25, 25));
			equals.setBackground(new Color(88,108,196));
			equals.setForeground(Color.WHITE);
			equals.addActionListener(this);
			equals.setFont(equals.getFont().deriveFont(Font.BOLD, 20));
			add(equals);
			
			JButton divide = new JButton("/");
			divide.setPreferredSize(new Dimension(25, 25));
			divide.setBackground(new Color(88,108,196));
			divide.setForeground(Color.WHITE);
			divide.addActionListener(this);
			divide.setFont(divide.getFont().deriveFont(Font.BOLD, 20));
			add(divide);
			
			
			buttons.add(seven);
			buttons.add(eight);
			buttons.add(nine);
			buttons.add(plus);
			buttons.add(four);
			buttons.add(five);
			buttons.add(six);
			buttons.add(minus);
			buttons.add(one);
			buttons.add(two);
			buttons.add(three);
			buttons.add(x);
			buttons.add(zero);
			buttons.add(decimal);
			buttons.add(equals);
			buttons.add(divide);
			
			
			add(buttons);
			
			
			setTitle("Calculator");
			
			repaint();
			
			setVisible(true);
		}
		
//------------------------------------------------------------------
	
		public void actionPerformed(ActionEvent e) {
			
			String command = e.getActionCommand();
			
			if(!oldprevious.equals("") && ( ( command.equals("+") || command.equals("-") || command.equals("/") || command.equals("X") ) || check )) {
				
				check = true;
				
				previous = oldprevious;
				
				if(command.equals("C")) {
					current = "";
					previous = "";
					operator = "";
					printer = "";
					repaint();
					
				}
					
				
				if(!operator.equals("") && command.equals("-") && current.equals("")) {
					current = "-";
				}
				
				if( operator.equals("") && ( command.equals("+") || command.equals("-") || command.equals("/") || command.equals("X") ) && !previous.equals("") && current.equals("") ) {
					if(command.equals("/"))
						operator = "/";
					else
					operator = command;
				}
			

				if(command.equals("-") && previous.equals("")) {
					previous = "-";
				}
				

				if( operator.equals("") && !command.equals("C") && !command.equals("+") && !command.equals("-") && !command.equals("/") && !command.equals("X") && !command.equals(".") && !command.equals("=") && current.equals("") && ( !previous.equals("") ) ) {
					previous = previous + command;
				if(previous.startsWith("-"))
					printer = previous.substring(1);
				else	
					printer = previous;
					repaint();
				}
				
				
				if(operator.equals("") && !command.equals("C") && !command.equals("+") && !command.equals("-") && !command.equals("/") && !command.equals("X") && !command.equals(".") && !command.equals("=") && current.equals("") && previous.equals("") ) {
					previous = command;	
					if(previous.startsWith("-"))
						printer = previous.substring(1);
					else	
						printer = previous;
					repaint();
				}
				

				if( !operator.equals("") && !command.equals("C") && !command.equals("+") && !command.equals("-") && !command.equals("/") && !command.equals("X") && !command.equals(".") && !command.equals("=") && !current.equals("") && ( !previous.equals("") && !previous.endsWith(".") ) ) {
					current = current + command;
					if(current.startsWith("-"))
						printer = current.substring(1);
					else	
						printer = current;
					repaint();
				}
				

				if( !operator.equals("") && !command.equals("C") && !command.equals("+") && !command.equals("-") && !command.equals("/") && !command.equals("X") && !command.equals(".") && !command.equals("=") && current.equals("") && (!previous.equals("") && !previous.endsWith(".") ) ) {
					current = command;
					if(current.startsWith("-"))
						printer = current.substring(1);
					else	
						printer = current;
					repaint();
				}
				

				if( operator.equals("") && !command.equals("C") && !command.equals("+") && !command.equals("-") && !command.equals("/") && !command.equals("X") && command.equals(".") && current.equals("") && !previous.equals("") ) {
					previous = previous + command;
					if(previous.startsWith("-"))
						printer = previous.substring(1);
					else	
						printer = previous;
					repaint();
				}
				

				if( operator.equals("") && !command.equals("C") && !command.equals("+") && !command.equals("-") && !command.equals("/") && !command.equals("X") && !command.equals(".") && !command.equals("=") && previous.endsWith(".") && current.equals("") ) {
					previous = previous + command;
					if(previous.startsWith("-"))
						printer = previous.substring(1);
					else	
						printer = previous;
					repaint();
				}
								

				if( !operator.equals("") && !command.equals("C") && !command.equals("+") && !command.equals("-") && !command.equals("/") && !command.equals("X") && command.equals(".") && !current.equals("") && !previous.equals("") && !previous.endsWith(".") ) {
					current = current + command;
					if(current.startsWith("-"))
						printer = current.substring(1);
					else	
						printer = current;
					repaint();
				}
				

				if( !operator.equals("") && !command.equals("C") && !command.equals("+") && !command.equals("-") && !command.equals("/") && !command.equals("X") && !command.equals(".") && !command.equals("=") && current.endsWith(".") && (!previous.equals("") && !previous.endsWith(".") )  ) {
					current = current + command;		
					if(printer.startsWith("-"))
						printer = printer.substring(1) + command;
					else	
						printer = printer + command;
					repaint();
				}
				
				
				if( command.equals("=") ) {
					
					switch(operator) {
					
					case("X"):
					result = Float.parseFloat(previous) * Float.parseFloat(current);
					break;
					
					case("+"):
						result = Float.parseFloat(previous) + Float.parseFloat(current);
					break;
					
					case("-"):
						result = Float.parseFloat(previous) - Float.parseFloat(current);
					break;
					
					case("/"):
						result = Float.parseFloat(previous) / Float.parseFloat(current);
					break;
					
					}
					
					if(result%10==0) {
						printer = String.valueOf((int) result);
						oldprevious = printer;
					}
					else {
						printer = String.valueOf(result);
						oldprevious = printer;
					}
								
						current = "";
						previous = "";
						operator = "";
						
						repaint();
						check = false;
				}
				

			}
			
//------------------------------------------------------------------------------------------------------------------------------------------------		
			
else {		
	
	oldprevious = "";
			if(command.equals("C")) {
				current = "";
				previous = "";
				operator = "";
				printer = "";
				oldprevious = "";
				repaint();
				
			}

			if(!operator.equals("") && command.equals("-") && current.equals("")) {
				current = "-";
			}
			
			if( operator.equals("") && ( command.equals("+") || command.equals("-") || command.equals("/") || command.equals("X") ) && !previous.equals("") && current.equals("") ) {
				if(command.equals("/"))
					operator = "/";
				else
				operator = command;
			}
		

			if(command.equals("-") && previous.equals("")) {
				previous = "-";
			}
			

			if( operator.equals("") && !command.equals("C") && !command.equals("+") && !command.equals("-") && !command.equals("/") && !command.equals("X") && !command.equals(".") && !command.equals("=") && current.equals("") && ( !previous.equals("") ) ) {
				previous = previous + command;
				if(previous.startsWith("-"))
					printer = previous.substring(1);
				else	
					printer = previous;
				repaint();
			}
			

			if(operator.equals("") && !command.equals("C") && !command.equals("+") && !command.equals("-") && !command.equals("/") && !command.equals("X") && !command.equals(".") && !command.equals("=") && current.equals("") && previous.equals("") ) {
				previous = command;
				if(previous.startsWith("-"))
					printer = previous.substring(1);
				else	
					printer = previous;
				repaint();
			}
			

			if( !operator.equals("") && !command.equals("C") && !command.equals("+") && !command.equals("-") && !command.equals("/") && !command.equals("X") && !command.equals(".") && !command.equals("=") && !current.equals("") && ( !previous.equals("") && !previous.endsWith(".") ) ) {
				current = current + command;
				if(current.startsWith("-"))
					printer = current.substring(1);
				else	
					printer = current;
				repaint();
			}
			

			if( !operator.equals("") && !command.equals("C") && !command.equals("+") && !command.equals("-") && !command.equals("/") && !command.equals("X") && !command.equals(".") && !command.equals("=") && current.equals("") && (!previous.equals("") && !previous.endsWith(".") ) ) {
				current = command;
				if(current.startsWith("-"))
					printer = current.substring(1);
				else	
					printer = current;
				repaint();
			}
			

			if( operator.equals("") && !command.equals("C") && !command.equals("+") && !command.equals("-") && !command.equals("/") && !command.equals("X") && command.equals(".") && current.equals("") && !previous.equals("") ) {
				previous = previous + command;
				if(previous.startsWith("-"))
					printer = previous.substring(1);
				else	
					printer = previous;
				repaint();
			}
			

			if( operator.equals("") && !command.equals("C") && !command.equals("+") && !command.equals("-") && !command.equals("/") && !command.equals("X") && !command.equals(".") && !command.equals("=") && previous.endsWith(".") && current.equals("") ) {
				previous = previous + command;
				if(previous.startsWith("-"))
					printer = previous.substring(1);
				else	
					printer = previous;
				repaint();
			}
							

			if( !operator.equals("") && !command.equals("C") && !command.equals("+") && !command.equals("-") && !command.equals("/") && !command.equals("X") && command.equals(".") && !current.equals("") && !previous.equals("") && !previous.endsWith(".") ) {
				current = current + command;
				if(current.startsWith("-"))
					printer = current.substring(1);
				else	
					printer = current;
				repaint();
			}
			

			if( !operator.equals("") && !command.equals("C") && !command.equals("+") && !command.equals("-") && !command.equals("/") && !command.equals("X") && !command.equals(".") && !command.equals("=") && current.endsWith(".") && (!previous.equals("") && !previous.endsWith(".") )  ) {
				current = current + command;
				if(printer.startsWith("-"))
					printer = printer.substring(1) + command;
				else	
					printer = printer + command;
				repaint();
			}
			
			
			if( command.equals("=") ) {
				
				switch(operator) {
				
				case("X"):
				result = Float.parseFloat(previous) * Float.parseFloat(current);
				break;
				
				case("+"):
					result = Float.parseFloat(previous) + Float.parseFloat(current);
				break;
				
				case("-"):
					result = Float.parseFloat(previous) - Float.parseFloat(current);
				break;
				
				case("/"):
					result = Float.parseFloat(previous) / Float.parseFloat(current);
				break;
				
				}
				
				if(result%10==0) {
					printer = String.valueOf((int) result);
					oldprevious = printer;
				}
				else {
					printer = String.valueOf(result);
					oldprevious = printer;
				}
				
	
					current = "";
					previous = "";
					operator = "";
					repaint();
					
			}
}			
		}
		
		
//------------------------------------------------------------------		
		
	public static void main(String[] args) {	
		new Main();

	}

}