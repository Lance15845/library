package GUI.manager;

import dao.BooksDao;
import entity.Books;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class ButListener_ad implements ActionListener{
	
	private JTextField name1;
	private JTextField num1;
	
	public void setJt(JTextField name1,JTextField num1){
		this.name1 = name1;
		this.num1 = num1;
	}
	@Override
	// ͼ��ݴ�������
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = name1.getText();
		String num = num1.getText();
		ArrayList<Books> booksList = new BooksDao().queryBooks(name, name);
		Books books = booksList.get(0);
		books.setBookNum(books.getBookNum() + Integer.parseInt(num));
		// ���ݿ⴦��
		boolean boolNum = new BooksDao().updateBooks(2, books);
		if(boolNum){
			//���ӳɹ�
			Success as = new Success();
			as.Success();
		}else{
			//ʧ�ܽ���
			Ad_bFail af=new Ad_bFail();
			af.Ad_Fail();
		}
	}
}
