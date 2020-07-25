package task11;

public class Rectangle extends Shape {
	private int x;
	private int y;
	private int z;
	private int d;
	
	public Rectangle() {
		super();
		this.x=x;
		this.y=y;
		this.z=z;
		this.d=d;
		}
	public Rectangle(int x,int y,int z,int d,String color) {
		super(color);
		this.x=x;
		this.y=y;
		this.z=z;
		this.d=d;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x=x;
			
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y=y;
			
		}
		public int getZ() {
			return z;
		}
		public void setZ(int z) {
			this.z=z;
			
		}
		public int getD() {
			return d;
		}
		public void setD(int d) {
			this.d=d;
			
		}
		


	

	@Override
	void draw() {
		System.out.println("координаты rectangle:"+x+" "+y+" "+z+" "+d+color);
		
		
	}
}
