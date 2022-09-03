package day30_inheritance.BookTask;

public class Ebook extends Book {

    private double size;
    private long pages;


    public Ebook(String title, String type, String author, double price) {
        super(title, type, author, price);
    }


    public Ebook(String title, String type, String author, double price, double size, long pages) {
        super(title, type, author, price);
        setSize(size);
        setPages(pages);
    }


    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }


    public void readBook(){
        System.out.println("Please read: " + "\"" + getTitle() + "\"" + "\n" +  "Written by: "+ getAuthor() + "\n" + "Pages "+getPages() + " Size: "+ getSize()  );
    }


}
/*
2 Create a sub class of Book named EBook:
			Extra variables:
				size, pages

			Encapsulate all the extra fields
					Conditions:
						1. pages can not be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				readBook()
 */