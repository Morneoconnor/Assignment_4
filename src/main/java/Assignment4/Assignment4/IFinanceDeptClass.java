package Assignment4.Assignment4;

import org.springframework.stereotype.Component;

@Component
public interface IFinanceDeptClass {
    public long AddOverHeads(long salary, long expenses );
    public long PayTax(long tax);
}
