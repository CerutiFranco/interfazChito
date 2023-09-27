import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ventana2 {
    private JFrame frame;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ventana2 window = new ventana2();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ventana2() {
        initialize();
    }
    
    private void initialize(){
    	frame = new JFrame();
        frame.setBounds(0, 0, 913, 841);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
    }

	public void setVisible(boolean b) {
		frame.setVisible(true);
		
	}
}
