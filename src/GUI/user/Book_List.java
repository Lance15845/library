package GUI.user;

import dao.BooksDao;
import entity.Books;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.util.ArrayList;

public class Book_List extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book_List frame = new Book_List();
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
	public Book_List() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1015, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel = new JLabel("List");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 45));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(435)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(133)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
					.addGap(49)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
					.addGap(128))
		);

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
				new String[] {
				"图书编码", "图书名称", "图书作者", "图书ISBN", "图书馆存量", "图书价格", "图书外借量", "图书借阅次数"
			}
		));
		table.getColumnModel().getColumn(6).setPreferredWidth(112);
		table.getColumnModel().getColumn(7).setPreferredWidth(100);
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
	}
}
