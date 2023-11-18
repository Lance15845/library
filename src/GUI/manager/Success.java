package GUI.manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Success extends JFrame {
	public void Success() {
		
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void Success1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Success frame = new Success();
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
	public Success() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 525, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("操作成功！");
		lblNewLabel.setFont(new Font("隶书", Font.PLAIN, 94));
		lblNewLabel.setBounds(49, 102, 476, 112);
		contentPane.add(lblNewLabel);
		
		setVisible(true);
	}

}
