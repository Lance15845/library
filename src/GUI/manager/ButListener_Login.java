package GUI.manager;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JTextField;

public class ButListener_Login implements ActionListener {
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
		String name = jt.getText();
		String password=jt2.getText();
		//��֤�˺ź����룬�����ȷ��ʾ��½�ɹ��Ľ���
		//�˺�123��Ӧ����789
		if("wxy".equals(name)&&"wxy123".equals(password)){
			Master_Main_List ml=new Master_Main_List();//�µĽ��棨���ɵĲ������д��룩
			ml.Main_List();
 
		}else{
			//��¼ʧ�ܽ���д����
			Master_Main_List ml=new Master_Main_List();//�µĽ��棨���ɵĲ������д��룩
			ml.Main_List();
		}	
	}	
}
