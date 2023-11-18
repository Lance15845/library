package GUI.manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

/*
*图书修改前的输入书名
*
*/
public class Book_exchange extends JFrame {
	public void Book_exchange() {
		
	}

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public void Book_exchange1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book_exchange frame = new Book_exchange();
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
	public Book_exchange() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 626, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u8981\u4FEE\u6539\u7684\u4E66\u540D\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 24));
		lblNewLabel.setBounds(10, 104, 255, 54);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(255, 114, 300, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.setFont(new Font("幼圆", Font.PLAIN, 30));
		btnNewButton.setBounds(223, 217, 154, 54);
		contentPane.add(btnNewButton);
		ButListener_tobmodify btm = new ButListener_tobmodify();
		btnNewButton.addActionListener(btm);
		btm.setJt(textField);
	}
}
