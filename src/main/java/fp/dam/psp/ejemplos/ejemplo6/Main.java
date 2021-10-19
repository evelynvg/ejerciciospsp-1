package fp.dam.psp.ejemplos.ejemplo6;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
	
	public static long serialVersionUID = 1;
	
	JLabel hora;	
	
	public Main() {
		Container panel = getContentPane();
		panel.setPreferredSize(new Dimension(300, 300));
		hora = new JLabel("00:00:00");
		hora.setFont(hora.getFont().deriveFont(30f));
		hora.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		panel.add(hora);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
	}
	
	private void comenzar() {
		setVisible(true);
		while (true) {
			
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Main()::comenzar);
	}
	
}
