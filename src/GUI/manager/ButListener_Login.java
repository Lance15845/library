package GUI.manager;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JTextField;

public class ButListener_Login implements ActionListener {
	//定义JTextFieldb变量jt,用来保存传递过来的文本框对象
	private JTextField jt;
	private JTextField jt2;
	
	//定义set方法，初始化jt
	public void setJt(JTextField jt,JTextField jt2){
		this.jt = jt;
		this.jt2=jt2;
	}
 
	public void actionPerformed(ActionEvent e) {
		//检测到按钮被点击自动计入到这个函数，这个函数是ActionListener类的方法
		//接下来获取文本框里面的字符串
		String name = jt.getText();
		String password=jt2.getText();
		//验证账号和密码，如果正确显示登陆成功的界面
		//账号123对应密码789
		if("wxy".equals(name)&&"wxy123".equals(password)){
			Master_Main_List ml=new Master_Main_List();//新的界面（跟旧的差不多后面有代码）
			ml.Main_List();
 
		}else{
			//登录失败界面写这里
			Master_Main_List ml=new Master_Main_List();//新的界面（跟旧的差不多后面有代码）
			ml.Main_List();
		}	
	}	
}
