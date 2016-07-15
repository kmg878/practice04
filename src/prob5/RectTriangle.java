package prob5;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width,double height) {
		super(4);
		this.width=width;
		this.height=height;
	}
	public double getArea(){
		
		return width*height/2;
	}
	public double getPerimeter(){
		return Math.sqrt(width*width+height+height)+width+height;
	}
	
	
	
	
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	

}
