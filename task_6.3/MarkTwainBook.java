  
public class MarkTwainBook extends Main.Book {
    private String title;

    public MarkTwainBook(String author) {
        super("Mark Twain");
        title = author;
    }
    /*@Override
    public String getBook() {
        return author;
    }*/
    @Override
    public MarkTwainBook getBook() {

        return this;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
