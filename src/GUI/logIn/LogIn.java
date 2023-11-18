package GUI.logIn;

import GUI.user.User;
import GUI.manager.Master_Login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LogIn extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setTitle("\u56FE\u4E66\u9986\u4E00\u4F53\u5316\u7BA1\u7406\u7CFB\u7EDF");
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		JLabel lblNewLabel = new JLabel(
				"\u6B22\u8FCE\u5149\u4E34\u56FE\u4E66\u9986\u4E00\u4F53\u5316\u7BA1\u7406\u7CFB\u7EDF");
		lblNewLabel.setBounds(133, 47, 660, 54);
		lblNewLabel.setFont(new Font("华光中雅_CNKI", Font.PLAIN, 46));
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("管理员登录");
		btnNewButton.setFont(new Font("华光中雅_CNKI", Font.PLAIN, 20));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Master_Login ml = new Master_Login();
				ml.Master_Login1();
			}
		});
		btnNewButton.setBackground(Color.blue);
		btnNewButton.setBounds(359, 300, 199, 66);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("普通用户登录");
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				User user = new User();
				user.main(null);
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("华光中雅_CNKI", Font.PLAIN, 20));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(359, 184, 199, 66);
		contentPane.add(btnNewButton_1);
	}

}
