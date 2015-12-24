package mailexemple;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext context;
//test
	//test1
	//test256
	//test3
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		SendMailExampl mm = (SendMailExampl) context.getBean("sendMailExampl");
        mm.sendMail("sender@gmail.com",
    		   "receiver@gmail.com",
    		   "Javacodegeeks email test", 
    		   "Testing.. \n Hello Spring Email Sender");
	}
}