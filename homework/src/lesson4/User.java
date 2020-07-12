package lesson4;

public class User {
	private String name;
	private String status;

	public User(String name, String status) {
		this.name = name;
		this.status = status;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setStatus(String status) {
		this.status = status;

	}

	public String getStatus() {
		return status;
	}

	public void getInfo() {
		System.out.println(name + " " + status);
	}
}
