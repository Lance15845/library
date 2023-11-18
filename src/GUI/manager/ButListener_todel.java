package GUI.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButListener_todel implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Book_del bd = new Book_del();
		bd.Book_del();
	}
	
}
