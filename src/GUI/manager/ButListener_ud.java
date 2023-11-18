package GUI.manager;

import dao.UsersDao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ButListener_ud implements ActionListener{

	private JTextField name1;
	
	public void setJt(JTextField name1){
		this.name1 = name1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = name1.getText();
		// 数据库处理
		boolean bool = new UsersDao().deleteUsers(Integer.parseInt(name));
		// 用户删除成功
		if (bool){
			System.out.println("成功");
			Success success = new Success();
			success.Success();
		}else{
			// 用户删除失败
			System.out.println("失败");
			Fail fail = new Fail();
			fail.main(null);
		}
	}

}
