package helloWorldSpringXml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Main {
 
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
 
    HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorldBean");
    System.out.println(helloWorld.getMessage());
  }
 
}