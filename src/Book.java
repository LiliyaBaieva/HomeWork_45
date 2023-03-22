import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Book implements Comparable<Book>{
  private String author;
  private String bookName;
  private int pages;

  public Book (String author, String bookName, int pages){
    this.author = author;
    this.bookName = bookName;
    this.pages = pages;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
  public void setBookName(String bookName) {
    this.bookName = bookName;
  }
  public void setPages(int pages) {
    this.pages = pages;
  }

  public String getAuthor() {
    return author;
  }
  public String getBookName() {
    return bookName;
  }
  public int getPages() {
    return pages;
  }

  @Override
  public int compareTo(Book other) {
    if(author != other.author){
      return author.compareTo(other.author);
    }
    return bookName.compareTo(other.bookName);
  }


  // Для теста
  public static  Book readBook() throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите автора книги: ");
    String author = br.readLine();
    System.out.print("Введите название книги: ");
    String bookName = br.readLine();
    System.out.print("Введите количество страниц в книге: ");
    int pages = Integer.parseInt(br.readLine());
    return new Book(author, bookName,pages);
  }

  @Override
  public String toString() {
    return author + ", \"" + bookName + "\", (" + pages + " стр.)";
  }
}
