package GUI.user;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Jieyue extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jieyue frame = new Jieyue();
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
	public Jieyue() {
		setTitle("\u501F\u9605");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 950, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u4E66\u7C4D\u540D\u79F0\uFF1A");
		lblNewLabel.setFont(new Font("ËÎÌו", Font.PLAIN, 25));
		lblNewLabel.setBounds(172, 178, 198, 45);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("ËÎÌו", Font.PLAIN, 25));
		textField.setBounds(360, 183, 347, 35);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("\u501F\u9605");
		btnNewButton.setFont(new Font("ËÎÌו", Font.PLAIN, 25));
		btnNewButton.setBounds(793, 463, 133, 45);
		JieyueListener jy = new JieyueListener();
		btnNewButton.addActionListener(jy);
		jy.setJt(textField);

		contentPane.add(btnNewButton);
	}
}
