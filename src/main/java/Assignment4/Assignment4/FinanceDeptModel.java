package Assignment4.Assignment4;

import sun.util.resources.sl.CalendarData_sl;

public class FinanceDeptModel {

    private long _salary;
    private long _expenses;
    private long _total;

    public FinanceDeptModel()
    {

    }
    public long GetSalary()
    {
        return _salary;
    }
    public long GetExpenses()
    {
        return _expenses;
    }
    public long GetTotal()
    {
        return _expenses;
    }
    public void SetTotal(long total)
    {
        _total = total;
    }
    public void SetSalary(long salary)
    {
        _salary = salary;
    }
    public void SetExpenses(long expenses)
    {
        _expenses = expenses;
    }
}
