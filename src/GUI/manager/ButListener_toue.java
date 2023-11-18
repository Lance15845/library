package GUI.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButListener_toue implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		User_exchange ue = new User_exchange();
		ue.User_exchange1(null);
	}

}
