package Assignment4.Assignment4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Assignment4ApplicationTests {
	private IFinanceDeptClass _financeDept;
	private ICompany _company;
	private FinanceDeptModel financeObj;
	private CompanyModel companyObj;
	CEO ceoObj = new CEO();
	Message welcomeMessage = Message.getInstance();

	@Test
	public void contextLoads() {
	}

	@Before
	public void SetUp() throws Exception {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(IoC.class);

		_company = (ICompany)ctx.getBean("company");
		_financeDept = (IFinanceDeptClass) ctx.getBean("finance");
	}

	@Test(timeout = 1000)
	public void TestCompany() throws Exception {
		String display = _company.DisplayCompanyInfo("DOS", 1000);
		assertEquals(display, _company.DisplayCompanyInfo("DOS", 1000));

	}
	@Test(timeout = 1000)
	public void TestFinance() throws Exception {
		long resultSet = _financeDept.AddOverHeads(1,1);
		long taxResult = _financeDept.PayTax(100);
		assertEquals(resultSet, _financeDept.AddOverHeads(1, 1));
		assertEquals(taxResult, _financeDept.PayTax(100));
	}
	@Test
	public void TestCEO() throws Exception{

		assertNotSame("Joe Soap",ceoObj.DisplayCEOInfo());
	}
	@Test
	public void TestSinglonMsg(){
		assertSame("Welcome User!", welcomeMessage.showMessage());
	}


}
