package Assignment4.Assignment4;

import org.springframework.context.annotation.*;

@Configuration
public class IoC {
    @Bean(name="company")
    public ICompany GetCompany(){
        return new Company();
    }
    @Bean(name="finance")
    public IFinanceDeptClass GetFinance(){
        return new FinanceDeptClass();
    }
    @Bean(name="comp")
    public ICompany GetComp(){
        return new Company();
    }
    @Bean(name="fin")
    public IFinanceDeptClass GetFin(){
        return new FinanceDeptClass();
    }
    @Bean(name = "ceo")
    public CEO GetCEO()
    {
        return new CEO();
    }


}
