public class Main3 {
  public static void main (String[] args) {
		Test test = new Test();
		test.testClasses();
  }
}
class Classes {
  private String name;
  private NameBooks nameBooks = new NameBooks();
  public Classes (String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public void addBooks (String booksName) {
    nameBooks.addBooks (booksName);
  }
  public void putAllBooks() {
    for (int i = 0; i < nameBooks.getNum() ; i++ )
      System.out.println ("第" + (i + 1) + "教材:" + nameBooks.getBooks (i) );
  }
}
class Books {
  private String name;
  public void setName (String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
}
class NameBooks {
  Books books[] = new Books[100];
  int num = 0;
  public void addBooks (String booksName) {
    books[num] = new Books();
    books[num].setName (booksName);
    num++;
  }
  public String getBooks (int num) {
    return books[num].getName();
  }
  public int getNum() {
    return num;
  }
}
class Test {
  public void testClasses() {
    Classes a = new Classes ("Chinese");
    a.addBooks ("Chinese Book I");
    a.addBooks ("Chinese Book II");
    a.addBooks ("Chinese Book III");
    a.putAllBooks();
  }
}
