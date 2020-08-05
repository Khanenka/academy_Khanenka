package lesson10;

public class User1 {
	private String login;
	private int password;

	User1(String login, int password) {
		this.login = login;
		this.password = password;

	}

	public void createQuery1() {
		class Query {
			public void printToLog() {
				System.out.println("fdfd" + login + password);
			}

		}
		Query q = new Query();
		q.printToLog();

	}
}
