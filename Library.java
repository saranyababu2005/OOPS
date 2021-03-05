package oops;

import day2java.Book;

import java.util.List;

public class Library{
    Books book,book1,book2,book3;
    Furniture fur,fur1,fur2,fur3;
    Staff st,st1,st2,st3;
    static int flag=0;
    public Library()
    {


    }
    public Library(String dept) {
        // Books bb=new Books(String isbn,String bookRented,String Author);
        if (dept.equals("Engineering")) {
            Books book = new Books("DFG34", "Yes", "Author",dept);
            Books book2 = new Books("LKJH098", "No", "Author2",dept);
            Books book4=new Books("ZXCV345","Yes","Author4",dept);
        }
        if (dept.equals("Arts")) {
            Books book1 = new Books("ASD456", "Yes", "Author1",dept);
            Books book3 = new Books("MNBV456", "No", "Author3",dept);
        }
        if (Library.flag == 0) {
            Furniture fur=new Furniture("Chair","Iron");
            Furniture fur1=new Furniture("Chair","Wood");
            Furniture fur2=new Furniture("Table","Iron");
            Furniture fur3=new Furniture("Racks","Wood");

            Staff st=new Staff(30,"Saranya","Babu");
            Staff st1=new Staff(65,"Babu","Bala");
            Staff st2=new Staff(60,"Chitra","Babu");
            Staff st3=new Staff(25,"Mithra","Babu");
            Library.flag=1;
        }
    }
}
