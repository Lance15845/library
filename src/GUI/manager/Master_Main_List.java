package GUI.manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

public class Master_Main_List extends JFrame {
	public Master_Main_List() {
	}

	private JPanel contentPane;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public void Main_List1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Master_Main_List frame = new Master_Main_List();
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
	public void Main_List() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 501, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("图书管理");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton.setBounds(58, 138, 369, 47);
		contentPane.add(btnNewButton);
		ButListener_tomainlist blbm = new ButListener_tomainlist();
		btnNewButton.addActionListener(blbm);
		
		JButton btnNewButton_1 = new JButton("用户管理");
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton_1.setBounds(58, 207, 369, 47);
		contentPane.add(btnNewButton_1);
		ButListener_to_user_manage blu = new ButListener_to_user_manage();
		btnNewButton_1.addActionListener(blu);
		
		JButton btnNewButton_2 = new JButton("退回主界面");
		btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton_2.setBounds(58, 279, 369, 47);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("\u7BA1\u7406\u5458\u754C\u9762");
		lblNewLabel.setFont(new Font("隶书", Font.PLAIN, 32));
		lblNewLabel.setBounds(157, 47, 185, 67);
		contentPane.add(lblNewLabel);
		
		javax.swing.JLabel jla= new javax.swing.JLabel();
		java.awt.Dimension dm0=new java.awt.Dimension(198,108);
		jla.setPreferredSize(dm0);
		getContentPane().add(jla);
			
		setVisible(true);
	}
}
