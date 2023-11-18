package GUI.manager;

import dao.BooksDao;
import entity.Books;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class ButListener_changecost implements ActionListener{
	
	private JTextField cost1;
	private String Prename1;
	
	public void setJt(JTextField cost1, String Prename1){
		this.cost1 = cost1;
		this.Prename1 = Prename1;
	}
	// 修改图书价格
	public void actionPerformed(ActionEvent e) {
		String cost = cost1.getText();
		String Prename = Prename1;
		ArrayList<Books> booksList = new ArrayList<>();
		// 查询
		booksList = new BooksDao().queryBooks(Prename, Prename);
		if (booksList.size() > 0){
			Books books = booksList.get(0);
			// 数据库处理
			books.setBookPrice(Double.parseDouble(cost));
			boolean boolPrice = new BooksDao().updateBooks(3, books);
			if(boolPrice) {
				Success suc = new Success();
				suc.Success();
			}
		}else {
			Ad_bFail af = new Ad_bFail();
			af.Ad_Fail();
		}
	}

}
