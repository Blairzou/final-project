public class DVD extends LibraryItem {
    private int duration;

    public DVD(String title, String author, int duration){
        super(title, author);
        this.duration=duration;
    }
    public int getDuration(){
        return duration;
    }
     public void playPreview(){
        System.out.println("playing preview for the DVD:"+getTitle());
     }
     public String toString(){
        return super.toString()+",Duration:"+duration+" minutes";

     }
    
}
