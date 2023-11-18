package GUI.manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class Book_del extends JFrame {
	public void Book_del() {
		
	}

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public void Book_del1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book_del frame = new Book_del();
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
	public Book_del() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 583, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(196, 39, 331, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("请输入要删除的书名ID：");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 39, 176, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("删除");
		btnNewButton.setFont(new Font("幼圆", Font.PLAIN, 20));
		btnNewButton.setBounds(175, 113, 176, 35);
		contentPane.add(btnNewButton);
		ButListener_del bd = new ButListener_del();
		btnNewButton.addActionListener(bd);
		bd.setJt(textField);
		
		setVisible(true);
	}

}
