package GUI.manager;

import GUI.user.User;
import dao.UsersDao;
import entity.Users;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ButListener_un implements ActionListener{

	private JTextField password1;
	private JTextField name1;
	private JTextField id1;
	
	
	public void setJt(JTextField id1,JTextField name1,JTextField password1){
		this.password1 = password1;
		this.name1 = name1;
		this.id1 = id1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String password = password1.getText();
		String name = name1.getText();
		String id = id1.getText();
		Users user = new Users(Integer.parseInt(id), name, password);
		// 数据库处理
		boolean bool  = new UsersDao().addUser(user);
		// 用户增加成功
		if (bool){
			Success success = new Success();
			success.Success();
		}else{
			// 用户增加失败
			Fail fail = new Fail();
			fail.main(null);
		}
	}

}
