package GUI.manager;

import dao.BooksDao;
import entity.Books;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class ButListener_changename implements ActionListener {

	private JTextField name1;
	private String Prename1;

	public void setJt(JTextField name1,String Prename1){
		this.name1 = name1;
		this.Prename1 = Prename1;
	}
	// 修改图书名称
	public void actionPerformed(ActionEvent e) {
		String name = name1.getText();
		String Prename = Prename1;
		ArrayList<Books> booksList = new ArrayList<>();
		//数据库处理
		booksList = new BooksDao().queryBooks(Prename, Prename);
		try {
			if (booksList.size() > 0){
				Books books = booksList.get(0);
				books.setBookName(name);
				boolean boolName = new BooksDao().updateBooks(1, books);
				if(boolName) {
					// 修改成功
					Success suc = new Success();
					suc.Success();
				}
			} else {
				// 修改失败
				Ad_uFail auf = new Ad_uFail();
				auf.main(null);
			}
		}catch (Exception exception){
			exception.printStackTrace();
		}
	}
}