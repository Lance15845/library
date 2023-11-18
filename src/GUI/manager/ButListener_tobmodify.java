package GUI.manager;
import dao.BooksDao;
import entity.Books;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class ButListener_tobmodify implements ActionListener{

	private JTextField name1;
	
	public void setJt(JTextField name1){
		this.name1 = name1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = name1.getText();
		ArrayList<Books> booksList = new ArrayList<>();
		booksList = new BooksDao().queryBooks("", name);
		Books books = booksList.get(0);

		if(books != null) {
		Book_modify bm = new Book_modify(books);
		bm.Book_modify1(books);
		}else {
			Ad_bFail af = new Ad_bFail();
			af.Ad_Fail();
		}
	}

}
