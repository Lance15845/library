CREATE TABLE books (
  bookId varchar(20) ,
	bookName	varchar(20),
	bookWriter	varchar(20),
	bookISBN	varchar(20),
	bookNum	int,
	bookPrice	double,
	bookNumBroughtOut	int,
  bookNumBorrowed	int,
  PRIMARY KEY (bookId)
) DEFAULT CHARSET=UTF8;