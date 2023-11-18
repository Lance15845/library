package GUI.manager;

import dao.UsersDao;
import entity.Users;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class ButListener_changeun implements ActionListener{
	private JTextField name1;
	private String preName1;
	
	public void setJt(JTextField name1,String preName1){
		this.name1 = name1;
		this.preName1 = preName1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = name1.getText();
		String preName = preName1;

		ArrayList<Users> usersList = new ArrayList<>();
		usersList = new UsersDao().queryUsers(-1, preName);
		if (usersList.size() > 0){
			Users users = usersList.get(0);
			users.setUserName(name);
			boolean boolName = new UsersDao().updateUsers(1,users);
			if( boolName) {
				Success suc = new Success();
				suc.Success();
			}
		}else {
			Ad_bFail af = new Ad_bFail();
			af.Ad_Fail();
		}
	}

}
