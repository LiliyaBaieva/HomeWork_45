import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
// Создайте класс Book (книга),
// в конструктор которого передавайте автора, название книги и количество страниц.

// Реализуйте интерфейс для сравнения книг:
// они должны сортироваться по авторам, а если авторы совпадают - по названиям
// (и там, и там - по алфавиту, "в словарном порядке").

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите количество книг: ");
    int numberOfBooks = Integer.parseInt(br.readLine());

    List<Book> books = new ArrayList<>();

    for (int i = 0; i < numberOfBooks; ++i) {
      books.add(Book.readBook());
    }

    Collections.sort(books);
    for (Book book : books) {
      System.out.println(book);
    }


  }


}