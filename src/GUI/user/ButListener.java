package GUI.user;
import entity.Users;
import tools.QueryPrint;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class ButListener implements ActionListener {
	//����JTextFieldb����jt,�������洫�ݹ������ı������
	private JTextField jt;
	private JTextField jt2;
	
	//����set��������ʼ��jt
	public void setJt(JTextField jt,JTextField jt2){
		this.jt = jt;
		this.jt2=jt2;
	}
 
	public void actionPerformed(ActionEvent e) {
		//��⵽��ť������Զ����뵽������������������ActionListener��ķ���
		//��������ȡ�ı���������ַ���
		String userName = jt.getText();
		String password=jt2.getText();
		int userId = 0;
		ArrayList<Users> usersList = new QueryPrint().queryUsersKey(userId,userName);

		for(Users user : usersList){
			// �����ȷ��ʾ��½�ɹ��Ľ���
			if (user.getUserName().equals(userName) && user.getUserPassword().equals(password)){
				Success sc=new Success();//�µĽ��棨���ɵĲ������д��룩
				sc.showUI();
			}
		}

		//��¼ʧ�ܽ���д����
		Success sc=new Success();//�µĽ��棨���ɵĲ������д��룩
		sc.showUI();

	}	
}