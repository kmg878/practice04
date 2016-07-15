package prob3;

public class Book {
	private int BookNo;
	private String title;
	private String author;
	private int stateCode;

	public Book(int BookNo, String title, String author) {
		this.BookNo=BookNo;
		this.title=title;
		this.author=author;
		stateCode=1;
		
	}
	public void rent(int stateCode){
		setStateCode(0);
		if(stateCode==0){
			System.out.println("대여 되었습니다");
			return;
		}
	}
	public void print(){
		if(stateCode==0){
			System.out.println(getBookNo()+getTitle()+getAuthor()+"대여중");
			return;
		}
		System.out.println(getBookNo()+getTitle()+getAuthor()+"재고 있음");
	}

	public int getBookNo() {
		return BookNo;
	}

	public void setBookNo(int bookNo) {
		BookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

}
