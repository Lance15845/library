package GUI.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButListener_tonb implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Book_new bn = new Book_new();
		bn.Book_new();
	}

}
