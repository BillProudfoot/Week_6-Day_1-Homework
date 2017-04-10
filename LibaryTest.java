import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LibaryTest{
  Libary libary;
  Book book;

  @Before 
  public void before(){
    libary = new Libary("Lending");
    book = new Book();
  }

  @Test
  public void hasName(){
    assertEquals("Lending", libary.getName());
  }

  @Test
  public void shelfIsEmpty(){
    assertEquals(0, libary.bookCount());
  }

  @Test 
  public void canAddBook(){
    this.libary.add(this.book);
    assertEquals(1, libary.bookCount());
  }

  @Test 
  public void shelfIsFull(){
    for(int i=0; i < 10; i++){
      this.libary.add(this.book);
    }

    assertEquals( true, this.libary.isShelfFull() );
  }
  
}