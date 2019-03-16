package Assignment4.Assignment4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Assignment4Application {


	public static void main(String[] args) {
		ICompany _company;
		IFinanceDeptClass _finance;
		SpringApplication.run(Assignment4Application.class, args);
		ApplicationContext ctx = new AnnotationConfigApplicationContext(IoC.class);

		_company = (ICompany)ctx.getBean("comp");
		_finance = (IFinanceDeptClass) ctx.getBean("fin");

		Message welcomeMessage = Message.getInstance();
		welcomeMessage.showMessage();

		Program programObj = new Program(_company, _finance);
		String companyInfo = programObj.CompanyInfo();

		double companyExpense =programObj.CompanyExpense();
		double taxPaid = programObj.CompanyTax();
	}

}
