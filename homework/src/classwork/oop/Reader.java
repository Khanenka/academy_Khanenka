package classwork.oop;

public class Reader {
	public Book fullName;
	int number;
	String faculty;
	String date;
	int tel;

	public Reader() {
		super();
	}
	
	public Reader(Book fullName, int number, String faculty, String date, int tel) {

		this.date = date;
		this.faculty = faculty;
		this.fullName = fullName;
		this.number = number;
		this.tel = tel;
	}

	public Book getfullName() {
		return fullName;
	}

	public void setfullName(Book fullName) {
		this.fullName = fullName;
	}

	public int number() {
		return number;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setfaculty() {
		this.faculty = faculty;
	}

	public void setNumber(int number) {
		this.number = number;

	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public void readerInfo() {
		System.out.println("номер читательского билет: " + number + ", дата:" + date + ", телефон: " + tel
				+ ", факультет :" + faculty);
	}

}
