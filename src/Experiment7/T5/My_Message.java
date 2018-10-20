package Experiment7.T5;

public class My_Message {
    private String Recipient;
    private String Sender;
    private String Text;

    public String getRecipient() {
        return Recipient;
    }

    public void setRecipient(String recipient) {
        Recipient = recipient;
    }

    public String getSender() {
        return Sender;
    }

    public void setSender(String sender) {
        Sender = sender;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public My_Message(String recipent, String sender){
        Recipient = recipent;
        Sender = sender;
        Text = "";
    }

    public My_Message(){}

    public void append(String text){
        Text = Text + text;
    }

    @Override
    public String toString() {
        return "From :"+getSender()+"\n "+getText()+"\n"+"To :"+getRecipient()+"\n";
    }
}
