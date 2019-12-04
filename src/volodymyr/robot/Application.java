package volodymyr.robot;

import java.util.ArrayList;

public class Application {
	
	    public static void main(String[] args) {
	        Robot dRobot = new Robot();
	        Robot coffeeRobot = new CoffeeRobot();
	        Robot robotDancer = new RobotDancer();
	        Robot robotCooker = new RobotCooker();
	        dRobot.work();
	        coffeeRobot.work();
	        robotDancer.work();
	        robotCooker.work();
	 
	        ArrayList<Robot> robotsList = new ArrayList<Robot>();
	        robotsList.add(dRobot);
	        robotsList.add(coffeeRobot);
	        robotsList.add(robotDancer);
	        robotsList.add(robotCooker);
	 
	        for (Robot robot : robotsList) {
	            robot.work();
	        }
	    }
	}
	 
	class Robot {
	    void work() {
	    	System.out.println("я Robot Ц € просто працюю");
	    }
	}
	 
	class CoffeeRobot extends Robot {
	    @Override
	    void work() {
	    	System.out.println("я CoffeRobot Ц € варю каву");
	    }
	}
	 
	class RobotDancer extends Robot {
	    @Override
	    void work() {
	    	System.out.println("я RobotDancer Ц € просто танцюю");
	    }
	}
	 
	class RobotCooker extends Robot{
	    @Override
	    void work() {
	    	System.out.println("я RobotCoocker Ц € просто готую");
	    	System.out.println("");
	    }
	    
	}


