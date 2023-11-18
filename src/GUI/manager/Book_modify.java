package GUI.manager;

import entity.Books;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Book_modify extends JFrame {
	public void Book_modify() {
		
	}

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public void Book_modify1(Books books) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book_modify frame = new Book_modify(books);
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
	public Book_modify(Books books) {
		String Prename = books.getBookName();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 455, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(99, 77, 224, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u4E66\u540D\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("ËÎÌå", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 77, 89, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u4EF7\u683C\uFF1A");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("ËÎÌå", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(10, 173, 89, 33);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(99, 173, 224, 33);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("\u4FEE\u6539");
		btnNewButton.setFont(new Font("Ó×Ô²", Font.PLAIN, 20));
		btnNewButton.setBounds(333, 82, 96, 28);
		contentPane.add(btnNewButton);
		ButListener_changename bcn = new ButListener_changename();
		btnNewButton.addActionListener(bcn);
		bcn.setJt(textField,Prename);
		
		JButton btnNewButton_1 = new JButton("\u4FEE\u6539");
		btnNewButton_1.setFont(new Font("Ó×Ô²", Font.PLAIN, 20));
		btnNewButton_1.setBounds(333, 177, 96, 28);
		contentPane.add(btnNewButton_1);
		ButListener_changecost bcc = new ButListener_changecost();
		btnNewButton_1.addActionListener(bcc);
		bcc.setJt(textField_1, Prename);
		
		setVisible(true);
	}
}
