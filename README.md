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
#### 2.4.2 用户信息修改实现
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
## 三、设计概要
实验要求实现六个匹配算法，分析三种算法的时间复杂性，通过应用三种算法在一个较长英文文本中查找一个子串的实验数据来对比三种算法的运行时间。涉及的三个算法如下：  


### BF(char *S, char *T)  
```
1.对主串的每一个字符作为子串开头，与要匹配的字符串进行匹配。  
2.对主串做大循环，每个字符开头做T的长度的小循环直到匹配成功。  
3.返回i的值即为该字符在主子符串的位置。  
```
### Rabin_Karp_Macher(const char *T,const char *P,int d,int q)  
```
计算匹配与需匹配字符串的哈希值  
1.进行哈希值的比较，相等再进行字符的比较  
2.都匹配成功则输出位置，失败返回“未找到”  
```
### KMP(char * text, char *pat, int next[ ])  
```
1.基于回溯法实现  
（1） 根据模式串创建next数组  
（2）根据next数组在文本串中匹配模式串  
2.基于确定有限状态自动机实现  
（2）根据模式串创建dp数组（状态转移表）  
（3）根据dp数组在文本串中匹配模式串   
```
### BM(char *buf, int blen, char *ptrn, int plen, int *skip, int *shift)  
```
1.根据模式串构建坏字符表。  
2. 根据模式串构建好后缀表。  
3. 在文本串中匹配模式串，遇到失配的情况，选择坏字符表和好后缀中相应的值中最大的那一个进行后移。   
```
### BMH(char *src, int n, char *des, int m)  
```
1.根据模式串构建坏字符表。  
2. 根据模式串构建好后缀表。  
3. 在文本串中匹配模式串，遇到失配的情况，选择坏字符表和好后缀中相应的值中最大的那一个进行后移。同时忽略好后缀产生的影响，只考虑好字符。  
```
### Sunday(char *S, char *T)  
```
1.将子字符串和主字符串对齐  
2.若在第一个位置匹配正确，则顺次匹配下一个位置上的字符直至子字符串完全匹配成功  
3.若匹配失败，主子符串则跳至参加匹配的子字符串的最末尾的下一个字符，直接跳过一大片，直至匹配成功   
```
## 用户手册

##### 1.本程序的运行环境为Windows操作系统，执行文件为StringMatch.exe。  
##### 2.进入程序后，根据已经存储在字符数组的文本信息进行模式串搜索。  
##### 3.当匹配成功时，会显示朴素匹配算法，RK算法和KMP算法的提示信息，并呈现执行匹配代码的运行时间。  
##### 4.运行时间的单位以ms(毫秒)为单位。  
##### 5.朴素匹配算法，基于回溯实现的KMP可以匹配任何字符。  
##### 6.RK算法由于使用了哈希表，用除余法解决冲突，因此不可以匹配英文之外的语言字符，数字，空格等特殊类型字符可以匹配。 
  
##### 7. 基于确定有限状态自动机实现的KMP算法只能匹配ASCII表中的 256个字符。  

