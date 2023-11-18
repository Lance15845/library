package GUI.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButListener_tomainlist implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Book_mainlist bm = new Book_mainlist();
		bm.Book_mainlist();
	}

}
