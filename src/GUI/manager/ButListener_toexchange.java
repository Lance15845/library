package GUI.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButListener_toexchange implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Book_exchange be = new Book_exchange();
		be.Book_exchange1(null);
	}

}
