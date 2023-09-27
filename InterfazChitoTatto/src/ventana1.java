import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ventana1 {
    private JFrame frame;
    private JTextField textField;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ventana1 window = new ventana1();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ventana1() {
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
    }

	public void setVisible(boolean b) {
		frame.setVisible(true);
		
	}
}
