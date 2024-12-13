public class LibraryItem{
    private String title;
    private String author;
    private boolean isAvailable;

    public LibraryItem(String title, String author){
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;

    }
    public boolean isAvailable(){
        return isAvailable;
    }

    public void borrowItem(){
        this.isAvailable=false;
        this.isAvailable =true;
    }
    public String toString(){
        return "Title:"+title+", Author:" +author+",Available:"+ isAvailable;
    }

}