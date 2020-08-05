package lesson10;

public class User {
	/*
	 * Создать класс User, содержащий private переменные login, password.
	 * 
	 * Создать внутренний класс Query в классе User.
	 * 
	 * Класс Query содержит метод printToLog(), который распечатывает на консоль
	 * 
	 * сообщение о том что пользователь с таким то логином и паролем отправил
	 * запрос.
	 * 
	 * Класс User, содержит метод createQuery(), в котором создается объект класса
	 * 
	 * Query и вызывается метод printToLog(). В методе main(): создать экземпляр
	 * класса
	 * 
	 * User и вызвать метод createQuery(); создать экземпляр класса Query и вызвать
	 * метод
	 * 
	 * printToLog() используя конструкцию user.new Query(); создать экземпляр класса
	 * 
	 * Query и вызвать метод printToLog() используя конструкцию new User().new
	 * Query();
	 */
	private String login;
	private int password;

	User(String login, int password) {
		this.login = login;
		this.password = password;

	}

	public void createQuery1() {
		class Query1 {
			public void printToLog() {
				System.out.println("fdfd" + login + password);
			}

		}
		Query1 q = new Query1();
		q.printToLog();

	}

	public class Query {
		public void printToLog() {
			System.out.println(" логин " + login + " пароль " + password);
		}
	}

	public void createQuery() {
		Query q = new Query();
		q.printToLog();

	}

}