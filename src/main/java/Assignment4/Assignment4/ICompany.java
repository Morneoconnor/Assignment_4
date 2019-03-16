package Assignment4.Assignment4;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public interface ICompany {
    public String DisplayCompanyInfo(String name, long total);
    public long PayTax(long tax);
}
