package GUI.manager;

import dao.BooksDao;
import entity.Books;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JEditorPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JScrollBar;

public class Book_booklist extends JFrame {
	public void Book_List() {
		
	}

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public void Book_List1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book_booklist frame = new Book_booklist();
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
	public Book_booklist() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1015, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel = new JLabel("图书清单");
		lblNewLabel.setFont(new Font("隶书", Font.PLAIN, 45));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(381)
							.addComponent(lblNewLabel))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(38)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
					.addGap(30)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
					.addGap(156))
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
		
		setVisible(true);
	}
}
