public class Magazine extends LibraryItem {
    private String issueDate;

    public Magazine(String title, String author, String issueDate){
        super(title, author);
        this.issueDate=issueDate;
    }
    public String getIssueDate(){
        return issueDate;
    }
    public void setIssueDate(String issueDate){
        this.issueDate=issueDate;
    }
    public void displayIssueDetails(){
        System.out.println("Magazine Issue:"+getTitle()+"-"+issueDate);
    }
    public String toString(){
        return super.toString()+",Issue Date:"+issueDate;
    }
    
}
