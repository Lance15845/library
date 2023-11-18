package GUI.user;

import entity.Users;
import tools.QueryPrint;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class MimaListener implements ActionListener {
	// 定义JTextFieldb变量jt,用来保存传递过来的文本框对象
	private JTextField jt;
	private JTextField jt2;

	// 定义set方法，初始化jt
	public void setJt(JTextField jt, JTextField jt2) {
		this.jt = jt;
		this.jt2 = jt2;
	}

	public void actionPerformed(ActionEvent e) {
		// 检测到按钮被点击自动计入到这个函数，这个函数是ActionListener类的方法
		// 接下来获取文本框里面的字符串
		String name = jt.getText();
		String password = jt2.getText();
		int userId = 0;
		ArrayList<Users> usersList = new QueryPrint().queryUsersKey(userId,name);

		for(Users user : usersList){
			// 如果正确显示登陆成功的界面
			if (user.getUserName().equals(name) && user.getUserPassword().equals(password)){
				Success sc=new Success();//新的界面（跟旧的差不多后面有代码）
				sc.main(null);
			}
		}

	}
}
