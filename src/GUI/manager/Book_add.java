package GUI.manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Book_add extends JFrame {
	public void Book_add() {
		
	}

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public void Book_add1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book_add frame = new Book_add();
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
	public Book_add() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 555, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(247, 40, 267, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u60A8\u8981\u589E\u52A0\u7684\u4E66\u7C4DID\u6216\u4E66\u540D\uFF1A");
		lblNewLabel.setFont(new Font("ËÎÌå", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 38, 242, 34);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(247, 117, 128, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u8BF7\u8F93\u5165\u8981\u589E\u52A0\u7684\u6570\u91CF\uFF1A");
		lblNewLabel_1.setFont(new Font("ËÎÌå", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(83, 115, 169, 34);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\u589E\u52A0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Ó×Ô²", Font.PLAIN, 20));
		btnNewButton.setBounds(194, 191, 100, 34);
		contentPane.add(btnNewButton);
		ButListener_ad ba = new ButListener_ad();
		btnNewButton.addActionListener(ba);
		ba.setJt(textField,textField_1);
		
		setVisible(true);
	}
}
