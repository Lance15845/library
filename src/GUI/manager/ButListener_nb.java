package GUI.manager;

import dao.BooksDao;
import entity.Books;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ButListener_nb implements ActionListener{

	private JTextField id1;
	private JTextField name1;
	private JTextField writer1;
	private JTextField isbn1;
	private JTextField num1;
	private JTextField cost1;
	
	public void setJt(JTextField id1,JTextField name1,JTextField writer1,JTextField isbn1,JTextField num1,JTextField cost1){
		this.id1 = id1;
		this.name1 = name1;
		this.writer1 = writer1;
		this.isbn1 = isbn1;
		this.num1 = num1;
		this.cost1 = cost1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String id = id1.getText();
		String name = name1.getText();
		String writer = writer1.getText();
		String isbn = isbn1.getText();
		String num = num1.getText();
		String cost = cost1.getText();
		Books books = new Books(id, name, writer, isbn, Integer.parseInt(num), Double.parseDouble(cost));
		// 数据库处理
		boolean bool = new BooksDao().addBooks(books);
		// 图书增加成功
		if (bool){
			Success success = new Success();
			success.Success();
		}else{
			// 图书增加失败
			Fail fail = new Fail();
			fail.main(null);
		}
	}

}
