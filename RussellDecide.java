import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
//import java.lang.Thread;


public class RussellDecide{
	static Random russell = new Random();
	static JLabel taco;
	static int max = 2;
	static int min = 1;
	public static void main(String[] args) {
		//Random russell = new Random();
		JFrame jacob = new JFrame("Russell's Decide-o-tron");
		JButton bruh = new JButton("Roll");
		taco = new JLabel("1 or 2?");
		ActionListener andrew = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				taco.setText("" + generateInt(max,min));
			}
			
		};
		bruh.setFont(new Font("Comic Sans MS",0,24));
		bruh.setBounds(50, 500, 500, 100);
		bruh.setVerticalAlignment(SwingConstants.CENTER);
		bruh.addActionListener(andrew);
		
		taco.setFont(new Font("Comic Sans MS",0,144));
		taco.setBounds(50, 50, 500, 400);
		taco.setHorizontalAlignment(SwingConstants.CENTER);
		
		jacob.add(bruh);
		jacob.add(taco);
		jacob.setSize(600, 650);
		jacob.setLayout(null);
		jacob.setVisible(true);
		
	}
	static int generateInt(int max, int min) {
		return russell.nextInt((max - min) + 1) + min;
	}
}
