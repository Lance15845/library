package GUI.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButListener_to_user_manage implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		User_manage um = new User_manage();
		um.User_manage();
	}
}
