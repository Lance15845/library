package GUI.manager;

import GUI.manager.ButListener_un;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class User_new extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField password;
	private JTextField id;

	/**
	 * Launch the application.
	 */
	public void User_new1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_new frame = new User_new();
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
	public User_new() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 473, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("用户名：");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 101, 103, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("用户密码：");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 161, 103, 50);
		contentPane.add(lblNewLabel_2);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(137, 110, 296, 38);
		contentPane.add(name);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(137, 170, 296, 38);
		contentPane.add(password);
		
		JButton btnNewButton = new JButton("添加到用户");
		btnNewButton.setFont(new Font("幼圆", Font.PLAIN, 40));
		btnNewButton.setBounds(34, 266, 355, 56);
		contentPane.add(btnNewButton);
		ButListener_un bu = new ButListener_un();
		btnNewButton.addActionListener(bu);

		JLabel lblNewLabel_1_1 = new JLabel("ID:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(0, 41, 103, 50);
		contentPane.add(lblNewLabel_1_1);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(137, 50, 296, 38);
		contentPane.add(id);
		
		bu.setJt(id,name, password);
	}
}
