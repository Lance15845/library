package GUI.user;

import dao.BooksDao;
import entity.Books;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class ChazhaonameListener implements ActionListener {
	// 定义JTextFieldb变量jt,用来保存传递过来的文本框对象
	private JTextField jt1;

	// 定义set方法，初始化jt
	public void setJt(JTextField jt1) {
		this.jt1 = jt1;

	}

	public void actionPerformed(ActionEvent e) {

		String bookName = jt1.getText();
		ArrayList<Books> booksList = new ArrayList<>();
		booksList = new BooksDao().queryBooks("", bookName);
		Books books = booksList.get(0);
		if ("".equals(bookName))
			;
		else {
			Chazhaonamebooks czn = new Chazhaonamebooks(books);
			czn.Chazhaonamebooks1(books);
		}
	}
}
