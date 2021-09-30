import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("helloworld.xml");
	HelloWorld hw=(HelloWorld) context.getBean("root");
	System.out.println(hw.getUserName());
}
}
