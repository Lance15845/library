package GUI.manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;

public class Book_mainlist extends JFrame {
	public void Book_mainlist() {
		
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void Book_mainlist1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book_mainlist frame = new Book_mainlist();
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
	public Book_mainlist() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("图书删除");
		btnNewButton.setFont(new Font("幼圆", Font.PLAIN, 30));
		btnNewButton.setBounds(57, 139, 329, 46);
		contentPane.add(btnNewButton);
		ButListener_todel bd =new ButListener_todel();
		btnNewButton.addActionListener(bd);
		
		JButton btnNewButton_1 = new JButton("新书上架");
		btnNewButton_1.setFont(new Font("幼圆", Font.PLAIN, 30));
		btnNewButton_1.setBounds(57, 233, 329, 46);
		contentPane.add(btnNewButton_1);
		ButListener_tonb bnl = new ButListener_tonb();
		btnNewButton_1.addActionListener(bnl);
		
		JButton btnNewButton_2 = new JButton("图书信息修改");
		btnNewButton_2.setFont(new Font("幼圆", Font.PLAIN, 30));
		btnNewButton_2.setBounds(57, 410, 329, 46);
		contentPane.add(btnNewButton_2);
		ButListener_toexchange bte = new ButListener_toexchange();
		btnNewButton_2.addActionListener(bte);
		
		JButton btnNewButton_3 = new JButton("库存更改");
		btnNewButton_3.setFont(new Font("幼圆", Font.PLAIN, 30));
		btnNewButton_3.setBounds(57, 326, 329, 46);
		contentPane.add(btnNewButton_3);
		ButListener_toarlsit btarl = new ButListener_toarlsit();
		btnNewButton_3.addActionListener(btarl);
		
		JButton btnNewButton_4 = new JButton("图书清单");
		btnNewButton_4.setFont(new Font("幼圆", Font.PLAIN, 30));
		btnNewButton_4.setBounds(57, 38, 329, 46);
		contentPane.add(btnNewButton_4);
		ButListener_tobl btb = new ButListener_tobl();
		btnNewButton_4.addActionListener(btb);
		
		
		setVisible(true);
	}

}
