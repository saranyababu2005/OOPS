package oops;

public class Furniture {
    String type,material;
    static int chair_counter=0;

    public Furniture()
    {

    }

    public Furniture(String type,String material)
    {
        this.type=type;
        this.material=material;

        if(type.equals("Chair"))
            Furniture.chair_counter=Furniture.chair_counter+1;
    }
}
