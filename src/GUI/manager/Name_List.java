package GUI.manager;

import dao.UsersDao;
import entity.Users;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.ScrollPane;
import java.util.ArrayList;
import javax.swing.JScrollPane;

public class Name_List extends JFrame {
	public void Name_List() {
		
	}

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public void Name_List1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Name_List frame = new Name_List();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Name_List() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 498, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D\u5355");
		lblNewLabel.setFont(new Font("隶书", Font.PLAIN, 32));
		lblNewLabel.setBounds(163, 21, 147, 69);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 108, 373, 334);
		contentPane.add(scrollPane);

		ArrayList<Users> arrayList = new UsersDao().showUsers();
		String[][] objects = new String[arrayList.size()][3];
		int temp = 0;
		for (Users users : arrayList){
			objects[temp][0] = String.valueOf(users.getUserId());
			objects[temp][1] = users.getUserName();
			objects[temp][2] = users.getUserPassword();
			temp++;
		}
		table = new JTable();
		table.setModel(new DefaultTableModel(
			 objects,
			new String[] {
				"用户ID", "用户名", "用户密码"
			}
		));
		scrollPane.setViewportView(table);
		
		setVisible(true);
	}
}
