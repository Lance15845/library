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
		// ���ݿ⴦��
		boolean boolDeleteBooks = new BooksDao().deleteBooks(name);
		// ͼ����Ϣɾ���ɹ�
		if(boolDeleteBooks) {
			Success suc = new Success();
			suc.Success();
		}else {
			// ͼ����Ϣɾ��ʧ��
			Fail fail = new Fail();
			fail.main(null);
		}
	}
}
