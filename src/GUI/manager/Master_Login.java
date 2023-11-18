package GUI.manager;


import java.awt.event.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

public class Master_Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public void Master_Login1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Master_Login frame = new Master_Login();
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
	public Master_Login() {
		setTitle("\u7BA1\u7406\u5458\u767B\u5F55");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 352, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		javax.swing.ImageIcon icon = new javax.swing.ImageIcon("D:\\CoderLife\\Java\\Library-Final\\图片\\TSJM01.jpg");
		javax.swing.JLabel jla= new javax.swing.JLabel(icon);
		java.awt.Dimension dm0=new java.awt.Dimension(302,290);
		jla.setPreferredSize(dm0);
		
		
		lblNewLabel = new JLabel("\u8D26\u53F7\uFF1A");
		
		
		textField = new JTextField("");
		textField.setColumns(25);
		
		
		lblNewLabel_1 = new JLabel("\u5BC6\u7801\uFF1A");
		
		btnNewButton = new JButton("\u767B\u5F55");
		//给按钮添加动作监听器方法
		ButListener_Login but = new ButListener_Login();
		//创建一个监听器
		btnNewButton.addActionListener(but);
		
	    
		passwordField = new JPasswordField();
		
		//把监听器加在“登录”按钮上
	    but.setJt(textField,passwordField);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
								.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(29)
							.addComponent(jla, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)))
					.addGap(34))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(127)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(140, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(jla, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(9)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		panel.setLayout(gl_panel);
	}
}
