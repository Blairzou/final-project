import java.util.ArrayList;
public class Reader {
    private String name;
    private ArrayList<LibraryItem> borrowedItems;
    private int borrowedLimit;

    public Reader(String name){
        this.name=name;
        this.borrowedItems=new ArrayList<>();
        this.borrowedLimit=5;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public ArrayList<LibraryItem> getBorrowedItems(){
        return borrowedItems;
    }
    public void borrowedItems(LibraryItem items){
        if(borrowedItems.size()>=borrowedLimit){
          System.out.println( name+"can not borrow more than "+borrowedLimit+" items.");
        }else if (!items.isAvailable()){
            System.out.println(items.getTitle()+"is not availble for borrowing.");
        } else{
            borrowedItems.add(items);
            items.borrowItem();
            System.out.println(name+"borrowed"+items.getTitle());

        }

    }
    
}
