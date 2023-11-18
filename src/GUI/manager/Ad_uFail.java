package GUI.manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ad_uFail extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ad_uFail frame = new Ad_uFail();
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
	public Ad_uFail() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 989, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("查无此人，如需请去添加该用户！");
		lblNewLabel.setFont(new Font("隶书", Font.PLAIN, 64));
		lblNewLabel.setBounds(10, 104, 978, 103);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("新增用户");
		btnNewButton.setFont(new Font("幼圆", Font.PLAIN, 25));
		btnNewButton.setBounds(384, 250, 169, 61);
		contentPane.add(btnNewButton);
		ButListener_toun btu = new ButListener_toun();
		btnNewButton.addActionListener(btu);
		
		setVisible(true);
	}

}
