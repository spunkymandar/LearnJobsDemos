import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.EnggStudent;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		//EnggStudent es1=(EnggStudent)ctx.getBean("engg_old");
		EnggStudent es1=(EnggStudent)ctx.getBean("engg_new");
		
		System.out.println(es1.getRollNo()+" "+es1.getName()+" " +es1.getBranch_code()+" "+es1.getCollege_code());

	}

}
