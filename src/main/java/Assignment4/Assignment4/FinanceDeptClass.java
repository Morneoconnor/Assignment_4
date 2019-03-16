package Assignment4.Assignment4;

import org.springframework.stereotype.Component;
@Component
public class FinanceDeptClass extends Tax implements IFinanceDeptClass {

    public FinanceDeptClass()
    {

    }

    public long AddOverHeads(long salary, long expenses )
    {
        long total = salary + expenses;
        return total;
    }
    public long PayTax(long total)
    {
        return ((total/14)*100);
    }
}
