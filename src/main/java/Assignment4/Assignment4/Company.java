package Assignment4.Assignment4;

import org.springframework.stereotype.Component;


public class Company extends Tax implements ICompany
{

    public String DisplayCompanyInfo(String name, long total)
    {
        String displayStringMsg =  name + " employeee count is "
                + Double.toString(total);

        return displayStringMsg;
    }

    public long PayTax(long total)
    {
        return ((total/14)*100);
    }
}
