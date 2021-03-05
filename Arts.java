package oops;

public class Arts {
    String music;
    Library artslib;

    public Arts()
    {
        this.music="Keyboard";
        Library artslib=new Library("Arts");
        this.artslib=artslib;
    }
}
