package oops;

public class Engineering {
    Library englib;
    String lab;

    public Engineering()
    {
        this.lab="Computer";
        Library englib=new Library("Engineering");
        this.englib=englib;
    }

}
