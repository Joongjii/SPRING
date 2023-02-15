package bean;

public class Book {
	//Book Java Bean파일
//	자바의 재활용 가능한 컴포넌트 모델을 말한다. 
//	정보의 덩어리로, 데이터 저장소이다. 
//	데이터를 저장하기 위한 필드와 데이터를 컨트롤하는 getter/setter 메소드를 하나의 쌍으로 가지고 있는 클래스이다. 
	private String title;
	private String author;
	private int page;
	
	public Book() {
		// TODO Auto-generated constructor stub
		//System.out.println("Book클래스의 인스턴스를 기본생성자를 사용하여 생성");
	}
	
	public Book(String title, String author, int page) {
		super();
		this.title = title;
		this.author = author;
		this.page = page;
		//System.out.println("Book클래스의 인스턴스를 매개변수가 있는 생성자로 생성");
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
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", page=" + page + "]";
	}
	

}
