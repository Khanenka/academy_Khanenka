package Homework6;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Date;

public class Task2 {
	public static void main(String[] args) {
		Date date = new Date((long) 20.05);
		User user = new User("David", 12345, "asdqwe@mail.ru");
		Person person = new Person("Johnnie", "Walker", 20, date);
		Class<?> userClass = user.getClass();
		Class<?> personClass = person.getClass();
		System.out.println(user.getClass());

		System.out.println("----getDeclaredMethod---");
		try {
			Method personDeclaredMethod = personClass.getDeclaredMethod("getFirstName");
			System.out.println(personDeclaredMethod);

			Method personDeclaredMethod1 = personClass.getDeclaredMethod("getLastName");
			System.out.println(personDeclaredMethod1);

			Method personDeclaredMethod2 = personClass.getDeclaredMethod("getAge");
			System.out.println(personDeclaredMethod2);

			Method personDeclaredMethod3 = personClass.getDeclaredMethod("getDateOfBirth");
			System.out.println(personDeclaredMethod3);

			Method personDeclaredMethod4 = personClass.getDeclaredMethod("printUserInfo");
			System.out.println(personDeclaredMethod4);
		} catch (NoSuchMethodException e1) {

			e1.printStackTrace();
		} catch (SecurityException e1) {

			e1.printStackTrace();
		}

		System.out.println("----getDeclaredMethods---");

		Method[] methodsPerson = userClass.getDeclaredMethods();
		for (Method method : methodsPerson) {
			System.out.println(method);
		}
		System.out.println("----getMethod---");

		try {
			Method methodPerson = personClass.getMethod("getFirstName");
			System.out.println(methodPerson);

			Method methodPerson1 = personClass.getMethod("getLastName");
			System.out.println(methodPerson1);

			Method methodPerson2 = personClass.getMethod("getAge");
			System.out.println(methodPerson2);

			Method methodPerson3 = personClass.getMethod("getDateOfBirth");
			System.out.println(methodPerson3);

		} catch (NoSuchMethodException e) {

			e.printStackTrace();
		} catch (SecurityException e) {

			e.printStackTrace();
		}
		System.out.println("----getMethods---");

		Method[] methods = personClass.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("----getDeclaredField---");
		try {
			Field personField = personClass.getDeclaredField("firstName");
			String firstNameValue = (String) personField.get(person);

			Field personField1 = personClass.getDeclaredField("lastName");
			personField1.setAccessible(true);
			String lastNameValue = (String) personField1.get(person);

			Field personField2 = personClass.getDeclaredField("age");
			personField2.setAccessible(true);
			int ageValue = (int) personField2.get(person);

			Field personField3 = personClass.getDeclaredField("dateOfBirth");
			personField3.setAccessible(true);
			Date dateValue = (Date) personField3.get(person);

			System.out.println("FirstName: " + firstNameValue);
			System.out.println("LastName: " + lastNameValue);
			System.out.println("Age:" + ageValue);
			System.out.println("Date" + dateValue);

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println("----getFields---");

		Field[] personFields = personClass.getFields();
		for (Field field : personFields) {
			System.out.println(field);
		}

		try {
			Field personField = personClass.getDeclaredField("firstName");
			String firstNameValue = (String) personField.get(person);
			personField.setAccessible(true);

			Field personField1 = personClass.getDeclaredField("lastName");
			personField1.setAccessible(true);
			String lastNameValue = (String) personField1.get(person);

			Field personField2 = personClass.getDeclaredField("age");
			personField2.setAccessible(true);
			int ageValue = (int) personField2.get(person);

			Field personField3 = personClass.getDeclaredField("dateOfBirth");
			personField3.setAccessible(true);
			Date dateValue = (Date) personField3.get(person);

			personField.set(person, "Bilbo");
			personField1.set(person, "Beggins");
			personField2.set(person, 95);
			personField3.set(person, new Date(13, 02, 2000));
			System.out.println(" After change FirstName:" + personField.get(person));
			System.out.println(" After change LastName:" + personField1.get(person));
			System.out.println(" After change LastName:" + personField2.get(person));
			System.out.println(" After change LastName:" + personField3.get(person));

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {

			e.printStackTrace();
		}

		try {
			Method toStr = personClass.getMethod("toString", null);
			String result = (String) toStr.invoke(person, null);
			System.out.println("\n----Method.invoke---");
			System.out.println(result);
		} catch (NoSuchMethodException | SecurityException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (IllegalArgumentException e) {

			e.printStackTrace();
		} catch (InvocationTargetException e) {

			e.printStackTrace();
		}

		System.out.println("----getDeclaredMethod User---");
		try {
			Method userDeclaredMethod = userClass.getDeclaredMethod("getLogin");
			System.out.println(userDeclaredMethod);

			Method userDeclaredMethod1 = userClass.getDeclaredMethod("getPassword");
			System.out.println(userDeclaredMethod1);

			Method userDeclaredMethod2 = userClass.getDeclaredMethod("getEmail");
			System.out.println(userDeclaredMethod2);

		} catch (NoSuchMethodException e1) {

			e1.printStackTrace();
		} catch (SecurityException e1) {

			e1.printStackTrace();
		}

		System.out.println("----getDeclaredMethods User---");

		Method[] methodsDecUser = userClass.getDeclaredMethods();
		for (Method method : methodsDecUser) {
			System.out.println(method);
		}
		System.out.println("----getMethod---");

		try {
			Method methodUser = userClass.getMethod("getLogin");
			System.out.println(methodUser);

			Method methodUser1 = userClass.getMethod("getPassword");
			System.out.println(methodUser1);

			Method methodUser2 = userClass.getMethod("getEmail");
			System.out.println(methodUser2);

		} catch (NoSuchMethodException e) {

			e.printStackTrace();
		} catch (SecurityException e) {

			e.printStackTrace();
		}
		System.out.println("----getMethods---");
 
		Method[] methodsUser = userClass.getMethods();
		for (Method method : methodsUser) {
			System.out.println(method);
		}
		System.out.println("----getDeclaredField---");
		try {
			Field userField = userClass.getDeclaredField("login");
			String loginValue = (String) userField.get(user);

			Field userField1 = userClass.getDeclaredField("email");
			userField1.setAccessible(true);
			String emailValue = (String) userField1.get(user);

			Field userField2 = userClass.getDeclaredField("password");
			userField2.setAccessible(true);
			int passwordValue = (int) userField2.get(user);

			System.out.println("login: " + loginValue);
			System.out.println("email: " + emailValue);
			System.out.println("password:" + passwordValue);

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println("----getFields---");

		Field[] userFields = userClass.getFields();
		for (Field field : userFields) {
			System.out.println(field);
		}

		try {
			Field userField = userClass.getDeclaredField("login");
			String firstNameValue = (String) userField.get(user);
			userField.setAccessible(true);

			Field userField1 = userClass.getDeclaredField("email");
			userField1.setAccessible(true);
			String lastNameValue = (String) userField1.get(user);

			Field userField2 = userClass.getDeclaredField("password");
			userField2.setAccessible(true);
			int ageValue = (int) userField2.get(user);

			userField.set(user, "12334");
			userField1.set(user, "asd@gmail.com");
			userField2.set(user, 12345678);

			System.out.println(" After change FirstName:" + userField.get(user));
			System.out.println(" After change LastName:" + userField1.get(user));
			System.out.println(" After change LastName:" + userField2.get(user));

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {

			e.printStackTrace();
		}

		try {
			Method toStr = userClass.getMethod("toString", null);
			String result = (String) toStr.invoke(user, null);
			System.out.println("\n----Method.invoke---");
			System.out.println(result);
		} catch (NoSuchMethodException | SecurityException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (IllegalArgumentException e) {

			e.printStackTrace();
		} catch (InvocationTargetException e) {

			e.printStackTrace();
		}

	}
}