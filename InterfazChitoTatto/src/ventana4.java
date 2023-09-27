import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ventana4 {
    private JFrame frame;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ventana4 window = new ventana4();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ventana4() {
        initialize();
    }
    
    private void initialize(){
    	frame = new JFrame();
        frame.setBounds(0, 0, 1200, 841);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Rubén\\Downloads\\tatuajes1.jpg"));
        lblNewLabel.setBounds(50, 100, 292, 257);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setBounds(394, 100, 292, 257);
        frame.getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("New label");
        lblNewLabel_1_1.setBounds(640, 100, 292, 257);
        frame.getContentPane().add(lblNewLabel_1_1);
    }

	public void setVisible(boolean b) {
		frame.setVisible(true);
		
	}
}
