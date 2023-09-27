import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class interfaz {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz window = new interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("ChitoTatto");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Precios");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ventana3 newframe = new ventana3();
		        newframe.setVisible(true);
		        

		        
			}
		});
		btnNewButton.setBounds(30, 120, 149, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Turno Agendado");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana2 newframe = new ventana2();
		        newframe.setVisible(true);
		        
			}
		});
		btnNewButton_1.setBounds(30, 70, 149, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Diseños");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana4 newframe = new ventana4();
		        newframe.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(30, 172, 149, 39);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Nuevo Turno");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana1 newframe = new ventana1();
		        newframe.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(30, 21, 149, 39);
		frame.getContentPane().add(btnNewButton_3);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		 frame.setVisible(true);

	}
}
