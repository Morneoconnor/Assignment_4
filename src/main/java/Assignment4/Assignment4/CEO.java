package Assignment4.Assignment4;

//Least Knowledge
public class CEO
{
    public String _name;
    public String _dateOfBirth;
    public CEO()
    {

    }
    public String DisplayCEOInfo()
    {
        _name = "Morne OConnor";
        _dateOfBirth = GetDateOfBirth();
        return String.format(_name + "" + _dateOfBirth);
    }
    private String GetDateOfBirth()
    {
        return "1989/06/21";
    }
}
