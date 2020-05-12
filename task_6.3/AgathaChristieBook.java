public class AgathaChristieBook extends Main.Book {
	    private String title;
	
	    public AgathaChristieBook(String author) {
	        super("Agatha Christie");
	        title = author;
	    }
	    /*@Override
	    public String getBook() {
	        return author;
	    }
	    */
	    @Override
	    public AgathaChristieBook getBook() {
	        return this;
	    }
	
	
	    @Override
	    public String getTitle() {
	        return title;
	    }
	}
