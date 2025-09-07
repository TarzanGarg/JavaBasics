package practicequestions;
//toString() Override
//Create a class Book with fields title and author.
// Override toString() to return "Title by Author".
// Print objects directly to test it.
class Book{
    String title;
    String author;
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString(){
        return title + " by " + author;
    }
}

public class Question15 {
    public static void main(String[] args){
        Book b1 = new Book("Harry Potter", "J.K. rowling");
        Book b2 = new Book("Courage", "J.K. rowling");
        System.out.println(b1);
        System.out.println(b2);
    }
}
