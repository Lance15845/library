package GUI.manager;

import dao.UsersDao;
import entity.Books;
import entity.Users;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class ButListener_toumodify implements ActionListener{
	private JTextField name1;
	
	public void setJt(JTextField name1){
		this.name1 = name1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = name1.getText();
		ArrayList<Users> usersList = new ArrayList<>();
		usersList = new UsersDao().queryUsers(-1, name);
		Users users = usersList.get(0);


		if(users != null) {
			User_modify um = new User_modify(users);
			um.User_modify1(users);
			}else {
				Ad_uFail af = new Ad_uFail();
				af.main(null);
			}
	}

}
