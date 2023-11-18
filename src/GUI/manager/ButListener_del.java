package GUI.manager;

import dao.BooksDao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ButListener_del implements ActionListener{
	
	private JTextField name1;
	
	public void setJt(JTextField name1){
		this.name1 = name1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = name1.getText();
		// 数据库处理
		boolean boolDeleteBooks = new BooksDao().deleteBooks(name);
		// 图书信息删除成功
		if(boolDeleteBooks) {
			Success suc = new Success();
			suc.Success();
		}else {
			// 图书信息删除失败
			Fail fail = new Fail();
			fail.main(null);
		}
	}
}
