package GUI.manager;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Book_reduce extends JFrame {
	public void Book_reduce() {
		
	}

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public void Book_reduce1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book_reduce frame = new Book_reduce();
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
	public Book_reduce() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 555, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("请输入您要减少的书籍ID或书名:");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 69, 242, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("请输入要减少的数量:");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(88, 137, 169, 34);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(262, 71, 267, 34);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(262, 139, 128, 34);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("\u51CF\u5C11");
		btnNewButton.setFont(new Font("幼圆", Font.PLAIN, 20));
		btnNewButton.setBounds(224, 224, 100, 34);
		contentPane.add(btnNewButton);
		ButListener_re br = new ButListener_re();
		btnNewButton.addActionListener(br);
		br.setJt(textField,textField_1);
		
		setVisible(true);
	}

}
