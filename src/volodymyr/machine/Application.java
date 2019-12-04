package volodymyr.machine;
//Mейн метод
public class Application {

	public static void main(String[] args) {
		Machine m = new Machine("Audi", 8, 121000.0, new Body("Sedan",3 ,"black"), new Wheel("Michelin", 17), new Helm("left", 0.25 , 1)/*, "Sedan", 3, "red"*/);
		System.out.println(m);
				
		Body b = new Body("sedan", 2, "orange");
		b.setBodyName("universal");
		
		Wheel w = new Wheel("Rosava", 18);
		
		Helm h = new Helm("right", 40, 1);
		
		Machine m1 = new Machine("Toyota", 4, 30000, b, w, h);
		System.out.println(m1);
		
		b.setBodyColor("white");
		b.setBodyName("maslcar");
		
		w.setWheelSize(20);
		
		h.setHelmName("left");
		
		Machine m2 = new Machine("Dodge", 12, 3000000, b, w, h);
		System.out.println(m2);
	} 
	
	//public static void main(String[] args) {
			//Machine m1 = new Machine("Honda", 5, 50000.0/*, new Body("",4, "")*/);
	//	System.out.println(m1);
	}
//}
