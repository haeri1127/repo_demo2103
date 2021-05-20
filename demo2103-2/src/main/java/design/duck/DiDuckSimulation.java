package design.duck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiDuckSimulation {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("design\\duck\\duckBean.xml");
		Duck myDuck = (Duck)context.getBean("myDuck");
		myDuck.performQuack();
		myDuck.performFly();
		myDuck = null;
		//여기 아래처럼 하면 망함. spring을 사용하지 않는 것.
		myDuck = new MallardDuck(); //X
		myDuck.performQuack(); //X
		myDuck.performFly();
		
	}

}
