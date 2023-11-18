package GUI.user;

import entity.Books;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Chazhaonamebooks extends JFrame {

	private JPanel contentPane;
	private JTable table;


	/**
	 * Launch the application.
	 */
	public void Chazhaonamebooks1(Books books) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chazhaonamebooks frame = new Chazhaonamebooks(books);
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
	public Chazhaonamebooks(Books books) {
		setTitle("\u4E66\u540D\u67E5\u627E");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 950, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 103, 926, 405);
		contentPane.add(scrollPane);


		String[][] object = new String[1][8];
		object[0][0] = books.getBookId();
		object[0][1] = books.getBookName();
		object[0][2] = books.getBookWriter();
		object[0][3] = books.getBookIsbn();
		object[0][4] = String.valueOf(books.getBookNum());
		object[0][5] = String.valueOf(books.getBookPrice());
		object[0][6] = String.valueOf(books.getBookNumBroughtOut());
		object[0][7] = String.valueOf(books.getBookNumBorrowed());

		table = new JTable();
		table.setModel(new DefaultTableModel(
				object,
				new String[] { "编号", "书名", "作者", "ISBN", "数量", "价格", "图书外借量", "图书借阅数" }));
		scrollPane.setViewportView(table);

		JLabel lblNewLabel = new JLabel("\u4E66\u7C4D\u67E5\u8BE2\u5982\u4E0B");
		lblNewLabel.setBounds(399, 65, 157, 34);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 25));
		contentPane.add(lblNewLabel);
	}
}
