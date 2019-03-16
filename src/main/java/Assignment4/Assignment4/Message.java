package Assignment4.Assignment4;

public class Message {
    //Singleton
    private static Message _messageInstance = new Message();


    public String message;


    private Message()
    {
    }

    public static Message getInstance()
    {
        return _messageInstance;
    }

    public String showMessage(){
        return  "Welcome User!";
    }
}
