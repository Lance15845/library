package GUI.manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;


public class Ad_bFail extends JFrame {
	public void Ad_Fail() {
		
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void Am_Fail1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ad_bFail frame = new Ad_bFail();
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
	public Ad_bFail() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 968, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u67E5\u65E0\u6B64\u4E66\uFF0C\u5982\u6709\u9700\u8981\u8BF7\u53BB\u6DFB\u52A0\uFF01");
		lblNewLabel.setFont(new Font("Á¥Êé", Font.PLAIN, 69));
		lblNewLabel.setBounds(10, 104, 978, 103);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u65B0\u589E\u4E66\u7C4D");
		btnNewButton.setFont(new Font("Ó×Ô²", Font.PLAIN, 25));
		btnNewButton.setBounds(384, 250, 169, 61);
		contentPane.add(btnNewButton);
		ButListener_tonb bnl = new ButListener_tonb();
		btnNewButton.addActionListener(bnl);
		
		setVisible(true);
	}

}
