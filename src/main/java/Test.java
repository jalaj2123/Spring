import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ref.A;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/ref/configreg.xml");
		
	A temp=(A) context.getBean("aref");
	System.out.println(temp.getA());
	System.out.println(temp.getOb().getB());
	
	}

}
