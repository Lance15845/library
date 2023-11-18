package GUI.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButListener_toud implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		User_del ud = new User_del();
		ud.User_del1();
	}
}
