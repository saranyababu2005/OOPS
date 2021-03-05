package oops;

public class College {
    public static void main(String[] args) {
        Engineering eng=new Engineering();
        Arts arts=new Arts();

        noOfBooks();
        noOfBooksRented();
        noOfCharis();
        noOfStaff();
        eldestStaff();

    }
    public static void noOfBooks()
    {
        System.out.println("Total number of books (Eng+Arts) "+Books.book_Counter);
        System.out.println("Total number of Eng books "+Books.eng_Book_Counter);
        System.out.println("Total number of Arts books "+Books.art_Book_Counter);
    }
    public static void noOfBooksRented()
    {
        System.out.println("Total number of books rented(Eng + Arts ) "+ Books.bookRented_counter);
    }

    public static void noOfCharis()
    {
        System.out.println("Total number of chairs "+Furniture.chair_counter);
    }

    public static void noOfStaff()
    {
        System.out.println("Total number of Staff "+Staff.staff_count);
    }

    public static void eldestStaff()
    {
        System.out.println("Eldest Staff member "+ Staff.eld_mem +" " + Staff.max_age);
    }
}
