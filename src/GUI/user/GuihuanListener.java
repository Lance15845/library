package GUI.user;

import dao.BooksDao;
import entity.Books;
import tools.QueryPrint;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class GuihuanListener implements ActionListener {
	// 定义JTextFieldb变量jt,用来保存传递过来的文本框对象
	private JTextField jt;

	// 定义set方法，初始化jt
	public void setJt(JTextField jt) {
		this.jt = jt;
	}

	public void actionPerformed(ActionEvent e) {
		// 检测到按钮被点击自动计入到这个函数，这个函数是ActionListener类的方法
		// 接下来获取文本框里面的字符串
		String bookName = jt.getText();
		// 验证账号和密码，如果正确显示登陆成功的界面
		// 账号123对应密码789
		ArrayList<Books> booksList = new QueryPrint().queryBooksKey("", bookName);
		Books books = booksList.get(0);
		books.setBookNum(books.getBookNum() + 1);
		books.setBookNumBroughtOut(books.getBookNumBroughtOut() - 1);
		Boolean num = new BooksDao().updateBooks(4, books);
		Boolean numOut = new BooksDao().updateBooks(5, books);
		if (num && numOut) {
			System.out.println("\n\t! ! 成功归还图书！！\n");
			Guihuansuccess ghs = new Guihuansuccess();
			ghs.main(null);
		} else {
			System.err.println("\n\t！！归还图书失败！！");
		}
	}
}
