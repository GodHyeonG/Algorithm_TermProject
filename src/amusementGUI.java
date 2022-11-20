import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class amusementGUI extends JFrame {

	Font f1 = new Font("SanSerif", Font.BOLD, 20);
	Font f2 = new Font("SanSerif", Font.PLAIN, 40);
	Font f3 = new Font("SanSerif", Font.ITALIC | Font.BOLD, 70);
	
	amusementGUI() {
		
		setBounds(100, 100, 350, 480);
		setLayout(null);
		setTitle("Amusement Park");
		ImageIcon background = new ImageIcon("image/background.jpg");
		ImageIcon logo = new ImageIcon("image/logo.png");
		
		JPanel pn1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(background.getImage(), 0, 0, 350, 480, null);
			}
		};
		pn1.setBounds(0, 0, 350, 480);
		
		JPanel pn2 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(logo.getImage(), 0, 0, 110, 110, null);
			}
		};
		pn2.setBounds(120, 30, 110, 110);
		
		JButton button = new JButton("Let's Go!");
		button.setFont(f1);
		button.setBounds(110, 380, 125, 40);
		add(button);
		
		JLabel lb1 = new JLabel("welcome to");
		lb1.setFont(f2);
		lb1.setBounds(65, 150, 280, 60);
		add(lb1);
		
		JLabel lb2 = new JLabel("RANNO");
		lb2.setFont(f3);
		lb2.setForeground(Color.red);
		lb2.setBounds(15, 205, 280, 70);
		add(lb2);
		
		JLabel lb3 = new JLabel("WORLD");
		lb3.setFont(f3);
		lb3.setForeground(Color.red);
		lb3.setBounds(50, 280, 280, 70);
		add(lb3);
		
		add(pn2); add(pn1);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**
		 * button 누르면, 화면 전환
		 */
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new information();
				setVisible(false); //창 안 보이게 하기
			}
			
		});
	}
	
	/**
	 * 정보 입력
	 */
	public class information extends JFrame {
		information() {
			
			setBounds(100, 100, 350, 480);
			setLayout(null);
			setTitle("Information");
			ImageIcon bg = new ImageIcon("image/bg.jpg");
			
			JPanel pn1 = new JPanel();
			pn1.setBounds(0, 0, 350, 480);
			pn1.setBackground(Color.white);
			
			JPanel pn2 = new JPanel() {
				public void paintComponent(Graphics g) {
					g.drawImage(bg.getImage(), 0, 0, 250, 250, null);
				}
			};
			pn2.setBounds(50, 90, 250, 250);
			
			JLabel people = new JLabel("인원");
			people.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
			
			add(pn2); add(pn1);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
	}
	
	public static void main(String[] args) {
		new amusementGUI();
	}

}
