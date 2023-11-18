package GUI.user;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Success extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setTitle("\u529F\u80FD\u9009\u62E9");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 950, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnNewButton = new JButton("\u501F\u9605");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 25));
		btnNewButton.setBounds(210, 337, 480, 37);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jieyue jy = new Jieyue();
				jy.main(null);

			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\u5F52\u8FD8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Guihuan gh = new Guihuan();
				gh.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 25));
		btnNewButton_1.setBounds(210, 264, 480, 37);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\u67E5\u627E");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chazhao cz = new Chazhao();
				cz.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 25));
		btnNewButton_2.setBounds(210, 191, 480, 37);
		contentPane.add(btnNewButton_2);

	}

	public void showUI() {
		javax.swing.JFrame jf = new javax.swing.JFrame();
		jf.setTitle("登录成功界面");
		jf.setSize(198, 108);
		jf.setDefaultCloseOperation(3);
		jf.setLocationRelativeTo(null);

		java.awt.FlowLayout flow = new java.awt.FlowLayout();
		jf.getContentPane().setLayout(flow);

		javax.swing.ImageIcon icon = new javax.swing.ImageIcon("D:\\桌面\\1579370158140.jpeg");
		javax.swing.JLabel jla = new javax.swing.JLabel(icon);
		java.awt.Dimension dm0 = new java.awt.Dimension(1920, 1080);
		jla.setPreferredSize(dm0);
		jf.getContentPane().add(jla);

		jf.setVisible(true);
	}
}
