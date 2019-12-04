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
	    	System.out.println("� Robot � � ������ ������");
	    }
	}
	 
	class CoffeeRobot extends Robot {
	    @Override
	    void work() {
	    	System.out.println("� CoffeRobot � � ���� ����");
	    }
	}
	 
	class RobotDancer extends Robot {
	    @Override
	    void work() {
	    	System.out.println("� RobotDancer � � ������ ������");
	    }
	}
	 
	class RobotCooker extends Robot{
	    @Override
	    void work() {
	    	System.out.println("� RobotCoocker � � ������ �����");
	    	System.out.println("");
	    }
	    
	}


