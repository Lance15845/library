package GUI.manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

public class Book_arlist extends JFrame {
	public void Book_arlist() {
		
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void Book_arlist1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book_arlist frame = new Book_arlist();
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
	public Book_arlist() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u5E93\u5B58\u51CF\u5C11");
		btnNewButton.setFont(new Font("свт╡", Font.PLAIN, 30));
		btnNewButton.setBounds(48, 42, 327, 59);
		contentPane.add(btnNewButton);
		ButListener_toreduce btr = new ButListener_toreduce();
		btnNewButton.addActionListener(btr);
		
		JButton btnNewButton_1 = new JButton("\u5E93\u5B58\u589E\u52A0");
		btnNewButton_1.setFont(new Font("свт╡", Font.PLAIN, 30));
		btnNewButton_1.setBounds(48, 161, 327, 59);
		contentPane.add(btnNewButton_1);
		ButListener_toadd bta =new ButListener_toadd();
		btnNewButton_1.addActionListener(bta);
		
		setVisible(true);
	}

}
