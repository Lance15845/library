package GUI.user;

import dao.BooksDao;
import entity.Books;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class ChazhaonumbListener implements ActionListener {
	// ����JTextFieldb����jt,�������洫�ݹ������ı������
	private JTextField jt2;

	// ����set��������ʼ��jt
	public void setJt(JTextField jt2) {
		this.jt2 = jt2;

	}

	public void actionPerformed(ActionEvent e) {

		String bookId = jt2.getText();
		ArrayList<Books> booksList = new ArrayList<>();
		booksList = new BooksDao().queryBooks(bookId, "");
		Books books = booksList.get(0);
		if ("".equals(bookId))
			;
		else {
			Chazhaonumbbooks cznumb = new Chazhaonumbbooks(books);
			cznumb.Chazhaonumbbooks1(books);
		}
	}
}
