package GUI.manager;

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

public class User_del extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public void User_del1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_del frame = new User_del();
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
	public User_del() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 616, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("请输入删除的用户ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel.setBounds(30, 85, 182, 35);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(222, 85, 331, 35);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("\u5220\u9664");
		btnNewButton.setFont(new Font("幼圆", Font.PLAIN, 20));
		btnNewButton.setBounds(193, 182, 176, 35);
		contentPane.add(btnNewButton);
		ButListener_ud butListener_ud = new ButListener_ud();
		btnNewButton.addActionListener(butListener_ud);
		butListener_ud.setJt(textField);
	}

}
