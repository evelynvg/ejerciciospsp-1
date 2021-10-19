package fp.dam.psp.ejemplos.ejemplo3;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main extends JFrame implements Runnable, ActionListener {
	
	public static long serialVersionUID = 1;
	
	JButton b;
	
	public Main() {
		Container panel = getContentPane();
		panel.setPreferredSize(new Dimension(300, 300));
		b = new JButton("Pulsa aquí");
		b.addActionListener(this);
		panel.add(b);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Thread(this).start();
	}

	@Override
	public void run() {
		while (true);
	}
	
}
