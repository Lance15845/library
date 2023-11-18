package GUI.manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class User_manage extends JFrame {
	public void User_manage() {
		
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void User_manage1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_manage frame = new User_manage();
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
	public User_manage() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("用户清单");
		btnNewButton.setFont(new Font("幼圆", Font.PLAIN, 34));
		btnNewButton.setBounds(59, 59, 296, 65);
		contentPane.add(btnNewButton);
		ButListener_tonl bn = new ButListener_tonl();
		btnNewButton.addActionListener(bn);
		
		JButton btnNewButton_1 = new JButton("新增用户");
		btnNewButton_1.setFont(new Font("幼圆", Font.PLAIN, 34));
		btnNewButton_1.setBounds(59, 176, 296, 65);
		contentPane.add(btnNewButton_1);
		ButListener_toun btun = new ButListener_toun();
		btnNewButton_1.addActionListener(btun);
		
		JButton btnNewButton_2 = new JButton("删除用户");
		btnNewButton_2.setFont(new Font("幼圆", Font.PLAIN, 34));
		btnNewButton_2.setBounds(59, 297, 296, 65);
		contentPane.add(btnNewButton_2);
		ButListener_toud btud = new ButListener_toud();
		btnNewButton_2.addActionListener(btud);
		
		JButton btnNewButton_3 = new JButton("用户信息修改");
		btnNewButton_3.setFont(new Font("幼圆", Font.PLAIN, 34));
		btnNewButton_3.setBounds(59, 417, 296, 65);
		contentPane.add(btnNewButton_3);
		ButListener_toue btue = new ButListener_toue();
		btnNewButton_3.addActionListener(btue);
		
		setVisible(true);
	}
}
