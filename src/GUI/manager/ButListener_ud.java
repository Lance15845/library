package GUI.manager;

import dao.UsersDao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ButListener_ud implements ActionListener{

	private JTextField name1;
	
	public void setJt(JTextField name1){
		this.name1 = name1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = name1.getText();
		// ���ݿ⴦��
		boolean bool = new UsersDao().deleteUsers(Integer.parseInt(name));
		// �û�ɾ���ɹ�
		if (bool){
			System.out.println("�ɹ�");
			Success success = new Success();
			success.Success();
		}else{
			// �û�ɾ��ʧ��
			System.out.println("ʧ��");
			Fail fail = new Fail();
			fail.main(null);
		}
	}

}