## 四、调试分析
### i.调试部分
#### 1.朴素匹配算法  
```
（1）考虑到使用string类型会造成主字符串在匹配过程中出现无法正确读取输入信息，故改为char类型，方便读取运算。为了与主子符串对应，故将子字符串也改为char类型。  
（2）在原来设计中，由于考虑子字符串匹配主字符串出现重复的问题，后修改设计，使得子字符串在主子符串出现的首个位置为最终需要匹配的位置。
```
#### 2.Rabin Karp算法  
```
（1）考虑到哈希值有多种计算方式，可能导致实验数据的结果产生偏差，所以对算法进行了代码层面的比较，最后选择了除余法，其计算公式：d%q*p+P[i]-'a'（d为一个素数）  
（2）在运行测试的过程中有极小的可能，会在计算哈希值时产生哈希冲突，为了代码的完整全面，加入了防止冲突的函数  
```
#### 3. Knuth Morria Pratt 算法：
```  
（1）KMP算法实现有两种方式，一个基于回溯，一个基于确定有限状态自动机，利用回溯实现的代码可以匹配数字，字母，空格等其他字符，而利用确定有限状态自动机实现代码只能匹配在ASCII表中的256个字符，无法匹配中文。  
（2）当匹配成功时，会显示模式串在文本串匹配的首位置。匹配失败，则会提示匹配失败。
```
### ii.时间复杂度分析
#### 1.朴素匹配算法  
```
设（n为主串长度，m为模式串长度）  
时间复杂度的情况分析如下:  
      a)	最好情况  
          O(1) 一开始就匹配成功。  
      b)	最坏情况  
          O((n-m+1)*m) 每次不成功的匹配都发生在模式串的最后一个字符。  
      c)	平均情况  
          O(n+m) 根据等概率原则，平均是(n+m)/2次查找。
```
#### 2.Rabin-Karp算法
&ensp;&ensp;&ensp;&ensp;该算法的主要改进就是先对两个需匹配字符串进行哈希值的运算，再进行比较，这就运用到了哈希算法。哈希算法可以有很多种不同的形式，它可能包含ASCII码字符以便对数字进行转化，但也可能是别的形式。我们唯一需要的就是将一个字符串（模式串）转化成为能够快速进行比较的哈希值。以"hello world"为例，假设它的哈希值hash('hello world')=12345。那么如果hash('he')=1，那么我们就可以说模式串"he"包含在文本"hello world"中。由此，我们可以每次从文本中取出长度为m（m为模式串的长度）的子串，然后将该子串进行哈希，并将其哈希值与模式串的哈希值进行比较。
#### 3.KMP算法
&ensp;&ensp;&ensp;&ensp;假设在M字符串中找N字符串的起始位置，长度分别为m和n，使用KMP算法，一般认为时间复杂度是O（m+n），也就是计算next数组的时间复杂度是O(n)，而匹配的时候是O（m）。
#### 4.BM算法
&ensp;&ensp;&ensp;&ensp;BM算法被认为是亚线性串匹配算法，它在最坏情况下找到模式所有出现的时间复杂度为O(mn)，在最好情况下执行匹配找到模式所有出现的时间复杂度为O(n/m)。 
#### 5.Sunday算法
```
（1）status InitData(char **S,char **T)频度为i+1  
（2）findindex(char *T,char temp)频度为i+1  
（3）Sunday(char *S, char *T)  
    设（m为主串长度，n为子串长度）时间复杂度的情况分析如下:  
      ① 平均性能的时间复杂度为O(n)；  
      ② 最差情况的时间复杂度为O(n * m)
```
#### 6.BMH算法  
&ensp;&ensp;&ensp;&ensp;设匹配字符串长度为M，被匹配字符串长度为N，将两个字符串先对齐后从后往前匹配。当失配时，搜索对齐位置末尾的字符在匹配字符串中从后往前最先出现的位置(预处理后时间复杂度为O(1) )k，移动m-k-1位，如果不存在则会初始化为-1。该算法的理想复杂度为N/M，期望复杂度为N，最坏复杂度为N*M。
##  五、结论
&ensp;&ensp;&ensp;&ensp;实验要求实现朴素匹配算法，Rabin-Karp算法 和KMP算法的代码实现和通过应用三种算法在一个较长英文文本中查找一个子串的实验数据来对比三种算法的运行时间。对于这三种算法，我们主要查阅了严蔚敏老师的的《数据结构》，《算法四》，《算法导论》以及一些博客贴。    
&ensp;&ensp;&ensp;&ensp;我们从一部小说节选了10165个字符的文本串，进行对比运行时间。为了精准对比运行时间，我们分别在文本中的第1000,2000,5000,7000和10000附近的位置选取模式串，进行匹配。  
&ensp;&ensp;通过运行时间对比显示，RK算法始终花费最多的时间，因为无论要搜索何处的模式串，都需要对整个文本串进行预处理，测试的文本串具有10165个字符，导致运行时间加大。截取文本串7000位的模式串的长度是其他模式串的两倍，因此导致时间加大。  
&ensp;&ensp;&ensp;&ensp;朴素匹配算法和KMP算法有着密切的关系，因此单独将这两个算法进行对比，可以发现匹配5000位之前的模式串，从运行时间的角度上来说，KMP是优于朴素匹配算法的，但是对于5000之后的模式串来说，朴素匹配算法优于KMP算法。从匹配7000位字符的模式串的运行时间来看，模式串的长度影响了运行时间。此文本串很少有重复的单词，因此会频繁地遇到失配的情况，KMP算法是不退回的算法，最坏情况下近乎于遍历文本串。 
&ensp;&ensp;&ensp;&ensp;由上所述，KMP算法和RK算法虽然对朴素匹配算法进行了相对显著的优化，但是应用于实际问题中，效率依旧不理想。我们查阅了相关的资料，发现文本编辑器，编译器中的查找功能往往是基于BM算法而实现的，BM算法于1970年由德克萨斯大学的两名教授发明的，至今有很多优化算法，比如本实验拓展部分的Sunday，BMH算法。   
&ensp;&ensp;&ensp;&ensp;本报告涉及的六种字符串匹配算法属于单模式匹配，即在文本中寻找一个子串，如果需要同时在文本中查找多个子串，需要用到字典树，AC自动机等算法。  
