package volodymyr.machine;
//Машина
public class Machine /*extends Body*/{

	private String machineName;
	private int machineAge;
	private double machineDistance;
	private Body body;
	private Wheel wheel;
	private Helm helm;
	
	public Machine(String machineName, int machineAge, double machineDistance, Body body, Wheel wheel, Helm helm/*, String bodyName,int bodyWidth, String bodyColor*/) {
		super(/*bodyName, bodyWidth, bodyColor*/);
		this.machineName = machineName;
		this.machineAge = machineAge;
		this.machineDistance = machineDistance;
		this.body = body;
		this.wheel = wheel;
		this.helm = helm;
	}

	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public int getMachineAge() {
		return machineAge;
	}

	public void setMachineAge(int machineAge) {
		this.machineAge = machineAge;
	}

	public double getMachineDistance() {
		return machineDistance;
	}

	public void setMachineDistance(double machineDistance) {
		this.machineDistance = machineDistance;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	@Override
	public String toString() {
		return "Machine [machineName=" + machineName + ", machineAge=" + machineAge + ", machineDistance="
				+ machineDistance + ", body=" + body + ", wheel=" + wheel + ", helm=" + helm + "]";
	}

}
