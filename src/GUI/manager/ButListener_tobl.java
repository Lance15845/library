package GUI.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButListener_tobl implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Book_booklist bbl = new Book_booklist();
		bbl.Book_List();
	}

}
