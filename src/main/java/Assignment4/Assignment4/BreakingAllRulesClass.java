package Assignment4.Assignment4;

public class BreakingAllRulesClass {

    public String DisplayCompanyInfo(String name, long total)
    {
        Message welcomeMessage = Message.getInstance();
        CEO ceoObj = new CEO();
        String ceoInfo = ceoObj.DisplayCEOInfo();
        String taxPaid = Double.toString(PayTax(20000));


        String displayStringMsg = welcomeMessage.showMessage() + ceoInfo + "The company name is " + name +
                "and employeee count is " + Double.toString(total) + " Tax Paid" + taxPaid;

        return displayStringMsg;
    }

    public long AddOverHeads(long salary, long expenses )
    {
        long total = salary + expenses;
        return total;
    }
    private long PayTax(long total)
    {
        return ((total/14)*100);
    }
}
