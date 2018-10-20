package Experiment7.T6;

import Experiment7.T5.My_Message;

import java.util.ArrayList;

public class Mailbox extends My_Message {
    private ArrayList<My_Message> Mailbox;

    public ArrayList<My_Message> getMailbox() {
        return Mailbox;
    }

    public void setMailbox(ArrayList<My_Message> mailbox) {
        Mailbox = mailbox;
    }

    public void addMessage(My_Message m){
        this.Mailbox.add(m);
    }

    public My_Message getMessaeg(int i){
        return this.Mailbox.get(i);
    }

    public void removeMessage(int i){
        this.Mailbox.remove(i);
    }
}
