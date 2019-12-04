package volodymyr.machine;
//Колесо
public class Wheel {

	private String wheelName;
	private int wheelSize;
	
	public Wheel(String wheelName, int wheelSize) {
		super();
		this.wheelName = wheelName;
		this.wheelSize = wheelSize;
	}

	public String getWheelName() {
		return wheelName;
	}

	public void setWheelName(String wheelName) {
		this.wheelName = wheelName;
	}

	public int getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(int wheelSize) {
		this.wheelSize = wheelSize;
	}

	@Override
	public String toString() {
		return "Wheel [wheelName=" + wheelName + ", wheelSize=" + wheelSize + "]";
	}
	
	
}
