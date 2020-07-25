package task11;

public class Main {
	public static void main(String[] args) {
		Circle circle[] = new Circle[3];
		Circle circle1 = new Circle(1, 2, 3, "Green");
		circle[0] = circle1;
		circle1 = new Circle(4, 5, 6, "red");
		circle[1] = circle1;
		circle1 = new Circle(7, 8, 9, "white");
		circle[2] = circle1;

		for (Circle x : circle) {
			x.draw();

		}

		Rectangle rectangle[] = new Rectangle[3];
		Rectangle rectangle1 = new Rectangle(1, 2,3, 4,"Green");
		rectangle[0] = rectangle1;
		rectangle1 = new Rectangle(4, 5, 6,7,"red");
		rectangle[1] = rectangle1;
		rectangle1 = new Rectangle(7, 8, 9,10,"white");
		rectangle[2] = rectangle1;

		for (Rectangle y : rectangle) {
			y.draw();

		}
		
		System.out.println(circle.equals(rectangle1));
		


	}
}