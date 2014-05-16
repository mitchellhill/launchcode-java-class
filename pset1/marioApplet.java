import java.awt.*;
import javax.swing.*;

public class marioApplet extends JApplet {

	int height;
	int steps;
	int spaces = 0;
	int hash = 0;	
	
	public void init(){	
		
		do{
			String fn = JOptionPane.showInputDialog("Please provide the desired height of the half pyramid between 1 and 23: ");
			height = Integer.parseInt(fn);
		}while (height<1 || height>23);
		
	}
	
	
	public void paint (Graphics g){
		super.paint(g);
		
		int x = 25, y = 35;
		for (steps = 1; steps <= height; steps++){		
			for (spaces = 1; spaces <= height - steps; spaces++)
				{
					g.drawString(" ", x, y);
					x += 10;
				}
			for (hash = 1; hash <= steps; hash++)
				{
					g.drawString("#", x, y);
					x += 10;
				}
			x = 25;
			y += 10;
		}
	}
}

