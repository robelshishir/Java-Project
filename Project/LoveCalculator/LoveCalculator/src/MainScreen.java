import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;


public class MainScreen extends JFrame {

	private JPanel contentPane;
	private JTextField maleName;
	private JTextField femaleName;
	private JTextField resultDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		maleName = new JTextField();
		maleName.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		maleName.setForeground(Color.RED);
		maleName.setBounds(164, 9, 174, 29);
		contentPane.add(maleName);
		maleName.setColumns(10);
		
		femaleName = new JTextField();
		femaleName.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		femaleName.setForeground(Color.RED);
		femaleName.setBounds(164, 173, 174, 29);
		femaleName.setBackground(Color.WHITE);
		contentPane.add(femaleName);
		femaleName.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(299, 227, 125, 23);
		Image img3 = new ImageIcon(this.getClass().getResource("/loveee.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img3));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					BufferedReader bufferreader = new BufferedReader (new InputStreamReader(System.in));
					String male = maleName.getText();
					String female = femaleName.getText();
	
					int sum1 = 0, sum2 = 0;
					for(int i=0;i<male.length();i++){
						char ch = male.charAt(i);
						int ascii = ch;
						sum1 = sum1+ascii;
						}
					for(int i=0;i<female.length();i++){
						char ch = female.charAt(i);
						int ascii = ch;
						sum2 = sum2+ascii;
					}
					
					int total = sum1+sum2;
					int loveparse = total%100;
					
					if(maleName.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Enter Male Name");
				    }
					
					else if(femaleName.getText().equals("")){
						JOptionPane.showMessageDialog(null,"Enter Female Name");
					}
				    
					else
				    {
					    resultDisplay.setText(""+loveparse + "" + "%");
				    }

				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,"Enter a Valid Input");
				}
				
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Male");
		lblNewLabel.setBounds(34, 11, 120, 26);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblFemale = new JLabel("Female");
		lblFemale.setBounds(34, 174, 120, 29);
		lblFemale.setForeground(Color.RED);
		lblFemale.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblFemale);
		
		JButton btnQuite = new JButton("Quite");
		btnQuite.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnQuite.setForeground(Color.RED);
		btnQuite.setBounds(34, 227, 110, 23);
		Image img1 = new ImageIcon(this.getClass().getResource("/loveee.png")).getImage();
		btnQuite.setIcon(new ImageIcon(img1));
		btnQuite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuite.setBackground(Color.WHITE);
		contentPane.add(btnQuite);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnReset.setForeground(Color.RED);
		btnReset.setBounds(164, 227, 113, 23);
		Image img2 = new ImageIcon(this.getClass().getResource("/loveee.png")).getImage();
		btnReset.setIcon(new ImageIcon(img2));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maleName.setText(null);
				femaleName.setText(null);
				resultDisplay.setText(null);
			}
		});
		btnReset.setBackground(Color.WHITE);
		contentPane.add(btnReset);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(164, 43, 174, 125);
		Image img4 = new ImageIcon(this.getClass().getResource("/Heart.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img4));
		contentPane.add(lblNewLabel_1);
		
		resultDisplay = new JTextField();
		resultDisplay.setEditable(false);
		resultDisplay.setBackground(Color.WHITE);
		resultDisplay.setForeground(new Color(255, 0, 0));
		resultDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		resultDisplay.setFont(new Font("Times New Roman", Font.BOLD, 25));
		resultDisplay.setBounds(223, 73, 58, 62);
		contentPane.add(resultDisplay);
		resultDisplay.setColumns(10);
	}
}
