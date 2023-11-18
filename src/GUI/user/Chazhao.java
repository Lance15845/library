package GUI.user;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Chazhao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chazhao frame = new Chazhao();
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
	public Chazhao() {
		setTitle("\u67E5\u627E");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 950, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u6839\u636E\u7F16\u53F7\u67E5\u627E\uFF1A");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 25));
		lblNewLabel.setBounds(157, 224, 185, 36);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 25));
		textField.setBounds(330, 224, 263, 30);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblisbn_1 = new JLabel("\u6839\u636E\u4E66\u540D\u67E5\u627E\uFF1A");
		lblisbn_1.setFont(new Font("宋体", Font.PLAIN, 25));
		lblisbn_1.setBounds(157, 316, 185, 36);
		contentPane.add(lblisbn_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("宋体", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(330, 316, 263, 30);
		contentPane.add(textField_2);

		JButton btnNewButton1 = new JButton("\u67E5\u627E");
		btnNewButton1.setFont(new Font("宋体", Font.PLAIN, 25));
		btnNewButton1.setBounds(603, 223, 99, 33);
		contentPane.add(btnNewButton1);
		// btnNewButton1.addActionListener(new ChazhaonumbListener() {
		// public void actionPerformed(ActionEvent e) {
		ChazhaonumbListener cznb = new ChazhaonumbListener();
		cznb.setJt(textField);
		btnNewButton1.addActionListener(cznb);
		// }
		// });

		JButton btnNewButton2 = new JButton("\u67E5\u627E");
		btnNewButton2.setFont(new Font("宋体", Font.PLAIN, 25));
		btnNewButton2.setBounds(603, 315, 99, 33);
		contentPane.add(btnNewButton2);
		// btnNewButton1.addActionListener(new ChazhaonameListener() {
		// public void actionPerformed(ActionEvent e) {
		ChazhaonameListener czn = new ChazhaonameListener();
		czn.setJt(textField_2);
		btnNewButton2.addActionListener(czn);
		// }
		// });
	}
}
