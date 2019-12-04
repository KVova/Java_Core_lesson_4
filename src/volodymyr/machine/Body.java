package volodymyr.machine;
//Кузов
public class Body {
	
	private String bodyName;
	private int bodyWidth;
	private String bodyColor;
	
	public Body(String bodyName, int bodyWidth, String bodyColor) {
		super();
		this.bodyName = bodyName;
		this.bodyWidth = bodyWidth;
		this.bodyColor = bodyColor;
	}

	public String getBodyName() {
		return bodyName;
	}

	public void setBodyName(String bodyName) {
		this.bodyName = bodyName;
	}

	public int getBodyWidth() {
		return bodyWidth;
	}

	public void setBodyWidth(int bodyWidth) {
		this.bodyWidth = bodyWidth;
	}

	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}
	
	public void changeStudentName(String modyfiName) {
		this.bodyName = modyfiName;
	}

	@Override
	public String toString() {
		return "Body [bodyName=" + bodyName + ", bodyWidth=" + bodyWidth + ", bodyColor=" + bodyColor + "]";
	}
	
}
