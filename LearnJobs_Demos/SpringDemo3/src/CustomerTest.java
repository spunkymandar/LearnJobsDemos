

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shopping.beans.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Customer c=(Customer)context.getBean("customer");
		System.out.println(c);
		System.out.println(c.getCustAddress());
		
	}

}
