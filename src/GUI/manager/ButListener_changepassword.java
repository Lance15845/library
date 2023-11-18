package GUI.manager;

import dao.UsersDao;
import entity.Users;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class ButListener_changepassword implements ActionListener{
	private JTextField password1;
	private String preName1;
	
	public void setJt(JTextField password1,String preName1){
		this.password1 = password1;
		this.preName1 = preName1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String password = password1.getText();
		String preName = preName1;
		ArrayList<Users> usersList = new ArrayList<>();
		usersList = new UsersDao().queryUsers(-1, preName);
		if (usersList.size() > 0){
			Users users = usersList.get(0);
			users.setUserPassword(password);
			boolean boolPassword = new UsersDao().updateUsers(2,users);
			if( boolPassword) {
				Success suc = new Success();
				suc.Success();
			}
		}else {
			Ad_bFail af = new Ad_bFail();
			af.Ad_Fail();
		}
	}

}
