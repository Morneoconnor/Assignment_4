package Assignment4.Assignment4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BreakingAllRulesTest {

    BreakingAllRulesClass breakObj = new BreakingAllRulesClass();


    public BreakingAllRulesTest()
    {

    }
    @Before
    public void SetUp() throws Exception {

    }
    @Test
    public void BreakRules() throws  Exception{

        assertNotSame("test",breakObj.DisplayCompanyInfo("Morne",1000));

    }
    public void BreakRulesAgain() throws Exception{
        assertSame(15,breakObj.AddOverHeads(13,2));
    }

}
