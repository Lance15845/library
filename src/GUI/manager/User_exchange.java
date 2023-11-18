package GUI.manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class User_exchange extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public void User_exchange1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_exchange frame = new User_exchange();
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
	public User_exchange() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 626, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u8981\u4FEE\u6539\u7684\u7528\u6237\u540D\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("ËÎÌå", Font.PLAIN, 24));
		lblNewLabel.setBounds(10, 99, 265, 54);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(275, 111, 310, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("È·¶¨");
		btnNewButton.setFont(new Font("Ó×Ô²", Font.PLAIN, 30));
		btnNewButton.setBounds(223, 217, 154, 54);
		contentPane.add(btnNewButton);
		ButListener_toumodify btum = new ButListener_toumodify();
		btnNewButton.addActionListener(btum);
		btum.setJt(textField);
	}
}
