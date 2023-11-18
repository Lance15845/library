package GUI.manager;

import entity.Users;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class User_modify extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public void User_modify1(Users users) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_modify frame = new User_modify(users);
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
	public User_modify(Users users) {
		String preName = users.getUserName();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 455, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel name1 = new JLabel("\u7528\u6237\u540D\uFF1A");
		name1.setHorizontalAlignment(SwingConstants.RIGHT);
		name1.setFont(new Font("ËÎÌå", Font.PLAIN, 25));
		name1.setBounds(10, 77, 100, 33);
		contentPane.add(name1);
		
		JLabel password1 = new JLabel("\u5BC6\u7801\uFF1A");
		password1.setHorizontalAlignment(SwingConstants.RIGHT);
		password1.setFont(new Font("ËÎÌå", Font.PLAIN, 25));
		password1.setBounds(21, 173, 89, 33);
		contentPane.add(password1);
		
		JButton btnNewButton = new JButton("\u4FEE\u6539");
		btnNewButton.setFont(new Font("Ó×Ô²", Font.PLAIN, 20));
		btnNewButton.setBounds(333, 82, 96, 28);
		contentPane.add(btnNewButton);
		ButListener_changeun bcun = new ButListener_changeun();
		btnNewButton.addActionListener(bcun);

		JButton btnNewButton_1 = new JButton("\u4FEE\u6539");
		btnNewButton_1.setFont(new Font("Ó×Ô²", Font.PLAIN, 20));
		btnNewButton_1.setBounds(333, 177, 96, 28);
		contentPane.add(btnNewButton_1);
		
		name = new JTextField();
		name.setBounds(120, 77, 203, 33);
		contentPane.add(name);
		name.setColumns(10);
		
		password = new JTextField();
		password.setBounds(120, 173, 203, 33);
		contentPane.add(password);
		password.setColumns(10);
		ButListener_changepassword bcp = new ButListener_changepassword();
		btnNewButton_1.addActionListener(bcp);
		bcp.setJt(password,preName);
		bcun.setJt(name,preName);

		setVisible(true);
	}

}
