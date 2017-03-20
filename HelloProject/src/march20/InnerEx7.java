package march20;

import java.awt.*;
import java.awt.event.*;

class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occured!!");
	}
	
}

public class InnerEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
		

	}

}
