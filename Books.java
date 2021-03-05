package oops;

public class Books {
    String isbn,isBookRented,author;
    static int bookRented_counter=0;
    static int book_Counter=0;
    static int eng_Book_Counter=0;
    static int art_Book_Counter=0;
    public Books()
    {

    }
    public Books(String isbn,String isBookRented,String author,String dept)
    {
        this.isbn=isbn;
        this.isBookRented=isBookRented;
        this.author=author;
        if(isBookRented.equals("Yes"))
            Books.bookRented_counter=Books.bookRented_counter+1;
        if(dept.equals("Engineering"))
            Books.eng_Book_Counter=Books.eng_Book_Counter+1;
        if(dept.equals("Arts"))
            Books.art_Book_Counter=Books.art_Book_Counter+1;
        Books.book_Counter=Books.eng_Book_Counter+Books.art_Book_Counter;
    }
}
