public class Libary{
  private String name;
  private Book [] shelf;

  public Libary(String name){
    this.name = name;
    this.shelf = new Book[10];
  }

  public String getName(){
    return this.name;
  }

  public void add(Book book){
    if(isShelfFull()) {
      return;
    }

    int bookCount = bookCount();
    this.shelf[bookCount] = book;
  }
  
  public boolean isShelfFull() {
    return bookCount() == shelf.length;
  }

  public int bookCount(){
    int count = 0;
    for (Book book : this.shelf){
      if(book != null){
        count++;
      }
    }

    return count;
  }
}
