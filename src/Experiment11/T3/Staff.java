package Experiment11.T3;

public class Staff {
    private StaffMember[] staffList;


    public void payday(){ }

    public StaffMember[] getStaffList() {
        return staffList;
    }

    public void setStaffList(StaffMember[] staffList) {
        this.staffList = staffList;
    }


    public static void main(String[] args){
        Staff staff = new Staff();
        staff.staffList = new StaffMember[8];
        Commission A = new Commission("WH","405","123","456",6.25,35,0.2);
        Commission B = new Commission("FY","405","456","789",9.75,40,0.15);
        staff.staffList[0] = A;
        staff.staffList[1] = B;
        A.pay();
        B.pay();

        System.out.println(staff.staffList[0].toString());
        System.out.println(staff.staffList[1].toString());

    }
}
