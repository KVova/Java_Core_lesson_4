package volodymyr.animal;

public class Application {
	
	public static void main(String[] args) {
		
		Animal a = new Animal("Леопард", "7 років", "20 км/год");
		System.out.println(a);
		Animal a1 = new Animal("Бик", "14 років", "2 км/год");
		System.out.println(a1);
		Animal a3 = new Animal("Кінь", "5 років", "10 км/год");
		System.out.println(a3);
	}

}
