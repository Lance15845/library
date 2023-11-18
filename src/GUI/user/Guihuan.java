package GUI.user;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Guihuan extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guihuan frame = new Guihuan();
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
	public Guihuan() {
		setTitle("\u5F52\u8FD8");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 950, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u5F52\u8FD8\u4E66\u7C4D\u7684\u540D\u79F0\uFF1A");
		lblNewLabel.setFont(new Font("ËÎÌו", Font.PLAIN, 25));
		lblNewLabel.setBounds(138, 195, 273, 39);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("ËÎÌו", Font.PLAIN, 25));
		textField.setColumns(10);
		textField.setBounds(408, 195, 266, 39);
		contentPane.add(textField);

		btnNewButton = new JButton("\u5F52\u8FD8");
		btnNewButton.setFont(new Font("ËÎÌו", Font.PLAIN, 25));
		btnNewButton.setBounds(793, 463, 133, 45);
		GuihuanListener gh = new GuihuanListener();
		btnNewButton.addActionListener(gh);
		gh.setJt(textField);
		contentPane.add(btnNewButton);
	}

}
