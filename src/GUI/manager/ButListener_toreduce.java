package GUI.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButListener_toreduce implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Book_reduce br = new Book_reduce();
		br.Book_reduce();
	}

}
