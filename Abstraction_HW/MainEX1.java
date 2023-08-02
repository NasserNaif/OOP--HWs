package Abstraction_HW;

public class MainEX1 {
    public static void main(String[] args) {
        Movie mov = new Movie();
        Book book = new Book("alice in wonderland", 120, "Lewis Carroll");

        mov.setName("Dark Knight");
        mov.setDirector("Nolan");
        mov.setPrice(100);
        mov.getDiscount(20);

        book.setPrice(300);
        System.out.println(mov.toString());
        System.out.println();
        System.out.println(book.toString());

    }
}
