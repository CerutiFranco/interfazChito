
import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana3 {
    private JFrame frame;
    private JTextField textField;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ventana3 window = new ventana3();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ventana3() {
        initialize();
    }
    
    private void initialize(){
    	frame = new JFrame();
        frame.setBounds(0, 0, 913, 841);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(32, 48, 86, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        JButton btnNewButton = new JButton("Vuelta al menu");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		interfaz newframe = new interfaz();
		        newframe.setVisible(true);
		        frame.dispose();
        	}
        });
        btnNewButton.setBounds(29, 98, 141, 23);
        frame.getContentPane().add(btnNewButton);
    }

	public void setVisible(boolean b) {
		frame.setVisible(true);
		
	}
}
