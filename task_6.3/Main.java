/*Задача 6.3
1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain].
Параметр конструктора - название книги (title).
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook измените тип возвращаемого значения на более подходящий.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:  //!
5.1. agathaChristieOutput для книг Агаты Кристи;
5.2. markTwainOutput для книг Марка Твена.*/

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer")); //почему тут названия книг?
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books.toString());
    }
}
   abstract /*static*/ class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook(); //мб убрать void?
        public abstract String getTitle();

       private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getTitle() + " is a detective"; //книги Агаты кристи
            String markTwainOutput = getTitle() + " was written by " + author; // книги марк твен
 
            //String output = условие если твен или кристи
           if(author.equals("Mark Twain"))// дописать вывод
                return markTwainOutput;
            else return agathaChristieOutput;
        }
       
        public String toString() {
            return getOutputByBookType();
        }
    }
/*public  static */ class MarkTwainBook extends Book {
        String title;

        MarkTwainBook(String title) {
            super("Mark Twain");
           this.title=title;
        }
        @Override
        public MarkTwainBook getBook() { //
            return this;
        }

        @Override
        public String getTitle(){
            return title;
        }
    }
/*public static*/  class AgathaChristieBook extends Book {
        //private final String author;
        // String author;
        String title;

        AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title=title;
        }

        @Override
        public AgathaChristieBook getBook() { //

            return this;
        }

        @Override
        public String getTitle(){
            return title;
        }
    }
