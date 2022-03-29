/*
 * Scopes of beans
 *    singleton : default. Only single copy of object is given to application
 *    prototype : Creates multiple beans from same bean ids
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("First Car ==>");
		Car mycar1=(Car)context.getBean("car1");
		System.out.println(mycar1);
		
		System.out.println("Second Car ==>");
		Car mycar2=(Car)context.getBean("car1");
		System.out.println(mycar2);
		
		//change second reference
		mycar2.setCarPrice(700000);

		
		System.out.println(mycar1);
		System.out.println(mycar2);
		
		
	}

}
