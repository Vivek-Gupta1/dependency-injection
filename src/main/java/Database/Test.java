package Database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	  ApplicationContext cnt = new ClassPathXmlApplicationContext("Beans.xml");
	  DataBaseService bean = cnt.getBean(DataBaseService.class);
	  bean.inject();
	}
}
