public class Book extends LibraryItem {
    private String genre;
    public Book(String title,String author, String genre){
        super(title,author);
        this.genre=genre;
    }
    public String getGenre(){
        return genre;
    }
    public void recommendationBasedOnDenre(){
        System.out.println("If you like"+genre+", you might enjoy"+getTitle());

    }
    public String toString(){
        return super.toString()+", Genre:"+genre;
    }

    
}
