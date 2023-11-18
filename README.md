# 图书馆一体化系统
## 一、系统设计
### 1.1需求分析
使用MySQL数据库对数据进行存储。  
实现对图书信息的增删查改以及借阅、归还和清单功能。  
实现对用户信息的增删查改功能。  
### 1.2开发环境
系统开发平台 ：IntelliJ IDEA  
系统开发语言 ：Java、SQL   
运行平台：Windows 7（SP1）/ Windows 8/Windows 8.1/Windows 10  
运行环境：JDK11、8.0.22  
运行场景：本地运行   
运行配置：在项目Modules中添加mysql-connector-java-8.0.22.jar	 
### 1.3 模块结构
包括如下五个模块：  
用户登录功能：管理员用户选择管理员端进行用户登录，其他用户选择普通用户端进行登录。若对应的权限端口中选择错误，则也不能进入。  
用户信息管理功能：对所有的普通用户信息进行增删查改的模块。  
图书信息管理：对图书信息进行增删查改的模块。  
图书借阅功能：对馆内已有的书籍进行借阅。  
图书归还功能：对已借阅的图书进行归还操作。  
### 1.4 设计思路
&ensp;&ensp;&ensp;&ensp;根据图书馆一体化的需求分析，我们确定了该系统所需要设计开发的各个模块，该系统分为：普通用户管理模块和管理员管理模块，供两种不同的权限用户使用：普通用户和管理员。这两种用户拥有不同的权限功能，包括普通用户图书借阅、图书归还、图书查询三大功能和管理员的图书信息管理和用户信息管理的两大功能供5大功能模块。该模块的确定为后续相继功能的开发奠定基础，相继功能已在上图中通过流程图更加具体直观呈现。这样，对该图书馆一体化系统有了大体了解方向有了大体把握。通过先前自行学习的数据库内容结合实体类和相应属性，即可设计数据库的各表。通过此次数据库的运用，更加熟悉了数据库的相关内容，组员能力有了较大提升。
## 二、系统实现
### 2.1初始化界面实现 
&ensp;&ensp;&ensp;&ensp;用户登录有普通用户登录和管理员登录两种方式。  
&ensp;&ensp;&ensp;&ensp;普通用户的登录流程图如图 所示，点击普通用户登录之后，会跳出窗口要求输入用户名，用户密码。输入后点击登录会执行业务逻辑处理，如果验证正确进入功能选择界面，否则返回主界面。登录成功进入用户界面后，用户可以开始选择功能，如图书查询功能，要求用户选择按编码或书名查询，选择后输入，如查找到该书则输出该书的全部信息，若该书不存在告知用户未查询得到。借阅功能要求用户输入要借阅的书名，成功则库中数量减少，记入借阅次数中，失败则告知用户该书不在库中，图书的归还同理。用户的借阅记录会在数据库中产生。
### 2.2 普通用户登录实现
&ensp;&ensp;&ensp;&ensp;普通用户的登录流程图如图 所示，点击普通用户登录之后，会跳出窗口要求输入用户名，用户密码。输入后点击登录会执行业务逻辑处理，如果验证正确进入功能选择界面，否则返回主界面。登录成功进入用户界面后，用户可以开始选择功能。  
##### 用户登录实现关键代码如下：
```
btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User user = new User();
				user.main(null);
			}
		});
// 给按钮添加动作监听器方法
		MimaListener but = new MimaListener();
		// 创建一个监听器
		btnNewButton.addActionListener(but);
		passwordField = new JPasswordField();
		// 把监听器加在“登录”按钮上
		but.setJt(textField, passwordField);
public void actionPerformed(ActionEvent e) {
		// 检测到按钮被点击自动计入到这个函数，这个函数是ActionListener类的方法
		// 接下来获取文本框里面的字符串
		String name = jt.getText();
		String password = jt2.getText();
		// 验证账号和密码，如果正确显示登陆成功的界面
		// 账号123对应密码789
		if ("123".equals(name) && "789".equals(password)) {
			Success sc = new Success();// 新的界面（跟旧的差不多后面有代码）
			sc.main(null);
		} else {}// 登录失败界面
```
### 2.3 管理员登录实现
&ensp;&ensp;&ensp;&ensp;管理员点击管理员登录之后，会跳出窗口要求输入管理员名，管理员密码。输入后点击登录会执行业务逻辑处理，如果验证正确进入功能选择界面，否则返回主界面。登录成功进入用户界面后，用户可以开始选择功能，如用户管理，书籍管理和返回主页面，进入各个菜单栏后还有细化的功能可以进一步选择。如果登录失败，会返回系统菜单，重新要求输入管理员名，管理员密码。需再次执行操作。管理员账户唯一，存在数据库中，会用户输入的值会与数据库中的值进行比对，再由监听器向使用者反馈对比情况。
### 2.4 用户信息增减修改
#### 2.4.1 用户信息增加实现
&ensp;&ensp;&ensp;&ensp;新用户的添加要求用户输入输入一系列的用户信息，包括用户名，用户密码，将信息通过监听器传导到数据库，查询是否存在，若不存在则创建一个新的用户类，分别存入各项信息。
##### 用户信息增加关键代码如下：
```
public void actionPerformed(ActionEvent e) {
		String password = password1.getText();
		String name = name1.getText();
		String id = id1.getText();
		Users user = new Users(Integer.parseInt(id), name, password);
		// 数据库处理
		boolean bool  = new UsersDao().addUser(user);
		// 用户增加成功
		if (bool){
			Success success = new Success();
			success.Success();
		}else{ 
// 用户增加失败
			Fail fail = new Fail();
			fail.main(null);
		}
	}
```
#### 2.4.2 用户信息删除实现
&ensp;&ensp;&ensp;&ensp;用户的删除要求输入用户的ID，由监听器传入数据在数据库中遍历，若存在则将此用户的信息整体删除，若未找到该用户则告知用户操作失败。
##### 用户信息删除关键代码如下：
```
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
```
#### 2.4.3 用户信息修改实现
&ensp;&ensp;&ensp;&ensp;用户信息修改包括用户名和用户密码的修改，进入信息修改界面后，需先查找要修改的用户，由监听器传输输入信息，若该用户存在可选择要修改的项目，空项默认输入为“null”系统自动略过不进行修改，其他数据将由监听器同步到数据库。若该用户不存在，系统会弹出提示窗口，询问是否需要添加新用户。
##### 用户信息修改关键代码如下：
```
// 修改用户名称
	public void actionPerformed(ActionEvent e) {
		String name = name1.getText();
		String Prename = Prename1;
		ArrayList<Books> booksList = new ArrayList<>();
		booksList = new BooksDao().queryBooks(Prename, Prename);
		try {
			if (booksList.size() > 0){
				Books books = booksList.get(0);
				books.setBookName(name);
				boolean boolName = new BooksDao().updateBooks(1, books);
				if(boolName) {
					Success suc = new Success();
					suc.Success();
				}
			} else {
				Ad_uFail auf = new Ad_uFail();
				auf.main(null);
			}
		}catch (Exception exception){
			exception.printStackTrace();
		}
	}
// 修改用户密码
	public void actionPerformed(ActionEvent e) {
		String password = password1.getText();
		String preName = preName1;
		ArrayList<Users> usersList = new ArrayList<>();
		usersList = new UsersDao().queryUsers(-1, preName);
		if (usersList.size() > 0){
			Users users = usersList.get(0);
			users.setUserPassword(password);
			boolean boolPassword = new UsersDao().updateUsers(2,users);
			if( boolPassword) {
				Success suc = new Success();
				suc.Success();
			}
		}else {
			Ad_bFail af = new Ad_bFail();
			af.Ad_Fail();
		}
	}
```
#### 2.4.4 用户信息清单实现
##### 用户信息清单关键代码如下：
```
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
```
### 2.5 图书信息管理实现
&ensp;&ensp;&ensp;&ensp;管理员登录成功后进入图书管理界面，可以对数据库中储存的图书数据信息进行一些列的处理，书目的删除，新书数据的添加，库存数量的增删和原有书目信息的修改。
#### 2.5.1 图书信息增加实现
&ensp;&ensp;&ensp;&ensp;新书的添加要求用户输入输入一系列的图书信息，包括图书编号，图书名称，图书作者，ISBA，馆存量，图书价格，将信息通过监听器传导到数据库，查询是否存在，若不存在则创建一个新的书类，分别存入各项信息。
##### 图书信息增加关键代码如下：
```
public void actionPerformed(ActionEvent e) {
		String id = id1.getText();
		String name = name1.getText();
		String writer = writer1.getText();
		String isbn = isbn1.getText();
		String num = num1.getText();
		String cost = cost1.getText();
		Books books = new Books(id, name, writer, isbn, Integer.parseInt(num), Double.parseDouble(cost));
		// 数据库处理
		boolean bool = new BooksDao().addBooks(books);
		// 图书增加成功
		if (bool){
			Success success = new Success();
			success.Success();
		}else{
			// 图书增加失败
			Fail fail = new Fail();
			fail.main(null);
		}
	}
```
#### 2.5.2 图书信息删除实现
&ensp;&ensp;&ensp;&ensp;书目的删除要求输入书目的id，由监听器传入数据在数据库中遍历，若存在则将书目的整体信息删除，若未找到该书目则告知用户操作失败。
##### 图书信息删除关键代码如下：
```
public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = name1.getText();
		// 数据库处理
		boolean boolDeleteBooks = new BooksDao().deleteBooks(name);
		// 图书信息删除成功
		if(boolDeleteBooks) {
			Success suc = new Success();
			suc.Success();
		}else {
			// 图书信息删除失败
			Fail fail = new Fail();
			fail.main(null);
		}
	}
```
#### 2.5.3 图书信息修改实现
&ensp;&ensp;&ensp;&ensp;信息修改包括书名和价格的修改，进入信息修改界面后，需先查找要修改的书目，由监听器传输输入信息，若该书存在可选择要修改的项目，空项默认输入为“null”系统自动略过不进行修改，其他数据将由监听器同步到数据库。若该书不存在，系统会弹出提示窗口，询问是否需要添加新书。
##### 图书信息修改关键代码如下：
```
// 修改图书价格
	public void actionPerformed(ActionEvent e) {
		String cost = cost1.getText();
		String Prename = Prename1;
		ArrayList<Books> booksList = new ArrayList<>();
		// 查询
		booksList = new BooksDao().queryBooks(Prename, Prename);
		if (booksList.size() > 0){
			Books books = booksList.get(0);
			// 数据库处理
			books.setBookPrice(Double.parseDouble(cost));
			boolean boolPrice = new BooksDao().updateBooks(3, books);
			if(boolPrice) {
				Success suc = new Success();
				suc.Success();
			}
		}else {
			Ad_bFail af = new Ad_bFail();
			af.Ad_Fail();
		}
	}

	// 修改图书名称
	public void actionPerformed(ActionEvent e) {
		String name = name1.getText();
		String Prename = Prename1;
		ArrayList<Books> booksList = new ArrayList<>();
		//数据库处理
		booksList = new BooksDao().queryBooks(Prename, Prename);
		try {
			if (booksList.size() > 0){
				Books books = booksList.get(0);
				books.setBookName(name);
				boolean boolName = new BooksDao().updateBooks(1, books);
				if(boolName) {
					// 修改成功
					Success suc = new Success();
					suc.Success();
				}
			} else {
				// 修改失败
				Ad_uFail auf = new Ad_uFail();
				auf.main(null);
			}
		}catch (Exception exception){
			exception.printStackTrace();
		}
	}
```
#### 2.5.4 图书库存修改实现
&ensp;&ensp;&ensp;&ensp;信息修改包括书名和价格的修改，进入信息修改界面后，需先查找要修改的书目，由监听器传输输入信息，若该书存在可选择要修改的项目，空项默认输入为“null”系统自动略过不进行修改，其他数据将由监听器同步到数据库。若该书不存在，系统会弹出提示窗口，询问是否需要添加新书。
##### 图书库存修改关键代码如下：
```
// 图书馆存量增加
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = name1.getText();
		String num = num1.getText();
		ArrayList<Books> booksList = new BooksDao().queryBooks(name, name);
		Books books = booksList.get(0);
		books.setBookNum(books.getBookNum() + Integer.parseInt(num));
		// 数据库处理
		boolean boolNum = new BooksDao().updateBooks(2, books);
		if(boolNum){
			//增加成功
			Success as = new Success();
			as.Success();
		}else{
			//失败界面
			Ad_bFail af=new Ad_bFail();
			af.Ad_Fail();
		}
	}

	// 图书馆存量减少
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = name1.getText();
		String num = num1.getText();
		ArrayList<Books> booksList = new BooksDao().queryBooks(name, name);
		Books books = booksList.get(0);
		books.setBookNum(books.getBookNum() - Integer.parseInt(num));
		// 数据库处理
		boolean boolNum = new BooksDao().updateBooks(2, books);
		if(boolNum){
			//修改成功
			Success as=new Success();
			as.Success();
		}else{
			//修改失败
			Ad_bFail af = new Ad_bFail();
			af.Ad_Fail();
		}
	}
```
#### 2.5.4 图书库存修改实现
##### 图书库存修改关键代码如下：
```
ArrayList<Books> booksList = new BooksDao().showBooks();
		String[][] objects = new String[booksList.size()][8];
		int temp = 0;
		for (Books books : booksList){
			objects[temp][0] = books.getBookId();
			objects[temp][1] = books.getBookName();
			objects[temp][2] = books.getBookWriter();
			objects[temp][3] = books.getBookIsbn();
			objects[temp][4] = String.valueOf(books.getBookNum());
			objects[temp][5] = String.valueOf(books.getBookPrice());
			objects[temp][6] = String.valueOf(books.getBookNumBroughtOut());
			objects[temp][7] = String.valueOf(books.getBookNumBroughtOut());
			temp++;
		}
		table = new JTable();
		table.setModel(new DefaultTableModel(
				objects,
				new String[] {"图书编码", "图书名称", "图书作者", "图书ISBN", "图书馆存量", "图书价格", "图书外借量", "图书借阅次数"
				}
		));
```
### 2.6 图书借阅功能实现
&ensp;&ensp;&ensp;&ensp;在这个模块中，普通用户可以通过输入要借阅的图书名称来完成图书借阅的功能。 在普通用户登录之后，点击图书借阅按钮，会弹出一个输入图书名称的窗口，输入图书名称后，点击借阅，会进行业务处理。如果该图书存在并且馆存量不小于等于0，那么借阅成功，否则借阅失败，转到借阅失败界面。
##### 图书借阅功能关键代码如下：
```
public void actionPerformed(ActionEvent e) {
		// 检测到按钮被点击自动计入到这个函数，这个函数是ActionListener类的方法
		// 接下来获取文本框里面的字符串
		String bookname = name.getText();
		// number--;借阅后书本数量减一
		Jieyuesuccess jys = new Jieyuesuccess();
		jys.main(null);
	}
JieyueListener jy = new JieyueListener();
		btnNewButton.addActionListener(jy);
		jy.setJt(textField);
//创建借阅监听器
```
### 2.7 图书归还功能实现
&ensp;&ensp;&ensp;&ensp;在这个模块中，普通用户可以通过输入要归还的图书名称来完成图书归还的功能。 在普通用户登录之后，点击图书归还按钮，会弹出一个输入图书名称的窗口，输入图书名称后，点击归还，会进行业务处理。如果该图书存在，那么归还成功，否则归还失败，转到归还失败界面。
##### 图书归还功能关键代码如下：
```
public void actionPerformed(ActionEvent e) {
		String bookname = name.getText();
		//从文本框获取数据
		Guihuansuccess ghs = new Guihuansuccess();
		ghs.main(null);
	}
GuihuanListener gh = new GuihuanListener();
		btnNewButton.addActionListener(gh);
		gh.setJt(textField);
```
### 2.8 图书查询功能实现
&ensp;&ensp;&ensp;&ensp;在该模块中，普通用户可以根据书籍名称或书籍编码进行书籍查询，普通用户只需根据需要，选择书籍名称查询或书籍编码查询，并在相应的文本框中输入对应内容，点击查询按钮后，程序会自行在数据库中进行查找，并在表格中显示查询数据，用户可自行根据需要进行操作。若数据库中未找到该书籍，程序会主动提示用户未找到改书籍。
##### 图书查询功能关键代码如下：
```
public void actionPerformed(ActionEvent e) {
		String booknum = jt1.getText();
		if ("".equals(booknum))
			;
		else {
			Chazhaonamebooks czn = new Chazhaonamebooks();
			czn.main(null);
		}
	}
public void actionPerformed(ActionEvent e) {
		String booknum = jt2.getText();
		if ("".equals(booknum))
;
		else {
			Chazhaonumbbooks cznumb = new Chazhaonumbbooks();
			cznumb.main(null);
		}
	}
ChazhaonameListener czn = new ChazhaonameListener();
		czn.setJt(textField_2);
		btnNewButton2.addActionListener(czn);
ChazhaonumbListener cznb = new ChazhaonumbListener();
		cznb.setJt(textField);
		btnNewButton1.addActionListener(cznb);
```
## 三、 思路总结
&ensp;&ensp;&ensp;&ensp;根据图书馆一体化的需求分析，我们确定了普通用户管理和管理员管理两大管理模块，用户选择用户登录后进入功能选择模块，该功能选择模块主要包含图书借阅、图书归还和图书查询三大功能，程序根据用户输入的书籍名称或书籍编号与数据库数据对接实现借-归-查三大功能。管理员则选择管理员登录模块，登录后可获得管理权限，该管理权限主要包含对图书信息和用户信息的管理两大功能，通过调用数据库数据对用户和书籍数据进行增加和修改。这样，根据该实验的需求分析，在对该图书馆一体化系统有了大体了解方向有了大体把握的基础上进行开发，最后再与数据库进行对接，实现了与需求分析相对应的功能，大大提高了代码的编排能力。在程序开发的过程中，运用了一些自主学习的知识如可视化和数据库，其中可视化使用了eclipse的Windows Builder插件，使页面的设计更加直观，大大加快了程序编写的进度。最后的程序和数据库的互动花费了很多的时间，但大大加强了数据综合处理的能力。

