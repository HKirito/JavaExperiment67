package Experiment11.T3;

public class StaffMember {
    private String Name;
    private String Address;
    private String Phone;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

//    public double pay(){
//        return 0;
//    }

    public StaffMember(String name, String address,String phone){
        Name = name;
        Address = address;
        Phone = phone;
    }

    @Override
    public String toString() {
        String result="";
        result =result+"\nName :"+getName();
        result =result+"\nAddress :"+getAddress();
        result =result+"\nPhoneNumber :"+getPhone();

        return result;
    }
}
