package GUI.manager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButListener_toadd implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Book_add ba = new Book_add();
		ba.Book_add();
	}

}
