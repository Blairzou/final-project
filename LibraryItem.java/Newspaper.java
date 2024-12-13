public class Newspaper extends LibraryItem {
    private String date;
    public Newspaper(String title, String author, String date){
        super(title, author);
        this.date=date;
    }
    public String getDate(){
        return date;
    }
    public void archiveNews(){
        System.out.println("Archiving newspaper:" +getTitle()+"published on"+date);

    }
    public String toString(){
        return super.toString()+",Date:"+date;
    }
}
