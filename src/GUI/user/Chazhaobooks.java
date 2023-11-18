package GUI.user;

import dao.BooksDao;
import entity.Books;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Chazhaobooks extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chazhaobooks frame = new Chazhaobooks();
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
	public Chazhaobooks() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 701, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(67, 109, 549, 316);
		contentPane.add(scrollPane);

		ArrayList<Books> booksList = new BooksDao().showBooks();
		String[][] objects = new String[booksList.size()][8];
		int temp = 0;
		for (Books books : booksList){
			objects[temp][0] = books.getBookId();
			objects[temp][1] = books.getBookName();
			objects[temp][2] = books.getBookWriter();
			objects[temp][3] = books.getBookIsbn();
			objects[temp][4] = String.valueOf(books.getBookNum());
			objects[temp][5] = String.valueOf(books.getBookPrice());
			objects[temp][6] = String.valueOf(books.getBookNumBroughtOut());
			objects[temp][7] = String.valueOf(books.getBookNumBroughtOut());
			temp++;
		}

		table = new JTable();
		table.setModel(new DefaultTableModel(
				objects,
				new String[] { "编号", "书名", "作者", "ISBN", "数量", "价格", "图书外借量", "图书借阅数" }));
		scrollPane.setViewportView(table);

		JLabel lblNewLabel = new JLabel("\u4E66\u7C4D\u67E5\u8BE2\u5982\u4E0B");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 25));
		lblNewLabel.setBounds(265, 65, 157, 34);
		contentPane.add(lblNewLabel);
	}
}
