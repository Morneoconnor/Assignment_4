package Assignment4.Assignment4;

import org.springframework.beans.factory.annotation.Autowired;

public class Program {
@Autowired
    public ICompany _company;
    public IFinanceDeptClass _financeDept;
    CompanyModel modelObj = new CompanyModel();
    FinanceDeptModel financeObj = new FinanceDeptModel();

    public Program(ICompany company, IFinanceDeptClass financeDept)
    {
        _company = company;
        _financeDept = financeDept;
    }


    public String CompanyInfo()
    {
        modelObj.SetName("DOS");
        modelObj.SetTotalEmployees(1000);

        return _company.DisplayCompanyInfo(modelObj.GetName(),
                modelObj.GetTotalEmployees());
    }
    public double CompanyExpense()
    {
        financeObj.SetSalary(40200);
        financeObj.SetExpenses(5930);
        double taxPaid = CompanyTax();

        return _financeDept.AddOverHeads(financeObj.GetSalary(),
                financeObj.GetExpenses());
    }
    public double CompanyTax()
    {
        financeObj.SetTotal(1000000);
        return _financeDept.PayTax(financeObj.GetTotal());
    }

}
