package volodymyr.machine;
//кермо
public class Helm {

	private String helmName;
	private double helmDiameter;
	private int helmheight;
	
	public Helm(String helmName, double helmDiameter, int helmheight) {
		super();
		this.helmName = helmName;
		this.helmDiameter = helmDiameter;
		this.helmheight = helmheight;
	}

	public String getHelmName() {
		return helmName;
	}

	public void setHelmName(String helmName) {
		this.helmName = helmName;
	}

	public double getHelmDiameter() {
		return helmDiameter;
	}

	public void setHelmDiameter(double helmDiameter) {
		this.helmDiameter = helmDiameter;
	}

	public int getHelmheight() {
		return helmheight;
	}

	public void setHelmheight(int helmheight) {
		this.helmheight = helmheight;
	}

	@Override
	public String toString() {
		return "Helm [helmName=" + helmName + ", helmDiameter=" + helmDiameter + ", helmheight=" + helmheight + "]";
	}
	
	
}
