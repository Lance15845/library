package GUI.user;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class User extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
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
	public User() {
		setTitle("\u7528\u6237\u767B\u5F55");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 950, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		javax.swing.ImageIcon icon = new javax.swing.ImageIcon("D:\\CoderLife\\Java\\Library-Final\\图片\\TSJM01.jpg");
		javax.swing.JLabel jla = new javax.swing.JLabel(icon);
		java.awt.Dimension dm0 = new java.awt.Dimension(302, 290);
		jla.setPreferredSize(dm0);

		lblNewLabel = new JLabel("\u8D26\u53F7\uFF1A");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 25));

		textField = new JTextField("");
		textField.setFont(new Font("宋体", Font.PLAIN, 25));
		textField.setColumns(25);

		lblNewLabel_1 = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 25));

		btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 25));
		// 给按钮添加动作监听器方法
		MimaListener but = new MimaListener();
		// 创建一个监听器
		btnNewButton.addActionListener(but);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("宋体", Font.PLAIN, 25));

		// 把监听器加在“登录”按钮上
		but.setJt(textField, passwordField);

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup().addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addGap(29).addComponent(jla,
								GroupLayout.PREFERRED_SIZE, 863, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup().addContainerGap(258, Short.MAX_VALUE)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addComponent(lblNewLabel)
										.addComponent(lblNewLabel_1))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false).addComponent(textField)
										.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.RELATED, 266, Short.MAX_VALUE)))
						.addGap(34))
				.addGroup(gl_panel.createSequentialGroup().addContainerGap(416, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addGap(414)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addComponent(jla, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE).addGap(34)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
				.addGap(10)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addComponent(lblNewLabel_1)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
				.addGap(18).addComponent(btnNewButton).addGap(65)));
		panel.setLayout(gl_panel);
	}

}
