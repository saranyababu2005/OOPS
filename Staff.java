package oops;

public class Staff {
    int age;
    String fname,lname;
    static int staff_count=0;
    static int max_age=Integer.MIN_VALUE;
    static String eld_mem;

    public Staff()
    {

    }

    public Staff(int age,String fname,String lname)
    {
        this.age=age;
        this.fname=fname;
        this.lname=lname;
        Staff.staff_count=Staff.staff_count+1;
        if (age>Staff.max_age) {
            Staff.max_age = age;
            Staff.eld_mem=fname + " " +lname;
        }
    }
}
