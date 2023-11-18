package GUI.manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Book_new extends JFrame {
	public void Book_new() {
		
	}

	private JPanel contentPane;
	private JTextField id;
	private JTextField name;
	private JTextField writer;
	private JTextField isba;
	private JTextField num;
	private JTextField cost;

	/**
	 * Launch the application.
	 */
	public void Book_new1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book_new frame = new Book_new();
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
	public Book_new() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 524, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u56FE\u4E66\u7F16\u53F7\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 10, 103, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u56FE\u4E66\u540D\u79F0\uFF1A");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 70, 103, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u56FE\u4E66\u4F5C\u8005\uFF1A");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 130, 103, 50);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblIsba = new JLabel("ISBA\uFF1A");
		lblIsba.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIsba.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		lblIsba.setBounds(10, 190, 103, 50);
		contentPane.add(lblIsba);
		
		JLabel lblNewLabel_4 = new JLabel("\u9986\u5B58\u91CF\uFF1A");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(10, 250, 103, 50);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u56FE\u4E66\u4EF7\u683C\uFF1A");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(10, 310, 103, 50);
		contentPane.add(lblNewLabel_5);
		
		id = new JTextField();
		id.setBounds(123, 10, 355, 38);
		contentPane.add(id);
		id.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(123, 70, 355, 38);
		contentPane.add(name);
		
		writer = new JTextField();
		writer.setColumns(10);
		writer.setBounds(123, 130, 355, 38);
		contentPane.add(writer);
		
		isba = new JTextField();
		isba.setColumns(10);
		isba.setBounds(123, 190, 355, 38);
		contentPane.add(isba);
		
		num = new JTextField();
		num.setColumns(10);
		num.setBounds(123, 250, 355, 38);
		contentPane.add(num);
		
		cost = new JTextField();
		cost.setColumns(10);
		cost.setBounds(123, 310, 355, 38);
		contentPane.add(cost);
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0\u5230\u4E66\u5E93");
		btnNewButton.setFont(new Font("Ó×Ô²", Font.PLAIN, 40));
		btnNewButton.setBounds(72, 370, 355, 56);
		contentPane.add(btnNewButton);
		ButListener_nb bn = new ButListener_nb();
		btnNewButton.addActionListener(bn);
		bn.setJt(id, name, writer, isba, num, cost);
		
		setVisible(true);
	}

}
