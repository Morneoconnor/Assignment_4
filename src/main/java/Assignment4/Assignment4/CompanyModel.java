package Assignment4.Assignment4;

public class CompanyModel {

    private String _name;
    private int _totalEmployees;

    public CompanyModel()
    {

    }
    public String GetName()
    {
        return _name;
    }
    public int GetTotalEmployees()
    {
        return _totalEmployees;
    }
    public void SetName(String name)
    {
        _name = name;
    }
    public void SetTotalEmployees(int totalEmployees)
    {
        _totalEmployees = totalEmployees;
    }


}

