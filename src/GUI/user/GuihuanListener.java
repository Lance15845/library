package GUI.user;

import dao.BooksDao;
import entity.Books;
import tools.QueryPrint;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class GuihuanListener implements ActionListener {
	// ����JTextFieldb����jt,�������洫�ݹ������ı������
	private JTextField jt;

	// ����set��������ʼ��jt
	public void setJt(JTextField jt) {
		this.jt = jt;
	}

	public void actionPerformed(ActionEvent e) {
		// ��⵽��ť������Զ����뵽������������������ActionListener��ķ���
		// ��������ȡ�ı���������ַ���
		String bookName = jt.getText();
		// ��֤�˺ź����룬�����ȷ��ʾ��½�ɹ��Ľ���
		// �˺�123��Ӧ����789
		ArrayList<Books> booksList = new QueryPrint().queryBooksKey("", bookName);
		Books books = booksList.get(0);
		books.setBookNum(books.getBookNum() + 1);
		books.setBookNumBroughtOut(books.getBookNumBroughtOut() - 1);
		Boolean num = new BooksDao().updateBooks(4, books);
		Boolean numOut = new BooksDao().updateBooks(5, books);
		if (num && numOut) {
			System.out.println("\n\t! ! �ɹ��黹ͼ�飡��\n");
			Guihuansuccess ghs = new Guihuansuccess();
			ghs.main(null);
		} else {
			System.err.println("\n\t�����黹ͼ��ʧ�ܣ���");
		}
	}
}
